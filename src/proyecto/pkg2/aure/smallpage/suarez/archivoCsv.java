/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2.aure.smallpage.suarez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author gabriel
 */
public class archivoCsv {

     public String abrirArchivo(BinaryTree arb){
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
                for (int i = 1; i < txt_split.length; i++) {
                    if (txt_split[0].contains(";")) {
                    String[] datos = txt_split[i].split(";");
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
     public void guardarArchivo(JTextArea area){
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
               save.write(area.getText());
               save.close();
               JOptionPane.showMessageDialog(null,
                    "El archivo se a guardado Exitosamente",
                        "Información",JOptionPane.INFORMATION_MESSAGE);
            }
                 }else if (guarda !=null){
              FileWriter  save=new FileWriter(guarda);
            save.write(area.getText());
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
}
