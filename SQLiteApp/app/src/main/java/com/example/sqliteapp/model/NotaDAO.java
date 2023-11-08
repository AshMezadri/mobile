package com.example.sqliteapp.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class NotaDAO {

    SQLiteDatabase database;
    public NotaDAO(Context c) {
        database = c.openOrCreateDatabase("dbNotas", c.MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS notas(id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "titulo VARCHAR,"+
                "texto VARCHAR)");
    }

    public Nota inserirNota(Nota n){

        ContentValues contentValues = new ContentValues();
        contentValues.put("titulo", n.getTitulo());
        contentValues.put("texto", n.getTexto());

        int i = (int) database.insert("notas", null, contentValues);

        n.setId(i);
        return n;
    }

}
