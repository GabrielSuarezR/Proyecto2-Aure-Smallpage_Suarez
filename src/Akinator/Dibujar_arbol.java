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
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author gabriel
 */
    import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

class Dibujar_arbol extends JPanel{
	
	public ArbolBinario tree;
	/**
         * Funcion dibujar_arbol
         * Llama a la funcion dibujar pasandole los parametros necesarios.
         * @param tree pasa como parametro un arbol que se quiera representar.
         */
	public Dibujar_arbol(ArbolBinario tree){
		this.tree = tree;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
	
		g.setFont(new Font("Tahoma", Font.BOLD, 10));
		//g.drawString(String.valueOf(tree.root.data), this.getWidth()/2, 30);
		

			//DrawNode(g, tree.root,100, 50,2);

		Dibujar(g, 0, getWidth(), 0, getHeight() / tree.getheight(tree.getRoot()), tree.getRoot());
	}

/**
 * Funcion Dibujar
 * Evalua cada nodo del arbol, generando su posicion en la ventana segun su nivel y dibujandolo segun los parametros que se le pasen 
 * para poder visualizar m[as facil el arbol.
 * @param g graficas de la representacion
 * @param StartWidth es la posicion mas a la izquierda de la ventana para representar el arbol
 * @param EndWidth posicion mas a la derecha de la ventana donde se representa el arbol
 * @param StartHeight altura donde se va a representar el nodo
 * @param Level nivel del arbol donde se encuentra el nodo
 * @param nodo nodo que se esta evaluando para ser representado
 */
    public void Dibujar(Graphics g, int StartWidth, int EndWidth, int StartHeight, int Level, Nodo nodo) {
        String data = String.valueOf(nodo.getInfo());
        g.setFont(new Font("Tahoma", Font.BOLD, 7));
        FontMetrics fm = g.getFontMetrics();
        int dataWidth = fm.stringWidth(data);
        g.drawString(data, (StartWidth + EndWidth) / 2 - dataWidth / 2, StartHeight + Level / 2);
        if (nodo.getLeft()!=null) {
            g.drawLine((StartWidth + EndWidth) / 2 , StartHeight + Level / 2, (StartWidth + (StartWidth + EndWidth) / 2) / 2 , StartHeight + (Level+1)/2 + (Level+1) / 2);
            
        }
        if (nodo.getRight()!=null) {
            g.drawLine((StartWidth + EndWidth) / 2 , StartHeight + Level / 2, ((StartWidth + EndWidth) / 2 + EndWidth) / 2, StartHeight + (Level+1)/2 + (Level+1) / 2);
        }

        if (nodo.getLeft() != null)            
        	Dibujar(g, StartWidth, ((StartWidth + EndWidth) / 2), StartHeight + Level/2, Level, nodo.getLeft());
                
        
        if (nodo.getRight() != null)
        	Dibujar(g, ((StartWidth + EndWidth) / 2), EndWidth, StartHeight + Level/2, Level, nodo.getRight());
    }
	
	
}


