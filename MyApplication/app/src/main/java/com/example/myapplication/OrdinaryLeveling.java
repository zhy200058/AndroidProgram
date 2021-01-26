package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class OrdinaryLeveling extends AppCompatActivity {
    private final int WC= ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int FP=ViewGroup.LayoutParams.FILL_PARENT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordinary_leveling);
        Button new_row=(Button)findViewById(R.id.new_row);
        new_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TableLayout tableLayout=(TableLayout)findViewById(R.id.GridLayout);
                tableLayout.setStretchAllColumns(true);
                for(int row=0;row<1;row++)
                {
                    TableRow tableRow=new TableRow(OrdinaryLeveling.this);
                    for(int col=0;col<8;col++)
                    {
                        EditText tv=new EditText(OrdinaryLeveling.this);
                        tv.setBackgroundResource(R.drawable.edit_background);
                        tv.setTextSize(20);
                        if(col!=1&&col!=7)
                        {
                            tv.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL|InputType.TYPE_CLASS_NUMBER);
                        }
                        tableRow.addView(tv);
                    }
                    tableLayout.addView(tableRow,new TableLayout.LayoutParams(FP,WC));
                    tableLayout.setStretchAllColumns(true);
                }
            }
        });
    }
}
