/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conversormoneda.GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author christopher
 */
public class JFConversor extends javax.swing.JFrame {
    private final float DOLAR = (float)Math.random()*100 ;
    private final float EURO = (float)Math.random()*100 ; 
    
    public JFConversor() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        JBConvertir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLEuro = new javax.swing.JLabel();
        JLDolar = new javax.swing.JLabel();
        JTPesos = new javax.swing.JTextField();
        JCMoneda = new javax.swing.JComboBox<>();
        JTFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de moneda");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JBConvertir.setText("Convertir");
        JBConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConvertirActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad Final");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Moneda de conversión");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Importe en pesos");

        JTPesos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTPesos.setText("0");
        JTPesos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTPesosFocusGained(evt);
            }
        });
        JTPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPesosActionPerformed(evt);
            }
        });
        JTPesos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTPesosKeyTyped(evt);
            }
        });

        JCMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecc.\t", "Dolares", "Euros" }));

        JTFinal.setEditable(false);
        JTFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFinal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(JLEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTPesos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFinal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JCMoneda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPesosActionPerformed
        
    }//GEN-LAST:event_JTPesosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConvertirActionPerformed
        
        float pesos = Float.parseFloat(JTPesos.getText());
        float finales ; 
        JLEuro.setText("Euro: " + String.format("%.2f", EURO));        
        JLDolar.setText("Dolar: " + String.format("%.2f", DOLAR));
        
        if(JTPesos.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un monto a convertir");
        }        
        switch(JCMoneda.getSelectedIndex()){
            case 1 :{
                finales = pesos/DOLAR;
                JTFinal.setText(String.format("%.2f", finales));
                break;
            }
            case 2 :{
                finales = pesos/EURO;
                JTFinal.setText(String.format("%.2f", finales));
                break;
            }
            default :{
                JOptionPane.showMessageDialog(this, "Debe seleccionar una moneda");
            }
        }
    }//GEN-LAST:event_JBConvertirActionPerformed

    private void JTPesosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPesosKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar cantidad válida");
        }
    }//GEN-LAST:event_JTPesosKeyTyped

    private void JTPesosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPesosFocusGained
        JTPesos.selectAll();
    }//GEN-LAST:event_JTPesosFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBConvertir;
    private javax.swing.JComboBox<String> JCMoneda;
    private javax.swing.JLabel JLDolar;
    private javax.swing.JLabel JLEuro;
    private javax.swing.JTextField JTFinal;
    private javax.swing.JTextField JTPesos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
