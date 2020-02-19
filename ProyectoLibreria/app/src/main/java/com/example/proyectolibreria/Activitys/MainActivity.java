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
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyectolibreria.BD.DataBaseHelper;
import com.example.proyectolibreria.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public EditText editusuario,editpassword;
    public  DataBaseHelper dataBaseHelper=null;
    public Integer mRowId=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editusuario=(EditText)findViewById(R.id.entryusuario);
        editpassword=(EditText)findViewById(R.id.entrypassword);
        Button button=(Button)findViewById(R.id.buttonCambiar);

        dataBaseHelper=new DataBaseHelper(this);

        try{
            fillDataUsuarios();
        }catch(SQLException e){
            e.printStackTrace();
        }



            button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                saveData();
                Intent intent = new Intent(MainActivity.this, Principal.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("clave",Principal.libros);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });




    }


    public void fillDataUsuarios(){
        dataBaseHelper.open();
        Cursor itemcursor=dataBaseHelper.getItemsUsuarios();
        Usuarios item= null;
        ArrayList<Usuarios> result=new ArrayList<Usuarios>();

        while(itemcursor.moveToNext()){
            int id=itemcursor.getInt(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_ID));
            String nombre=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_NOMBRE));
            String contrasenya=itemcursor.getString(itemcursor.getColumnIndex(DataBaseHelper.USUARIOS_Contrasenya));
            item=new Usuarios();
            item.id=id;
            item.nombre=nombre;
            item.contrasenya=contrasenya;
            result.add(item);
            System.out.println("Entro en fillDataUsuarios");
        }
        //cerramos la base de datos
        itemcursor.close();
        dataBaseHelper.close();

    }



    protected void saveData(){
        try{
            String itemusuario=editusuario.getText().toString();
            String itempassword=editpassword.getText().toString();
            dataBaseHelper.open();
            while (itemusuario !=null && itempassword !=null){
                dataBaseHelper.insertItemUsuario(itemusuario,itempassword);
                Toast.makeText(getApplicationContext(),"Inserta",Toast.LENGTH_SHORT);

            }
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
