package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.example.proyectolibreria.BD.DataBaseHelper;
import com.example.proyectolibreria.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public EditText editusuario,editpassword;
    public static DataBaseHelper dataBaseHelper=null;
    public Integer mRowId=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editusuario=(EditText)findViewById(R.id.entryusuario);
        editpassword=(EditText)findViewById(R.id.entrypassword);
        Button button=(Button)findViewById(R.id.buttonCambiar);

        dataBaseHelper=new DataBaseHelper(this);
        mRowId=(savedInstanceState==null)?null:
                (Integer)savedInstanceState.getSerializable(DataBaseHelper.USUARIOS_ID);
        if (DataBaseHelper.liteDatabase != null) {        //Si correcta la base de datos
            for (int cont = 1; cont <= 3; cont++) {  //Introducimos 3 clientes de ejemplo
                int codigo = cont;
                String nombre = "Nombre" + cont;
                String contrasenya = cont + "XXXXXXX";
                DataBaseHelper.liteDatabase.execSQL("INSERT INTO Usuarios (nombre, contrasenya) " +
                        "VALUES (" + nombre + ", '" + contrasenya + "')");
            }
        }

        if (DataBaseHelper.liteDatabase != null) {
            System.out.println("No conecta con la base de datos");

        }




            button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Principal.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("clave",Principal.libros);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });




    }

    public void fullDataLibros(){
        dataBaseHelper.open();
        Cursor itemcursor=dataBaseHelper.getItemsLibros();
        Libros item=null;
       // ArrayList<LIbroCompleto>list=new ArrayAdapter<LIbroCompleto>();
        while(itemcursor.moveToNext()){
            int id=itemcursor.getInt(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_ID));
            String titulo=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_TITULO));
            String anyo=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_ANYO));
            String sinopis=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_SINOPSIS));
            String autor=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_AUTOR));
            String genero=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.LIBROS_GENERO));
          //  list.add(item);
        }
    }



    public void fillDataUsuarios(){
        dataBaseHelper.open();
        Cursor itemcursor=dataBaseHelper.getItemsUsuarios();
        Usuarios item=null;
        ArrayList<Usuarios> result=new ArrayList<Usuarios>();

        while(itemcursor.moveToNext()){
            int id=itemcursor.getInt(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_ID));
            String nombre=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_NOMBRE));
            String contrasenya=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_Contrasenya));
            int idlib=itemcursor.getInt(itemcursor.getColumnIndex(DataBaseHelper.LIBRO_ID));
            item=new Usuarios();
            result.add(item);
        }
        //cerramos la base de datos
        itemcursor.close();
        dataBaseHelper.close();

    }

    protected void saveData(){
        String itemusuario=editusuario.getText().toString();
        String itempassword=editpassword.getText().toString();

        try{
            dataBaseHelper.open();
            //dataBaseHelper.insertItemUsuario(itemusuario,itempassword);
            dataBaseHelper.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }




    //Menu
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

}
