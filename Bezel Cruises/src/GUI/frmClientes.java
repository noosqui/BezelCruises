package GUI;

import Clases.ConexionBasedeDatos;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Calendar;
import java.sql.CallableStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrea
 */
public class frmClientes extends javax.swing.JInternalFrame {

    PreparedStatement pp = null;
    ConexionBasedeDatos cone = new ConexionBasedeDatos();
    Connection cn = null;
    ResultSet rs;
    Statement st;
    ResultSetMetaData rsmd;
    DefaultTableModel model;

    public frmClientes() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        bttnMostrar = new javax.swing.JButton();
        bttnModificar = new javax.swing.JButton();
        bttnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        bttnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        txtDirec2 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();

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

        jPanel1.setBackground(new java.awt.Color(32, 98, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientes.setBackground(new java.awt.Color(26, 78, 108));
        tblClientes.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Fecha Nacimiento", "Sexo", "Telefono", "Direccion #1", "Direcccion #2", "Correo electronico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 870, 196));

        bttnMostrar.setBackground(new java.awt.Color(26, 78, 108));
        bttnMostrar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        bttnMostrar.setText("Mostrar");
        bttnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(bttnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 150, 50));

        bttnModificar.setBackground(new java.awt.Color(26, 78, 108));
        bttnModificar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnModificar.setForeground(new java.awt.Color(255, 255, 255));
        bttnModificar.setText("Modificar");
        bttnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(bttnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 150, 50));

