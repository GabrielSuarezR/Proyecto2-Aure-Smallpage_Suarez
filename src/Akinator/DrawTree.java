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

class DrawTree extends JPanel{
	
	public ArbolBinario tree;
	
	public DrawTree(ArbolBinario tree){
		this.tree = tree;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
	
		g.setFont(new Font("Tahoma", Font.BOLD, 10));
		//g.drawString(String.valueOf(tree.root.data), this.getWidth()/2, 30);
		

			//DrawNode(g, tree.root,100, 50,2);

		Draw(g, 0, getWidth(), 0, getHeight() / tree.getheight(tree.root), tree.root);
	}

	
    public void Draw(Graphics g, int StartWidth, int EndWidth, int StartHeight, int Level, Nodo_arbol node) {
        String data = String.valueOf(node.get_info());
        g.setFont(new Font("Tahoma", Font.BOLD, 7));
        FontMetrics fm = g.getFontMetrics();
        int dataWidth = fm.stringWidth(data);
        g.drawString(data, (StartWidth + EndWidth) / 2 - dataWidth / 2, StartHeight + Level / 2);
        if (node.Left_child()!=null) {
            g.drawLine((StartWidth + EndWidth) / 2 , StartHeight + Level / 2, (StartWidth + (StartWidth + EndWidth) / 2) / 2 , StartHeight + (Level+1)/2 + (Level+1) / 2);
            
        }
        if (node.Right_child()!=null) {
            g.drawLine((StartWidth + EndWidth) / 2 , StartHeight + Level / 2, ((StartWidth + EndWidth) / 2 + EndWidth) / 2, StartHeight + (Level+1)/2 + (Level+1) / 2);
        }

        if (node.Left_child() != null)            
        	Draw(g, StartWidth, ((StartWidth + EndWidth) / 2), StartHeight + Level/2, Level, node.Left_child());
                
        
        if (node.Right_child() != null)
        	Draw(g, ((StartWidth + EndWidth) / 2), EndWidth, StartHeight + Level/2, Level, node.Right_child());
    }
	
	
}


