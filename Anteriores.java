/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitness2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
/**
 *
 * @author Luna
 */
import javax.swing.DefaultListModel;

public class Anteriores extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Anteriores.class.getName());

    public Anteriores() {
        initComponents();
        setTitle("Entrenamientos Anteriores");
        setResizable(false);
        setLocationRelativeTo(null);
        cargarDesdeExcel();
    }

    private void cargarDesdeExcel() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.clear();

        try {
            File archivo = new File("entrenamientos.xlsx");
            if (!archivo.exists()) {
                modelo.addElement("No hay entrenamientos registrados.");
            } else {
                try (FileInputStream fis = new FileInputStream(archivo);
                     Workbook workbook = new XSSFWorkbook(fis)) {

                    Sheet sheet = workbook.getSheetAt(0);

                    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                        Row fila = sheet.getRow(i);
                        if (fila != null) {
                            String ejercicio = fila.getCell(0).getStringCellValue();
                            int pulsaciones = (int) fila.getCell(1).getNumericCellValue();
                            String fecha = fila.getCell(2).getStringCellValue();
                            modelo.addElement(ejercicio + " - " + pulsaciones + " bpm - " + fecha);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            modelo.addElement("Error al leer el archivo Excel.");
        }

        lista.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemInicio = new javax.swing.JMenuItem();
        itemEntrenamiento = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lista.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones");

        itemInicio.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        itemInicio.setText("Inicio");
        itemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInicioActionPerformed(evt);
            }
        });
        jMenu1.add(itemInicio);

        itemEntrenamiento.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        itemEntrenamiento.setText("Nuevo entrenamiento");
        itemEntrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEntrenamientoActionPerformed(evt);
            }
        });
        jMenu1.add(itemEntrenamiento);

        itemSalir.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(itemSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInicioActionPerformed
        new Inicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_itemInicioActionPerformed

    private void itemEntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEntrenamientoActionPerformed
        new Entrenamiento().setVisible(true);
        dispose();
    }//GEN-LAST:event_itemEntrenamientoActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_itemSalirActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Anteriores().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemEntrenamiento;
    private javax.swing.JMenuItem itemInicio;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
