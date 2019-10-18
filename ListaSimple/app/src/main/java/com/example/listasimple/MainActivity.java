package com.example.listasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    final static String semana []={"Lunes","Martes","Miercoles","Jueves","Viernes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String maensaje;
        ListView listView=(ListView)findViewById(R.id.list);

        ArrayAdapter<String> stringArrayAdapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,semana);
        listView.setAdapter(stringArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int position, long id) {
                String mensaje="";
                mensaje="Item clicked => " + semana[position];
                Toast.makeText(MainActivity.this, "Ha pulsado",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
