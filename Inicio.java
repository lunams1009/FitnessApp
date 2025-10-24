/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitness2;

/**
 *
 * @author Luna
 */
public class Inicio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Inicio.class.getName());
    
    public Inicio() {
        initComponents();
        setTitle("Inicio - Fitness App");
        setResizable(false);
        setLocationRelativeTo(null);

        try {
            java.net.URL url = new java.net.URL("https://www.shutterstock.com/image-vector/fat-little-kid-do-running-600nw-2488195115.jpg");
            javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(url);
            java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
            panelImagen.setIcon(new javax.swing.ImageIcon(scaledImage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrenamiento = new javax.swing.JButton();
        btnAnteriores = new javax.swing.JButton();
        panelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.control);

        btnEntrenamiento.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        btnEntrenamiento.setText("Entrenamiento");
        btnEntrenamiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEntrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenamientoActionPerformed(evt);
            }
        });

        btnAnteriores.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        btnAnteriores.setText("Entrenamientos anteriores");
        btnAnteriores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAnteriores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterioresActionPerformed(evt);
            }
        });

        panelImagen.setMaximumSize(new java.awt.Dimension(100, 100));
        panelImagen.setMinimumSize(new java.awt.Dimension(100, 100));
        panelImagen.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenamientoActionPerformed
        new Entrenamiento().setVisible(true);
    }//GEN-LAST:event_btnEntrenamientoActionPerformed

    private void btnAnterioresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterioresActionPerformed
        new Anteriores().setVisible(true);
    }//GEN-LAST:event_btnAnterioresActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Inicio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnteriores;
    private javax.swing.JButton btnEntrenamiento;
    private javax.swing.JLabel panelImagen;
    // End of variables declaration//GEN-END:variables
}
