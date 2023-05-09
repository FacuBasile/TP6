/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Cliente;
import Clases.Directorio;
import javax.swing.JOptionPane;


/**
 *
 * @author H
 */
public class VAgregarCliente extends javax.swing.JInternalFrame {

    
    public VAgregarCliente(){
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTdireccion = new javax.swing.JTextField();
        jTciudad = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jTtelefono = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar Cliente");

        jLabel1.setText("NUEVO CLIENTE");

        jTdni.setText("Dni");
        jTdni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTdniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTdniFocusLost(evt);
            }
        });

        jTnombre.setText("Nombre");
        jTnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnombreFocusLost(evt);
            }
        });
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });

        jTapellido.setText("Apellido");
        jTapellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTapellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTapellidoFocusLost(evt);
            }
        });

        jTdireccion.setText("Direccion");
        jTdireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTdireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTdireccionFocusLost(evt);
            }
        });

        jTciudad.setText("Ciudad");
        jTciudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTciudadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTciudadFocusLost(evt);
            }
        });
        jTciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTciudadActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jTtelefono.setText("TELEFONO");
        jTtelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTtelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTtelefonoFocusLost(evt);
            }
        });
        jTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBNuevo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTtelefono)
                            .addComponent(jTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBNuevo)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoActionPerformed

    private void jTtelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTtelefonoFocusLost
        if(jTtelefono.getText().equals("")){
            jTtelefono.setText("TELEFONO");
        }
    }//GEN-LAST:event_jTtelefonoFocusLost

    private void jTtelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTtelefonoFocusGained
        if(jTtelefono.getText().equals("TELEFONO")){
            jTtelefono.setText("");
        }
    }//GEN-LAST:event_jTtelefonoFocusGained

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
        jTdni.setText("Dni");
        jTnombre.setText("Nombre");
        jTapellido.setText("Apellido");
        jTdireccion.setText("Direccion");
        jTciudad.setText("Ciudad");
        jTtelefono.setText("TELEFONO");
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTciudadActionPerformed

    private void jTciudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTciudadFocusLost
        if(jTciudad.getText().equals("")){
            jTciudad.setText("Ciudad");
        }
    }//GEN-LAST:event_jTciudadFocusLost

    private void jTciudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTciudadFocusGained
        if(jTciudad.getText().equals("Ciudad")){
            jTciudad.setText("");
        }
    }//GEN-LAST:event_jTciudadFocusGained

    private void jTdireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdireccionFocusLost
        if(jTdireccion.getText().equals("")){
            jTdireccion.setText("Direccion");
        }
    }//GEN-LAST:event_jTdireccionFocusLost

    private void jTdireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdireccionFocusGained
        if(jTdireccion.getText().equals("Direccion")){
            jTdireccion.setText("");
        }
    }//GEN-LAST:event_jTdireccionFocusGained

    private void jTapellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTapellidoFocusLost
        if(jTapellido.getText().equals("")){
            jTapellido.setText("Apellido");
        }
    }//GEN-LAST:event_jTapellidoFocusLost

    private void jTapellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTapellidoFocusGained
        if(jTapellido.getText().equals("Apellido")){
            jTapellido.setText("");
        }
    }//GEN-LAST:event_jTapellidoFocusGained

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jTnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnombreFocusLost
        if(jTnombre.getText().equals("")){
            jTnombre.setText("Nombre");
        }
    }//GEN-LAST:event_jTnombreFocusLost

    private void jTnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnombreFocusGained
        // TODO add your handling code here:
        if(jTnombre.getText().equals("Nombre")){
            jTnombre.setText("");
        }
    }//GEN-LAST:event_jTnombreFocusGained

    private void jTdniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdniFocusLost
        // TODO add your handling code here:
        if(jTdni.getText().equals("")){
            jTdni.setText("Dni");
        }

    }//GEN-LAST:event_jTdniFocusLost

    private void jTdniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdniFocusGained
        if(jTdni.getText().equals("Dni") || jTdni.getText().equals("") ){
            jTdni.setText("");
        }

    }//GEN-LAST:event_jTdniFocusGained

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
     String dni=jTdni.getText(),
            nombre=jTnombre.getText(),
            apellido=jTapellido.getText(),
            direccion=jTdireccion.getText(),
            ciudad=jTciudad.getText(),
            tel=jTtelefono.getText();
     Cliente cl = new Cliente(dni,nombre,apellido,direccion,ciudad);   
        
       boolean operacion= Directorio.agregarCliente(tel, cl);
        if(operacion){
            JOptionPane.showMessageDialog(this, "CLIENTE AGREGADO");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed
    
    

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTciudad;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}
