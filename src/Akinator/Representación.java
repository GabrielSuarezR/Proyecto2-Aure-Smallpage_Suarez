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
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Image;
import java.awt.Scrollbar;

public class Representación extends JFrame {
       	private JPanel contentPane;
        public ArbolBinario tree;
	public Dibujar_arbol drawer;
         
	
	/**
	 * Create the frame.
	 */
	public Representación(ArbolBinario tree) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 900);
                Scrollbar s  = new Scrollbar();
                s.setBounds(100, 100, 10, 1800);
                s.setOrientation(0);
                
               
                
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
<<<<<<< HEAD:src/Akinator/treeGUI.java
		drawer = new DrawTree(tree);
		contentPane.add(s);
=======
		drawer = new Dibujar_arbol(tree);
		
>>>>>>> 660e83d23a19a3d19154cc1cb2ab206cc4e5d2a0:src/Akinator/Representación.java
		contentPane.add(drawer);
                this.setLayout(new BorderLayout());
               	setContentPane(contentPane);
		this.tree = tree;
		setVisible(true);
	}

}


