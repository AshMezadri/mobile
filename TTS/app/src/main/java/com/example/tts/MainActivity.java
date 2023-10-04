package com.example.tts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    private TextToSpeech tts;

    private EditText texto;

    private boolean ttsLoaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto);

        tts = new TextToSpeech(this, this);
    }

    public void onInit(int status){
        if(status==TextToSpeech.SUCCESS){
            tts.setLanguage(Locale.getDefault());
            ttsLoaded = true;
        }
    }

    public void falar(View view){
        if(ttsLoaded){
            String s = texto.getText().toString();
            tts.speak(s,TextToSpeech.QUEUE_FLUSH, null, null);
        }
    }
}