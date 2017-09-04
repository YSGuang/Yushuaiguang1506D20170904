package com.bwie.yushuaiguang1506d20170904;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 主页面
 * 姓名：于帅光
 * 时间：2017/9/4
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RoundProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.setcolor).setOnClickListener(this);
        findViewById(R.id.jiansu).setOnClickListener(this);
        findViewById(R.id.jiansu).setOnClickListener(this);
        progressbar = (RoundProgressBar)findViewById(R.id.roundProgressBar_02);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.setcolor:
                progressbar.setBackgroundColor(Color.RED);
                progressbar.setCircleProgressColor(Color.RED);
                break;
            case R.id.jiasu:
                progressbar.setTime("加速",100);
                break;
            case R.id.jiansu:
                progressbar.setTime("减速速",5000);
                break;
        }
    }
}
