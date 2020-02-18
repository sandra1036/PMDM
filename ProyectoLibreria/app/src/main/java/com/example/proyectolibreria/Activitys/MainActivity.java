package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.proyectolibreria.BD.DataBaseHelper;
import com.example.proyectolibreria.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText editusuario,editpassword;
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

    public void fillData(){
        dataBaseHelper.open();
        Cursor itemcursor=dataBaseHelper.getItemsUsuarios();
        Usuarios item=null;
        ArrayList<Usuarios> result=new ArrayList<Usuarios>();

        while(itemcursor.moveToNext()){
            int id=itemcursor.getInt(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_ID));
            String nombre=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_NOMBRE));
            String email=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_EMAIL));
            String telefono=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_TELEFONO));
            int idlib=itemcursor.getInt(itemcursor.getColumnIndex(DataBaseHelper.LIBRO_ID));
            item=new Usuarios();
            result.add(item);
        }
        //cerramos la base de datos
        itemcursor.close();
        dataBaseHelper.close();

    }




    //Menu
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

}
