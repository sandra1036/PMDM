package com.example.spinnerbasedatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PersonaSQLiteHelper extends SQLiteOpenHelper {
    String cadSQL = "CREATE TABLE Clientes (codigo INTEGER, nombre TEXT, telefono TEXT)";


    public PersonaSQLiteHelper(Context contexto, String nombre, SQLiteDatabase.CursorFactory almacen, int version) {
        super(contexto, nombre, almacen, version);
    }

    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL(cadSQL);
    }

    public void onUpgrade(SQLiteDatabase bd, int versionAnterior, int versionNueva) {

        bd.execSQL("DROP TABLE IF EXISTS Clientes");
        bd.execSQL(cadSQL);

    }
}