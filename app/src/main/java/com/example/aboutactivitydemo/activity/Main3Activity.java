package com.example.aboutactivitydemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.aboutactivitydemo.R;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class Main3Activity extends AppCompatActivity {

    private static final String TAG = "Main3Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        Log.e(TAG, "-------" + this.toString());
        Log.e(TAG, "---------Task id is:" + getTaskId());

    }
}
