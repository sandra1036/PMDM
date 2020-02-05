package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyectolibreria.Adaptador.AdaptadorLibreria;
import com.example.proyectolibreria.R;

public class Principal extends AppCompatActivity {

    public static Libros[]libros=new Libros[]{
            new Libros(R.drawable.harrypotter_piedrafilosofal,"Harry Potter y la piedra filosofal",
                    "J.K.Rowling","1997","Literatura fantástica, aventuras, literatura juvenil"),


            new Libros(R.drawable.cazadoressombras,"Cazadores de Sombras" ,"Cassandra Clare","2007",
                    "Fantasía"),


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        AdaptadorLibreria adaptadorLibreria=new AdaptadorLibreria(this);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adaptadorLibreria);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Ha entrado ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Principal.this, LIbroCompleto.class);
                setIntent(intent);

            }
        });



    }






}
