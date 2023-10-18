package com.example.sqlitetest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    ListView lv;

    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        db = openOrCreateDatabase("meudb", MODE_PRIVATE, null);

        db.execSQL("CREATE  TABLE IF NOT EXISTS user(id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR );");

        ContentValues cv = new ContentValues();
        cv.put("nome", "João");
        db.insert("user", null, cv);

        Cursor cursor = db.rawQuery("SELECT * FROM user ", null);
        cursor.moveToFirst();
        ArrayList<String> listaUsuario = new ArrayList<>();

        while (!cursor.isAfterLast()) {
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("nome")));
            Log.d("tableuser", cursor.getString(cursor.getColumnIndex("id")) +
                    cursor.getString(cursor.getColumnIndex("nome")));
            cursor.moveToNext();

        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                                                                            android.R.id.text1, listaUsuario);
        lv.setAdapter(arrayAdapter);
    }
}