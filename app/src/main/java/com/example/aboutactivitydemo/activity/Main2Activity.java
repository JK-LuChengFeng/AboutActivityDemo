package com.example.aboutactivitydemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.aboutactivitydemo.R;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Main2Activity";
    private Button btn_jump, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        Log.e(TAG, "-------" + this.toString());
        Log.e(TAG, "---------Task id is:" + getTaskId());



        initData();
        initView();
    }

    private void initData() {
        Intent intent = getIntent();
        String data = intent.getStringExtra("data1");
        Log.e(TAG, "intent传递数据:" + data);
    }

    private void initView() {
        btn_jump = findViewById(R.id.btn_jump);
        btn_jump.setOnClickListener(this);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_jump:
                //跳转
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_back:
                //返回
//                Intent intent = new Intent();
//                intent.putExtra("data3","回传的数据data3");
//                setResult(RESULT_OK,intent);
                finish();
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data3","回传的数据data3");
        setResult(RESULT_OK,intent);
        finish();
    }
}
