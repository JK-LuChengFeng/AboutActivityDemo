package com.example.aboutactivitydemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aboutactivitydemo.R;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class ActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }


    /**
     * 添加menu菜单
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    /**
     * Menu的点击事件
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add:
                //添加
                Toast.makeText(ActivityMenu.this,"Menu Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_delete:
                //删除
                Toast.makeText(ActivityMenu.this,"Menu Delete",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
}
