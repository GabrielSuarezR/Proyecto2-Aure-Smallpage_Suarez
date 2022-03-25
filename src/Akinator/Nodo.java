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
public class Nodo {
    private Nodo right;
    private String info;

    public Nodo(String info) {
        this.right = null;
        this.info = info;
    }
 
    public Nodo getSiguiente() {
        return right;
    }

    public void setSiguiente(Nodo siguiente) {
        this.right = siguiente;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
