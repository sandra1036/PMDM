package com.example.diferentestiposdeeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2=(Button)findViewById(R.id.bt2);
        Button button3=(Button)findViewById(R.id.bt3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button3",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickButton(View v){

        Toast.makeText(MainActivity.this,"Button2",Toast.LENGTH_SHORT).show();

    }
}
