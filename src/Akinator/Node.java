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
public class Node {
    private String data;
	private Node left;
	private Node right;
	
	public Node(String dato) {
		this.data = dato;
		this.left = null;
		this.right = null;
	}

	public void displayNode(Node n) {
		System.out.print(n.data + " ");
	}
        
        public String get_info(){
            return this.data;
        }
        public void Set_info(String data){
            this.data=data;
        }
        public Node Left_child(){
            return this.left;
        }
         public Node Right_child(){
            return this.right;
        }
         public void Set_Left_child(Node n){
             this.left=n;
         }
         public void Set_Right_child(Node n){
             this.right=n;
         }

}

