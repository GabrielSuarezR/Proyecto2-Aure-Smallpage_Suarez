/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

/**
 *
 * @author sebas
 */

public class Main {
    public static BinaryTree arb;
    public static HashTable hash_table;
    public static archivoCsv csv;
    
    public static void main(String[] args) {
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(arb, csv, hash_table);
        ventanaPrincipal.setVisible(true);
        
        
    }
}
