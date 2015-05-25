package com.tarea.edd.matriz;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Saul
 */
public class NodoMatriz {
    private NodoMatriz mArriba = null;
    private NodoMatriz mAbajo = null;
    private NodoMatriz mDerecha = null;
    private NodoMatriz mIzquierda = null;
    
    private ListaEnlazada mElementos = null;
    
    private String columna = "";
    private String fila = "";

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }
    
    public void agregarAvatar(Data dato){
        if(dato == null){
            return;
        }
        if(mElementos == null){
            fila = dato.getFila();
            columna = dato.getColumna();
            mElementos = new ListaEnlazada();
        }
        mElementos.InsertarFinal(dato);
    }

    public NodoMatriz getArriba() {
        return mArriba;
    }

    public void setArriba(NodoMatriz mArriba) {
        this.mArriba = mArriba;
    }

    public NodoMatriz getAbajo() {
        return mAbajo;
    }

    public void setAbajo(NodoMatriz mAbajo) {
        this.mAbajo = mAbajo;
    }

    public NodoMatriz getDerecha() {
        return mDerecha;
    }

    public void setDerecha(NodoMatriz mDerecha) {
        this.mDerecha = mDerecha;
    }

    public NodoMatriz getIzquierda() {
        return mIzquierda;
    }

    public void setIzquierda(NodoMatriz mIzquierda) {
        this.mIzquierda = mIzquierda;
    }

    public ListaEnlazada getElementos() {
        return mElementos;
    }

    public void setElementos(ListaEnlazada mElementos) {
        this.mElementos = mElementos;
    }
    
    public String toString(){
        return mElementos.print();
    }
    public ArrayList<String> getListaCorreo(){
        return mElementos.getListaCorreo();
    }
}
