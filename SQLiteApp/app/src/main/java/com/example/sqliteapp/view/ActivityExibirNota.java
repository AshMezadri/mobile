package com.example.sqliteapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sqliteapp.R;
import com.example.sqliteapp.controller.NotaController;
import com.example.sqliteapp.model.Nota;

public class ActivityExibirNota extends AppCompatActivity {

    NotaController nController;

    EditText texto, titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_nota);
        nController = new NotaController(getApplicationContext());

        texto = findViewById(R.id.txtNota);
        titulo = findViewById(R.id.txtTitulo);

    }

    public void salvarNota(View v){
        Nota n = nController.cadastrarNota( new Nota(titulo.getText().toString(), texto.getText().toString()));
        Toast.makeText(this, Integer.toString(n.getId()), Toast.LENGTH_LONG).show();
    }
}