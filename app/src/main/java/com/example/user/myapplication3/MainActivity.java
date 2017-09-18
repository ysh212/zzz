package com.example.user.myapplication3;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //추가한 라인
//        FirebaseMessaging.getInstance().subscribeToTopic("news");
       String to= FirebaseInstanceId.getInstance().getToken();
        //System.out.print(to);
        Log.d("sot",to);

    }
}
