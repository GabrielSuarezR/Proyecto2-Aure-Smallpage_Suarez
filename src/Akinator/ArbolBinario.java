/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

import javax.swing.JOptionPane;

/**
 * Clase ArbolBinario
 * Estructura de datos Arbol Binario donde se encuentran las preguntas y animales de la base de conocimientos
 * @author gabriel
 */
public class ArbolBinario {
        private Nodo root;
        /**
        * Constructor del Arbol Binario
        * @param root raiz del arbol binario
        */
	public ArbolBinario() {
		this.root = null;
	}
        
        /**
         * Función its_empty
        * Verifica si un nodo esta vacio
        * @param n: nodo a verificar si esta vacio o no
        * @return "boolean" que representa si el nodo esta vacio 
        */
        public boolean its_empty(Nodo n){
            return n==null;
        }
        /**
         * Función insertar_izq
        * Inserta como hijo izquierdo de un nodo padre
        * @param cadena: cadena correspondiente a la informacion del nodo a insertar
        * @param padre: cadena correspondiente a la informacion del padre
        */
	public void insertar_izq(String padre, String cadena) {
		Nodo n = buscar(root, padre);
		Nodo hijo_izq= new Nodo(cadena);
		n.setLeft(hijo_izq);
	}
        /**
         * Función insertar_der
        * Inserta como hijo derecho de un nodo padre
        * @param cadena: cadena correspondiente a la informacion del nodo a insertar
        * @param padre: cadena correspondiente a la informacion del padre
        */
	public void insertar_der(String padre, String cadena) {
		Nodo n = buscar(root, padre);
		Nodo hijo_der = new Nodo(cadena);
		n.setRight(hijo_der);
	}
        /**
         * Función insertar_raiz
        * Inserta la raiz del arbol
        * @param data: cadena correspondiente a la informacion de la raiz
        */    
	public void insertar_raiz(String data) {
		root = new Nodo(data);
	}
        /**
         * Función buscar
        * Busca un nodo que se encuentra en el arbol
        * @param n: nodo a verificar si esta en el arbol
        * @param key: informacion del nodo a buscar
        * @return "Nodo" que retorna el nodo a buscar en caso de encontrarlo
        */
	public Nodo buscar(Nodo n, String key) {
		Nodo result = null;
		if (n == null)
			return null;
		if (n.getInfo().equals(key))
			return n;
		if (n.getLeft() != null)
			result = buscar(n.getLeft(), key);
		if (result == null)
			result = buscar(n.getRight(), key);
		return result;
	}

	/**
         * Función PreOrder
        * Hace el recorrido del arbol binario en preorden
        * @param n: nodo en el que se va a comenzar el recorrido
        * @param cadena: informacion de los nodos recorridos
        * @return "String" que retorna el resultado del recorrido
        */
	public String PreOrder(Nodo n, String cadena){
		if (n != null){
                    if (n.getLeft()==null && n.getRight()==null) {
                        if (cadena.equals("")) {
                            cadena+=n.getInfo();
                        }
                        else{
                            cadena+= "," + n.getInfo();
                        }
                    }
		cadena= PreOrder(n.getLeft(), cadena);
		cadena= PreOrder(n.getRight(), cadena);
                }
                return cadena;
	}
        
        /**
         * Funcion archivorder
        * Crea un String con la informacion ordenada corretamente para ser guardada en el archivo por defecto.
        * @param n: nodo que va a recorrer para agarrar ambos hijos y escribir los 3 nodos en el String.
        * @param cadena: cadena en la que se va a guardar el string del archivo, de forma que se vpuedo volver a leer.
        * @return "String" retorna la cadena
        */
	
        public String archivorder(Nodo n,String cadena){
            if (n!=null){ 
            if (n.getLeft() !=null && n.getRight()!=null) {
                 cadena += n.getInfo()+","+n.getLeft().getInfo()+","+n.getRight().getInfo()+"\n";
                  
            }
            cadena = archivorder(n.getLeft(), cadena);
            cadena = archivorder(n.getRight(), cadena);
            }
            return cadena;
        }
        
        /**
         * Función getheight
        * Halla la altura del arbol binario
        * @param root: nodo raiz del arbol
        * @return "int" que representa la altura del arbol
        */
        public int getheight(Nodo root) {
		if (root == null)
			return 0;
		return Math.max(getheight(root.getLeft()), getheight(root.getRight())) + 1;
	}
        /**
         * Función getRoot
        * Halla raiz del arbol binario
        * @return "Nodo" que representa la raiz del arbol
        */
        public Nodo getRoot() {
            return root;
        }
        /**
         * Función setRoot
        * Establece la raiz del arbol binario
        * @param root: nodo que va a establecerse como raiz
        */
        public void setRoot(Nodo root) {
            this.root = root;
        }
         
}
