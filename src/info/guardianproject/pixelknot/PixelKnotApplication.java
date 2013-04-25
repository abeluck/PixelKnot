package info.guardianproject.pixelknot;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;
import android.util.Log;

@ReportsCrashes(
        formKey = "",
        formUri = "https://guardianproject.iriscouch.com/acra-pixelknot/_design/acra-storage/_update/report",
        reportType = org.acra.sender.HttpSender.Type.JSON,
        httpMethod = org.acra.sender.HttpSender.Method.PUT,
        formUriBasicAuthLogin="FakeUser",
        formUriBasicAuthPassword="ThisIsNotARealPassword",
        // Your usual ACRA configuration
        mode = ReportingInteractionMode.DIALOG,
        resDialogText = R.string.crash_dialog_text,
        resDialogIcon = android.R.drawable.ic_dialog_info,
        resDialogTitle = R.string.crash_dialog_title,
        resDialogCommentPrompt = R.string.crash_dialog_comment_prompt,
        resDialogOkToast = R.string.crash_dialog_ok_toast
        )
public class PixelKnotApplication extends Application {

	@Override
	  public final void onCreate() {
	    super.onCreate();
	    ACRA.init(this);
	    Log.d("PixelKnot", "ACRA initialized!");
	  }
}
