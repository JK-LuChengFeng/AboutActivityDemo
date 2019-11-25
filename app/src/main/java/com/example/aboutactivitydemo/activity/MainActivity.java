package com.example.aboutactivitydemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aboutactivitydemo.R;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    private Button btn_toast,btn_menu,btn_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();

    }

    private void initData() {

    }

    private void initView() {
        btn_toast = findViewById(R.id.btn_toast);
        btn_toast.setOnClickListener(this);
        btn_menu = findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(this);
        btn_intent = findViewById(R.id.btn_intent);
        btn_intent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_toast:
                //Toast使用
                intent.setClass(MainActivity.this,ActivityUse.class);
                startActivity(intent);
                break;
            case R.id.btn_menu:
                //Menu使用
                intent.setClass(MainActivity.this,ActivityMenu.class);
                startActivity(intent);
                break;
            case R.id.btn_intent:
                //Intent简单使用
                intent.setClass(MainActivity.this,ActivityIntent.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
