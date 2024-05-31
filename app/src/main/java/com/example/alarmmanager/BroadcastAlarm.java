package com.example.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Sheeraz on 1/6/2024.
 */

public class BroadcastAlarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "alarm started", Toast.LENGTH_SHORT).show();
    }
}
