/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

/**
 * Clase Nodo
 * Nodo que guarda las preguntas y los animales
 * @author gabriel
 */
public class Nodo{
        private String info;
	private Nodo left;
	private Nodo right;
	/**
        * Constructor del Nodo
        * @param info informacion del nodo
        * @param left apuntador al hijo izquierdo
        * @param right apuntador al hijo derecho
        */
	public Nodo(String info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}
        /**
         * Función getInfo
        * Obtiene la informacion del nodo
        * @return "String" que representa informacion del nodo
        */
        public String getInfo() {
            return info;
        }
        /**
         * Función setInfo
        * Establece la informacion del nodo
        * @param info: nodo al que se le va a asignar cierta informacion
        */
        public void setInfo(String info) {
            this.info = info;
        }
        /**
         * Función getLeft
        * Obtiene el hijo izquierdo de un nodo
        * @return "Nodo" que representa el hijo izquierdo de un nodo
        */
        public Nodo getLeft() {
            return left;
        }
        /**
         * Función setLeft
        * Establece el hijo izquierdo de un nodo
        * @param left: nodo que va a ser establecido como hijo izquierdo
        */
        public void setLeft(Nodo left) {
            this.left = left;
        }
        /**
         * Función getRight
        * Obtiene el hijo derecho de un nodo
        * @return "Nodo" que representa el hijo derecho de un nodo
        */
        public Nodo getRight() {
            return right;
        }
        /**
         * Función setRight
        * Establece el hijo derecho de un nodo
        * @param right: nodo que va a ser establecido como hijo derecho
        */
        public void setRight(Nodo right) {
            this.right = right;
        }
        
        

}

