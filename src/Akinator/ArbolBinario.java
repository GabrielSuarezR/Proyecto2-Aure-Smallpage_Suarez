/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

import javax.swing.JOptionPane;
//import javax.swing.text.html.StyleSheet;
//import org.graphstream.graph.Edge;
//import org.graphstream.graph.Graph;
//import org.graphstream.graph.Node;
//import org.graphstream.graph.implementations.SingleGraph;
//import org.graphstream.ui.view.Viewer;

/**
 *
 * @author gabriel
 */
public class ArbolBinario {
    private Nodo root;

	public ArbolBinario() {
		this.root = null;
	}
        public boolean its_empty(Nodo n){
            return n==null;
        }
	public void insertar_izq(String padre, String cadena) {
		Nodo n = buscar(root, padre);
		Nodo hijo_izq= new Nodo(cadena);
		n.setLeft(hijo_izq);
	}

	public void insertar_der(String padre, String cadena) {
		Nodo n = buscar(root, padre);
		Nodo hijo_der = new Nodo(cadena);
		n.setRight(hijo_der);
	}

	public void insertar_raiz(String data) {
		root = new Nodo(data);
	}

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


//	public void printTree(Nodo n) {
//		if (n == null)
//			return;
//		printTree(n.Left_child());
//		n.displayNode(n);
//		printTree(n.Right_child());
//	}
	
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
        
//        public void Inicializar_mostrar(Nodo n){
//            System.setProperty("org.graphstream.ui", "swing");
//            Graph arbol = new SingleGraph("arbol");
//            arbol.setAttribute("ui.stylesheet", "graph { fill-color: orange; }");
//            PreOrder_mostrar(n, arbol);
//            Viewer viewer = arbol.display();
//            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
//        }
//        
//        public void PreOrder_mostrar(Nodo n, Graph arbol){
//		if (n != null){
//                    try {
//                       Node addNode= arbol.addNode(n.get_info());
//                       addNode.setAttribute("ui.label", n.get_info() + " RAIZ DEL ÁRBOL");
//                    } catch (Exception e) {
//                    }
//                    if (n.Left_child()!=null) {
//                        try {
//                            Node addNode_2= arbol.addNode(n.Left_child().get_info());
//                            addNode_2.setAttribute("ui.label", n.Left_child().get_info());
//                            Edge addEdge = arbol.addEdge(n.get_info()+n.Left_child().get_info(),n.get_info() ,n.Left_child().get_info());
//                        } catch (Exception e) {
//                        }
//                    }
//                    if (n.Right_child()!=null) {
//                        try {
//                            Node addNode_3= arbol.addNode(n.Right_child().get_info());
//                            addNode_3.setAttribute("ui.label", n.Right_child().get_info());
//                            Edge addEdge_2 = arbol.addEdge(n.get_info()+n.Right_child().get_info(),n.get_info() ,n.Right_child().get_info());
//                        } catch (Exception e) {
//                        }
//                    }
//		PreOrder_mostrar(n.Left_child(), arbol);
//                PreOrder_mostrar(n.Right_child(), arbol);
//                }
//	}
        
	
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
        public int getheight(Nodo root) {
		if (root == null)
			return 0;
		return Math.max(getheight(root.getLeft()), getheight(root.getRight())) + 1;
	}

        public Nodo getRoot() {
            return root;
        }

        public void setRoot(Nodo root) {
            this.root = root;
        }
         
}
