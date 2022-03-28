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
    Nodo_arbol root;

	public ArbolBinario() {
		this.root = null;
	}
        public boolean its_empty(Nodo_arbol n){
            return n==null;
        }
	public void insertLeft(String parent, String leftvalue) {
		Nodo_arbol n = find(root, parent);
		Nodo_arbol leftchild = new Nodo_arbol(leftvalue);
		n.Set_Left_child(leftchild);
	}

	public void insertRight(String parent, String rightvalue) {
		Nodo_arbol n = find(root, parent);
		Nodo_arbol rightchild = new Nodo_arbol(rightvalue);
		n.Set_Right_child(rightchild);
	}

	public void insertRoot(String data) {
		root = new Nodo_arbol(data);
	}

	public Nodo_arbol getRoot() {
		return root;
	}

	public Nodo_arbol find(Nodo_arbol n, String key) {
		Nodo_arbol result = null;
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


//	public void printTree(Nodo_arbol n) {
//		if (n == null)
//			return;
//		printTree(n.Left_child());
//		n.displayNode(n);
//		printTree(n.Right_child());
//	}
	
	public String PreOrder(Nodo_arbol n, String cadena){
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
        
//        public void Inicializar_mostrar(Nodo_arbol n){
//            System.setProperty("org.graphstream.ui", "swing");
//            Graph arbol = new SingleGraph("arbol");
//            arbol.setAttribute("ui.stylesheet", "graph { fill-color: orange; }");
//            PreOrder_mostrar(n, arbol);
//            Viewer viewer = arbol.display();
//            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
//        }
//        
//        public void PreOrder_mostrar(Nodo_arbol n, Graph arbol){
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
        
	
        public String archivorder(Nodo_arbol n,String cadena){
            if (n!=null){ 
            if (n.Left_child() !=null && n.Right_child()!=null) {
                 cadena += n.get_info()+","+n.Left_child().get_info()+","+n.Right_child().get_info()+"\n";
                  
            }
            cadena = archivorder(n.Left_child(), cadena);
            cadena = archivorder(n.Right_child(), cadena);
            }
            return cadena;
        }
         
}
