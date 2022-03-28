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
public class Nodo_arbol{
        private String data;
	private Nodo_arbol left;
	private Nodo_arbol right;
	
	public Nodo_arbol(String dato) {
		this.data = dato;
		this.left = null;
		this.right = null;
	}

//	public void displayNode(Nodo_arbol n) {
//		System.out.print(n.data + " ");
//	}
        
        public String get_info(){
            return this.data;
        }
        public void Set_info(String data){
            this.data=data;
        }
        public Nodo_arbol Left_child(){
            return this.left;
        }
         public Nodo_arbol Right_child(){
            return this.right;
        }
         public void Set_Left_child(Nodo_arbol n){
             this.left=n;
         }
         public void Set_Right_child(Nodo_arbol n){
             this.right=n;
         }

}

