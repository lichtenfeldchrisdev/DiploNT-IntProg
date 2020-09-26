
package com.numerito.GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author christopher
 */

public class JFComprobacion extends javax.swing.JFrame {

    public JFComprobacion() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBComprobar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JTNumerito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Programa del numerito");

        JBComprobar.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        JBComprobar.setText("Comprobar");
        JBComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBComprobarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ejercicio 1 - Laboratorio 7");

        JBCancelar.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.setName("Programa del numerito"); // NOI18N
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JTNumerito.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        JTNumerito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTNumerito.setText("Ingrese un número en este pequeño lugar");
        JTNumerito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTNumeritoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTNumeritoFocusLost(evt);
            }
        });
        JTNumerito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTNumeritoMouseClicked(evt);
            }
        });
        JTNumerito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTNumeritoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTNumerito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(JBComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTNumerito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBComprobar)
                    .addComponent(JBCancelar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTNumeritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNumeritoMouseClicked
        JTNumerito.selectAll();
    }//GEN-LAST:event_JTNumeritoMouseClicked

    private void JBComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBComprobarActionPerformed
        try{
            if (Integer.parseInt(JTNumerito.getText())%2 == 0) {
                JOptionPane.showMessageDialog(this, "El numerito es par ^_^");
            }else{
                JOptionPane.showMessageDialog(this, "El numerito es impar ^_^");
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Tiene que ingresar números");
        }
    }//GEN-LAST:event_JBComprobarActionPerformed

    private void JTNumeritoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTNumeritoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Te dije un numerito (-_-)");
        }
    }//GEN-LAST:event_JTNumeritoKeyTyped

    private void JTNumeritoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTNumeritoFocusLost
        if (JTNumerito.getText().equals("")) {
            JTNumerito.setText("Ingrese un número en este pequeño lugar");
        }        
    }//GEN-LAST:event_JTNumeritoFocusLost

    private void JTNumeritoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTNumeritoFocusGained
        JTNumerito.selectAll();
    }//GEN-LAST:event_JTNumeritoFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBComprobar;
    private javax.swing.JTextField JTNumerito;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
