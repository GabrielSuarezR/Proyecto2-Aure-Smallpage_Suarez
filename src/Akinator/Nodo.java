/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

/**
 *
 * @author gabriel
 */
public class Nodo{
        private String info;
	private Nodo left;
	private Nodo right;
	
	public Nodo(String info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public Nodo getLeft() {
            return left;
        }

        public void setLeft(Nodo left) {
            this.left = left;
        }

        public Nodo getRight() {
            return right;
        }

        public void setRight(Nodo right) {
            this.right = right;
        }
        
        

}

