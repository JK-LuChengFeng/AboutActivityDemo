package com.example.aboutactivitydemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.aboutactivitydemo.R;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class ActivityUse extends AppCompatActivity implements View.OnClickListener {

    private Button btn_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use);

        initData();
        initView();

    }

    private void initData() {

    }

    private void initView() {
        btn_toast = findViewById(R.id.btn_toast);
        btn_toast.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_toast:
                //Toast的基本使用
                Toast.makeText(ActivityUse.this,"Toast的基本使用",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
