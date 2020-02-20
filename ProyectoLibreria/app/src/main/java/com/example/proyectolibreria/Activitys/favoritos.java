package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.proyectolibreria.Adaptador.AdaptadorLibreria;
import com.example.proyectolibreria.R;

public class favoritos extends AppCompatActivity {
    public static ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        list=(ListView)findViewById(R.id.list);
        AdaptadorLibreria libreria=new AdaptadorLibreria(this);
        list.setAdapter(libreria);


    }
}
