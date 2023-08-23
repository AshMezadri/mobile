package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    MainActivity ma = new MainActivity();

    TextView txtPeso, txtAltura, resultado;
    Double peso, altura, imc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtPeso = findViewById(R.id.txtPesoR);
        txtAltura = findViewById(R.id.txtAlturaR);
        resultado = findViewById(R.id.txtIMCR);

        peso = ma.peso;
        altura = ma.altura;

        Double IMC = ma.imc;
        resultado.setText(Double.toString(IMC));
        txtPeso.setText(Double.toString(peso));
        txtAltura.setText(Double.toString(altura));



    }
}