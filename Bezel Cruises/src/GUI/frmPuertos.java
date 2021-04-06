/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.ClassDestinos;
import Clases.ConexionBasedeDatos;
import com.microsoft.sqlserver.jdbc.StringUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class frmPuertos extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    ClassDestinos cd = new ClassDestinos();
    String IdL, IdD;
    String Salida, Destino;
    int codigoS, codigoD;

 
    public frmPuertos()  {
        initComponents();
        
        this.setResizable(false);
        TABLAPuertos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        BtnAgregar.setEnabled(false);
        BtnActualizar.setEnabled(false);
        Btneliminar.setEnabled(false);
        
        try {
            String[] titulo = new String[]{"Informacion Promocional", "Puerto Salida", "Pais que se encuentra", "Ciudad que pertenece", "ID VIAJE", "ID PUERTO"};
            dtm.setColumnIdentifiers(titulo);
            TABLAPuertos.setModel(dtm);
            CargarData();
            cd.comboboxDestino(cmbPais);
            cd.comboboxDestino(cmbCiudad, "SELECT Nombre_Ciudad FROM  Ciudades Order by Codigo_Ciudad asc");
            ocultarColumna(4);
            ocultarColumna(5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo mas tarde...\nVuelva a intentarlo mas tarde");
        }

    }

    public void validarText() {
        if (InfoPUERTO.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "No deje la informacion promocional Vacia");
        }
        if (InfoPUERTO.getText().length() >= 47) {
            JOptionPane.showMessageDialog(null, "No debe ingresar mas caracteres\n Ha alcanzado el maximo");
            InfoPUERTO.getText().replaceFirst(".$", "");
        }

    }

    public void validarText1() {
        if (txtLugarPuerto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "No deje el Lugar Vacio");
        }
        if (txtLugarPuerto.getText().length() >= 247) {
            JOptionPane.showMessageDialog(null, "No debe ingresar mas caracteres\n Ha alcanzado el maximo");
            txtLugarPuerto.getText().replaceFirst(".$", "");
        }
    }

    public void CargarData() throws SQLException {

        try {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
            ResultSet rst = stm.executeQuery("execute TablaPuertos");
            limpiartabla();
            while (rst.next()) {
                dtm.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)

                });

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo mas tarde...\nVerifique su coenxion con la base de datos");

        }

    }

    public void limpiartabla() {
        try {
            int filas = dtm.getRowCount();
            for (int i = 0; i < filas; i++) {
                dtm.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo mas tarde...\nVerifique su coenxion con la base de datos");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        PanelPuerto = new javax.swing.JPanel();
        Btneliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLAPuertos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoPUERTO = new javax.swing.JTextArea();
        cmbCiudad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtLugarPuerto = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        btnVER = new javax.swing.JCheckBox();
        PanelSuperiorpuerto = new javax.swing.JPanel();
        txtBUSCAR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Puerto");
        setEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);
        getContentPane().setLayout(null);

        PanelPuerto.setBackground(new java.awt.Color(26, 78, 108));
        PanelPuerto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btneliminar.setBackground(new java.awt.Color(204, 204, 255));
        Btneliminar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        Btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        Btneliminar.setText("Eliminar");
        Btneliminar.setEnabled(false);
        Btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneliminarActionPerformed(evt);
            }
        });
        PanelPuerto.add(Btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 120, 30));

        BtnActualizar.setBackground(new java.awt.Color(204, 204, 255));
        BtnActualizar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizar.setText("Actualizar");
        BtnActualizar.setEnabled(false);
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        PanelPuerto.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 120, 30));

        BtnAgregar.setBackground(new java.awt.Color(204, 204, 255));
        BtnAgregar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.setEnabled(false);
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseClicked(evt);
            }
        });
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        PanelPuerto.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 120, 30));

        jLabel3.setBackground(new java.awt.Color(21, 38, 76));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 38, 76));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DUERME TEMPRANO PARA LLEGAR A TIEMPO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPuerto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("es muy importante la puntualidad del cliente");
        PanelPuerto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        TABLAPuertos.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        TABLAPuertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLAPuertos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAPuertosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TABLAPuertos);
        if (TABLAPuertos.getColumnModel().getColumnCount() > 0) {
            TABLAPuertos.getColumnModel().getColumn(0).setResizable(false);
            TABLAPuertos.getColumnModel().getColumn(1).setResizable(false);
            TABLAPuertos.getColumnModel().getColumn(2).setResizable(false);
            TABLAPuertos.getColumnModel().getColumn(3).setResizable(false);
        }

        PanelPuerto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 830, 170));

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Informacion del Puerto de salida:");
        PanelPuerto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        InfoPUERTO.setBackground(new java.awt.Color(0, 51, 51));
        InfoPUERTO.setColumns(20);
        InfoPUERTO.setForeground(new java.awt.Color(255, 255, 255));
        InfoPUERTO.setRows(5);
        InfoPUERTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InfoPUERTOKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(InfoPUERTO);

        PanelPuerto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 80));

        cmbCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadItemStateChanged(evt);
            }
        });
        PanelPuerto.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 210, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ciudad");
        PanelPuerto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 140, -1));

        cmbPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisItemStateChanged(evt);
            }
        });
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });
        PanelPuerto.add(cmbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 210, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pais");
        PanelPuerto.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 100, -1));

        txtLugarPuerto.setBackground(new java.awt.Color(0, 51, 51));
        txtLugarPuerto.setColumns(20);
        txtLugarPuerto.setForeground(new java.awt.Color(255, 255, 255));
        txtLugarPuerto.setRows(5);
        txtLugarPuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLugarPuertoKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtLugarPuerto);

        PanelPuerto.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 270, 80));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Lugar donde estara:");
        PanelPuerto.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        btnVER.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVER.setForeground(new java.awt.Color(255, 255, 255));
        btnVER.setText("Ver Eliminados");
        btnVER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVERMouseClicked(evt);
            }
        });
        btnVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVERActionPerformed(evt);
            }
        });
        PanelPuerto.add(btnVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        getContentPane().add(PanelPuerto);
        PanelPuerto.setBounds(-30, 50, 950, 520);

        PanelSuperiorpuerto.setBackground(new java.awt.Color(38, 116, 162));

        txtBUSCAR.setBackground(new java.awt.Color(17, 51, 71));
        txtBUSCAR.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        txtBUSCAR.setBorder(null);
        txtBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBUSCARKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar Puerto");

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Puertos");

        javax.swing.GroupLayout PanelSuperiorpuertoLayout = new javax.swing.GroupLayout(PanelSuperiorpuerto);
        PanelSuperiorpuerto.setLayout(PanelSuperiorpuertoLayout);
        PanelSuperiorpuertoLayout.setHorizontalGroup(
            PanelSuperiorpuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorpuertoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        PanelSuperiorpuertoLayout.setVerticalGroup(
            PanelSuperiorpuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorpuertoLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(PanelSuperiorpuertoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSuperiorpuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelSuperiorpuerto);
        PanelSuperiorpuerto.setBounds(-30, 0, 980, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TABLAPuertosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAPuertosMouseClicked
        int i = TABLAPuertos.rowAtPoint(evt.getPoint());

        BtnActualizar.setEnabled(true);
        Btneliminar.setEnabled(true);

        try {
            InfoPUERTO.setText(String.valueOf(TABLAPuertos.getValueAt(i, 0)));
            txtLugarPuerto.setText(String.valueOf(TABLAPuertos.getValueAt(i, 1)));
            cmbPais.setSelectedItem(String.valueOf(TABLAPuertos.getValueAt(i, 2)));
            cmbCiudad.setSelectedItem(String.valueOf(TABLAPuertos.getValueAt(i, 3)));
            IdL = String.valueOf(TABLAPuertos.getValueAt(TABLAPuertos.getSelectedRow(), 4));
            IdD = String.valueOf(TABLAPuertos.getValueAt(TABLAPuertos.getSelectedRow(), 5));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Al seleccioanrun dato de la tabla");

        }

    }//GEN-LAST:event_TABLAPuertosMouseClicked

    private void txtBUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBUSCARKeyTyped

        if (btnVER.isSelected() == true) {
            try {
                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
                ResultSet rst = stm.executeQuery("execute TablaPuertoBuscarEliminado '" + txtBUSCAR.getText() + "'");
                limpiartabla();
                while (rst.next()) {
                    dtm.addRow(new Object[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6)

                    });
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Datos");
            }
        } else {
            try {
                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
                ResultSet rst = stm.executeQuery("execute TablaPuertoBuscar '" + txtBUSCAR.getText() + "'");
                limpiartabla();
                while (rst.next()) {
                    dtm.addRow(new Object[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6)

                    });
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error\n Busqueda no encontrada");
            }

        }
        //validar que solo se escriba palabras

        char vali = evt.getKeyChar();

        if (Character.isDigit(vali)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingrese letras porfavor");
            txtBUSCAR.getText().replaceFirst(".$", "");
            txtBUSCAR.requestFocus();
        }

    }//GEN-LAST:event_txtBUSCARKeyTyped

    public void ocultarColumna(int columna) {
        TABLAPuertos.getColumnModel().getColumn(columna).setMaxWidth(0);
        TABLAPuertos.getColumnModel().getColumn(columna).setMinWidth(0);
        TABLAPuertos.getTableHeader().getColumnModel().getColumn(columna).setMaxWidth(0);
        TABLAPuertos.getTableHeader().getColumnModel().getColumn(columna).setMinWidth(0);
    }
    private void cmbCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadItemStateChanged
        Salida = (String) cmbCiudad.getSelectedItem();
        codigoS = cmbCiudad.getSelectedIndex();

    }//GEN-LAST:event_cmbCiudadItemStateChanged

    private void cmbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisItemStateChanged
        Destino = (String) cmbPais.getSelectedItem();
        codigoD = cmbPais.getSelectedIndex();

    }//GEN-LAST:event_cmbPaisItemStateChanged

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void BtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseClicked
        //insertar destino
        validarText();
        revisar();

        try {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();

            stm.execute("execute RegistrarPuertos " + codigoS + "," + codigoD + ",'" + txtLugarPuerto.getText().toString() + "','" + InfoPUERTO.getText().toString() + "'");

            CargarData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "\n Error al Agregar");
        }

    }//GEN-LAST:event_BtnAgregarMouseClicked

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        //agregar 
        
            validarText();
            validarText1();
            revisar();

         
        
            try {
                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();

                stm.execute("execute RegistrarPuertos " + codigoS + "," + codigoD + ",'" + txtLugarPuerto.getText().toString() + "','" + InfoPUERTO.getText().toString() + "'");

                CargarData();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error\n Error al Insertar");
            }
        


    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneliminarActionPerformed
        try {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();

            stm.execute("execute EliminarPuerto '" + IdL.toString() + "'");

            CargarData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error\n Error al Insertar verifique sus datos/conexion");
        }
    }//GEN-LAST:event_BtneliminarActionPerformed

    private void btnVERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVERMouseClicked

    }//GEN-LAST:event_btnVERMouseClicked

    private void btnVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVERActionPerformed
        if (btnVER.isSelected() == true) {
            try {
                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
                ResultSet rst = stm.executeQuery("execute TablaPuertosEliminado");
                limpiartabla();
                while (rst.next()) {
                    dtm.addRow(new Object[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6)

                    });
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Datos");
            }
        } else {
            try {
                CargarData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Datos");
            }
        }

    }//GEN-LAST:event_btnVERActionPerformed
    public void revisar() {
        if (cmbPais.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Pais de la lista desplegable");
        }
        if (cmbCiudad.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una Ciudad de la lista desplegable");
        }
    }

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        //actualizar
        
         validarText();
            validarText1();
            revisar();

       
        try {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();

            stm.execute("execute ModificarPuertos " + codigoS + "," + codigoD + ",'" + txtLugarPuerto.getText().toString() + "','" + InfoPUERTO.getText().toString() + "'," + IdL + " , " + IdD + "");

            CargarData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "\n Error al Actualizar verifique sus datos/conexion");
        }
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void InfoPUERTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InfoPUERTOKeyTyped
        validarText();
        validarText1();

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
            InfoPUERTO.getText().replaceFirst(".$", "");
            JOptionPane.showMessageDialog(null, "Sólo se admiten letras", "WARNING", JOptionPane.WARNING_MESSAGE);

            if (InfoPUERTO.getText().length() == 0) {
                BtnAgregar.setEnabled(false);
            } else {
                BtnAgregar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_InfoPUERTOKeyTyped

    private void txtLugarPuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarPuertoKeyTyped
        validarText1();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
            txtLugarPuerto.getText().replaceFirst(".$", "");
            JOptionPane.showMessageDialog(null, "Sólo se admiten letras", "WARNING", JOptionPane.WARNING_MESSAGE);

            if (txtLugarPuerto.getText().length() == 0) {
                BtnAgregar.setEnabled(false);
            } else {
                BtnAgregar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtLugarPuertoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton Btneliminar;
    private javax.swing.JTextArea InfoPUERTO;
    private javax.swing.JPanel PanelPuerto;
    private javax.swing.JPanel PanelSuperiorpuerto;
    private javax.swing.JTable TABLAPuertos;
    private javax.swing.JCheckBox btnVER;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbPais;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtBUSCAR;
    private javax.swing.JTextArea txtLugarPuerto;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
