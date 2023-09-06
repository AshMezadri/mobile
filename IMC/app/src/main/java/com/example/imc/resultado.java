package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class resultado extends AppCompatActivity {

    TextView txtPeso, txtAltura, resultado;
    ImageView imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtPeso = findViewById(R.id.txtPesoR);
        txtAltura = findViewById(R.id.txtAlturaR);
        resultado = findViewById(R.id.txtIMCR);
        imgResultado = findViewById(R.id.imgResultado);

        Intent intent = getIntent();
        double peso = intent.getDoubleExtra("peso", 0.0);
        double altura = intent.getDoubleExtra("altura", 0.0);
        double imc = intent.getDoubleExtra("imc", 0.0);

        DecimalFormat df = new DecimalFormat("0.00");
        resultado.setText(df.format(imc));
        txtPeso.setText(String.valueOf(peso));
        txtAltura.setText(String.valueOf(altura));

        if (imc < 18.5) {
            imgResultado.setImageResource(R.drawable.abaixopeso);
        } else if (imc >= 18.5 && imc < 24.9) {
            imgResultado.setImageResource(R.drawable.normal);
        } else if (imc >= 25 && imc < 29.9) {
            imgResultado.setImageResource(R.drawable.sobrepeso);
        } else if (imc >= 30 && imc < 34.9) {
            imgResultado.setImageResource(R.drawable.obesidade1);
        } else if (imc >= 35 && imc < 39.9) {
            imgResultado.setImageResource(R.drawable.obesidade2);
        } else{
            imgResultado.setImageResource(R.drawable.obesidade3);
        }
    }
}
