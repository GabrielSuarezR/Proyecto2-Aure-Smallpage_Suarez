/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

/**
 Clase HashTable
 * Estructura de datos Hashtable para almacenar y verificar la existencia de un animal
 * @author johnd
 */
public class HashTable {
    private Nodo tabla[];
    private int tamaño_tabla;

    /**
     * Constructor de la HashTable
     * @param tamaño_tabla numero de elementos que tendrá la tabla 
     * @param tabla arreglo de Nodos del mismo tamaño de la tabla
     */
    public HashTable(int tamaño_tabla) {
        this.tamaño_tabla = tamaño_tabla;
        this.tabla = new Nodo[tamaño_tabla];
        for (int i = 0; i < tamaño_tabla; i++) {
            this.tabla[i]=null; 
        }
    }

    /**
     * Función Hashing
     * Toma una clave y devuelve el numero de grupo al que será añadido el elemento en la tabla
     * @param key: clave del elemento a ser añadido; el nombre del animal 
     * @return "int" que representa el número de grupo donde será añadido la key a la tabla
     */
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
    
    /**
     * Procedimiento insertar
     * Inserta el animal en la HashTable haciendo uso de la Hash function "hashing"
     * @param nombre nombre del animal
     */
    public void insertar(String nombre){
        int posicion=hashing(nombre);
        boolean existe=false;
        if (tabla[posicion]!=null) {
            Nodo temp=tabla[posicion];
            if (temp.getInfo().equals(nombre)) {
                existe=true;
            }
            while (temp.getRight()!=null) {                
                temp=temp.getRight();
                if (temp.getInfo().equals(nombre)) {
                    existe=true;
                }
            }
            if (!existe) {
                Nodo nuevo= new Nodo(nombre);
                temp.setRight(nuevo);
            }
        }
        else{
            Nodo nuevo= new Nodo(nombre);
            tabla[posicion]=nuevo;
        }
    }
    
    /**
     * Función buscar
     * Busca en la HashTable el animal a través de recibir el nombre del mismo
     * @param nombre: nombre del animal
     * @return "Nodo" retorna el nodo que contiene el nombre del animal buscado, si no se encuentra en la tabla se devuelve null
     */
    public Nodo buscar(String nombre){
        int posicion=hashing(nombre);
        Nodo temp= tabla[posicion];
        boolean existe=false;
        if (temp!=null) {
            if (temp.getRight()==null) {
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
                        temp=temp.getRight();
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
    
    /**
     * Procedimiento vaciado
     * Vacia la HashTable
     */
    public void vaciado(){
        for (int i = 0; i < tamaño_tabla; i++) {
            tabla[i]=null;
        }
    }
    
    /**
     * Función getTable
     * @return retorna el arreglo de nodos que forman la tabla
     */
    public Nodo[] getTabla() {
        return tabla;
    }

    /**
     * Procedimiento setTabla
     * Permite establecer la HashTable a un arreglo determinado
     * @param tabla arreglo de nodos
     */
    public void setTabla(Nodo[] tabla) {
        this.tabla = tabla;
    }

    /**
     * Función getTamaño_tabla
     * @return retorna el tamaño de la tabla
     */
    public int getTamaño_tabla() {
        return tamaño_tabla;
    }

    /**
     * Función setTamaño_tabla
     * Permite establecer el tamaño de la tabla a un tamaño determinado
     * @param tamaño_tabla recibe el tamaño de la tabla que será establecido 
     */
    public void setTamaño_tabla(int tamaño_tabla) {
        this.tamaño_tabla = tamaño_tabla;
    }
}
