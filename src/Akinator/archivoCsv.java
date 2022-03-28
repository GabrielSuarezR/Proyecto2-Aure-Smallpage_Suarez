/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Normalizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author johnd
 */

public class archivoCsv {
    public String abrirArchivo(BinaryTree arb, HashTable hash_table){
        String aux="";   
        String texto="";
        try
        {

         JFileChooser file=new JFileChooser();
         file.showOpenDialog(null);

         File abre=file.getSelectedFile();


         if(abre!=null)
         {     
            FileReader archivos=new FileReader(abre);
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
               texto+= aux+ "\n";
            }

            if (!"".equals(texto) && !texto.isEmpty()){

                String[] txt_split= texto.split("\n");
                char espacio=' ';
                for (int i = 1; i < txt_split.length; i++) {
                    if (txt_split[0].contains(";")) {
                    String[] datos = txt_split[i].split(";");
               for (int j = 0; j < datos.length; j++) {
                            if (datos[j].charAt(0)==espacio) {
                                datos[j]=datos[j].replaceFirst(" ","");
                            }
                            datos[j]=datos[j].toLowerCase();
                            datos[j]=quitar_acentos(datos[j]);
                        }
                        System.out.println(datos[0]+"+"+datos[1]+"+"+datos[2]);
                        if (i==0) {
                            
                        }
                        if (i==1) {
                            arb.insertRoot(datos[0]);
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }else{
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }
                    }else{
                    String[] datos = txt_split[i].split(",");
                    for (int j = 0; j < datos.length; j++) {
                            if (datos[j].charAt(0)==espacio) {
                                datos[j]=datos[j].replaceFirst(" ","");
                            }
                            datos[j]=datos[j].toLowerCase();
                            datos[j]=quitar_acentos(datos[j]);
                        }
                        System.out.println(datos[0]+"+"+datos[1]+"+"+datos[2]);
                        if (i==0) {
                            
                        }
                    if (i==1) {
                            arb.insertRoot(datos[0]);
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }else{
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }
                    }
                }  
            } 
              
            String cadena="";
            cadena= arb.PreOrder(arb.getRoot(), cadena);
            String [] animales= cadena.split(",");
             for (int i = 0; i <animales.length ; i++) {
                 System.out.println(animales[i]);
                 hash_table.insertar(animales[i]);
             }
            lee.close();      
          }
         }
         catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" +
                 "\nNo se ha encontrado el archivo",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          } 
        return texto;
        
        }  
     public void guardarArchivo(String cadena){
        try
        {
         String nombre= "";
         JFileChooser file=new JFileChooser();
         file.showSaveDialog(null);
         File guarda =file.getSelectedFile();
         nombre = guarda.getName();
         String [] identificador = nombre.split("\\.(?=[^\\.]+$)");
         if (identificador.length == 1){
            if(guarda !=null){
               FileWriter  save=new FileWriter(guarda+".csv");
               save.write(cadena);
               save.close();
               JOptionPane.showMessageDialog(null,
                    "El archivo se a guardado Exitosamente",
                        "Información",JOptionPane.INFORMATION_MESSAGE);
            }
                 }else if (guarda !=null){
              FileWriter  save=new FileWriter(guarda);
            save.write(cadena);
            save.close();
            JOptionPane.showMessageDialog(null,
                 "El archivo se a guardado Exitosamente",
                     "Información",JOptionPane.INFORMATION_MESSAGE);
            
         
         }
         
        }
         catch(IOException ex)
         {
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
         }
     }
     public void escribirCvsPorDefecto(String cadena){
         try
        {
        FileWriter  save=new FileWriter("test\\arbol.csv");
        save.write(cadena);
        save.close();
        JOptionPane.showMessageDialog(null,
             "El archivo se a guardado Exitosamente",
                 "Información",JOptionPane.INFORMATION_MESSAGE);

     }catch(IOException ex)
         {
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
         }
}
     public void leerPorDefecto(BinaryTree arb, HashTable hash_table){
         String aux="";   
        String texto="";
        try
        {  
            FileReader archivos=new FileReader("test\\arbol.csv");
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
               texto+= aux+ "\n";
            }

            if (!"".equals(texto) && !texto.isEmpty()){
                String[] txt_split= texto.split("\n");
                char espacio=' ';
                for (int i = 1; i < txt_split.length; i++) {
                    if (txt_split[0].contains(";")) {
                    String[] datos = txt_split[i].split(";");
               for (int j = 0; j < datos.length; j++) {
                            if (datos[j].charAt(0)==espacio) {
                                datos[j]=datos[j].replaceFirst(" ","");
                            }
                            datos[j]=datos[j].toLowerCase();
                            datos[j]=quitar_acentos(datos[j]);
                        }
                        System.out.println(datos[0]+"+"+datos[1]+"+"+datos[2]);
                        if (i==0) {
                            
                        }
                        if (i==1) {
                            arb.insertRoot(datos[0]);
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }else{
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }
                    }else{
                    String[] datos = txt_split[i].split(",");
                    for (int j = 0; j < datos.length; j++) {
                            if (datos[j].charAt(0)==espacio) {
                                datos[j]=datos[j].replaceFirst(" ","");
                            }
                            datos[j]=datos[j].toLowerCase();
                            datos[j]=quitar_acentos(datos[j]);
                        }
                        System.out.println(datos[0]+"+"+datos[1]+"+"+datos[2]);
                        if (i==0) {
                            
                        }
                    if (i==1) {
                            arb.insertRoot(datos[0]);
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }else{
                            arb.insertLeft(datos[0], datos[1]);
                            arb.insertRight(datos[0], datos[2]);
                        }
                    }
                }  
            } 
              
            String cadena="";
            cadena= arb.PreOrder(arb.getRoot(), cadena);
            String [] animales= cadena.split(",");
             for (int i = 0; i <animales.length ; i++) {
                 System.out.println(animales[i]);
                 hash_table.insertar(animales[i]);
             }
            lee.close();      
          JOptionPane.showMessageDialog(null, "Leido exitosamente");
     
        }catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" +
                 "\nNo se ha encontrado el archivo",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          } 
}
     
     public static String quitar_acentos(String palabra) {
        palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        palabra = palabra.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return palabra;
     }
     
     public static boolean validacion_animal(String animal){
         if (animal==null) {
             return true;
         }
         boolean es_numero= animal.matches("[+-]?\\d*(\\.\\d+)?");
         if (es_numero || animal.isBlank() || animal.isEmpty() || animal==null) {
            return true;
        }
         return false;
     }
}

