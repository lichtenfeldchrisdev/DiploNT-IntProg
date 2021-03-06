package com.software.gui;

import com.software.basededatos.ConexionBd;
import com.software.dominio.Consultor;
import com.software.dominio.Empleado;
import com.software.dominio.Empresa;
import com.software.dominio.Trabajador;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author christopher
 */
public class JDAgregarTrabajador extends javax.swing.JDialog {

    /**
     * Creates new form JDAgregarempleado
     *
     * @param parent
     * @param modal
     */
    public JDAgregarTrabajador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCTipoContraro = new javax.swing.JComboBox<>();
        jBAgregar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFLegajo = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFSueldoHstrab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBCargarImagen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JLFoto = new javax.swing.JLabel();
        JCFechaContrato = new com.toedter.calendar.JDateChooser();
        JLPrSu = new javax.swing.JLabel();
        JLHsExHsTr = new javax.swing.JLabel();
        JTFPuesto = new javax.swing.JTextField();
        JTFHsExHsTr = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar  contrato");

        JCTipoContraro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleado", "Consultor" }));
        JCTipoContraro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCTipoContraroActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LEGAJO");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE COMPLETO");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FECHA DE CONTRATO");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PUESTO");

        JTFLegajo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFLegajoActionPerformed(evt);
            }
        });
        JTFLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFLegajoKeyTyped(evt);
            }
        });

        JTFNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNombreKeyTyped(evt);
            }
        });

        JTFSueldoHstrab.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFSueldoHstrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFSueldoHstrabKeyTyped(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TIPO DE CONTRATO");

        JBCargarImagen.setText("Seleccionar  imagen");
        JBCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCargarImagenActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        JCFechaContrato.setDateFormatString("dd/MM/yyyy");
        JCFechaContrato.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JCFechaContratoPropertyChange(evt);
            }
        });

        JLPrSu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JLHsExHsTr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JTFPuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFPuestoKeyTyped(evt);
            }
        });

        JTFHsExHsTr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFHsExHsTr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFHsExHsTrKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(JCTipoContraro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFLegajo)
                            .addComponent(JCFechaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFPuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLPrSu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFSueldoHstrab, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLHsExHsTr, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFHsExHsTr, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBCargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(JCFechaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBCargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(JCTipoContraro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPrSu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFSueldoHstrab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLHsExHsTr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JTFHsExHsTr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCTipoContraroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCTipoContraroActionPerformed
        
        switch (JCTipoContraro.getSelectedIndex()) {
            case 0: {
                JLPrSu.setText("");
                JLHsExHsTr.setText("");
                break;
            }
            case 1: {
                JLPrSu.setText("Sueldo");
                JLHsExHsTr.setText("Hs. extra");
                break;
            }
            case 2: {
                JLPrSu.setText("Paga por hora");
                JLHsExHsTr.setText("Hs. trabajadas");
                break;
            }
        }
    }//GEN-LAST:event_JCTipoContraroActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTFLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFLegajoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFLegajoKeyTyped

    private void JTFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombreKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFNombreKeyTyped

    private void JTFSueldoHstrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFSueldoHstrabKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFSueldoHstrabKeyTyped

    private void JBCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCargarImagenActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Elija la imagen");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            rsscalelabel.RSScaleLabel.setScaleLabel(JLFoto, fc.getSelectedFile().toString());
        }

    }//GEN-LAST:event_JBCargarImagenActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        Trabajador x = null ;

        switch(JCTipoContraro.getSelectedIndex()){
            case 1:{
                String puesto = JTFPuesto.getText();
                String legajo = JTFLegajo.getText(); 
                String nombre = JTFNombre.getText(); 
                String fechaC = JCFechaContrato.getDateFormatString();
                float sueldo = Float.parseFloat(JTFSueldoHstrab.getText());
                float HsExtra = Float.parseFloat(JTFHsExHsTr.getText());        
                x = new Empleado(sueldo, HsExtra, puesto, legajo, nombre, fechaC);
                break;
            }
            case 2:{
                String puesto = JTFPuesto.getText();
                String legajo = JTFLegajo.getText(); 
                String nombre = JTFNombre.getText(); 
                String fechaC = JCFechaContrato.getDateFormatString();
                float PrHora = Float.parseFloat(JTFSueldoHstrab.getText());
                float HsTrab = Float.parseFloat(JTFHsExHsTr.getText());        
                x = new Consultor(HsTrab, PrHora, puesto, legajo, nombre, fechaC);
                break;
            }
        }                
        
        new ConexionBd().agregarTrabajador(x);
        
        Empresa empresa = new Empresa("Empresa de prueba");
        empresa.agregarEmpleado(x);
        JOptionPane.showMessageDialog(this, "Carga exitosa!");
        
        JTFLegajo.setText("");
        JTFNombre.setText("");
        JTFPuesto.setText("");
        JTFSueldoHstrab.setText("");
        JTFHsExHsTr.setText("");
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void JTFLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFLegajoActionPerformed
            
    }//GEN-LAST:event_JTFLegajoActionPerformed

    private void JCFechaContratoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JCFechaContratoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_JCFechaContratoPropertyChange

    private void JTFPuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPuestoKeyTyped
         if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFPuestoKeyTyped

    private void JTFHsExHsTrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFHsExHsTrKeyTyped
         if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFHsExHsTrKeyTyped

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBCargarImagen;
    private com.toedter.calendar.JDateChooser JCFechaContrato;
    private javax.swing.JComboBox<String> JCTipoContraro;
    private javax.swing.JLabel JLFoto;
    private javax.swing.JLabel JLHsExHsTr;
    private javax.swing.JLabel JLPrSu;
    private javax.swing.JTextField JTFHsExHsTr;
    private javax.swing.JTextField JTFLegajo;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFPuesto;
    private javax.swing.JTextField JTFSueldoHstrab;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
