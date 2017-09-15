package com.kahfi.arief.belajarandroidbroadcastreceiver1.Service;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.kahfi.arief.belajarandroidbroadcastreceiver1.receivers.MyBroadcastReceiver;

/**
 * Created by arief on 15/09/17.
 */

public class MyIntentService extends IntentService {



    public MyIntentService(){
        super("MyIntentServiceClass");
    }



    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.e("onHandleIntent","Start");

        Bundle b = new Bundle();

        b.putString("nama","arief");


        Intent inten = new Intent();
        inten.setAction("com.kahfi.arief.belajarandroidbroadcastreceiver1.receivers.MyBroadcastReceiver");
        inten.putExtras(b);

        sendBroadcast(inten);

        Log.e("onHandleIntent","Finished");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Service","Service Destroyed");
    }
}
