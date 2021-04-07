package GUI;

import Clases.ClaseViajes;
import Clases.ConexionBasedeDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class frmViajes extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    ClaseViajes cv = new ClaseViajes();


    String Duracion;
    String id_viaje;
    int codigoestado = 1;
    String FechaSeleccionada;


    public frmViajes() throws SQLException {
        initComponents();

        TablaVIAJES.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListaDuracion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        BtnAgregar.setEnabled(false);
        BtnModificar.setEnabled(false);
        Btneliminar.setEnabled(false);

        try {
            String[] titulo = new String[]{"Fecha de Partida", "Buque", "Puerto Salida", "Destino", "Duracion", "Estado del Viaje", "Codigo Viaje"};
            dtm.setColumnIdentifiers(titulo);
            TablaVIAJES.setModel(dtm);
            ocultarColumna(6);
            CargarData();
            ListaDuracion.setSelectedIndex(1);
            cv.combobox(cmbBuques);
            cv.combobox(cmbDestino, "SELECT Codigo_RutaDestino, Descripcion FROM  Destinos_Turisticos ORDER BY Codigo_RutaDestino asc ");
            cv.combobox(cmbSalida, "SELECT Descripcion FROM Puertos_Salida ORDER BY Codigo_PuertoSalida asc", "Descripcion");
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Algo no anda bien");

        }

       

    }

    public String fechaS() {
        String fecha;
        java.util.Date date = new java.util.Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        return fecha = f.format(FechaPartida.getDate());

    }

    public void CargarData() throws SQLException {
        Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
        ResultSet rst = stm.executeQuery("execute TablaViajes");
        limpiartabla();
        while (rst.next()) {
            dtm.addRow(new Object[]{
                rst.getDate(1),
                rst.getString(2),
                rst.getString(3),
                rst.getString(4),
                rst.getString(5),
                rst.getString(6),
                rst.getString(7)

            });
        }
    }

    public void limpiartabla() {

        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtBUSCAR = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btneliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaVIAJES = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chEstado = new javax.swing.JCheckBox();
        cmbBuques = new javax.swing.JComboBox<>();
        cmbDestino = new javax.swing.JComboBox<>();
        cmbSalida = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tarea_ubicacion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDuracion = new javax.swing.JList<>();
        FechaPartida = new com.toedter.calendar.JDateChooser();
        btnVER = new javax.swing.JCheckBox();

        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(38, 116, 162));

        txtBUSCAR.setBackground(new java.awt.Color(17, 51, 71));
        txtBUSCAR.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        txtBUSCAR.setBorder(null);
        txtBUSCAR.setName("txt_buscar"); // NOI18N
        txtBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBUSCARKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Viajes");

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Viajes");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lup32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap())))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 60);

        jPanel1.setBackground(new java.awt.Color(26, 78, 108));
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btneliminar.setBackground(new java.awt.Color(255, 204, 204));
        Btneliminar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        Btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        Btneliminar.setText("Eliminar");
        Btneliminar.setEnabled(false);
        Btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 120, 30));

        BtnModificar.setBackground(new java.awt.Color(255, 204, 204));
        BtnModificar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setText("Modificar");
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 120, 30));

        BtnAgregar.setBackground(new java.awt.Color(255, 204, 204));
        BtnAgregar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.setEnabled(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 120, 30));

        jLabel3.setBackground(new java.awt.Color(21, 38, 76));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 38, 76));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EMPACA TU TRAJE DE BUCEO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("cerca en una aventura de buceo o buceo con esnórquel.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, 20));

        TablaVIAJES.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        TablaVIAJES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Buque", "Puerto Salida", "Destino", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaVIAJES.setColumnSelectionAllowed(true);
        TablaVIAJES.getTableHeader().setReorderingAllowed(false);
        TablaVIAJES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaVIAJESMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaVIAJES);
        TablaVIAJES.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TablaVIAJES.getColumnModel().getColumnCount() > 0) {
            TablaVIAJES.getColumnModel().getColumn(0).setResizable(false);
            TablaVIAJES.getColumnModel().getColumn(1).setResizable(false);
            TablaVIAJES.getColumnModel().getColumn(2).setResizable(false);
            TablaVIAJES.getColumnModel().getColumn(3).setResizable(false);
            TablaVIAJES.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 930, 130));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puerto Salida");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 140, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Detalles:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Duracion");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha de partida");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, -1));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Buque");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        chEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chEstado.setForeground(new java.awt.Color(255, 255, 255));
        chEstado.setText("Estado ");
        chEstado.setBorder(new javax.swing.border.MatteBorder(null));
        chEstado.setContentAreaFilled(false);
        chEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(chEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, -1));

        cmbBuques.setBackground(new java.awt.Color(17, 51, 71));
        cmbBuques.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        cmbBuques.setForeground(new java.awt.Color(255, 255, 255));
        cmbBuques.setBorder(null);
        cmbBuques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuquesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbBuques, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 210, -1));

        cmbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDestinoItemStateChanged(evt);
            }
        });
        cmbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 210, -1));

        cmbSalida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSalidaItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Destino");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 100, -1));

        tarea_ubicacion.setEditable(false);
        tarea_ubicacion.setBackground(new java.awt.Color(0, 51, 102));
        tarea_ubicacion.setColumns(20);
        tarea_ubicacion.setForeground(new java.awt.Color(255, 255, 255));
        tarea_ubicacion.setRows(5);
        tarea_ubicacion.setCaretColor(new java.awt.Color(255, 255, 255));
        tarea_ubicacion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tarea_ubicacion);
        tarea_ubicacion.getAccessibleContext().setAccessibleParent(tarea_ubicacion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 240, 110));

        ListaDuracion.setBackground(new java.awt.Color(0, 51, 51));
        ListaDuracion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ListaDuracion.setForeground(new java.awt.Color(255, 255, 255));
        ListaDuracion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2 Dias    ", "3 Dias    ", "4 Dias    ", "5 Dias    ", "6 Dias    ", "1 Semana    ", "10 Dias    ", "2 Semanas    ", "3 Semanas    ", "1 Mes    " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaDuracion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaDuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaDuracionMouseClicked(evt);
            }
        });
        ListaDuracion.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaDuracionValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaDuracion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 130, 170));

        FechaPartida.setBackground(new java.awt.Color(255, 204, 204));
        FechaPartida.setForeground(new java.awt.Color(204, 204, 255));
        FechaPartida.setDateFormatString("yyyy-MM-dd");
        FechaPartida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechaPartida.setInheritsPopupMenu(true);
        FechaPartida.setMaxSelectableDate(new java.util.Date(1746169311000L));
        FechaPartida.setMinSelectableDate(new java.util.Date(1610089266000L));
        FechaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaPartidaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FechaPartidaMousePressed(evt);
            }
        });
        FechaPartida.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaPartidaPropertyChange(evt);
            }
        });
        FechaPartida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FechaPartidaKeyPressed(evt);
            }
        });
        jPanel1.add(FechaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 210, -1));

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
        jPanel1.add(btnVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 1000, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBUSCARKeyTyped
        try {
            if (txtBUSCAR.equals(" ")) {
                CargarData();
            }

            if (btnVER.isSelected() == true) {

                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
                ResultSet rst = stm.executeQuery("execute [TablaViajesBuscaCancelado]'" + txtBUSCAR.getText() + "'");
                limpiartabla();
                while (rst.next()) {
                    dtm.addRow(new Object[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6),
                        rst.getString(7)

                    });
                }
            } else {
                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
                ResultSet rst = stm.executeQuery("execute [TablaViajesBuscar] '" + txtBUSCAR.getText() + "'");
                limpiartabla();
                while (rst.next()) {
                    dtm.addRow(new Object[]{
                        rst.getDate(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6),
                        rst.getString(7)});
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar");
        }

        //validar que solo se escriba palabras
        char vali = evt.getKeyChar();

        if (Character.isDigit(vali)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingrese letras porfavor");
            txtBUSCAR.getText().replaceFirst(".$", "");
            txtBUSCAR.requestFocus();

        }
        //
    }//GEN-LAST:event_txtBUSCARKeyTyped

    public void validar() {

        if (FechaPartida.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione Una Fecha");
        }
        if (cmbBuques.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione Buque de la lista desplegable");
        }
        if (cmbDestino.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un destino de la lista desplegable");
        }
        if (cmbSalida.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una Puerto de salida de la lista desplegable");
        }

    }

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        validar();
        Statement stm;
        try {
            stm = ConexionBasedeDatos.obtenerConexion().createStatement();
            stm.execute("execute [InsertarViaje] " + cmbBuques.getSelectedIndex() + "," + cmbSalida.getSelectedIndex() + "," + cmbDestino.getSelectedIndex() + ",'" + ListaDuracion.getSelectedValue() + "','" + fechaS().toString() + "','" + codigoestado + "'");
            CargarData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al Agregar el viaje compruebe su conexion/campos"+ex);

        }
         tarea_ubicacion.setText(null);
         cmbBuques.setSelectedIndex(0);
         cmbSalida.setSelectedIndex(0);
         cmbDestino.setSelectedIndex(0);
         ListaDuracion.setSelectedIndex(0);

    }//GEN-LAST:event_BtnAgregarActionPerformed

    public void ocultarColumna(int columna) {
        TablaVIAJES.getColumnModel().getColumn(columna).setMaxWidth(0);
        TablaVIAJES.getColumnModel().getColumn(columna).setMinWidth(0);
        TablaVIAJES.getTableHeader().getColumnModel().getColumn(columna).setMaxWidth(0);
        TablaVIAJES.getTableHeader().getColumnModel().getColumn(columna).setMinWidth(0);
    }
    private void cmbBuquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuquesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBuquesActionPerformed

    private void cmbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDestinoItemStateChanged
        String Destino = (String) cmbDestino.getSelectedItem();
        int codigo = cmbDestino.getSelectedIndex();
        cv.Ubicacion(Destino, codigo, tarea_ubicacion);
    }//GEN-LAST:event_cmbDestinoItemStateChanged

    private void cmbSalidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSalidaItemStateChanged
        String Salida = (String) cmbSalida.getSelectedItem();
        int codigo = cmbSalida.getSelectedIndex();
        cv.PuertoSalida(Salida, codigo, tarea_ubicacion);
    }//GEN-LAST:event_cmbSalidaItemStateChanged

    private void ListaDuracionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaDuracionValueChanged
        ListaDuracion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_ListaDuracionValueChanged

    private void TablaVIAJESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaVIAJESMouseClicked
        int i = TablaVIAJES.rowAtPoint(evt.getPoint());

        chEstado.setEnabled(true);
        Btneliminar.setEnabled(true);

        try {
            String f = String.valueOf(TablaVIAJES.getValueAt(TablaVIAJES.getSelectedRow(), 0));
            cmbBuques.setSelectedItem(String.valueOf(TablaVIAJES.getValueAt(i, 1)));
            cmbSalida.setSelectedItem(String.valueOf(TablaVIAJES.getValueAt(i, 2)));
            cmbDestino.setSelectedItem(String.valueOf(TablaVIAJES.getValueAt(i, 3)));
            Duracion = String.valueOf(TablaVIAJES.getValueAt(TablaVIAJES.getSelectedRow(), 4));
            String estado = String.valueOf(TablaVIAJES.getValueAt(TablaVIAJES.getSelectedRow(), 5));
            id_viaje = String.valueOf(TablaVIAJES.getValueAt(TablaVIAJES.getSelectedRow(), 6));

            //fecha
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fecha;

            try {
                fecha = (java.util.Date) s.parse(f);
                FechaPartida.setDate(fecha);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "estamos teniendo problemas con la fecha...");
            }

            //Duracion
            ListaDuracion.setSelectedValue(Duracion, true);

            if ("Activo".equals(estado)) {
                chEstado.setSelected(true);

            } else {
                chEstado.setSelected(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas de conexion con la tabla...");
        }


    }//GEN-LAST:event_TablaVIAJESMouseClicked

    private void cmbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDestinoActionPerformed

    }//GEN-LAST:event_cmbDestinoActionPerformed

    private void ListaDuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDuracionMouseClicked

    }//GEN-LAST:event_ListaDuracionMouseClicked

    private void BtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneliminarActionPerformed
        Statement stm;
        try {
            stm = ConexionBasedeDatos.obtenerConexion().createStatement();
            stm.execute("EliminarViaje " + id_viaje + " ");
            CargarData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar viaje");
        }


    }//GEN-LAST:event_BtneliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        validar();
        Statement stm;
        try {
            stm = ConexionBasedeDatos.obtenerConexion().createStatement();
            stm.execute("execute ModificarViaje " + id_viaje + "," + cmbBuques.getSelectedIndex() + "," + cmbSalida.getSelectedIndex() + "," + cmbDestino.getSelectedIndex() + ",'" + ListaDuracion.getSelectedValue() + "','" + fechaS().toString() + "','" + codigoestado + "'");
            CargarData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el viaje compruebe su conexion/campos"+e);
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void chEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chEstadoActionPerformed
        if (chEstado.isSelected() == true) {
            codigoestado = 1;
        } else {
            codigoestado = 2;
        }
    }//GEN-LAST:event_chEstadoActionPerformed

    private void FechaPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaPartidaMouseClicked
        if (FechaPartida.getDate() != null) {

            BtnModificar.setEnabled(true);
            BtnAgregar.setEnabled(true);
        }

         if (FechaPartida.getDate() == null) {

            BtnModificar.setEnabled(false);
            BtnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_FechaPartidaMouseClicked

    private void FechaPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaPartidaMousePressed
        if (FechaPartida.getDate() != null) {

            BtnModificar.setEnabled(true);
            BtnAgregar.setEnabled(true);
        }

         if (FechaPartida.getDate() == null) {

            BtnModificar.setEnabled(false);
            BtnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_FechaPartidaMousePressed

    private void btnVERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVERMouseClicked

    }//GEN-LAST:event_btnVERMouseClicked

    private void btnVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVERActionPerformed
        if (btnVER.isSelected() == true) {
            try {
                Statement stm = ConexionBasedeDatos.obtenerConexion().createStatement();
                ResultSet rst = stm.executeQuery("execute [TablaViajesCancelado]");
                limpiartabla();
                while (rst.next()) {
                    dtm.addRow(new Object[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6),
                        rst.getString(7)

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

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseWheelMoved

    private void FechaPartidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaPartidaKeyPressed
        if (FechaPartida.getDate() != null) {

            BtnModificar.setEnabled(true);
            BtnAgregar.setEnabled(true);
        }

        if (FechaPartida.getDate() == null) {

            BtnModificar.setEnabled(false);
            BtnAgregar.setEnabled(false);
        }

    }//GEN-LAST:event_FechaPartidaKeyPressed

    private void FechaPartidaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaPartidaPropertyChange
        if (FechaPartida.getDate() != null) {

            BtnModificar.setEnabled(true);
            BtnAgregar.setEnabled(true);
        }


         if (FechaPartida.getDate() == null) {

            BtnModificar.setEnabled(false);
            BtnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_FechaPartidaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton Btneliminar;
    private com.toedter.calendar.JDateChooser FechaPartida;
    private javax.swing.JList<String> ListaDuracion;
    private javax.swing.JTable TablaVIAJES;
    private javax.swing.JCheckBox btnVER;
    private javax.swing.JCheckBox chEstado;
    private javax.swing.JComboBox<String> cmbBuques;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JComboBox<String> cmbSalida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea tarea_ubicacion;
    private javax.swing.JTextField txtBUSCAR;
    // End of variables declaration//GEN-END:variables
}
