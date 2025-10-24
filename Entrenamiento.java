/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitness2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Luna
 */
public class Entrenamiento extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Entrenamiento.class.getName());
    private static final List<String> listaAnteriores = new ArrayList<>();

    public Entrenamiento() {
        initComponents();
        setTitle("Entrenamiento - Fitness App");
        setResizable(false);
        setLocationRelativeTo(null);

        // Configurar combo dinámico
        DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement("Sentadilla");
        modeloCombo.addElement("Press Banca");
        modeloCombo.addElement("Correr");
        modeloCombo.addElement("Flexiones");

        comboEjercicios.setModel(modeloCombo);

        // Spinner (mínimo, máximo, paso)
        spinnerPulsaciones.setModel(new SpinnerNumberModel(80, 40, 250, 1));

        btnGuardar.setPreferredSize(new java.awt.Dimension(160, 28));

        agregarLogo();
    }

    public static List<String> getListaAnteriores() {
        return listaAnteriores;
    }

    private void agregarLogo() {
        try {
            String ruta = new java.io.File(".").getCanonicalPath() + java.io.File.separator + "fitness.png";
            java.io.File archivoLogo = new java.io.File(ruta);

            if (archivoLogo.exists()) {
                javax.swing.ImageIcon icono = new javax.swing.ImageIcon(archivoLogo.getAbsolutePath());
                java.awt.Image imagenEscalada = icono.getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
                javax.swing.JLabel lblLogo = new javax.swing.JLabel(new javax.swing.ImageIcon(imagenEscalada));
                lblLogo.setOpaque(false);

                // Colocarlo en la esquina inferior derecha
                jPanel1.add(lblLogo);
                lblLogo.setBounds(jPanel1.getWidth() - 90, jPanel1.getHeight() - 90, 70, 70);

                // Reajustar tamaño
                jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
                    @Override
                    public void componentResized(java.awt.event.ComponentEvent e) {
                        lblLogo.setBounds(jPanel1.getWidth() - 90, jPanel1.getHeight() - 90, 70, 70);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboEjercicios = new javax.swing.JComboBox<>();
        spinnerPulsaciones = new javax.swing.JSpinner();
        txtFecha = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAñadirAccion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemInicio = new javax.swing.JMenuItem();
        itemAnteriores = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        jLabel1.setText("Ejercicio: ");

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        jLabel2.setText("Pulsaciones:");

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        jLabel3.setText("Fecha (dd/mm/aaaa):");

        comboEjercicios.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        comboEjercicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardar.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        jLabel4.setText("bpm");

        btnAñadirAccion.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        btnAñadirAccion.setText("+");
        btnAñadirAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirAccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(spinnerPulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAñadirAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirAccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerPulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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

        itemAnteriores.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        itemAnteriores.setText("Anteriores");
        itemAnteriores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnterioresActionPerformed(evt);
            }
        });
        jMenu1.add(itemAnteriores);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String ejercicio = (String) comboEjercicios.getSelectedItem();
        int pulsaciones = (Integer) spinnerPulsaciones.getValue();
        String fecha = txtFecha.getText();

        if (fecha.isBlank()) {
            JOptionPane.showMessageDialog(this, "Introduce una fecha válida.");
            return;
        }

        String registro = ejercicio + " - " + pulsaciones + " bpm - " + fecha;
        listaAnteriores.add(registro);

        // Guardar en Excel
        Excel.escribirDatos(ejercicio, pulsaciones, fecha);

        JOptionPane.showMessageDialog(this, "Entrenamiento guardado");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void itemAnterioresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnterioresActionPerformed
        new Anteriores().setVisible(true);
    }//GEN-LAST:event_itemAnterioresActionPerformed

    private void itemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInicioActionPerformed
        new Inicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_itemInicioActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_itemSalirActionPerformed

    private void btnAñadirAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirAccionActionPerformed
        String nuevo = JOptionPane.showInputDialog(this, "Introduce un nuevo ejercicio:");
        if (nuevo != null && !nuevo.isBlank()) {
            ((DefaultComboBoxModel<String>) comboEjercicios.getModel()).addElement(nuevo);
        }
    }//GEN-LAST:event_btnAñadirAccionActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Entrenamiento().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirAccion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboEjercicios;
    private javax.swing.JMenuItem itemAnteriores;
    private javax.swing.JMenuItem itemInicio;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spinnerPulsaciones;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
