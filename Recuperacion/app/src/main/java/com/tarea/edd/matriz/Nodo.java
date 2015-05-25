package com.tarea.edd.matriz;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saul
 */
public class Nodo {
    private Nodo siguiente;
    private Data datos;
    public Nodo(){
        siguiente = null;
        datos = null;
    }
    public Nodo(Data datos){
        siguiente = null;
        this.datos = datos;
    }
    public Nodo(Data datos, Nodo sig){
        this.datos = datos;
        this.siguiente = sig;
    }
    public void setSiguiente(Nodo sig){
        this.siguiente = sig;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public Data getDatos(){
        return datos;
    }
    public void setDatos(Data datos){
        this.datos = datos;
    }
}
