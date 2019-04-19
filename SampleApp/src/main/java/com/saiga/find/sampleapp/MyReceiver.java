package com.saiga.find.sampleapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        // this prints the log in console of the connected device
        Log.d("Tym",Calendar.getInstance().getTime().toString());
        // this prints the grey color toast message
        Toast.makeText(context,Calendar.getInstance().getTime().toString(),Toast.LENGTH_LONG).show();
    }
}
