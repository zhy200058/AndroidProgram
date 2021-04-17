package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NewEngineering.class);
                startActivity(intent);
            }
        });//点击新建工程，进入新建工程选择项目页面

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //待编写
            }
        });//点击加载工程，进入加载工程页面
    }
}
