package com.example.aboutactivitydemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aboutactivitydemo.R;

/**
 * Create By JK_Liu on 2019/11/26
 */
public class ActivitySaveData extends AppCompatActivity {

    /**
     * 在OnCreate中，Bundle savedInstanceState需要进行判空操作。
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savedata);
    }

    /**
     * 取数据，官方推荐，不用判空，因为走这个方法的时候，Bundle一定有数据，不为空。
     * 调用时机在onStart() 方法之后。
     * @param savedInstanceState
     */
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    /**
     * 异常崩溃时保存数据
     * 调用时机在onStop() 方法之前，但是与onPause方法没有固定的时序关系。
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
