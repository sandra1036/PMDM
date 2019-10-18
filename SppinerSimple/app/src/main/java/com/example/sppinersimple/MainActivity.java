package com.example.sppinersimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    final static String semana[] ={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s="";

        spinner=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String>stringArrayAdapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,semana);

        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                    String s="";
                    s="Item clicked => "+semana[position];
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
