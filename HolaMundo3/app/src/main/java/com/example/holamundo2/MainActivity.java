package com.example.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Text;
    private Button buttonC;
    private TextView Hello;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        Text= (EditText)findViewById(R.id.editText);
        buttonC= (Button)findViewById(R.id.button);
        Hello= (TextView)findViewById(R.id.textView);

        Hello.setText("Hola "+Text.getText().toString());




    }




}
