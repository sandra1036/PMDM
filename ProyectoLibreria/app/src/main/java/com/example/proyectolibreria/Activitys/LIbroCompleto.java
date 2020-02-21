package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.icu.text.MessagePattern;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectolibreria.BD.DataBaseHelper;
import com.example.proyectolibreria.BD.DataBaseHelperInternal;
import com.example.proyectolibreria.R;

import java.sql.SQLException;
import java.util.ArrayList;


public class LIbroCompleto extends AppCompatActivity {
    DataBaseHelper dataBaseHelper = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro_completo);


        TextView nombre = (TextView) findViewById(R.id.nombre);
        TextView fecha = (TextView) findViewById(R.id.fecha);
        TextView sinopsis = (TextView) findViewById(R.id.sinopis);
        ImageView imagen = (ImageView) findViewById(R.id.foto);
        TextView autor = (TextView) findViewById(R.id.autor);
        TextView genero = (TextView) findViewById(R.id.genero);
        final TextView precioi = (TextView) findViewById(R.id.precio);
        final TextView total = (TextView) findViewById(R.id.Total);

        final RadioGroup rg = (RadioGroup) findViewById(R.id.radiogrup);
        final RadioButton re = (RadioButton) findViewById(R.id.Ebook);
        final RadioButton rf = (RadioButton) findViewById(R.id.Fisico);
        Button siguiente = (Button) findViewById(R.id.siguiente);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.favoritos);

        //Obtengo los datos del objeto de los libros
        Bundle bundle = getIntent().getExtras();
        final Libros libros = (Libros) bundle.getSerializable("clave");


        //Se los asigno
        genero.setText("Genero: " + libros.getGenero());
        imagen.setImageResource(libros.getFoto());
        nombre.setText("Titulo: " + libros.getTitulo());
        autor.setText("Autor: " + libros.getAutor());
        fecha.setText("Fecha: " + libros.getFecha());
        sinopsis.setText("Sinopsis: " + libros.getSinopsis());
        precioi.setText("Precio: " + libros.getPrecio());
        //Metodos del radio Grup
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int precio = 20;
                if (rg.getCheckedRadioButtonId() == R.id.Fisico) {

                    precio = precio + 5;
                    libros.setTotal(String.valueOf(precio));
                } else {
                    libros.setTotal(libros.getPrecio());
                }

            }
        });

        //El boton pasa a la otra pantalla y te dice el precio
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LIbroCompleto.this, Factura.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("clave", libros);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });




        dataBaseHelper=new DataBaseHelper(this);
        dataBaseHelper.open();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox.isChecked()) {
                    dataBaseHelper.insertItemLibros(libros.getTitulo(),libros.getFecha(),libros.getSinopsis(),libros.getAutor(),libros.getGenero(),Usuarios.id);
                }
                dataBaseHelper.close();
            }
        });



    }
//    int row=0;
//    protected void deleterow(){
//        try{
//            dataBaseHelper.open();
//            dataBaseHelper.delete((Libros));
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }

}