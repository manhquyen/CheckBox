package com.example.mypc.manhquyen.checkbox;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =(TextView)findViewById(R.id.text);
        tb =(ToggleButton)findViewById(R.id.battat);
        Toggle tbProcess=new Toggle();
        tb.setOnCheckedChangeListener(tbProcess);
        /* tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv.setTextColor(Color.parseColor("#0000FF"));
                    tv.setText(R.string.toggle_on);
                }
                else
                {
                    tv.setText(R.string.toggle_off);
                    tv.setTextColor(Color.parseColor("#00FF00"));
                }
            }
        }); */
    }
        class Toggle implements CompoundButton.OnCheckedChangeListener
        {   @Override
            public void onCheckedChanged(CompoundButton buttonView , boolean isChecked)
            {
                if(isChecked){
                    tv.setTextColor(Color.parseColor("#0000FF"));
                    tv.setText(R.string.toggle_on);
                }
                else
                {
                    tv.setText(R.string.toggle_off);
                    tv.setTextColor(Color.parseColor("#00FF00"));
                }
            }
        }
       /* CompoundButton.OnCheckedChangeListener tbProcess = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv.setTextColor(Color.parseColor("#0000FF"));
                    tv.setText(R.string.toggle_on);
                }
                else
                {
                    tv.setText(R.string.toggle_off);
                    tv.setTextColor(Color.parseColor("#00FF00"));
                }
            }
        }; */

    }



