package com.example.proyectolibreria.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelperInternalusuario extends SQLiteOpenHelper {


    public DataBaseHelperInternalusuario(Context context) {
        super(context,DataBaseHelper.DATABASE_NAME,null,DataBaseHelper.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createtables(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    private  void createtables(SQLiteDatabase db){
        db.execSQL(DataBaseHelper.DATABASE_TABLE_USUARIOS);
    }
    private void deletetables(SQLiteDatabase db){
        db.execSQL("DROP TABLE EXISTS"+DataBaseHelper.DATABASE_TABLE_USUARIOS);
    }
}
