package com.example.sqliteapp.controller;

import android.content.Context;

import com.example.sqliteapp.model.Nota;
import com.example.sqliteapp.model.NotaDAO;

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
}
