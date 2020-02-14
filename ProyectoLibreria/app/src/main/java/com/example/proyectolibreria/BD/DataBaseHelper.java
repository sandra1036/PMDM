package com.example.proyectolibreria.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper {

    private Context context=null;
    private  DataBaseHelperInternal dataBaseHelper=null;
    private SQLiteDatabase liteDatabase=null;
    private DataBaseHelperInternallibros dataBaseHelpelibros=null;
    public static final int DATABASE_VERSION=3;
    public static final String DATABASE_NAME= "Dbproyecto";


    public static final String DATABASE_TABLE_LIBROS="Libros";
    private static final String LIBROS_ID="id";
    private static final String LIBROS_TITULO="titulo";
    private static final String LIBROS_ANYO="anyos";
    private static final String LIBROS_SINOPSIS="sinopsis";
    private static final String LIBROS_AUTOR="autor";
    private static final String LIBROS_GENERO="genero";

    public static final String DATABASE_CREATE_LIBROS="crate table"+DATABASE_TABLE_LIBROS+"("
            +LIBROS_ID+"integer primary key autoincrement,"
            +LIBROS_TITULO+"text not null,"
            +LIBROS_ANYO+"text not null,"
            +LIBROS_SINOPSIS+"text not null,"
            +LIBROS_AUTOR+"text not null,"
            +LIBROS_GENERO+"text not null,";


    public static final String DATABASE_TABLE_USUARIOS="Usuarios";
    private static final String USUARIOS_ID="id";
    private static final String USUARIOS_NOMBRE="nombre";
    private static final String USUARIOS_EMAIL="email";
    private static final String USUARIOS_TELEFONO="telefono";
    private static final String LIBRO_ID="libro_id";

    public static final String DATABASE_CREATE_USUARIO= "create table"+DATABASE_TABLE_USUARIOS +"("
             +USUARIOS_ID+"integer primary key autoincrement,"
             +USUARIOS_NOMBRE+ "text not null,"
             +USUARIOS_EMAIL+"text not null,"
             +USUARIOS_TELEFONO+"text not null,"
             +"FOREIGN KEY ("+LIBRO_ID+") REFERENCES "+DATABASE_TABLE_LIBROS+" ("+LIBROS_ID+")";



    public DataBaseHelper(Context context){
        this.context=context;
    }

    public DataBaseHelper open(){
        dataBaseHelper= new DataBaseHelperInternal(context);
        liteDatabase=dataBaseHelper.getWritableDatabase();
        return this;
    }

    public void close(){
        dataBaseHelper.close();
    }

    public long insertItemUsuario(String nombre,String email,String telefono,String libroid){
        ContentValues  contentValues=new ContentValues();
        contentValues.put(USUARIOS_NOMBRE,nombre);
        contentValues.put(USUARIOS_EMAIL,email);
        contentValues.put(USUARIOS_TELEFONO,telefono);
        contentValues.put(LIBRO_ID,libroid);
        return liteDatabase.insert(DATABASE_TABLE_USUARIOS,null,contentValues);
    }









}
