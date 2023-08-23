package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtPeso, txtAltura;
    TextView txtImc;
    Double peso, altura, imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        txtImc = findViewById(R.id.txtIMCR);
    }

    public void onCLick(View v){


        peso = Double.parseDouble(txtPeso.getText().toString());
        altura = Double.parseDouble(txtAltura.getText().toString());
        imc = peso / (altura * altura);

        Intent it = new Intent(MainActivity.this, resultado.class);
        startActivity(it);

    }
}