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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
    }

    public void onClick(View v) {

            double peso = Double.parseDouble(txtPeso.getText().toString());
            double altura = Double.parseDouble(txtAltura.getText().toString());
            double imc = peso / (altura * altura);

            Intent intent = new Intent(MainActivity.this, resultado.class);
            intent.putExtra("peso", peso);
            intent.putExtra("altura", altura);
            intent.putExtra("imc", imc);
            startActivity(intent);
    }
}