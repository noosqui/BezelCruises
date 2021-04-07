/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.ConexionBasedeDatos;
import Clases.ProcedimientoBuquesandCamarotes;
import static GUI.frmBuque.res;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class frmCamarote extends javax.swing.JInternalFrame {

    //////////
    Connection cn = ConexionBasedeDatos.obtenerConexion();
    DefaultTableModel modelo = new DefaultTableModel();
    PreparedStatement ps = null;
    Statement stModel = null;
    ResultSet rsModelo = null;
    String id;
    String precio;
    String descripcion;
    //////////////////////////

    public frmCamarote() {
        initComponents();
        cargatablebCamarotes();
        Cmbidbuque.setModel(insercombo());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Btnagregar = new javax.swing.JButton();
        Btnupdate = new javax.swing.JButton();
        Btndelet = new javax.swing.JButton();
        Btnlimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdescrpBuque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtidcamarote = new javax.swing.JTextField();
        txtxantdadCamar = new javax.swing.JTextField();
        txtprecio1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtbusqueda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnbuscar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cmbidbuque = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CmbDescripcama = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(26, 78, 108));
        jPanel1.setLayout(null);

        jTable1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Camarote", "Cantidad Camas", "Descipcion Camarote", "Precio", "Id Buque"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 950, 120);

        Btnagregar.setBackground(new java.awt.Color(204, 204, 204));
        Btnagregar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        Btnagregar.setForeground(new java.awt.Color(51, 51, 51));
        Btnagregar.setText("Agregar");
        Btnagregar.setBorder(null);
        Btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnagregarActionPerformed(evt);
            }
        });
        jPanel1.add(Btnagregar);
        Btnagregar.setBounds(410, 480, 100, 30);

        Btnupdate.setBackground(new java.awt.Color(204, 204, 204));
        Btnupdate.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        Btnupdate.setForeground(new java.awt.Color(51, 51, 51));
        Btnupdate.setText("Actualizar");
        Btnupdate.setBorder(null);
        Btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(Btnupdate);
        Btnupdate.setBounds(520, 480, 100, 30);

        Btndelet.setBackground(new java.awt.Color(204, 204, 204));
        Btndelet.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        Btndelet.setForeground(new java.awt.Color(51, 51, 51));
        Btndelet.setText("Eliminar");
        Btndelet.setBorder(null);
        Btndelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndeletActionPerformed(evt);
            }
        });
        jPanel1.add(Btndelet);
        Btndelet.setBounds(410, 520, 100, 30);

        Btnlimpiar.setBackground(new java.awt.Color(204, 204, 204));
        Btnlimpiar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        Btnlimpiar.setForeground(new java.awt.Color(51, 51, 51));
        Btnlimpiar.setText("Limpiar");
        Btnlimpiar.setBorder(null);
        Btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Btnlimpiar);
        Btnlimpiar.setBounds(520, 520, 100, 30);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad Camas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 330, 112, 19);

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion camarote");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 400, 153, 19);

        txtdescrpBuque.setEnabled(false);
        txtdescrpBuque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescrpBuqueActionPerformed(evt);
            }
        });
        txtdescrpBuque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescrpBuqueKeyTyped(evt);
            }
        });
        jPanel1.add(txtdescrpBuque);
        txtdescrpBuque.setBounds(630, 360, 140, 30);

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID camarote");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 270, 83, 19);

        txtidcamarote.setEnabled(false);
        txtidcamarote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidcamaroteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidcamaroteKeyTyped(evt);
            }
        });
        jPanel1.add(txtidcamarote);
        txtidcamarote.setBounds(250, 290, 140, 30);

        txtxantdadCamar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtxantdadCamarKeyTyped(evt);
            }
        });
        jPanel1.add(txtxantdadCamar);
        txtxantdadCamar.setBounds(250, 360, 140, 30);

        txtprecio1.setEnabled(false);
        txtprecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecio1KeyTyped(evt);
            }
        });
        jPanel1.add(txtprecio1);
        txtprecio1.setBounds(630, 290, 140, 30);

        jPanel2.setBackground(new java.awt.Color(38, 116, 162));

        txtbusqueda.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtbusqueda.setForeground(new java.awt.Color(51, 51, 51));
        txtbusqueda.setBorder(null);
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        txtbusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar Camarote");

        btnbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lup32.png"))); // NOI18N
        btnbuscar1.setBorder(null);
        btnbuscar1.setBorderPainted(false);
        btnbuscar1.setContentAreaFilled(false);
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 950, 72);

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id Buque");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(560, 410, 70, 19);

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(560, 270, 45, 19);

        Cmbidbuque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        Cmbidbuque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbidbuqueItemStateChanged(evt);
            }
        });
        jPanel1.add(Cmbidbuque);
        Cmbidbuque.setBounds(630, 420, 140, 30);

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre Buque");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(560, 340, 140, 19);

        CmbDescripcama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Interior", "Vista al Oseano", "Balcon", "Suite" }));
        CmbDescripcama.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbDescripcamaItemStateChanged(evt);
            }
        });
        jPanel1.add(CmbDescripcama);
        CmbDescripcama.setBounds(250, 430, 140, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Camarote1.jpg"))); // NOI18N
        jLabel9.setText("jLabel2");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 70, 950, 550);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnagregarActionPerformed

        if (txtxantdadCamar.getText().isEmpty() || txtprecio1.getText().isEmpty() || txtdescrpBuque.getText().isEmpty() || Cmbidbuque.getSelectedIndex()==0 ) {
            JOptionPane.showMessageDialog(this, "Tienes datos por llenar y/o Seleccione el tipo de buque", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        } else {
            try {
                String Dato = Cmbidbuque.getSelectedItem().toString();

                ProcedimientoBuquesandCamarotes.insertCamarotes(txtxantdadCamar.getText(), descripcion, precio, Dato);
            } catch (SQLException ex) {

            }
        }
        cargatablebCamarotes();

    }//GEN-LAST:event_BtnagregarActionPerformed
