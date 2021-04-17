package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cover extends AppCompatActivity {

    private int GPS_REQUEST_CODE=1;
    /**
     * 判断GPS是否开启
     */
    private boolean checkGpsIsOpen() {
        boolean isOpen;
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        isOpen = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        return isOpen;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cover_layout);
        Button button=(Button)findViewById(R.id.buttonCover);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkGpsIsOpen()) {
                    Toast.makeText(Cover.this,"已打开GNSS", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Cover.this,MainActivity.class);
                    startActivity(intent);
                }//如果GNSS打开，跳转至MainActivity
                else {
                    new AlertDialog.Builder(Cover.this).setTitle("请打开GNSS").setMessage("现在去开启定位").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //跳转到手机原生GNSS设置页面
                            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                            startActivityForResult(intent, GPS_REQUEST_CODE);
                        }
                    }).setCancelable(false).show();
                }

            }
        });
    }
}
