package com.kahfi.arief.belajarandroidbroadcastreceiver1.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.kahfi.arief.belajarandroidbroadcastreceiver1.R;

/**
 * Created by arief on 15/09/17.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    public MyBroadcastReceiver() {
        Log.i("MyBroadCastReceiver","Constructor Called");

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle b = intent.getExtras();

        Log.e("onReceive()",b.getString("nama"));


        TextView t= (TextView)((AppCompatActivity)context).findViewById(R.id.receiverText);

        t.setText(b.getString("nama"));

    }





}
