
package GUI;

import java.sql.*;
import Clases.ConexionBasedeDatos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class frmClientes extends javax.swing.JInternalFrame {

   ConexionBasedeDatos cone = new ConexionBasedeDatos();
   Connection con = cone.obtenerConexion();
    
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
        bttnLimpiar = new javax.swing.JButton();
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
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        txtDirec2 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(32, 98, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientes.setBackground(new java.awt.Color(26, 78, 108));
        tblClientes.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Sexo", "Telefono", "Fecha Nacimiento", "Direccion 1", "Direcccion 2", "Correo electronico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblClientes);
        tblClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 850, 196));

        bttnLimpiar.setBackground(new java.awt.Color(26, 78, 108));
        bttnLimpiar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnLimpiar.setText("Limpiar");
        jPanel1.add(bttnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 150, 50));

        bttnModificar.setBackground(new java.awt.Color(26, 78, 108));
        bttnModificar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnModificar.setText("Modificar");
        jPanel1.add(bttnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 150, 50));

        bttnEliminar.setBackground(new java.awt.Color(26, 78, 108));
        bttnEliminar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnEliminar.setText("Eliminar");
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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo electronico:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 140, -1));

        txtTelefono.setBackground(new java.awt.Color(26, 78, 108));
        txtTelefono.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setText("  ");
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 20));

        jdcFechaNacimiento.setBackground(new java.awt.Color(26, 78, 108));
        jdcFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        jdcFechaNacimiento.setOpaque(false);
        jPanel1.add(jdcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 130, -1));

        bttnGuardar.setBackground(new java.awt.Color(26, 78, 108));
        bttnGuardar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bttnGuardar.setText("Guardar");
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

        txtApellido.setBackground(new java.awt.Color(26, 78, 108));
        txtApellido.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setText("  ");
        txtApellido.setBorder(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 20));

        txtNombre.setBackground(new java.awt.Color(26, 78, 108));
        txtNombre.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 130, 20));

        txtDirec.setBackground(new java.awt.Color(26, 78, 108));
        txtDirec.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtDirec.setForeground(new java.awt.Color(204, 204, 204));
        txtDirec.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDirec.setText("  ");
        txtDirec.setBorder(null);
        jPanel1.add(txtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 130, 20));

        txtDirec2.setBackground(new java.awt.Color(26, 78, 108));
        txtDirec2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDirec2.setText("  ");
        txtDirec2.setBorder(null);
        jPanel1.add(txtDirec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 130, 20));

        txtCorreo.setBackground(new java.awt.Color(26, 78, 108));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreo.setText("  ");
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 130, 20));

        rbFemenino.setBackground(new java.awt.Color(32, 98, 136));
        buttonGroup1.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbFemenino.setText("Femenino");
        jPanel1.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        rbMasculino.setBackground(new java.awt.Color(32, 98, 136));
        buttonGroup1.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setText("Masculino");
        jPanel1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void bttnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGuardarActionPerformed
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String direccionUno = txtDirec.getText();
        String direcccionDos = txtDirec2.getText();
        String sexo;
        if(rbMasculino.isSelected()==true)
        {
            sexo = "Masculino";
        }else if(rbFemenino.isSelected()==true)
        {
            sexo = "Femenino";
        }else
        {
            sexo = "Otro";
        }
        
            try {
                Connection con = ConexionBasedeDatos.obtenerConexion();
                PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO Clientes (nombre, apellido,telefono, correo, direccionUno, direccionDos, sexo) VALUES (?,?,?,?,?,?,?)");
                
                ps.setString(1,nombre);
                ps.setString(2,apellido);
                ps.setString(4,sexo);
                ps.setString(3,telefono);
                ps.setString(5,direccionUno);
                ps.setString(6,direcccionDos);
                ps.setString(7,correo);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Registro Guardado");
                
            } catch (SQLException ex) 
            {
                 JOptionPane.showMessageDialog(null,ex.toString());
            }
    }//GEN-LAST:event_bttnGuardarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnGuardar;
    private javax.swing.JButton bttnLimpiar;
    private javax.swing.JButton bttnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDirec2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

 

    


   

 


}
