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

public class frmDestinos extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private ClassDestinos cd = new ClassDestinos();
    private String IdL, IdD;
    private String Salida, Destino;
    private int codigoS, codigoD,puesto;

    /**
     * Creates new form Destinos
     */
    public frmDestinos(int puesto) throws SQLException {
        initComponents();
        TABLADestinos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        BtnAgregar.setEnabled(false);
        BtnActualizar.setEnabled(false);
        Btneliminar.setEnabled(false);
        this.puesto =puesto;
        try {
            String[] titulo = new String[]{"Informacion Promocional", "Destino Turistico", "Pais que se encuentra", "Ciudad que pertenece", "ID VIAJE", "ID DESTINO"};
            dtm.setColumnIdentifiers(titulo);
            TABLADestinos.setModel(dtm);
            CargarData();
            cd.comboboxDestino(cmbPais);
            cd.comboboxDestino(cmbCiudad, "SELECT Nombre_Ciudad FROM  Ciudades Order by Codigo_Ciudad asc");
            ocultarColumna(4);
            ocultarColumna(5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo mas tarde...\nVuelva a intentarlo mas tarde");
        }
        if (this.puesto==1)
        {
            this.Btneliminar.setVisible(false);
            this.BtnActualizar.setVisible(false);
            this.BtnAgregar.setVisible(false);
           
        }

    }

    public void validarText() {
       
        if (Descripcion.getText().length() >= 47) {
            JOptionPane.showMessageDialog(null, "No debe ingresar mas caracteres\n Ha alcanzado el maximo");
            Descripcion.getText().replaceFirst(".$", "");
        }

    }

    public void validarText1() {

        if (txtLugar.getText().length() >= 247) {
            JOptionPane.showMessageDialog(null, "No debe ingresar mas caracteres\n Ha alcanzado el maximo");
            txtLugar.getText().replaceFirst(".$", "");
        }
    }

    public void CargarData() throws SQLException {

        try {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
            ResultSet rst = stm.executeQuery("execute TablaDestinos");
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
        jPanel4 = new javax.swing.JPanel();
        txtbuscar2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btneliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLADestinos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        cmbCiudad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtLugar = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        btnVER = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        txtBUSCAR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(38, 116, 162));
        jPanel4.setLayout(null);

        txtbuscar2.setBackground(new java.awt.Color(17, 51, 71));
        txtbuscar2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtbuscar2.setForeground(new java.awt.Color(255, 255, 255));
        txtbuscar2.setBorder(null);
        jPanel4.add(txtbuscar2);
        txtbuscar2.setBounds(690, 607, 265, 17);

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar Destino");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(579, 607, 99, 17);

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Destinos");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(39, 588, 146, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(193, 189, 0, 0);

        jPanel1.setBackground(new java.awt.Color(26, 78, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(Btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 120, 30));

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
        jPanel1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 120, 30));

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
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 120, 30));

        jLabel3.setBackground(new java.awt.Color(21, 38, 76));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 38, 76));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VE COMPRANDO EL BLOQUEADOR SOLAR");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("el sol de nuestras playas te bronceara");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        TABLADestinos.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        TABLADestinos.setModel(new javax.swing.table.DefaultTableModel(
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
        TABLADestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLADestinosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TABLADestinos);
        if (TABLADestinos.getColumnModel().getColumnCount() > 0) {
            TABLADestinos.getColumnModel().getColumn(0).setResizable(false);
            TABLADestinos.getColumnModel().getColumn(1).setResizable(false);
            TABLADestinos.getColumnModel().getColumn(2).setResizable(false);
            TABLADestinos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 830, 170));

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descripcion del Destino Turistico:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        Descripcion.setBackground(new java.awt.Color(0, 51, 51));
        Descripcion.setColumns(20);
        Descripcion.setForeground(new java.awt.Color(255, 255, 255));
        Descripcion.setRows(5);
        Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 330, 80));

        cmbCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 210, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ciudad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 140, -1));

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
        jPanel1.add(cmbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 210, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pais");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 100, -1));

        txtLugar.setBackground(new java.awt.Color(0, 51, 51));
        txtLugar.setColumns(20);
        txtLugar.setForeground(new java.awt.Color(255, 255, 255));
        txtLugar.setRows(5);
        txtLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLugarKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtLugar);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 270, 80));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Lugar del Destino:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        btnVER.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVER.setForeground(new java.awt.Color(255, 255, 255));
        btnVER.setText("Ver Eliminados");
        btnVER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnVERItemStateChanged(evt);
            }
        });
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
        jPanel1.add(btnVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 990, 520);

        jPanel5.setBackground(new java.awt.Color(38, 116, 162));

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
        jLabel7.setText("Buscar Destino");

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Destinos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 990, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TABLADestinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLADestinosMouseClicked
        int i = TABLADestinos.rowAtPoint(evt.getPoint());

        BtnActualizar.setEnabled(true);
        Btneliminar.setEnabled(true);

        try {
            Descripcion.setText(String.valueOf(TABLADestinos.getValueAt(i, 0)));
            txtLugar.setText(String.valueOf(TABLADestinos.getValueAt(i, 1)));
            cmbPais.setSelectedItem(String.valueOf(TABLADestinos.getValueAt(i, 2)));
            cmbCiudad.setSelectedItem(String.valueOf(TABLADestinos.getValueAt(i, 3)));
            IdL = String.valueOf(TABLADestinos.getValueAt(TABLADestinos.getSelectedRow(), 4));
            IdD = String.valueOf(TABLADestinos.getValueAt(TABLADestinos.getSelectedRow(), 5));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Al seleccioanrun dato de la tabla");

        }

    }//GEN-LAST:event_TABLADestinosMouseClicked

    private void txtBUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBUSCARKeyTyped

        if (btnVER.isSelected() == true) {
            try {
                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
                ResultSet rst = stm.executeQuery("execute [TablaDestinosDatosEliminadosBuscar] '" + txtBUSCAR.getText() + "'");
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
                ResultSet rst = stm.executeQuery("execute [TablaDestinosBuscar] '" + txtBUSCAR.getText() + "'");
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
        TABLADestinos.getColumnModel().getColumn(columna).setMaxWidth(0);
        TABLADestinos.getColumnModel().getColumn(columna).setMinWidth(0);
        TABLADestinos.getTableHeader().getColumnModel().getColumn(columna).setMaxWidth(0);
        TABLADestinos.getTableHeader().getColumnModel().getColumn(columna).setMinWidth(0);
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
             if (revisar()==true)
             {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();

            stm.execute("execute RegistrarDestinosTuristicos " + codigoS + "," + codigoD + ",'" + txtLugar.getText().toString() + "','" + Descripcion.getText().toString() + "'");

            CargarData();
             }
             else throw new Exception ("No deje campos vacios ");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "\n Error al Agregar ");
        }

    }//GEN-LAST:event_BtnAgregarMouseClicked

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
 

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneliminarActionPerformed
        try {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();

            stm.execute("execute EliminarDestino '" + IdL.toString() + "'");

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
                ResultSet rst = stm.executeQuery("execute [TablaDestinosEliminado]");
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
    public boolean revisar() {
        boolean estado = true;
         if (Descripcion.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "No deje la informacion promocional Vacia");
            estado=false;
        }
           if (txtLugar.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "No deje el Lugar Vacio");
            estado=false;
        }
           
        if (cmbPais.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Pais de la lista desplegable");
            estado=false;
        }
        if (cmbCiudad.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una Ciudad de la lista desplegable");
            estado=false;
        }
        JOptionPane.showMessageDialog(null, estado);
        return estado;
    }

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        //actualizar

        validarText();
        validarText1();
        revisar();

        try {
            Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();

            stm.execute("execute ModificarDestinosTuristicos " + codigoS + "," + codigoD + ",'" + txtLugar.getText().toString() + "','" + Descripcion.getText().toString() + "'," + IdL + " , " + IdD + "");

            CargarData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "\n Error al Actualizar verifique sus datos/conexion");
        }
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void DescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionKeyTyped
        validarText();
        validarText1();

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
            Descripcion.getText().replaceFirst(".$", "");
            JOptionPane.showMessageDialog(null, "Sólo se admiten letras", "WARNING", JOptionPane.WARNING_MESSAGE);

            if (Descripcion.getText().length() == 0) {
                BtnAgregar.setEnabled(false);
            } else {
                BtnAgregar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_DescripcionKeyTyped

    private void txtLugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarKeyTyped
        validarText1();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
            txtLugar.getText().replaceFirst(".$", "");
            JOptionPane.showMessageDialog(null, "Sólo se admiten letras", "WARNING", JOptionPane.WARNING_MESSAGE);

            if (txtLugar.getText().length() == 0) {
                BtnAgregar.setEnabled(false);
            } else {
                BtnAgregar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtLugarKeyTyped

    private void btnVERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnVERItemStateChanged
        // TODO add your handling code here:
         if (this.btnVER.isSelected())
        {
            this.BtnAgregar.setVisible(false);
            this.Btneliminar.setVisible(false);
        }
        else 
        {
           this.BtnAgregar.setVisible(true);
            this.Btneliminar.setVisible(true); 
        }
    }//GEN-LAST:event_btnVERItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton Btneliminar;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JTable TABLADestinos;
    private javax.swing.JCheckBox btnVER;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbPais;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtBUSCAR;
    private javax.swing.JTextArea txtLugar;
    private javax.swing.JTextField txtbuscar2;
    // End of variables declaration//GEN-END:variables
}
