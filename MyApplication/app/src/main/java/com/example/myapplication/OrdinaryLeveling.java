package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
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

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

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
                Boolean screen = isScreenChange();
                if(screen==true)//若横屏
                {
                    Toast.makeText(OrdinaryLeveling.this,"请竖屏后再点击",Toast.LENGTH_SHORT).show();
                }else if(screen==false)//若竖屏
                {
                    Intent intent = new Intent(OrdinaryLeveling.this, BaiduMap.class);
                    startActivity(intent);//转到百度地图
                }
            }
        });
    }

    public boolean isScreenChange() {
        Configuration mConfiguration = this.getResources().getConfiguration(); //获取设置的配置信息
        int ori = mConfiguration.orientation ; //获取屏幕方向

        if(ori == mConfiguration.ORIENTATION_LANDSCAPE){
            //横屏
            return true;
        } else if (ori == mConfiguration.ORIENTATION_PORTRAIT){
            //竖屏
            return false;
        }
        return false;
    }
}
