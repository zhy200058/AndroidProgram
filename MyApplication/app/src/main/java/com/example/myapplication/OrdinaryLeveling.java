package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class OrdinaryLeveling extends AppCompatActivity {
    private EditText houshi;
    private EditText qianshi;
    private EditText gaocha;
    private EditText gaocheng;
    private EditText gaocheng1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordinary_leveling);
        houshi=(EditText)findViewById(R.id.houshi);
        qianshi=(EditText)findViewById(R.id.qianshi);
        gaocha=(EditText)findViewById(R.id.gaocha);
        gaocheng=(EditText)findViewById(R.id.gaocheng);
        gaocheng1=(EditText)findViewById(R.id.gaocheng1);
        Button calculate=(Button)findViewById(R.id.calculate);//实现计算功能
        Button map=(Button)findViewById(R.id.locate);//打开地图
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String houshistr=houshi.getText().toString();
                float houshif=Float.parseFloat(houshistr);
                String qianshistr=qianshi.getText().toString();
                float qianshif=Float.parseFloat(qianshistr);
                String gaochengstr=gaocheng.getText().toString();
                float gaochengf=Float.parseFloat(gaochengstr);

                float gaochaf=houshif-qianshif;
                String gaochastr=String.valueOf(gaochaf);
                gaocha.setText(gaochastr);

                float gaocheng1f=gaochengf+gaochaf;
                String gaocheng1str=String.valueOf(gaocheng1f);
                gaocheng1.setText(gaocheng1str);

            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(OrdinaryLeveling.this, BaiduMap.class);
                    startActivity(intent);//转到百度地图

            }
        });
    }


}
