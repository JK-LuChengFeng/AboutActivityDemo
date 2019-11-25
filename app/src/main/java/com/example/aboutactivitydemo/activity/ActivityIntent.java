package com.example.aboutactivitydemo.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.aboutactivitydemo.R;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class ActivityIntent extends AppCompatActivity implements View.OnClickListener {

    private Button btn_xianshi, btn_yinshi,btn_bowser,btn_browser2,btn_tel,btn_data, btn_data2;

    private static final String TAG = "ActivityIntent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        initData();
        initView();

    }

    private void initData() {

    }

    private void initView() {
        btn_xianshi = findViewById(R.id.btn_xianshi);
        btn_xianshi.setOnClickListener(this);
        btn_yinshi = findViewById(R.id.btn_yinshi);
        btn_yinshi.setOnClickListener(this);
        btn_bowser = findViewById(R.id.btn_browser);
        btn_bowser.setOnClickListener(this);
        btn_browser2 = findViewById(R.id.btn_browser2);
        btn_browser2.setOnClickListener(this);
        btn_tel = findViewById(R.id.btn_tel);
        btn_tel.setOnClickListener(this);
        btn_data = findViewById(R.id.btn_data);
        btn_data.setOnClickListener(this);
        btn_data2 = findViewById(R.id.btn_data2);
        btn_data2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_xianshi:
                //显示Intent
                Intent intent = new Intent(ActivityIntent.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_yinshi:
                //隐式Intent
                Intent intent1 = new Intent("com.example.aboutactivitydemo.Main2Acton_START");
                intent1.addCategory("android.intent.category.DEFAULT");
                intent1.addCategory("android.intent.category.MY_CATEGORY");
                startActivity(intent1);
                break;
            case R.id.btn_browser:
                //调用网页
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent2);
                break;
            case R.id.btn_browser2:
                //调用网页2
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent3);
                break;
            case R.id.btn_tel:
                //调用拨号
                Intent intent4 = new Intent(Intent.ACTION_DIAL);
                intent4.setData(Uri.parse("tel:10086"));
                startActivity(intent4);
                break;
            case R.id.btn_data:
                //intent 传递数据
                Intent intent5 = new Intent(ActivityIntent.this,Main2Activity.class);
                intent5.putExtra("data1","Intent传递数据data1");
                startActivity(intent5);
                break;
            case R.id.btn_data2:
                //intent 传递数据并回传
                Intent intent6 = new Intent(ActivityIntent.this,Main2Activity.class);
                intent6.putExtra("data1","Intent传递数据data2");
                startActivityForResult(intent6,1);
                break;
            default:
                break;
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (data != null && resultCode == RESULT_OK){
                    String data3 = data.getStringExtra("data3");
                    Log.e(TAG, "onActivityResult:Intent回传数据为:" + data3);
                }
                break;
        }
    }
}
