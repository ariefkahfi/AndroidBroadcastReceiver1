package com.kahfi.arief.belajarandroidbroadcastreceiver1;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kahfi.arief.belajarandroidbroadcastreceiver1.Service.MyIntentService;
import com.kahfi.arief.belajarandroidbroadcastreceiver1.receivers.MyBroadcastReceiver;

public class MainActivity extends AppCompatActivity {

    private Button klik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpRegister();

        klik = (Button)findViewById(R.id.clickService);

        TextView response = (TextView)findViewById(R.id.receiverText);

        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMyIntentService();
            }
        });

    }


    private void startMyIntentService(){
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }


    private void setUpRegister(){
        BroadcastReceiver br = new MyBroadcastReceiver();
        IntentFilter iFilter = new IntentFilter("com.kahfi.arief.belajarandroidbroadcastreceiver1.receivers.MyBroadcastReceiver");
        registerReceiver(br,iFilter);
    }





}
