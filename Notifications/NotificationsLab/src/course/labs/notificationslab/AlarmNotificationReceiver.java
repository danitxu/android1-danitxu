package course.labs.notificationslab;

import java.text.DateFormat;
import java.util.Date;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

public class AlarmNotificationReceiver extends BroadcastReceiver {
	// Notification ID to allow for future updates
	private static final int MY_NOTIFICATION_ID = 1;
	private static final String TAG = "AlarmNotificationReceiver";

	// Notification Text Elements
	private final CharSequence tickerText = "Are You Playing Angry Birds Again!";
	private final CharSequence contentTitle = "A Kind Reminder";
	private final CharSequence contentText = "Get back to studying!!";

	// Notification Action Elements
	private Intent mNotificationIntent;
	private PendingIntent mContentIntent;

	// Notification Sound and Vibration on Arrival
	/*private Uri soundURI = Uri
			.parse("android.resource://course.examples.Alarms.AlarmCreate/"
					+ R.raw.alarm_rooster);*/
	private long[] mVibratePattern = { 0, 200, 200, 300 };

	@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	@Override
	public void onReceive(Context context, Intent intent) {

		mNotificationIntent = new Intent(context, MainActivity.class);
		mContentIntent = PendingIntent.getActivity(context, 0,
				mNotificationIntent, Intent.FLAG_ACTIVITY_NEW_TASK);
		
		

		Log.i(TAG,"Sending notification at:" + DateFormat.getDateTimeInstance().format(new Date()));
		

	}
}