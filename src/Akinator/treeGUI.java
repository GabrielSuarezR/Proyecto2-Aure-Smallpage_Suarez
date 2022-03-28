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

public class treeGUI extends JFrame {
       	private JPanel contentPane;
        public ArbolBinario tree;
	public DrawTree drawer;
         
	
	/**
	 * Create the frame.
	 */
	public treeGUI(ArbolBinario tree) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 3000, 1800);
               
                
		contentPane = new JPanel(rootPaneCheckingEnabled);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		drawer = new DrawTree(tree);
		
		contentPane.add(drawer);
                this.setLayout(new BorderLayout());
               	setContentPane(contentPane);
		this.tree = tree;
		setVisible(true);
	}

}


