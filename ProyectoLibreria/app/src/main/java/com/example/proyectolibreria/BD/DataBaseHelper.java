package com.example.proyectolibreria.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper {

    private Context context=null;
    private  DataBaseHelper dataBaseHelper=null;
    private SQLiteDatabase liteDatabase=null;
    public static final int DATABASE_VERSION=3;
    public static final String DATABASE_NAME= "Dbproyecto";

    public static final String DATABASE_TABLE_USUARIOS="Usuarios";
    private static final String USUARIOS_ID="id";
    private static final String USUARIOS_NOMBRE="nombre";
    private static final String USUARIOS_EMAIL="email";
    private static final String USUARIOS_TELEFONO="telefono";

    public static final String DATABASE_CREATE_USUARIO= "create table"+DATABASE_TABLE_USUARIOS +"("
             +USUARIOS_ID+"integer primary key,"
             +USUARIOS_NOMBRE+ "text not null,"
             +USUARIOS_EMAIL+"text not null,"
             +USUARIOS_TELEFONO+"text not null,";

    public DataBaseHelper(Context context){
        this.context=context;
    }





}
