package com.example.sqliteapp.controller;

import android.content.Context;

import com.example.sqliteapp.model.Nota;
import com.example.sqliteapp.model.NotaDAO;

import java.util.ArrayList;

public class NotaController {

    Context mContext;
    NotaDAO nDAO;

    public NotaController(Context c) {

        mContext = c;
        nDAO = new NotaDAO(c);
    }

    public Nota cadastrarNota(Nota n){

        return nDAO.inserirNota(n);
    }

    public ArrayList<Nota> listaNota(){
        return nDAO.getListaNotas();

    }

    public ArrayList<String> listaTitulosNotas(){

        ArrayList<String> result = new ArrayList<String>();

        for (Nota nota: this.listaNota()){
            result.add(nota.getTitulo());
        }

        return result;
    }
}
