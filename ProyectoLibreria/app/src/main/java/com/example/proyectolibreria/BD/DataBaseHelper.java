package com.example.proyectolibreria.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DataBaseHelper {

    private Context context=null;
    public static   DataBaseHelperInternal dataBaseHelper=null;
    public static SQLiteDatabase liteDatabase=null;
    private DataBaseHelperInternallibros dataBaseHelpelibros=null;
    public static final int DATABASE_VERSION=3;
    public static final String DATABASE_NAME= "Dbproyecto";


    public static final String DATABASE_TABLE_LIBROS="Libros";
    public static final String LIBROS_ID="id";
    public static final String LIBROS_TITULO="titulo";
    public static final String LIBROS_ANYO="anyos";
    public static final String LIBROS_SINOPSIS="sinopsis";
    public static final String LIBROS_AUTOR="autor";
    public static final String LIBROS_GENERO="genero";

    public static final String DATABASE_CREATE_LIBROS="crate table"+DATABASE_TABLE_LIBROS+"("
            +LIBROS_ID+"integer primary key autoincrement,"
            +LIBROS_TITULO+"text not null,"
            +LIBROS_ANYO+"text not null,"
            +LIBROS_SINOPSIS+"text not null,"
            +LIBROS_AUTOR+"text not null,"
            +LIBROS_GENERO+"text not null,)";


    public static final String DATABASE_TABLE_USUARIOS="Usuarios";
    public static final String USUARIOS_ID="id";
    public static final String USUARIOS_NOMBRE="nombre";
    public static final String USUARIOS_Contrasenya="contrasenya";
    public static final String LIBRO_ID="libro_id";

    public static final String DATABASE_CREATE_USUARIO= "create table"+DATABASE_TABLE_USUARIOS +"("
             +USUARIOS_ID+"integer primary key autoincrement,"
             +USUARIOS_NOMBRE+ "text not null,"
             +USUARIOS_Contrasenya+"text not null,"
             +LIBRO_ID+"text not null,"
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

    public Cursor getItemsUsuarios(){
        return liteDatabase.query(DATABASE_TABLE_USUARIOS,new String[] {USUARIOS_ID, USUARIOS_NOMBRE, USUARIOS_Contrasenya, LIBRO_ID},
                null,null,null,null,null,USUARIOS_NOMBRE);
    }

    public long insertItemUsuario(String nombre,String email,String telefono,String libroid){
        ContentValues  contentValues=new ContentValues();
        contentValues.put(USUARIOS_NOMBRE,nombre);
        contentValues.put(USUARIOS_Contrasenya,email);
        contentValues.put(LIBRO_ID,libroid);
        return liteDatabase.insert(DATABASE_TABLE_USUARIOS,null,contentValues);
    }









}
