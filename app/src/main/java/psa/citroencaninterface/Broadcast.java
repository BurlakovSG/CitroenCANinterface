package psa.citroencaninterface;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Broadcast extends BroadcastReceiver {
    final String LOG_TAG = "myLogs";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Log.d(LOG_TAG, "ACTION_BOOT_COMPLETED");
            context.startService(new Intent(context, CANinterfaceService.class));
        }
    }
}