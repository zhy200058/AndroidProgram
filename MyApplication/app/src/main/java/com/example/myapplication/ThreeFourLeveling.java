package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

public class ThreeFourLeveling extends AppCompatActivity {
    private final int WC= ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int FP=ViewGroup.LayoutParams.FILL_PARENT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_four_leveling);
        Button new_row=(Button)findViewById(R.id.new_row);
        new_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TableLayout tableLayout=(TableLayout)findViewById(R.id.TableLayout);
                tableLayout.setStretchAllColumns(true);
                for(int row=0;row<1;row++)
                {
                    TableRow tableRow=new TableRow(ThreeFourLeveling.this);
                    for(int col=0;col<8;col++)
                    {
                        EditText tv=new EditText(ThreeFourLeveling.this);
                        tv.setBackgroundResource(R.drawable.edit_background);
                        tv.setTextSize(20);
                        tv.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL|InputType.TYPE_CLASS_NUMBER);
                        tableRow.addView(tv);
                    }
                    tableLayout.addView(tableRow,new TableLayout.LayoutParams(FP,WC));
                    tableLayout.setStretchAllColumns(true);
                }
            }
        });
    }
}
