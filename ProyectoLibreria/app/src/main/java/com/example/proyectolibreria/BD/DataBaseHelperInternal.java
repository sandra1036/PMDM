package com.example.proyectolibreria.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelperInternal extends SQLiteOpenHelper {


    public DataBaseHelperInternal (Context context) {
        super(context,DataBaseHelper.DATABASE_NAME,null,DataBaseHelper.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createtables(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public static   void createtables(SQLiteDatabase db){
        db.execSQL(DataBaseHelper.DATABASE_CREATE_USUARIO);
        db.execSQL(DataBaseHelper.DATABASE_CREATE_LIBROS);
    }

    public static void deletetables(SQLiteDatabase db){
        db.execSQL("DROP TABLE if EXISTS "+DataBaseHelper.DATABASE_TABLE_USUARIOS);
        db.execSQL("DROP TABLE if EXISTS "+DataBaseHelper.DATABASE_TABLE_LIBROS);
    }

}



