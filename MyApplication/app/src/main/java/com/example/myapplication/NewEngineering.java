package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

//新建工程选择项目页面
public class NewEngineering extends AppCompatActivity {
private String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_engineering);
        Toast.makeText(NewEngineering.this,"请选择项目",Toast.LENGTH_SHORT).show();
        final Spinner chooseprojects=(Spinner)findViewById(R.id.menu_choose_projects);
        chooseprojects.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                item=chooseprojects.getSelectedItem().toString();//把框中的字符串赋给item
            }
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });//点击下拉菜单选择
        Button button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(item.equals("普通水准测量")){
                    Intent intent=new Intent(NewEngineering.this,OrdinaryLeveling.class);
                    Log.d("NewEngineering",item);
                    startActivity(intent);
                }
                else if(item.equals("三四等水准测量")){
                    Intent intent=new Intent(NewEngineering.this,ThreeFourLeveling.class);
                    startActivity(intent);
                }
                else if(item.equals("导线测量")){
                    Intent intent=new Intent(NewEngineering.this,TraverseSurvey.class);
                    startActivity(intent);
                }
                else if(item.equals("NULL")){
                    Toast.makeText(NewEngineering.this,"请选择项目",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

