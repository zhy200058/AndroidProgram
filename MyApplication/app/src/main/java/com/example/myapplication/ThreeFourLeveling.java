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
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class ThreeFourLeveling extends AppCompatActivity {
    private EditText houshang;
    private EditText houxia;
    private EditText qianshang;
    private EditText qianxia;
    private EditText houju;
    private EditText qianju;
    private EditText shijucha;
    private EditText sigmad;
    private EditText heihou,heiqian,gaochahei,hongqian,honghou,gaochahong;
    private EditText Kheihong1,Kheihong2,Kheihong3;
    private EditText gaochazhongshu;
    private EditText K,K1;
    private float sigma_d=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_four_leveling);

        houshang=(EditText)findViewById(R.id.text52);
        houxia=(EditText)findViewById(R.id.text62);
        qianshang=(EditText)findViewById(R.id.text53);
        qianxia=(EditText)findViewById(R.id.text63);
        houju=(EditText)findViewById(R.id.text72);
        qianju=(EditText)findViewById(R.id.text73);
        shijucha=(EditText)findViewById(R.id.text82);
        sigmad=(EditText)findViewById(R.id.text83);
        heihou=(EditText)findViewById(R.id.text55);
        heiqian=(EditText)findViewById(R.id.text65);
        honghou=(EditText)findViewById(R.id.text56);
        hongqian=(EditText)findViewById(R.id.text66);
        gaochahei=(EditText)findViewById(R.id.text75);
        gaochahong=(EditText)findViewById(R.id.text76);
        Kheihong1=(EditText)findViewById(R.id.text57);
        Kheihong2=(EditText)findViewById(R.id.text67);
        Kheihong3=(EditText)findViewById(R.id.text77);
        gaochazhongshu=(EditText)findViewById(R.id.text78);
        K=(EditText)findViewById(R.id.text17);
        K1=(EditText)findViewById(R.id.text47);
        Button map=(Button)findViewById(R.id.locate);//打开地图
        Button calculate1=(Button)findViewById(R.id.calculate1);
        calculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String houshangstr=houshang.getText().toString();
                float houshangf=Float.parseFloat(houshangstr);
                String houxiastr=houxia.getText().toString();
                float houxiaf=Float.parseFloat(houxiastr);
                String qianshangstr=qianshang.getText().toString();
                float qianshangf=Float.parseFloat(qianshangstr);
                String qianxiastr=qianxia.getText().toString();
                float qianxiaf=Float.parseFloat(qianxiastr);
                String heihoustr=heihou.getText().toString();
                float heihouf=Float.parseFloat(heihoustr);
                String heiqianstr=heiqian.getText().toString();
                float heiqianf=Float.parseFloat(heiqianstr);
                String honghoustr=honghou.getText().toString();
                float honghouf=Float.parseFloat(honghoustr);
                String hongqianstr=hongqian.getText().toString();
                float hongqianf=Float.parseFloat(hongqianstr);
                String Kstr=K.getText().toString();
                float Kf=Float.parseFloat(Kstr);
                String K1str=K1.getText().toString();
                float K1f=Float.parseFloat(K1str);


                float houjuf=houshangf-houxiaf;
                float qianjuf=qianshangf-qianxiaf;
                float shijuchaf=houjuf-qianjuf;
                sigma_d+=shijuchaf;
                float gaochaheif=heihouf-heiqianf;
                float gaochahongf=honghouf-hongqianf;
                float Kheihong1f=Kf+heihouf-honghouf;
                float Kheihong2f=K1f+heiqianf-hongqianf;
                float Kheihong3f=Kheihong1f-Kheihong2f;
                float gaochazhongshuf=(gaochaheif+gaochahongf)/2;

                String houjustr=String.valueOf(houjuf);
                houju.setText(houjustr);
                String qianjustr=String.valueOf(qianjuf);
                qianju.setText(qianjustr);
                String shijuchastr=String.valueOf(shijuchaf);
                shijucha.setText(shijuchastr);
                String sigmadstr=String.valueOf(sigma_d);
                sigmad.setText(sigmadstr);
                String gaochaheistr=String.valueOf(gaochaheif);
                gaochahei.setText(gaochaheistr);
                String gaochahongstr=String.valueOf(gaochahongf);
                gaochahong.setText(gaochahongstr);
                String Kheihong1str=String.valueOf(Kheihong1f);
                Kheihong1.setText(Kheihong1str);
                String Kheihong2str=String.valueOf(Kheihong2f);
                Kheihong2.setText(Kheihong2str);
                String Kheihong3str=String.valueOf(Kheihong3f);
                Kheihong3.setText(Kheihong3str);
                String gaochazhongshustr=String.valueOf(gaochazhongshuf);
                gaochazhongshu.setText(gaochazhongshustr);


            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(ThreeFourLeveling.this, BaiduMap.class);
                    startActivity(intent);//转到百度地图

            }
        });
    }


}
