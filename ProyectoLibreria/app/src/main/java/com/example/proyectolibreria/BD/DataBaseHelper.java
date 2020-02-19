package com.example.proyectolibreria.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyectolibreria.Activitys.Usuarios;

public class DataBaseHelper {

    private Context context=null;
    private static   DataBaseHelperInternal dataBaseHelper=null;
    public static SQLiteDatabase liteDatabase=null;
    private DataBaseHelperInternal dataBaseHelpelibros=null;
    public static final int DATABASE_VERSION=3;
    public static final String DATABASE_NAME= "Dbproyecto";


    public static final String DATABASE_TABLE_LIBROS="Libros";
    public static final String LIBROS_ID="id";
    public static final String LIBROS_TITULO="titulo";
    public static final String LIBROS_ANYO="anyos";
    public static final String LIBROS_SINOPSIS="sinopsis";
    public static final String LIBROS_AUTOR="autor";
    public static final String LIBROS_GENERO="genero";
    public static final String USUARIO_ID="usuario_id";




    public static final String DATABASE_TABLE_USUARIOS="Usuarios";
    public static final String USUARIOS_ID="id";
    public static final String USUARIOS_NOMBRE="nombre";
    public static final String USUARIOS_Contrasenya="contrasenya";

    public static final String DATABASE_CREATE_USUARIO= "create table "+DATABASE_TABLE_USUARIOS +"("
            +USUARIOS_ID+" integer primary key autoincrement,"
            +USUARIOS_NOMBRE+ " text not null,"
            +USUARIOS_Contrasenya+" text not null)";





    public static final String DATABASE_CREATE_LIBROS="create table "+DATABASE_TABLE_LIBROS+"("
            +LIBROS_ID+" integer primary key autoincrement,"
            +LIBROS_TITULO+" text not null,"
            +LIBROS_ANYO+" text not null,"
            +LIBROS_SINOPSIS+" text not null,"
            +LIBROS_AUTOR+" text not null,"
            +LIBROS_GENERO+" text not null,"
            +USUARIO_ID+" text not null,"
            +"FOREIGN KEY ("+USUARIO_ID+") REFERENCES "+DATABASE_TABLE_LIBROS+" ("+USUARIOS_ID+"))";



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


    public Cursor getItemsUsuarios(){
        return liteDatabase.query(DATABASE_TABLE_USUARIOS,new String[] {USUARIOS_ID, USUARIOS_NOMBRE, USUARIOS_Contrasenya},
                null,null,null,null,USUARIOS_NOMBRE);
    }

    public long insertItemUsuario(String nombre, String contrasenya){
        ContentValues  contentValues=new ContentValues();
        contentValues.put(USUARIOS_NOMBRE,nombre);
        contentValues.put(USUARIOS_Contrasenya,contrasenya);
        return liteDatabase.insert(DATABASE_TABLE_USUARIOS,null,contentValues);
    }



    public Cursor getItemsLibros(){
        return liteDatabase.query(DATABASE_TABLE_LIBROS,new String[]{LIBROS_ID,LIBROS_TITULO,LIBROS_ANYO,LIBROS_SINOPSIS,LIBROS_AUTOR,LIBROS_GENERO,USUARIO_ID},
                null,null,null,null,null,LIBROS_TITULO);
    }

    public long insertItemLibros(String titulo, String anyo, String sinopsis, String autor, String genero, int user){
        ContentValues contentValues=new ContentValues();
        contentValues.put(LIBROS_TITULO ,titulo);
        contentValues.put(LIBROS_ANYO,anyo);
        contentValues.put(LIBROS_SINOPSIS,sinopsis);
        contentValues.put(LIBROS_AUTOR,autor);
        contentValues.put(LIBROS_GENERO,genero);
        contentValues.put(USUARIO_ID,user);
        return liteDatabase.insert(DATABASE_TABLE_LIBROS,null,contentValues);
    }










}
