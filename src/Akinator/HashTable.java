/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

/**
 *
 * @author johnd
 */
public class HashTable {
    private Nodo tabla[];
    private int tamaño_tabla;

    public HashTable(int tamaño_tabla) {
        this.tamaño_tabla = tamaño_tabla;
        this.tabla = new Nodo[tamaño_tabla];
        for (int i = 0; i < tamaño_tabla; i++) {
            this.tabla[i]=null; 
        }
    }

    public int hashing(String key){
        int valor=0;
        int posicion=1;
        for (int i = 0; i < key.length(); i++) {
            if (key.codePointAt(i)==32) {
                valor+=0;
            }
            else if (key.codePointAt(i)>=48 && key.codePointAt(i)<=57) {
                valor+=((key.codePointAt(i)-47)*posicion);
            }
            else if (key.codePointAt(i)>=65 && key.codePointAt(i)<=90) {
                valor+=((key.codePointAt(i)-54)*posicion);
            }
            else if (key.codePointAt(i)>=97 && key.codePointAt(i)<=122) {
                valor+=((key.codePointAt(i)-60)*posicion);
            }
            posicion=posicion*2;
        }
        return (valor % tamaño_tabla);
    }
    
    public void insertar(String nombre){
        int posicion=hashing(nombre);
        boolean existe=false;
        if (tabla[posicion]!=null) {
            Nodo temp=tabla[posicion];
            if (temp.getInfo().equals(nombre)) {
                existe=true;
            }
            while (temp.getSiguiente()!=null) {                
                temp=temp.getSiguiente();
                if (temp.getInfo().equals(nombre)) {
                    existe=true;
                }
            }
            if (!existe) {
                Nodo nuevo= new Nodo(nombre);
                temp.setSiguiente(nuevo);
            }
        }
        else{
            Nodo nuevo= new Nodo(nombre);
            tabla[posicion]=nuevo;
        }
    }
    
    public Nodo buscar(String nombre){
        int posicion=hashing(nombre);
        Nodo temp= tabla[posicion];
        boolean existe=false;
        if (temp!=null) {
            if (temp.getSiguiente()==null) {
                if (temp.getInfo().equals(nombre)) {
                    existe=true;
                }
            }
            else{
                while (temp!=null) {                    
                    if (temp.getInfo().equals(nombre)) {
                        existe=true;
                        break;
                    }
                    else{
                        temp=temp.getSiguiente();
                    }
                }
            }
        }
        if (existe) {
            return temp;
        }
        else{
            return null;
        }
    }
    
    public void vaciado(){
        for (int i = 0; i < tamaño_tabla; i++) {
            tabla[i]=null;
        }
    }
    
    
    public Nodo[] getTabla() {
        return tabla;
    }

    public void setTabla(Nodo[] tabla) {
        this.tabla = tabla;
    }

    public int getTamaño_tabla() {
        return tamaño_tabla;
    }

    public void setTamaño_tabla(int tamaño_tabla) {
        this.tamaño_tabla = tamaño_tabla;
    }
}
