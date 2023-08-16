package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.txtN1);
        n2=findViewById(R.id.txtN2);
        resultado=findViewById(R.id.resultado);

    }

    public void sorteio(View v){
        Random random = new Random();

        int min = Integer.parseInt(n1.getText().toString());
        int max = Integer.parseInt(n2.getText().toString());

        int randomNum=(int)(Math.random()*(max+min));

        resultado.setText(Integer.toString(randomNum));
    }
}