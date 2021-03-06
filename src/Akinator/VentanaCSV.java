/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

import javax.swing.JOptionPane;

/**
 * Clase VentanaCSV
 * Ventana con las opciones relacionadas a la inicializacion, carga y 
 * guardado del archivo, consulta de animales en la base de conocimientos 
 * y representacion grafica del arbol 
 * @author sebas
 */
public class VentanaCSV extends javax.swing.JFrame {
    public static HashTable hash_table;
    public static ArbolBinario arb;
    public static archivoCsv csv;
    
    
    /**
     * Creates new form VentanaCSV
     */
    /**
        * Constructor de VentanaCSV
        * @param hash_table estructura de datos Hash Table
        * @param arb estructura de datos Arbol Binario
        * @param csv archivo csv
        */
    public VentanaCSV(HashTable hash_table, ArbolBinario arb, archivoCsv csv) {
        initComponents();
        this.hash_table= hash_table;
        this.csv = csv;
        this.arb = arb;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        cargarButton = new javax.swing.JButton();
        inicializarButton = new javax.swing.JButton();
        consultarAnimalButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        mostrarBDCButton = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        guardarPorDefectoButton = new javax.swing.JButton();
        cargarPorDefectoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(255, 102, 0));
        backButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("<<<");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 60, 30));

        exitButton.setBackground(new java.awt.Color(255, 102, 0));
        exitButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("x");
        exitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 30, 30));

        cargarButton.setBackground(new java.awt.Color(255, 102, 0));
        cargarButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cargarButton.setForeground(new java.awt.Color(0, 0, 0));
        cargarButton.setText("Cargar archivo externo");
        cargarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cargarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cargarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 50));

        inicializarButton.setBackground(new java.awt.Color(255, 102, 0));
        inicializarButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        inicializarButton.setForeground(new java.awt.Color(0, 0, 0));
        inicializarButton.setText("Inicializar ");
        inicializarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inicializarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicializarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicializarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(inicializarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 50));

        consultarAnimalButton.setBackground(new java.awt.Color(255, 102, 0));
        consultarAnimalButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        consultarAnimalButton.setForeground(new java.awt.Color(0, 0, 0));
        consultarAnimalButton.setText("Consultar Animal");
        consultarAnimalButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        consultarAnimalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarAnimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAnimalButtonActionPerformed(evt);
            }
        });
        jPanel1.add(consultarAnimalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 210, 50));

        guardarButton.setBackground(new java.awt.Color(255, 102, 0));
        guardarButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        guardarButton.setForeground(new java.awt.Color(0, 0, 0));
        guardarButton.setText("Guardar en archivo externo");
        guardarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 50));

        mostrarBDCButton.setBackground(new java.awt.Color(255, 102, 0));
        mostrarBDCButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        mostrarBDCButton.setForeground(new java.awt.Color(0, 0, 0));
        mostrarBDCButton.setText("Mostrar Base de Conocimientos");
        mostrarBDCButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mostrarBDCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarBDCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBDCButtonActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarBDCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 430, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 153, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 17)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText(" *NOTA: Recuerde que al cargar un \n archivo, este debe ser de tipo \"csv\".");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, 40));

        guardarPorDefectoButton.setBackground(new java.awt.Color(255, 102, 0));
        guardarPorDefectoButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        guardarPorDefectoButton.setForeground(new java.awt.Color(0, 0, 0));
        guardarPorDefectoButton.setText("Guardar en archivo por defecto");
        guardarPorDefectoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardarPorDefectoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarPorDefectoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPorDefectoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(guardarPorDefectoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 210, 50));

        cargarPorDefectoButton.setBackground(new java.awt.Color(255, 102, 0));
        cargarPorDefectoButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cargarPorDefectoButton.setForeground(new java.awt.Color(0, 0, 0));
        cargarPorDefectoButton.setText("Cargar archivo por defecto");
        cargarPorDefectoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cargarPorDefectoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarPorDefectoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPorDefectoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cargarPorDefectoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Akinator/fondoAkinator.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
        * Funci??n backButtonActionPerformed
        * Vuelve a la ventana principal del programa
        */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        new VentanaPrincipal(arb, csv, hash_table);
    }//GEN-LAST:event_backButtonActionPerformed
    /**
        * Funci??n exitButtonActionPerformed
        * Finaliza el programa
        */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    /**
        * Funci??n consultarAnimalButtonActionPerformed
        * Consulta si un animal ingresado por el usuario existe en la base de conocimientos
        */
    private void consultarAnimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAnimalButtonActionPerformed
        if ((arb == null) && (hash_table == null)) {
            
            JOptionPane.showMessageDialog(null, "Es necesario que cargue un archivo para poder consultar un animal");
        
        } else {
            
            String cadena= JOptionPane.showInputDialog("Ingrese el nombre del animal a buscar: ");
            boolean es_numero= cadena.matches("[+-]?\\d*(\\.\\d+)?");
            if (es_numero || cadena.isBlank() || cadena.isEmpty() || cadena==null) {
                JOptionPane.showMessageDialog(null, "La cadena no puede ser num??rica o estar vac??a");
            }else{
               cadena= archivoCsv.quitar_acentos(cadena);
               cadena= cadena.toLowerCase();
               Nodo buscado= hash_table.buscar(cadena);
                if (buscado==null) {
                    JOptionPane.showMessageDialog(null, "'"+cadena+"'"+" no se encuentra registado en la base de conocimientos");
                }else{
                    JOptionPane.showMessageDialog(null, "'" + buscado.getInfo() + "'" + " se encuentra registrado en la base de conocimientos");
                }   
            }       
        }   
    }//GEN-LAST:event_consultarAnimalButtonActionPerformed
    /**
        * Funci??n cargarButtonActionPerformed
        * Carga un archivo csv externo con la informacion para poder utilizar el programa
        */
    private void cargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarButtonActionPerformed
        
        if ((arb == null) && (hash_table == null) ) {
            
            this.csv = new archivoCsv();
            this.arb = new ArbolBinario();
            this.hash_table= new HashTable(10111);
            String cadena=csv.abrirArchivo(arb, hash_table);
            if (cadena.equals("")) {
                arb=null;
                hash_table=null;
                return;
            }
            JOptionPane.showMessageDialog(null, "Lectura exitosa");
        } else {
            
            JOptionPane.showMessageDialog(null, "Ya existe un archivo cargado.\nSi desea cargar uno nuevo, presione 'Inicializar'.");
            
        }
    }//GEN-LAST:event_cargarButtonActionPerformed
    /**
        * Funci??n inicializarButtonActionPerformed
        * Vacia el arbol binario y el Hash Table
        */
    private void inicializarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicializarButtonActionPerformed
    if (arb == null && hash_table == null) {
            JOptionPane.showMessageDialog(null, "Su base de conocimientos ya esta vacia.");
        } else {
            arb = null;
            hash_table = null;
            JOptionPane.showMessageDialog(null, "Su base de conocimientos fue inicializada correctamente");
        }
    }//GEN-LAST:event_inicializarButtonActionPerformed
    /**
        * Funci??n guardarButtonActionPerformed
        * Guarda el archivo con la base de conocimientos de manera externa al programa
        */
    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        archivoCsv csvAux = new archivoCsv();
        if ((arb == null) && (hash_table == null)) {
            JOptionPane.showMessageDialog(null, "Para guardar una base de conocimientos, primero debe cargar un archivo");
        } else {
            String cadena="Pregunta, No, Si"+"\n";
            cadena=arb.archivorder(arb.getRoot(), cadena);
            csvAux.guardarArchivo(cadena);
        }

    }//GEN-LAST:event_guardarButtonActionPerformed
    /**
        * Funci??n mostrarBDCButtonActionPerformed
        * Muestra la informacion de la base de conocimientos de manera grafica en forma de arbol
        */
    private void mostrarBDCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBDCButtonActionPerformed


        if ((arb == null) && (hash_table == null)) {
            JOptionPane.showMessageDialog(null, "Para mostrar una base de conocimientos, primero debe cargar un archivo");
        } else {
             Representaci??n gui = new Representaci??n(arb);
        }
    }//GEN-LAST:event_mostrarBDCButtonActionPerformed
    /**
        * Funci??n guardarPorDefectoButtonActionPerformed
        * Guarda el archivo con la base de conocimientos de manera local en el programa 
        */
    private void guardarPorDefectoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPorDefectoButtonActionPerformed
        
        archivoCsv csvAux = new archivoCsv();
        if ((arb == null) && (hash_table == null)) {
            JOptionPane.showMessageDialog(null, "Para guardar una base de conocimientos, primero debe cargar un archivo");
        } else {
            String cadena="Pregunta, No, Si"+"\n";
            cadena=arb.archivorder(arb.getRoot(), cadena);
            csvAux.escribirCvsPorDefecto(cadena);
        }
    }//GEN-LAST:event_guardarPorDefectoButtonActionPerformed
    /**
        * Funci??n cargarPorDefectoButtonActionPerformed
        * Carga un archivo csv interno que se encuentra por defecto en el programa 
        */
    private void cargarPorDefectoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPorDefectoButtonActionPerformed
        
        if ((arb == null) && (hash_table == null) ) {
            
            this.csv = new archivoCsv();
            this.arb = new ArbolBinario();
            this.hash_table= new HashTable(10111);          
            csv.leerPorDefecto(arb, hash_table);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Ya existe un archivo cargado.\nSi desea cargar uno nuevo, presione 'Inicializar'.");
            
        }
        
    }//GEN-LAST:event_cargarPorDefectoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCSV(hash_table, arb, csv).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cargarButton;
    private javax.swing.JButton cargarPorDefectoButton;
    private javax.swing.JButton consultarAnimalButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JButton guardarPorDefectoButton;
    private javax.swing.JButton inicializarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mostrarBDCButton;
    // End of variables declaration//GEN-END:variables
}