////////////////////////////////////////////
    private void BtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnupdateActionPerformed
        if (txtidcamarote.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione el registro para actualizar", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿ESTAS SEGURO QUE DESEA ACTUALIZAR ESTE REGISTRO?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION) {
                try {
                    String Dato = Cmbidbuque.getSelectedItem().toString();
                    ProcedimientoBuquesandCamarotes.UpdateCamarotes(Integer.parseInt(txtidcamarote.getText()),
                            txtxantdadCamar.getText(), descripcion, txtprecio1.getText(), Dato);
                } catch (SQLException e) {
                }
                cargatablebCamarotes();
                JOptionPane.showMessageDialog(null, "LOS DATOS HAN SIDO ACTUALIZADOS");
                limpiar();
            }
        }
    }//GEN-LAST:event_BtnupdateActionPerformed
/////////////////////////////////////
    private void BtndeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndeletActionPerformed
        if (txtidcamarote.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione el registro para Eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            limpiar();
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿ESTAS SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION) {
                try {
                    ProcedimientoBuquesandCamarotes.deletCamarotes(Integer.parseInt(txtidcamarote.getText()));
                } catch (SQLException e) {
                }
                cargatablebCamarotes();
            }
        }
    }//GEN-LAST:event_BtndeletActionPerformed

    private void BtnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BtnlimpiarActionPerformed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed
///////////////////////////////////////////////////////////////////////////


    private void txtbusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyPressed


    }//GEN-LAST:event_txtbusquedaKeyPressed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        busqueda(txtbusqueda.getText());
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void txtidcamaroteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidcamaroteKeyPressed

    }//GEN-LAST:event_txtidcamaroteKeyPressed

    private void txtidcamaroteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidcamaroteKeyTyped
        char vali = evt.getKeyChar();
        if ((vali < '0' || vali > '9') && vali != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingrese numeros porfavor");
        }


    }//GEN-LAST:event_txtidcamaroteKeyTyped

    private void txtxantdadCamarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtxantdadCamarKeyTyped
        char vali = evt.getKeyChar();
        if ((vali < '0' || vali > '9') && vali != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingrese numeros porfavor");
        }
    }//GEN-LAST:event_txtxantdadCamarKeyTyped

    private void txtprecio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecio1KeyTyped
        char vali = evt.getKeyChar();
        if ((vali < '0' || vali > '9') && vali != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingrese numeros porfavor");
        }
    }//GEN-LAST:event_txtprecio1KeyTyped

    private void txtdescrpBuqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescrpBuqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescrpBuqueActionPerformed

    private void txtdescrpBuqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescrpBuqueKeyTyped
        char vali = evt.getKeyChar();
        if ((vali < '0' || vali > '9') && vali != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingrese numeros porfavor");
        }
    }//GEN-LAST:event_txtdescrpBuqueKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        busqueda(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void CmbidbuqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbidbuqueItemStateChanged
        BusquedaBuque(Cmbidbuque.getSelectedItem().toString());
    }//GEN-LAST:event_CmbidbuqueItemStateChanged

    private void CmbDescripcamaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbDescripcamaItemStateChanged

        descripcion = CmbDescripcama.getSelectedItem().toString();

        if (descripcion == "Interior") {

            precio = "50";
            txtprecio1.setText(precio);
        } else if (descripcion == "Vista al Oseano") {
            precio = "75";
            txtprecio1.setText(precio);
        } else if (descripcion == "Balcon") {
            precio = "100";
            txtprecio1.setText(precio);
        } else if (descripcion == "Suite") {
            precio = "150";
            txtprecio1.setText(precio);
        } else if (descripcion == "seleccionar") {
            txtprecio1.setText("");
        }
        
    }//GEN-LAST:event_CmbDescripcamaItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        
        
        CmbDescripcamaItemStateChanged(null);
    }//GEN-LAST:event_formInternalFrameOpened

