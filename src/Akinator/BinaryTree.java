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
public class BinaryTree {
    Node root;

	public BinaryTree() {
		this.root = null;
	}
        public boolean its_empty(Node n){
            return n==null;
        }
	public void insertLeft(String parent, String leftvalue) {
		Node n = find(root, parent);
		Node leftchild = new Node(leftvalue);
		n.Set_Left_child(leftchild);
	}

	public void insertRight(String parent, String rightvalue) {
		Node n = find(root, parent);
		Node rightchild = new Node(rightvalue);
		n.Set_Right_child(rightchild);
	}

	public void insertRoot(String data) {
		root = new Node(data);
	}

	public Node getRoot() {
		return root;
	}

	public Node find(Node n, String key) {
		Node result = null;
		if (n == null)
			return null;
		if (n.get_info().equals(key))
			return n;
		if (n.Left_child() != null)
			result = find(n.Left_child(), key);
		if (result == null)
			result = find(n.Right_child(), key);
		return result;
	}

	public int getheight(Node root) {
		if (root == null)
			return 0;
		return Math.max(getheight(root.Left_child()), getheight(root.Right_child())) + 1;
	}

	public void printTree(Node n) {
		if (n == null)
			return;
		printTree(n.Left_child());
		n.displayNode(n);
		printTree(n.Right_child());
	}
	
	public String PreOrder(Node n, String cadena){
		if (n != null){
                    if (n.Left_child()==null && n.Right_child()==null) {
                        if (cadena.equals("")) {
                            cadena+=n.get_info();
                        }
                        else{
                            cadena+= "," + n.get_info();
                        }
                    }
		cadena= PreOrder(n.Left_child(), cadena);
		cadena= PreOrder(n.Right_child(), cadena);
                }
                return cadena;
	}
	
	public void InOrder(Node n ){
		
		if (n == null)
			return;
		InOrder(n.Left_child());
		n.displayNode(n);
		InOrder(n.Right_child());
	}
	
	public void PostOrder(Node n ){
		
		if (n == null)
			return;
		PostOrder(n.Left_child());
		PostOrder(n.Right_child());
		n.displayNode(n);
	}
        public String archivorder(Node n,String cadena){
            if (n!=null){ 
            if (n.Left_child() !=null && n.Right_child()!=null) {
                 cadena += n.get_info()+","+n.Left_child().get_info()+","+n.Right_child().get_info()+"\n";
                  
            }
            cadena = archivorder(n.Left_child(), cadena);
            cadena = archivorder(n.Right_child(), cadena);
            }
            return cadena;
        }

        public Node Max(Node n) {
            if (n.Right_child() == null) {
                return n;
            } else {
                return Max(n.Right_child());
    }
} 
}
