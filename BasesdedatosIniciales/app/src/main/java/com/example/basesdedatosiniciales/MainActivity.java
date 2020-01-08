package com.example.basesdedatosiniciales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Abrimos la base de datos en modo escritura
        ClientesSQLiteHelper cliBDh = new ClientesSQLiteHelper(this, "DBClientes", null, 1);

        //Obtenemos referencia a la base de datos para poder modificarla.
        SQLiteDatabase bd = cliBDh.getWritableDatabase();

        if (bd != null) {        //Si correcta la base de datos
            for (int cont = 1; cont <= 3; cont++) {  //Introducimos 3 clientes de ejemplo
                int codigo = cont;
                String nombre = "Cliente" + cont;
                String telefono = cont + "XXXXXXX";
                bd.execSQL("INSERT INTO Clientes (codigo, nombre, telefono) " +
                        "VALUES (" + codigo + ", '" + nombre + "', '" + telefono + "')");
            }
        }

        //Ejemplo de utilización de método insert()
        //Creamos el registro que queremos insertar utilizando un objeto ContentValues
//        ContentValues nuevoRegistro = new ContentValues();
//        nuevoRegistro.put("nombre","cli10");
//        nuevoRegistro.put("telefono", "101010");
//        //Insertamos el registro en la base de datos
//        //Param1:nombre de la tabla donde insertamos
//        //Param2: solo sirve para introducir un registro vacío
//        //Param3: objeto ContentValues con el registro a insertar
//        bd.insert("Clientes", null, nuevoRegistro);
//
//
//        //Ejemplo de utilización del método update()
//        //Establecemos los campos-valores que vamos a actualizar
//        ContentValues valores=new ContentValues();
//        valores.put("telefono","101010XX");
//        //Actualizamos el registro den la base de datos
//        //Param3: condición del UPDATE como lo haríamos en la cláusula
//        //Where en una sentencia SQL normal
//        //Param4: partes de variables de la sentencia SQL que aportamos
//        //en un vector de valores aparte
//        String [] args=new String[]{"cli1","cli2"};
//        bd.update("Clientes",valores,"nombre=? or nombre=?",args);
//
//        //Ejemplo de utilización del modo delete()
//        //Eliminamos el registro del 'cli2'
//        String []args2=new String[]{"cli2"};
//        bd.delete("Clientes","usuario=?",args2);
//
//        //Ejemplo Select
//
//        String [] args3=new String[]{"cli1"};
//        Cursor c = bd.rawQuery("Select nombre,telefono from Clientes where nombre=?",args3);

        //Ejemplo Select 2
        String[] campos = new String[] {"nombre", "telefono"};
        String[] args = new String[] {"cli1"};
        Cursor c = bd.query("Clientes", campos, "nombre=?", args, null, null, null);
        //Nos aseguramos de que exista al menos un registro
        if (c.moveToFirst()) {
            //Recorremos el cursor hasta que no haya más registros
            do {
                String nombreCli = c.getString(0);
                String telefonoCli = c.getString(1);
                String mensaje="Nombre"+nombreCli+"Telefono"+telefonoCli;
                Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
            } while (c.moveToNext());

            bd.close();
        }

    }
}