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
    /**
     * Funcion abrirArchivo
     * Funcion que te abre los directorios de la computadora para que puedas recorrerlos y buscar el archivo que desees abrir,
     * siempre que sea valido
     * @param arb arbol base que se le van a pasar los datos del archivo
     * @param hash_table tabla hash base que se le van a pasar la informacion del archivo
     * @return 
     */
    public String abrirArchivo(ArbolBinario arb, HashTable hash_table){
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
                        if (i==0) {
                            
                        }
                        if (i==1) {
                            arb.insertar_raiz(datos[0]);
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
                        }else{
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
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
                        if (i==0) {
                            
                        }
                    if (i==1) {
                            arb.insertar_raiz(datos[0]);
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
                        }else{
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
                        }
                    }
                }  
            } 
              
            String cadena="";
            cadena= arb.PreOrder(arb.getRoot(), cadena);
            String [] animales= cadena.split(",");
             for (int i = 0; i <animales.length ; i++) {
                 hash_table.insertar(animales[i]);
             }
            lee.close();      
          }
         }
         catch(Exception e)
         {
           JOptionPane.showMessageDialog(null, 
                 "Archivo de texto inválido",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
           texto="";
           return texto;
          } return texto;
        }  
    /**
     * Funcion guardarArchivo
     * funcion que se la pasa un String que va a ser guardado en el archivo seleccionado por el mismo
     * recorrido por directorios
     * @param cadena String que contiene la informacion a ser guardada
     */
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
                    "El archivo se ha guardado Exitosamente",
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
         catch(Exception e)
         {
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
         }
     }
     /**
      * Funcion escribirCvsPorDefecto
      * Guarda los cambios hechos en el programa en el Csv incluido por defecto, sin necesidad
      * de buscar un archivo.
      * @param cadena  String que contiene la informacion a ser guardada
      */
     public void escribirCvsPorDefecto(String cadena){
         try
        {
        FileWriter  save=new FileWriter("test\\arbol.csv");
        save.write(cadena);
        save.close();
        JOptionPane.showMessageDialog(null,
             "El archivo se ha guardado Exitosamente",
                 "Información",JOptionPane.INFORMATION_MESSAGE);

     }catch(Exception e)
         {
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
         }
}
     /**
      * Funcion leerPorDefecto
      * Funcion que llena el arbol y la tabla hash base con la informacion del Csv incluido por
      * defecto en el programa sin necesidad de buscar un archivo externo.
      * @param arb arbol base que se va a crear con la inforamcion del Csv
      * @param hash_table tabla hash que se va a lleanr con la informacion del Csv por defecto
      */
     public void leerPorDefecto(ArbolBinario arb, HashTable hash_table){
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
                        if (i==0) {
                            
                        }
                        if (i==1) {
                            arb.insertar_raiz(datos[0]);
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
                        }else{
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
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
                        if (i==0) {
                            
                        }
                    if (i==1) {
                            arb.insertar_raiz(datos[0]);
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
                        }else{
                            arb.insertar_izq(datos[0], datos[1]);
                            arb.insertar_der(datos[0], datos[2]);
                        }
                    }
                }  
            } 
              
            String cadena="";
            cadena= arb.PreOrder(arb.getRoot(), cadena);
            String [] animales= cadena.split(",");
             for (int i = 0; i <animales.length ; i++) {
                 hash_table.insertar(animales[i]);
             }
            lee.close();      
          JOptionPane.showMessageDialog(null, "Archivo por defecto cargado exitosamente");
     
        }catch(Exception e)
         {
           JOptionPane.showMessageDialog(null,
                 "Archivo de texto inválido",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          }
        
}
     /**
      * Funcion quitar_acentos
      * funcionq que recorre el String para quitar acentos y caracteres varios que no se leen por defecto
      * para evitar la representacion de palabras incomprensibles.
      * @param palabra String que se le pasa para evaluar cada letra
      * @return retorna el mismo String pero con caracteres sin acentos.
      */
     public static String quitar_acentos(String palabra) {
        palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        palabra = palabra.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return palabra;
     }
     /**
      * Funcion validacion_animal
      * valida que el animal insertado no sea vacio, numerico o alguna insercion incompredible.
      * @param animal String del animal nuevo
      * @return retorna si el String es valido o no.
      */
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

