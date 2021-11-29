package com.example.tiendamovil.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbConnection extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "tiendamovil";
    public static final int DATABASE_VERSION = 1;
    public DbConnection(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE users (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " name VARCHAR(50),identificacion varchar(50), email VARCHAR(50),  password VARCHAR(16)," +
                "role VARCHAR(15), shop VARCHAR(20))";
        String  sql2= "CREATE TABLE product(idProduct INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nameProduct VARCHAR(50),cantidadProduct int,marcaProduct VARCHAR(50), precioProduct int)";
        db.execSQL(sql);
        db.execSQL(sql2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        onCreate(db);
    }
}
