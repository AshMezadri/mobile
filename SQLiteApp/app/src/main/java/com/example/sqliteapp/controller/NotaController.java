package com.example.sqliteapp.controller;

import android.content.Context;

import com.example.sqliteapp.model.Nota;
import com.example.sqliteapp.model.NotaDAO;

import java.util.ArrayList;

public class NotaController {

    NotaDAO nDAO;

    public NotaController(Context c){
        nDAO = new NotaDAO();
    }
    public void cadastrarNota(Nota n){
        if (n.getTitulo().length()>3){
            nDAO.inserirNota();
        }
    }
    public Nota getNota(int idNota){
        //return nDAO.getNota(idNota);
    }
    public void excluirNota(Nota n){
        if (n.getTitulo().length()>3){
            nDAO.excluirNota();
        }
    }
    public ArrayList<Nota> recuperaTodasNotas(){

        return nDAO.listarNotas();
    }

    public ArrayList<String> recuperaTituloNotas(){
        ArrayList<String> tituloNotas = new ArrayList<>();
        for (Nota n:this.recuperaTodasNotas()) {
            tituloNotas.add(n.getTitulo());
        }
        return tituloNotas;
    }
}
