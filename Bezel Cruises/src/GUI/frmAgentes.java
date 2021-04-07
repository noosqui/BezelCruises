
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

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmAgentes extends javax.swing.JInternalFrame {


    public frmAgentes() {
        initComponents();

 
    }

    PreparedStatement pp = null;
    ConexionBasedeDatos cone = new ConexionBasedeDatos();
    Connection cn = null;
    ResultSet rs;
    Statement st;
    ResultSetMetaData rsmd;
    DefaultTableModel model;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblempleados = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtidentidad = new javax.swing.JTextField();
        txtpais = new javax.swing.JTextField();
        txtcodigousuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jdcfechanacimiento = new com.toedter.calendar.JDateChooser();
        cmbpuesto = new javax.swing.JComboBox<>();
        btncrear = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 98, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblempleados.setBackground(new java.awt.Color(26, 78, 108));
        tblempleados.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        tblempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Identidad", "Fecha Nacimiento", "Fecha Contratacion", "Codigo Puesto", "Codigo Usuario", "Pais", "Direccion", "Telefono "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblempleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblempleados);
        if (tblempleados.getColumnModel().getColumnCount() > 0) {
            tblempleados.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 850, 196));

        BtnAgregar.setBackground(new java.awt.Color(26, 78, 108));
        BtnAgregar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 150, 50));

        btnmostrar.setBackground(new java.awt.Color(26, 78, 108));
        btnmostrar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnmostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 150, 50));

        btneliminar.setBackground(new java.awt.Color(26, 78, 108));
        btneliminar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 150, 50));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Identidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pais");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puesto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo Usuario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        txtnombre.setBackground(new java.awt.Color(26, 78, 108));
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombre.setBorder(null);
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 130, -1));

        txtapellido.setBackground(new java.awt.Color(26, 78, 108));
        txtapellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtapellido.setBorder(null);
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 130, -1));

        txttelefono.setBackground(new java.awt.Color(26, 78, 108));
        txttelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txttelefono.setBorder(null);
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, -1));

        txtdireccion.setBackground(new java.awt.Color(26, 78, 108));
        txtdireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtdireccion.setBorder(null);
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 130, -1));

        txtidentidad.setBackground(new java.awt.Color(26, 78, 108));
        txtidentidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtidentidad.setBorder(null);
        txtidentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtidentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 130, -1));

        txtpais.setBackground(new java.awt.Color(26, 78, 108));
        txtpais.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpais.setBorder(null);
        txtpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaisActionPerformed(evt);
            }
        });
        txtpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaisKeyTyped(evt);
            }
        });
        jPanel1.add(txtpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 130, -1));

        txtcodigousuario.setEditable(false);
        txtcodigousuario.setBackground(new java.awt.Color(26, 78, 108));
        txtcodigousuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcodigousuario.setBorder(null);
        jPanel1.add(txtcodigousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 40, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agentes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 40));

        jdcfechanacimiento.setMaxSelectableDate(new java.util.Date(1049785293000L));
        jdcfechanacimiento.setMinSelectableDate(new java.util.Date(-788889507000L));
        jPanel1.add(jdcfechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 180, -1));

        cmbpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente de Ventas" }));
        jPanel1.add(cmbpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 180, -1));

        btncrear.setBackground(new java.awt.Color(26, 78, 108));
        btncrear.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btncrear.setForeground(new java.awt.Color(255, 255, 255));
        btncrear.setText("Crear Usuario");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });
        jPanel1.add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 130, 20));

        btnmodificar.setBackground(new java.awt.Color(26, 78, 108));
        btnmodificar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 978, 579));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

      int dia, mes, año;

      String nombre = txtnombre.getText().trim();
      String apellido = txtapellido.getText().trim();
      String telefono = txttelefono.getText().trim();
      String direccion = txtdireccion.getText().trim();
      String identidad = txtidentidad.getText().trim();
      String pais = txtpais.getText().trim();
      dia = jdcfechanacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
      mes = jdcfechanacimiento.getCalendar().get(Calendar.MONTH)+1;
      año = jdcfechanacimiento.getCalendar().get(Calendar.YEAR);
      String fechaNac = año + "-" + mes + "-" + dia;
      String codigoUsuario = txtcodigousuario.getText().trim();
      String puesto = "" + (cmbpuesto.getSelectedIndex()+1);
      

      try
      {
          CallableStatement cmd = cn.prepareCall("{CALL insertarEmpleado(?,?,?,?,?,?,?,?,?)}");
          cmd.setString(1, nombre);
          cmd.setString(2, apellido);
          cmd.setString(3, identidad);
          cmd.setString(4, fechaNac);
          cmd.setString(5, telefono);
          cmd.setString(6, direccion);
          cmd.setString(7, pais);
          cmd.setString(8, puesto);
          cmd.setString(9, codigoUsuario);
          cmd.executeUpdate();
          JOptionPane.showMessageDialog(null, "Empleado Agregado Exitosamente");
      }
      catch(SQLException ex)
      {
          JOptionPane.showMessageDialog(null, "Error al ingresar el empleado! " + ex);
      }
      finally
      {
          txtnombre.setText(null);
          txtapellido.setText(null);
          txttelefono.setText(null);
          txtdireccion.setText(null);
          txtidentidad.setText(null);
          txtpais.setText(null);
          jdcfechanacimiento.setCalendar(null);
          cmbpuesto.setSelectedIndex(-1);
          txtcodigousuario.setText(null);
          listar();
      }


      btncrear.show();
      BtnAgregar.hide();
      btnmostrar.show();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cn = cone.obtenerConexion();
        BtnAgregar.hide();
        btnmodificar.hide();
        btneliminar.hide();
        listar();
    }//GEN-LAST:event_formInternalFrameOpened

    
    
    
    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        String user, pass, word, codigo ="";
        int encontrado = 0, encontradouser = 0;

        btnmostrar.hide();
        
        if(txtnombre.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre del agente.");
          txtnombre.requestFocus();
        }
        else if(txtapellido.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Por favor ingrese un apellido del agente.");
          txtapellido.requestFocus();
        }
        else if(txttelefono.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Por favor ingrese un telefono del agente.");
          txttelefono.requestFocus();
        }
        else if(txtdireccion.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Por favor ingrese una direccion del agente.");
          txtdireccion.requestFocus();
        }
        else if(txtidentidad.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de identidad del agente.");
          txtidentidad.requestFocus();
        }
        else if(txtpais.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Por favor ingrese un Pais del agente.");
          txtpais.requestFocus();
        }
        else if(jdcfechanacimiento.getCalendar() == null )
        {
          JOptionPane.showMessageDialog(null, "Por favor ingrese una fecha de nacimiento valida del agente.");
          jdcfechanacimiento.requestFocus();
        }
        else
        {

            do
            {
               user = JOptionPane.showInputDialog("Ingrese el nombre de Usuario: ");

               try
                {
                    pp = cn.prepareStatement("select count(*)[Encontrado] from [dbo].[Usuarios] where Nombre_Usuario = ?");
                    pp.setString(1, user);
                    rs = pp.executeQuery();

                    if(rs.next())
                    {
                        encontradouser = rs.getInt("Encontrado");
                    }
                }
                catch(Exception ex)
                {

                }

                if(encontradouser == 1)
                {
                    JOptionPane.showMessageDialog(null, "El Nombre de usuario que ingreso no esta disponible.");
                }

                if(user.equals(""))
                {
                  JOptionPane.showMessageDialog(null, "No puede dejar el campo vacio.");
                }

            }while(encontradouser == 1 || user.equals(""));


            do
            {
               do
               {
                   pass = JOptionPane.showInputDialog("Ingrese la contraseña: ");
               }while(pass.equals(null));

               do
               {
                   word = JOptionPane.showInputDialog("Verifique la contraseña: ");
               }while(word.equals(null));

               if(!pass.equals(word))
               {
                   JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, vuelva a ingresarlas por favor.");
               }

            }while(!pass.equals(word));

            try
            {
                CallableStatement cmd = cn.prepareCall("{CALL insertaruser(?,?)}");
                cmd.setString(1, user);
                cmd.setString(2, pass);
                cmd.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario Creado Exitosamente");

                BtnAgregar.show();
                btncrear.hide();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Error al Crear el Usuario " + ex);
            }
                
            try
                {
                    pp = cn.prepareStatement("Select Codigo_Usuario[Codigo] from [dbo].[Usuarios] where [Nombre_Usuario] = ?");
                    pp.setString(1, user);
                    rs = pp.executeQuery();

                    if(rs.next())
                    {
                        codigo = rs.getString("Codigo");
                    }
                    
                }
                catch(Exception ex)
                {

                }
            
             txtcodigousuario.setText(codigo);
        }
        

        

    }//GEN-LAST:event_btncrearActionPerformed

    private void txtpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaisActionPerformed

    //Variable Global
    int codigo, seleccionada;


    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        int user;


        try
        {
            seleccionada = tblempleados.getSelectedRow();

            if(seleccionada == -1)
            {
                btnmostrar.show();
                btnmodificar.hide();
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila para poder mostrar los datos.");
            }
            else
            {
                codigo = (Integer)tblempleados.getValueAt(seleccionada, 0);
                txtnombre.setText((String)tblempleados.getValueAt(seleccionada, 1));
                txtapellido.setText((String)tblempleados.getValueAt(seleccionada, 2));
                txtidentidad.setText((String)tblempleados.getValueAt(seleccionada, 3));
                jdcfechanacimiento.setDate(convertirFecha("" + tblempleados.getValueAt(seleccionada, 4)));
                txttelefono.setText((String)tblempleados.getValueAt(seleccionada, 10));
                txtdireccion.setText((String)tblempleados.getValueAt(seleccionada, 9));
                txtpais.setText((String)tblempleados.getValueAt(seleccionada, 8));
                cmbpuesto.setSelectedIndex((Integer)tblempleados.getValueAt(seleccionada, 6)-1);
                user = (Integer)tblempleados.getValueAt(seleccionada, 7);
                txtcodigousuario.setText("" + user);


                btncrear.hide();
                //btnmostrar.hide();
                btnmodificar.show();
                btneliminar.show();
                //tblempleados.clearSelection();
            }

        }
        catch(Exception ex)
        {

        }



    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed




        try
        {


            if(seleccionada == -1)
            {
                btnmostrar.show();
                btnmodificar.hide();
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila para poder modificar los datos.");
            }
            else
            {
                int dia, mes, año;

                String nombre = txtnombre.getText().trim();
                String apellido = txtapellido.getText().trim();
                String telefono = txttelefono.getText().trim();
                String direccion = txtdireccion.getText().trim();
                String identidad = txtidentidad.getText().trim();
                String pais = txtpais.getText().trim();
                dia = jdcfechanacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
                mes = jdcfechanacimiento.getCalendar().get(Calendar.MONTH)+1;
                año = jdcfechanacimiento.getCalendar().get(Calendar.YEAR);
                String fechaNac = año + "-" + mes + "-" + dia;
                String codigoUsuario = txtcodigousuario.getText().trim();
                String puesto = "" + (cmbpuesto.getSelectedIndex()+1);

                try
                {
                    CallableStatement cmd = cn.prepareCall("{CALL updateempleado(?,?,?,?,?,?,?,?,?)}");

                    cmd.setString(1, ""+codigo);
                    cmd.setString(2, nombre);
                    cmd.setString(3, apellido);
                    cmd.setString(4, identidad);
                    cmd.setString(5, fechaNac);
                    cmd.setString(6, telefono);
                    cmd.setString(7, direccion);
                    cmd.setString(8, pais);
                    cmd.setString(9, puesto);
                    cmd.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Empleado Modificado Exitosamente");
                }
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error al modificar el empleado! " + ex);
                }
                finally
                {
                    txtnombre.setText(null);
                    txtapellido.setText(null);
                    txttelefono.setText(null);
                    txtdireccion.setText(null);
                    txtidentidad.setText(null);
                    txtpais.setText(null);
                    jdcfechanacimiento.setCalendar(null);
                    cmbpuesto.setSelectedIndex(-1);
                    txtcodigousuario.setText(null);
                    tblempleados.clearSelection();
                    btnmodificar.hide();
                    btneliminar.hide();
                    listar();
                }


            }

            btncrear.show();

        }
        catch(Exception ex)
        {

        }


    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if(seleccionada == -1)
            {
                btnmostrar.show();
                btnmodificar.hide();
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila para poder eliminar los datos.");
            }
        else
        {
            try
            {
                CallableStatement cmd = cn.prepareCall("{CALL eliminarempleado(?)}");

                cmd.setString(1, ""+codigo);
                cmd.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado Eliminado Exitosamente");
                btncrear.show();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Error al eliminar el empleado! " + ex);
            }
            finally
            {
                txtnombre.setText(null);
                txtapellido.setText(null);
                txttelefono.setText(null);
                txtdireccion.setText(null);
                txtidentidad.setText(null);
                txtpais.setText(null);
                jdcfechanacimiento.setCalendar(null);
                cmbpuesto.setSelectedIndex(-1);
                txtcodigousuario.setText(null);
                tblempleados.clearSelection();
                btnmodificar.hide();
                    btneliminar.hide();
                listar();
            }
        }


    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped

    char car = evt.getKeyChar();
    
    if(Character.isLetter(car) || car == KeyEvent.VK_BACK_SPACE)
    {

    }else
    {
        JOptionPane.showMessageDialog(null, "Solo puede ingresar letras.");
        evt.consume();
        getToolkit().beep();
    }   
        
        
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        
        char car = evt.getKeyChar();
    
        if(Character.isLetter(car) || car == KeyEvent.VK_BACK_SPACE)
        {

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras.");
            evt.consume();
            getToolkit().beep();
        }  
        
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaisKeyTyped
        
        char car = evt.getKeyChar();
    
        if(Character.isLetter(car) || car == KeyEvent.VK_BACK_SPACE)
        {

        }else
        {
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras.");
            evt.consume();
            getToolkit().beep();
        }  
        
    }//GEN-LAST:event_txtpaisKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        
        char car = evt.getKeyChar();
    
        if(Character.isLetter(car) || Character.isDigit(car) || car == KeyEvent.VK_BACK_SPACE)
        {

        }else
        {
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras o numeros.");
            evt.consume();
            getToolkit().beep();
        } 
        
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtidentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentidadKeyTyped
        
        char car = evt.getKeyChar();
    
        if(Character.isDigit(car) || car == KeyEvent.VK_BACK_SPACE)
        {

        }else
        {
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros.");
            evt.consume();
            getToolkit().beep();
        } 
        
    }//GEN-LAST:event_txtidentidadKeyTyped

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        
        char car = evt.getKeyChar();
    
        if(Character.isDigit(car) || car == KeyEvent.VK_BACK_SPACE )
        {

        }else
        {
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros.");
            evt.consume();
            getToolkit().beep();
        } 
        
    }//GEN-LAST:event_txttelefonoKeyTyped

    public Date convertirFecha(String fecha)
    {
        Date result = null;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        try
        {
            result = formato.parse(fecha);
        } catch (ParseException ex)
        {

        }

        return result;
    }

    public void listar()
    {
        model = (DefaultTableModel) tblempleados.getModel();
        model.setRowCount(0);

        try
        {
            pp =cn.prepareStatement("Select * from [dbo].[Empleados]");
            rs = pp.executeQuery();
            rsmd = rs.getMetaData();
            int col = rsmd.getColumnCount();

            while(rs.next())
            {
                Object fil[] = new Object[col];
                for(int i = 0; i < col; i++)
                {
                    fil[i] = rs.getObject(i+1);
                }
                model.addRow(fil);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Los datos no se pudieron cargar a la tabla correctamente.");
        }


    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JComboBox<String> cmbpuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcfechanacimiento;
    private javax.swing.JTable tblempleados;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigousuario;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidentidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