///////////////
    private void cargatablebCamarotes() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        res = Clases.ConexionBasedeDatos.Consulta("select * from Camarotes");
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));

                model.addRow(v);
                jTable1.setModel(model);
            }
        } catch (SQLException e) {
        }
    }
///////////////////

    private void limpiar() {

        txtidcamarote.setText("");
        txtxantdadCamar.setText("");
        CmbDescripcama.setSelectedIndex(0);
        txtprecio1.setText("");
        txtdescrpBuque.setText("");
        txtidcamarote.requestFocus();

    }
////////////////

    private void busqueda(String id) {
        String consulta = "SELECT * FROM [dbo].[Camarotes] WHERE Id_Camarote LIKE '%" + id + "%' "
                + "OR Descripcion_Camarote LIKE '%" + id + "%'";

        Connection conect = ConexionBasedeDatos.obtenerConexion();
        try {
            stModel = (Statement) conect.createStatement();
            rsModelo = stModel.executeQuery(consulta);
            while (rsModelo.next()) {
                txtidcamarote.setText(rsModelo.getString(1));
                txtxantdadCamar.setText(rsModelo.getString(2));
                CmbDescripcama.setSelectedItem(rsModelo.getString(3));
                txtprecio1.setText(rsModelo.getString(4));
                Cmbidbuque.setSelectedItem(rsModelo.getString(5));

                cargatablebCamarotes();

            }

        } catch (SQLException ex) {
            System.out.println("No existe : " + ex.getMessage());
        }
    }
/////////////////

    public DefaultComboBoxModel insercombo() {
        DefaultComboBoxModel modelo =(DefaultComboBoxModel) Cmbidbuque.getModel();

        try {
            CallableStatement dato = ConexionBasedeDatos.obtenerConexion().prepareCall("{call ComboxBuque}");
            rsModelo = dato.executeQuery();
            while (rsModelo.next()) {
                modelo.addElement(rsModelo.getString(1));

            }

        } catch (Exception e) {

        }

        return modelo;

    }

    ///////////////
    private void BusquedaBuque(String id) {

        String consulta = "SELECT * FROM [dbo].[Buques] WHERE [Id_Buque] LIKE '%" + id + "%' "
                + "OR [Nombre_Buque] LIKE '%" + id + "%'";

        Connection conect = ConexionBasedeDatos.obtenerConexion();
        try {
            stModel = (Statement) conect.createStatement();
            rsModelo = stModel.executeQuery(consulta);
            while (rsModelo.next()) {

                txtdescrpBuque.setText(rsModelo.getString(2));

            }

        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);    
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnagregar;
    private javax.swing.JButton Btndelet;
    private javax.swing.JButton Btnlimpiar;
    private javax.swing.JButton Btnupdate;
    private javax.swing.JComboBox<String> CmbDescripcama;
    private javax.swing.JComboBox<String> Cmbidbuque;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtdescrpBuque;
    private javax.swing.JTextField txtidcamarote;
    private javax.swing.JTextField txtprecio1;
    private javax.swing.JTextField txtxantdadCamar;
    // End of variables declaration//GEN-END:variables
}
