package GUI;

import Clases.ConexionBasedeDatos;
import java.awt.Cursor;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import javax.swing.JOptionPane;

/**
 *
 * @author Maykin Perdomo
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public frmLogin() {
        initComponents();
    }

    PreparedStatement pp = null;
    ConexionBasedeDatos cone = new ConexionBasedeDatos();
    Connection cn = null;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        Pswusuario = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Btningresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1098, 678));
        setSize(new java.awt.Dimension(1098, 678));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(0, 90, 130));
        panel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICONO.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 200, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bezel_cruises.png"))); // NOI18N
        jLabel9.setToolTipText("");
        panel1.add(jLabel9);
        jLabel9.setBounds(10, 290, 210, 50);

        getContentPane().add(panel1);
        panel1.setBounds(280, 130, 220, 460);

        panel4.setBackground(new java.awt.Color(33, 45, 62));
        panel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        panel4.add(jLabel3);
        jLabel3.setBounds(126, 42, 143, 32);
        jLabel3.getAccessibleContext().setAccessibleName("Iniciar_Sesion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        panel4.add(jLabel4);
        jLabel4.setBounds(41, 134, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        panel4.add(jLabel5);
        jLabel5.setBounds(40, 220, 70, 17);

        txtusuario.setBackground(new java.awt.Color(33, 45, 62));
        txtusuario.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setBorder(null);
        txtusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtusuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtusuarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        panel4.add(txtusuario);
        txtusuario.setBounds(110, 160, 160, 33);

        Pswusuario.setBackground(new java.awt.Color(33, 45, 62));
        Pswusuario.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Pswusuario.setForeground(new java.awt.Color(255, 255, 255));
        Pswusuario.setBorder(null);
        panel4.add(Pswusuario);
        Pswusuario.setBounds(110, 250, 170, 34);
        panel4.add(jSeparator1);
        jSeparator1.setBounds(69, 201, 214, 4);
        panel4.add(jSeparator2);
        jSeparator2.setBounds(69, 291, 214, 2);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconousuario.png"))); // NOI18N
        panel4.add(jLabel7);
        jLabel7.setBounds(40, 160, 30, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Passwicono.png"))); // NOI18N
        jLabel6.setRequestFocusEnabled(false);
        panel4.add(jLabel6);
        jLabel6.setBounds(40, 250, 30, 40);

        Btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btningresar.png"))); // NOI18N
        Btningresar.setBorderPainted(false);
        Btningresar.setContentAreaFilled(false);
        Btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtningresarActionPerformed(evt);
            }
        });
        panel4.add(Btningresar);
        Btningresar.setBounds(70, 340, 190, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olvide mi contraseña");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        panel4.add(jLabel1);
        jLabel1.setBounds(100, 410, 180, 20);

        getContentPane().add(panel4);
        panel4.setBounds(500, 130, 350, 460);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crucero.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1100, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtusuarioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioAncestorAdded


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cn = cone.obtenerConexion();

    }//GEN-LAST:event_formWindowOpened

    private void BtningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtningresarActionPerformed

        int idEmpleado =0;
        int puesto=0;
        
        try {
            pp = cn.prepareStatement("select Id_Empleado,Codigo_Puesto from Empleados join Usuarios on Empleados.Codigo_Usuario = Usuarios.Codigo_Usuario and Usuarios.Nombre_Usuario=? and Usuarios.Contrasenia=?");
            pp.setString(1, txtusuario.getText());
            pp.setString(2, Pswusuario.getText());
            rs = pp.executeQuery();

            if (rs.next()) 
            {
                idEmpleado = rs.getInt(1);
                puesto = rs.getInt(2);
            } 
                if (idEmpleado != 0 && puesto!=0) {
                    JOptionPane.showMessageDialog(null, "Bienvenido a Bezel Cruises System");
                    frmMenuPrincipal prin = new frmMenuPrincipal(idEmpleado,puesto);
                    prin.show();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Datos Incorrectos! Porfavor verifique sus Datos Nuevamente.");
                    txtusuario.setText(null);
                    Pswusuario.setText(null);
                    txtusuario.requestFocus();
                }
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + ex);
        }

    }//GEN-LAST:event_BtningresarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
       String user, telefono, id, email, code = "", recibido = "", pass,word;
        int encontradouser = 0, intentos = 0;
        
        do
        {
            user = JOptionPane.showInputDialog("Ingrese el usuario del cual desea recuperar la contraseña: ");
            
            if(user == null)
            {
                break;
            }
            
            telefono = JOptionPane.showInputDialog("Ingrese el telefono vinculado al usuario: ");
            
            if(telefono == null)
            {
                break;
            }
            
            id = JOptionPane.showInputDialog("Ingrese el numero de identidad vinculado al usuario: ");
            
            if(id == null)
            {
                break;
            }
            
            try
            {
                pp = cn.prepareStatement("Select count(*)[Encontrado] from\n" +
                        "[dbo].[Empleados] a join [dbo].[Usuarios] b on a.Codigo_Usuario = b.Codigo_Usuario\n" +
                        "where a.Identidad = ? and a.Telefono = ? and b.Nombre_Usuario = ?");
                pp.setString(1, id);
                pp.setString(2, telefono);
                pp.setString(3, user);
                rs = pp.executeQuery();

                if(rs.next())
                {
                    encontradouser = rs.getInt("Encontrado");
                }
            }
            catch(Exception ex)
            {
                
            }
            
            if(encontradouser == 0)
            {
                JOptionPane.showMessageDialog(null, "Datos Ingresados Incorrectos, intentelo nuevamente.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario Verificado.");
            }
            
        }while(encontradouser == 0);
        
        if(encontradouser == 1)
        {
            try
            {
                CallableStatement cmd = cn.prepareCall("{CALL recuperar}");
                cmd.executeUpdate();
                JOptionPane.showMessageDialog(null, "Codigo de Recuperacion Generado Exitosamente");
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Error al Generar el codigo" + ex);
            }
        
            try
                {
                    pp = cn.prepareStatement("select top 1 codigo from recuperacion order by id desc");
                    rs = pp.executeQuery();

                    if(rs.next())
                    {
                        code = rs.getString("codigo");
                    }
                }
                catch(Exception ex)
                {

                }

            email = JOptionPane.showInputDialog("Ingrese el correo de Recuperacion: ");

            Properties propiedad = new Properties();
            propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
            propiedad.setProperty("mail.smtp.starttls.enable", "true");
            propiedad.setProperty("mail.smtp.port", "587");
            propiedad.setProperty("mail.smtp.auth", "true");

            Session sesion = Session.getDefaultInstance(propiedad);

            String correoenvia = "bezelcruises@gmail.com";
            String contra = "programacion";
            String Destinatario = email;
            String asunto = "Codigo Recuperacion";
            String Mensaje = "El codigo de recuperacion es: " + code;

            MimeMessage mail  = new MimeMessage(sesion);

            try {
                mail.setFrom(new InternetAddress(correoenvia));
                mail.addRecipient(Message.RecipientType.TO, new InternetAddress(Destinatario));
                mail.setSubject(asunto);
                mail.setText(Mensaje);

                Transport transporte = sesion.getTransport("smtp");
                transporte.connect(correoenvia,contra);
                transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                transporte.close();

                JOptionPane.showMessageDialog(null, "Correo Enviado");
            } catch (AddressException ex) {
                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

            do
            {
                recibido = JOptionPane.showInputDialog("Ingrese el codigo de verificacion: ");

                if(!recibido.equals(code))
                {
                    JOptionPane.showMessageDialog(null, "El codigo ingresado no coincide, intentelo nuevamente.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El codigo ingresado es correcto.");

                }
                    
            }while(!recibido.equals(code));

            do
                {
                   do
                   {
                       pass = JOptionPane.showInputDialog("Ingrese la nueva contraseña: ");
                   }while(pass.equals(null));

                   do
                   {
                       word = JOptionPane.showInputDialog("Verifique la nueva contraseña: ");
                   }while(word.equals(null));

                   if(!pass.equals(word))
                   {
                       JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, vuelva a ingresarlas por favor.");
                   }

                }while(!pass.equals(word));

             try
             {
                CallableStatement cmd = cn.prepareCall("{CALL cambiocontra(?,?)}");

                cmd.setString(1, user);
                cmd.setString(2, pass);
                cmd.executeUpdate();
                JOptionPane.showMessageDialog(null, "Contraseña Modificada Exitosamente");
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Error al modificar la Contraseña! " + ex);
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btningresar;
    private javax.swing.JPasswordField Pswusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel4;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
