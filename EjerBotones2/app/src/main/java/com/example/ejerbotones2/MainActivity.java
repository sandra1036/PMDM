package com.example.ejerbotones2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     private static Button buttonr,buttonb;
     private static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonr=findViewById(R.id.ButtonRed);
        buttonb=findViewById(R.id.ButtonBlue);
        textView=findViewById(R.id.TextBack);
    }

    public void OnclickR(View view){

        textView.setBackgroundResource(R.color.ColorRed);



    }

    public void OnclickB(View view){

        textView.setBackgroundResource(R.color.ColorBlue);



    }
}
