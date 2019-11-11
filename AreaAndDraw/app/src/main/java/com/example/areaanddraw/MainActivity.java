package com.example.areaanddraw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int base,altura;
    private String figuras[]={"Circulo","Triangulo","Cuadrado"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>stringArrayAdapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,figuras);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                String s="";
                s="Item clicked => "+ figuras[position];
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();







            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }


    private void areaCirculo(float radio){
        float result=0;

        result=Math.PI*Math.pow(radio,2);

    }

    private void areaTriangulo(int base,int altura){
        int result=0;

        result=(base*altura)/2;

    }






}