        bttnEliminar.setBackground(new java.awt.Color(26, 78, 108));
        bttnEliminar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bttnEliminar.setText("Eliminar");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bttnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 150, 50));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 80, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Direccion #2:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo electronico:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 140, -1));

        txtTelefono.setBackground(new java.awt.Color(26, 78, 108));
        txtTelefono.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setBorder(null);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 20));

        jdcFechaNacimiento.setBackground(new java.awt.Color(26, 78, 108));
        jdcFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        jdcFechaNacimiento.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jdcFechaNacimiento.setMaxSelectableDate(new java.util.Date(1072854102000L));
        jdcFechaNacimiento.setMinSelectableDate(new java.util.Date(-1262278698000L));
        jdcFechaNacimiento.setOpaque(false);
        jPanel1.add(jdcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 180, -1));

        bttnGuardar.setBackground(new java.awt.Color(26, 78, 108));
        bttnGuardar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bttnGuardar.setText("Agregar");
        bttnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(bttnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 150, 50));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clientes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 40));

        txtNombre.setBackground(new java.awt.Color(26, 78, 108));
        txtNombre.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setText(" ");
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 130, 20));

        txtDirec.setBackground(new java.awt.Color(26, 78, 108));
        txtDirec.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtDirec.setForeground(new java.awt.Color(204, 204, 204));
        txtDirec.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDirec.setText("  ");
        txtDirec.setBorder(null);
        txtDirec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecKeyTyped(evt);
            }
        });
        jPanel1.add(txtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 200, 20));

        txtDirec2.setBackground(new java.awt.Color(26, 78, 108));
        txtDirec2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtDirec2.setForeground(new java.awt.Color(204, 204, 204));
        txtDirec2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDirec2.setText("  ");
        txtDirec2.setBorder(null);
        txtDirec2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirec2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirec2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDirec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 200, 20));

        txtCorreo.setBackground(new java.awt.Color(26, 78, 108));
        txtCorreo.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreo.setText("  ");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 180, 20));

        txtApellido.setBackground(new java.awt.Color(26, 78, 108));
        txtApellido.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setText(" ");
        txtApellido.setBorder(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 20));

        cmbSexo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbSexo.setName(""); // NOI18N
        jPanel1.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    int id;
    int seleccion;


    private void bttnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGuardarActionPerformed

        int dia, mes, año;

        
        if (txtNombre.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty()
                || txtDirec.getText().trim().isEmpty() || txtDirec2.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty() || jdcFechaNacimiento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos con sus requerimientos", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String nombreC = txtNombre.getText().trim();
                String apellidoC = txtApellido.getText().trim();
                String telefono = txtTelefono.getText().trim();
                String direccion1 = txtDirec.getText().trim();
                String direccion2 = txtDirec2.getText().trim();
                String correo = txtCorreo.getText().trim();
                String sexo = String.valueOf(cmbSexo.getSelectedItem());
                dia = jdcFechaNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
                mes = jdcFechaNacimiento.getCalendar().get(Calendar.MONTH) + 1;
                año = jdcFechaNacimiento.getCalendar().get(Calendar.YEAR);
                String fechaNac = "" + año + "-" + ((mes <= 9) ? "0" + mes : mes) + "-" + ((dia <= 9) ? "0" + dia : dia);
                CallableStatement cmd = cn.prepareCall("{CALL InsertCliente(?,?,?,?,?,?,?,?)}");
                cmd.setString(1, nombreC);
                cmd.setString(2, apellidoC);
                cmd.setString(3, sexo);
                cmd.setString(4, telefono);
                cmd.setString(5, fechaNac);
                cmd.setString(6, direccion1);
                cmd.setString(7, direccion2);
                cmd.setString(8, correo);
                cmd.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente Agregado Exitosamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR! No se pudo ingresar el Cliente! " + ex);
            } finally {
                txtNombre.setText(null);
                txtApellido.setText(null);
                cmbSexo.setSelectedIndex(-1);
                txtTelefono.setText(null);
                jdcFechaNacimiento.setCalendar(null);
                txtDirec.setText(null);
                txtDirec2.setText(null);
                txtCorreo.setText(null);
                listarCliente();
            }
    }//GEN-LAST:event_bttnGuardarActionPerformed
    }

    public Date convertirFecha(String fecha) {
        Date result = null;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        try {
            result = formato.parse(fecha);
        } catch (ParseException ex) {

        }

        return result;
    }


    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed

    }//GEN-LAST:event_txtApellidoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cn = cone.obtenerConexion();
        listarCliente();

    }//GEN-LAST:event_formInternalFrameOpened

    private void bttnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnMostrarActionPerformed

        try {
            seleccion = tblClientes.getSelectedRow();

            if (seleccion == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila para poder mostrar los datos.");
            } else {
                id = (Integer) tblClientes.getValueAt(seleccion, 0);
                txtNombre.setText((String) tblClientes.getValueAt(seleccion, 1));
                txtApellido.setText((String) tblClientes.getValueAt(seleccion, 2));
                
                if (((String) tblClientes.getValueAt(seleccion, 4)).trim().equalsIgnoreCase("Masculino"))
                {
                cmbSexo.setSelectedIndex(0);
                }
                else
                {
                    cmbSexo.setSelectedIndex(1);
                }
                    txtTelefono.setText((String) tblClientes.getValueAt(seleccion, 5));
                jdcFechaNacimiento.setDate(convertirFecha("" + tblClientes.getValueAt(seleccion, 3)));
                txtDirec.setText((String) tblClientes.getValueAt(seleccion, 6));
                txtDirec2.setText((String) tblClientes.getValueAt(seleccion, 7));
                txtCorreo.setText((String) tblClientes.getValueAt(seleccion, 8));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se han podido mostrar los datos, Intentelo nuevamente.");
        }


    }//GEN-LAST:event_bttnMostrarActionPerformed

    private void bttnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnModificarActionPerformed

        try {
            if (seleccion == -1 || txtNombre.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty()
                || txtDirec.getText().trim().isEmpty() || txtDirec2.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty() || jdcFechaNacimiento.getDate() == null || cmbSexo.getSelectedIndex()==-1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila para poder modificar los datos y/o hay datos vacios");
            } else {
                int dia, mes, año;

                String nombreC = txtNombre.getText().trim();
                String apellidoC = txtApellido.getText().trim();
                String telefono = txtTelefono.getText().trim();
                String direccion1 = txtDirec.getText().trim();
                String direccion2 = txtDirec2.getText().trim();
                String correo = txtCorreo.getText().trim();
                String sexo = String.valueOf(cmbSexo.getSelectedItem());
                dia = jdcFechaNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
                mes = jdcFechaNacimiento.getCalendar().get(Calendar.MONTH) + 1;
                año = jdcFechaNacimiento.getCalendar().get(Calendar.YEAR);
                String fechaNac = año + "-" + mes + "-" + dia;

                try {
                    CallableStatement cmd = cn.prepareCall("{CALL ActualizarCliente(?,?,?,?,?,?,?,?,?)}");

                    cmd.setString(1, "" + id);
                    cmd.setString(2, nombreC);
                    cmd.setString(3, apellidoC);
                    cmd.setString(4, sexo);
                    cmd.setString(5, telefono);
                    cmd.setString(6, fechaNac);
                    cmd.setString(7, direccion1);
                    cmd.setString(8, direccion2);
                    cmd.setString(9, correo);
                    cmd.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro de Cliente Modificado Exitosamente");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR! Al modificar los datos del Cliente! " + ex);
                } finally {
                    txtNombre.setText(null);
                    txtApellido.setText(null);
                    cmbSexo.setSelectedIndex(-1);
                    txtTelefono.setText(null);
                    jdcFechaNacimiento.setCalendar(null);
                    txtDirec.setText(null);
                    txtDirec2.setText(null);
                    txtCorreo.setText(null);
                    listarCliente();

                }

            }

        } catch (Exception ex) {

        }


    }//GEN-LAST:event_bttnModificarActionPerformed

    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed

        if (seleccion == -1) {

            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila para poder eliminar los datos.");
        } else {
            try {
                CallableStatement cmd = cn.prepareCall("{CALL EliminarCliente(?)}");

                cmd.setString(1, "" + id);
                cmd.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente Eliminado Exitosamente");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el cliente! " + ex);
            } finally {
                txtNombre.setText(null);
                txtApellido.setText(null);
                cmbSexo.setSelectedIndex(-1);
                txtTelefono.setText(null);
                jdcFechaNacimiento.setCalendar(null);
                txtDirec.setText(null);
                txtDirec2.setText(null);
                txtCorreo.setText(null);
                tblClientes.clearSelection();
                listarCliente();
            }
    }//GEN-LAST:event_bttnEliminarActionPerformed
    }

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed

    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed

    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased

    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased

    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtDirecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecKeyReleased

    }//GEN-LAST:event_txtDirecKeyReleased

    private void txtDirec2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirec2KeyReleased

    }//GEN-LAST:event_txtDirec2KeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased

    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDirecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecKeyTyped

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') &&( c < '0' || c > '9')
                && (c != (char) KeyEvent.VK_BACK_SPACE) && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }


    }//GEN-LAST:event_txtDirecKeyTyped

    private void txtDirec2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirec2KeyTyped

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') &&( c < '0' || c > '9')
                && (c != (char) KeyEvent.VK_BACK_SPACE) && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }


    }//GEN-LAST:event_txtDirec2KeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped

    }//GEN-LAST:event_txtCorreoKeyTyped

    public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }
    }

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
       
        if(isEmail(txtCorreo.getText().trim()))
        {

        }else{
           JOptionPane.showMessageDialog(null, "Correo Electronico incorrecto", "Complete el Email", JOptionPane.INFORMATION_MESSAGE);
           txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    public void listarCliente() {
        model = (DefaultTableModel) tblClientes.getModel();
        model.setRowCount(0);

        try {
            pp = cn.prepareStatement("SELECT * FROM [dbo].[Clientes]");
            rs = pp.executeQuery();
            rsmd = rs.getMetaData();
            int col = rsmd.getColumnCount();

            while (rs.next()) {
                Object fil[] = new Object[col];
                for (int i = 0; i < col; i++) {
                    fil[i] = rs.getObject(i + 1);
                }
                model.addRow(fil);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Los datos no se pudieron cargar a la tabla correctamente.");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnGuardar;
    private javax.swing.JButton bttnModificar;
    private javax.swing.JButton bttnMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDirec2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
