/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.ConexionBasedeDatos;
import Clases.ProcedimientoBuquesandCamarotes;
import static GUI.frmBuque.res;
import java.awt.event.ItemEvent;
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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 *
 */
public class frmCamarote extends javax.swing.JInternalFrame {

    //////////
    private Connection cn = ConexionBasedeDatos.obtenerConexion();
    private DefaultTableModel modelo = new DefaultTableModel();
    private PreparedStatement ps = null;
    private Statement stModel = null;
    private ResultSet rsModelo = null;
    private String id;
    private String precio;
    private String descripcion;
    private int puesto;
   
    //////////////////////////

    public frmCamarote(int puesto) {
        initComponents();
        cargatablebCamarotes();
        Cmbidbuque.setModel(insercombo());
        this.puesto = puesto;
        if (puesto==1)
        {
            this.Btnagregar.setVisible(false);
            this.Btnupdate.setVisible(false);
            this.Btnlimpiar.setVisible(false);
            this.Btndelet.setVisible(false);
            this.CmbDescripcama.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Btnagregar = new javax.swing.JButton();
        Btnupdate = new javax.swing.JButton();
        Btndelet = new javax.swing.JButton();
        Btnlimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidcamarote = new javax.swing.JTextField();
        txtxantdadCamar = new javax.swing.JTextField();
        txtprecio1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cmbidbuque = new javax.swing.JComboBox<>();
        CmbDescripcama = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCamarote = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtbusqueda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnbuscar1 = new javax.swing.JButton();

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
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(26, 78, 108));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(Btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 442, 100, 30));

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
        jPanel3.add(Btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 442, 100, 30));

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
        jPanel3.add(Btndelet, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 482, 100, 30));

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
        jPanel3.add(Btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 482, 100, 30));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad Camas");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 292, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion camarote");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 362, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID camarote");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 232, -1, -1));

        txtidcamarote.setEnabled(false);
        txtidcamarote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidcamaroteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidcamaroteKeyTyped(evt);
            }
        });
        jPanel3.add(txtidcamarote, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 252, 140, 30));

        txtxantdadCamar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtxantdadCamarKeyTyped(evt);
            }
        });
        jPanel3.add(txtxantdadCamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 322, 140, 30));

        txtprecio1.setEnabled(false);
        txtprecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecio1KeyTyped(evt);
            }
        });
        jPanel3.add(txtprecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 252, 140, 30));

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buque");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 70, -1));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 232, -1, -1));

        Cmbidbuque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        Cmbidbuque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbidbuqueItemStateChanged(evt);
            }
        });
        jPanel3.add(Cmbidbuque, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 140, 30));

        CmbDescripcama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Interior", "Vista al Oceano", "Balcon", "Suite" }));
        CmbDescripcama.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbDescripcamaItemStateChanged(evt);
            }
        });
        jPanel3.add(CmbDescripcama, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 392, 140, 30));

        tabCamarote.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        tabCamarote.setForeground(new java.awt.Color(51, 51, 51));
        tabCamarote.setModel(new javax.swing.table.DefaultTableModel(
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
        tabCamarote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCamaroteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCamarote);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 22, 950, 120));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(38, 116, 162));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 57));

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
                .addGap(173, 173, 173)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1248, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnagregarActionPerformed
          
        if (txtxantdadCamar.getText().isEmpty() || txtprecio1.getText().isEmpty()  || Cmbidbuque.getSelectedIndex()==0 ) {
            JOptionPane.showMessageDialog(this, "Tienes datos por llenar y/o Seleccione el tipo de buque", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        } else {
              String idBuque[] = String.valueOf(Cmbidbuque.getSelectedItem()).split(" ");
            try {
                String Dato = idBuque[0];
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

    private void tabCamaroteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCamaroteMouseClicked
        id = String.valueOf(tabCamarote.getValueAt(tabCamarote.getSelectedRow(), 0));
        busqueda(id);
    }//GEN-LAST:event_tabCamaroteMouseClicked

    private void CmbidbuqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbidbuqueItemStateChanged
      //  BusquedaBuque(Cmbidbuque.getSelectedItem().toString());
        String idBuque[] = String.valueOf(Cmbidbuque.getSelectedItem()).split(" ");
        
            if (evt.getStateChange() == ItemEvent.SELECTED) {
            // do something with object
            if (Cmbidbuque.getSelectedIndex()!=0 )
            {
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tabCamarote.getModel()));
            sorter.setRowFilter(RowFilter.regexFilter(idBuque[0], 4));
            tabCamarote.setRowSorter(sorter);
            }
            else 
              tabCamarote.setRowSorter(null);  
            
        }
        
        
    }//GEN-LAST:event_CmbidbuqueItemStateChanged

    private void CmbDescripcamaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbDescripcamaItemStateChanged

        descripcion = CmbDescripcama.getSelectedItem().toString();

        if (descripcion == "Interior") {

            precio = "50";
            txtprecio1.setText(precio);
        } else if (descripcion == "Vista al Oceano") {
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
        DefaultTableModel model = (DefaultTableModel) tabCamarote.getModel();
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
                tabCamarote.setModel(model);
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
                modelo.addElement(rsModelo.getString(1)+" - "+rsModelo.getString(2));

            }

        } catch (Exception e) {

        }

        return modelo;

    }

    ///////////////
  /*  private void BusquedaBuque(String id) {

        String consulta = "SELECT * FROM [dbo].[Buques] WHERE [Id_Buque] LIKE '%" + id + "%' "
                + "OR [Nombre_Buque] LIKE '%" + id + "%'";

        Connection conect = ConexionBasedeDatos.obtenerConexion();
        try {
            stModel = (Statement) conect.createStatement();
            rsModelo = stModel.executeQuery(consulta);
            while (rsModelo.next()) {

              

            }

        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);    
        }
    }*/

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCamarote;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtidcamarote;
    private javax.swing.JTextField txtprecio1;
    private javax.swing.JTextField txtxantdadCamar;
    // End of variables declaration//GEN-END:variables
}
