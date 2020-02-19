package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Typeface;
import android.icu.text.MessagePattern;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.text.style.StyleSpan;
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
import com.example.proyectolibreria.R;

import java.util.ArrayList;


public class LIbroCompleto extends AppCompatActivity {
    public  DataBaseHelper dataBaseHelper=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro_completo);

        dataBaseHelper=new DataBaseHelper(this);
        dataBaseHelper.open();


        TextView nombre=(TextView)findViewById(R.id.nombre);
        TextView fecha=(TextView)findViewById(R.id.fecha);
        TextView sinopsis=(TextView)findViewById(R.id.sinopis);
        ImageView imagen=(ImageView)findViewById(R.id.foto);
        final TextView autor=(TextView)findViewById(R.id.autor);
        TextView genero=(TextView)findViewById(R.id.genero);
        final  TextView precioi=(TextView)findViewById(R.id.precio);
        final TextView total=(TextView)findViewById(R.id.Total);

        final RadioGroup rg=(RadioGroup)findViewById(R.id.radiogrup);
        final RadioButton re=(RadioButton)findViewById(R.id.Ebook);
        final RadioButton rf=(RadioButton)findViewById(R.id.Fisico);
        Button siguiente=(Button)findViewById(R.id.siguiente);
        final CheckBox favoritos=(CheckBox)findViewById(R.id.favoritos);


        //Obtengo los datos del objeto de los libros
        Bundle bundle=getIntent().getExtras();
        final Libros libros=(Libros)bundle.getSerializable("clave");


        //Se los asigno
        genero.setText("Genero: "+libros.getGenero());
        imagen.setImageResource(libros.getFoto());
        nombre.setText("Titulo: "+libros.getTitulo());
        autor.setText("Autor: "+libros.getAutor());
        fecha.setText("Fecha: "+libros.getFecha());
        sinopsis.setText("Sinopsis: "+libros.getSinopsis());
        precioi.setText("Precio: "+libros.getPrecio());


            //Metodos del radio Grup
            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int precio = 20;
                    if (rg.getCheckedRadioButtonId() == R.id.Fisico) {

                        precio = precio + 5;
                        libros.setTotal(String.valueOf(precio));
                    }else {
                        libros.setTotal(libros.getPrecio());
                    }

                }
            });

        //El boton pasa a la otra pantalla y te dice el precio
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LIbroCompleto.this,Factura.class);
                Bundle bundle=new Bundle();
                bundle.putSerializable("clave",libros);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        favoritos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(favoritos.isChecked()){

                    saveData();

                }
            }
        });
        dataBaseHelper.close();
    }

    public void fullDataLibros(){
        dataBaseHelper.open();
        Cursor itemcursor=dataBaseHelper.getItemsLibros();
        Libros item=null;
        ArrayList<Libros> list=new ArrayList<Libros>();
        while(itemcursor.moveToNext()){
            int id=itemcursor.getInt(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_ID));
            String titulo=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_TITULO));
            String anyo=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_ANYO));
            String sinopis=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_SINOPSIS));
            String autor=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_AUTOR));
            String genero=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_GENERO));
            String user=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIO_ID));
            item.id=id;
            item.titulo=titulo;
            item.fecha=anyo;
            item.sinopsis=sinopis;
            item.autor=autor;
            item.genero=genero;
            item.idusers=user;
            list.add(item);
        }
    }
    protected void saveData(){


        try{
            dataBaseHelper.open();
            dataBaseHelper.insertItemLibros(Libros.titulo,Libros.fecha,Libros.sinopsis,Libros.autor,Libros.genero,Usuarios.id);
            dataBaseHelper.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }








}
