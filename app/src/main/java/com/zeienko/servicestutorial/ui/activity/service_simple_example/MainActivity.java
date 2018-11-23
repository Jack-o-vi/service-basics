package com.zeienko.servicestutorial.ui.activity.service_simple_example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zeienko.servicestutorial.R;
import com.zeienko.servicestutorial.ui.activity.service_simple_example.MyService1;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickStart(View v) {
//        startService(new Intent(this, MyService.class));

        startService(new Intent(this, MyService1.class).putExtra("time", 7));
        startService(new Intent(this, MyService1.class).putExtra("time", 2));
        startService(new Intent(this, MyService1.class).putExtra("time", 4));
    }

    public void onClickStop(View v) {
//        stopService(new Intent(this, MyService.class));
    }
}
