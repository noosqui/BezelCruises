/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author Andres Martinez
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private int idEmpleado;
    private int Puesto;
    public frmMenuPrincipal() {
        initComponents();
    }
     public frmMenuPrincipal(int idEmpleado,int Puesto) {
        initComponents();
        this.idEmpleado = idEmpleado;
        this.Puesto=Puesto;
   
    }

    frmMenuPrincipal(int idEmpleado) {
          initComponents();
          this.idEmpleado = idEmpleado;
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgente = new javax.swing.JButton();
        btnDestinos = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        btnCamarotes = new javax.swing.JButton();
        btnBuque = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnPuertos = new javax.swing.JButton();
        ContenedorFrm = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(32, 98, 136));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(38, 116, 161));
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(38, 116, 161));
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 90));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bezel_cruises.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel3, gridBagConstraints);

        btnAgente.setBackground(new java.awt.Color(32, 98, 136));
        btnAgente.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnAgente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seller.png"))); // NOI18N
        btnAgente.setText("Agente");
        btnAgente.setBorder(null);
        btnAgente.setBorderPainted(false);
        btnAgente.setContentAreaFilled(false);
        btnAgente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgenteMouseEntered(evt);
            }
        });
        btnAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgenteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(btnAgente, gridBagConstraints);

        btnDestinos.setBackground(new java.awt.Color(32, 98, 136));
        btnDestinos.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnDestinos.setForeground(new java.awt.Color(255, 255, 255));
        btnDestinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/placeholder.png"))); // NOI18N
        btnDestinos.setText("Destinos");
        btnDestinos.setBorder(null);
        btnDestinos.setBorderPainted(false);
        btnDestinos.setContentAreaFilled(false);
        btnDestinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDestinos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDestinos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDestinosMouseEntered(evt);
            }
        });
        btnDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(btnDestinos, gridBagConstraints);

        btnVenta.setBackground(new java.awt.Color(32, 98, 136));
        btnVenta.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping-cart.png"))); // NOI18N
        btnVenta.setText("Vender Boleto");
        btnVenta.setBorder(null);
        btnVenta.setBorderPainted(false);
        btnVenta.setContentAreaFilled(false);
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVenta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentaMouseEntered(evt);
            }
        });
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(btnVenta, gridBagConstraints);

        btnViajes.setBackground(new java.awt.Color(32, 98, 136));
        btnViajes.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnViajes.setForeground(new java.awt.Color(255, 255, 255));
        btnViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/luggage.png"))); // NOI18N
        btnViajes.setText("Viajes");
        btnViajes.setBorder(null);
        btnViajes.setBorderPainted(false);
        btnViajes.setContentAreaFilled(false);
        btnViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViajes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnViajes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViajesMouseEntered(evt);
            }
        });
        btnViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(btnViajes, gridBagConstraints);

        btnCamarotes.setBackground(new java.awt.Color(32, 98, 136));
        btnCamarotes.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnCamarotes.setForeground(new java.awt.Color(255, 255, 255));
        btnCamarotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bed.png"))); // NOI18N
        btnCamarotes.setText("Camarotes");
        btnCamarotes.setBorder(null);
        btnCamarotes.setBorderPainted(false);
        btnCamarotes.setContentAreaFilled(false);
        btnCamarotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCamarotes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCamarotes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCamarotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCamarotesMouseEntered(evt);
            }
        });
        btnCamarotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamarotesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(btnCamarotes, gridBagConstraints);

        btnBuque.setBackground(new java.awt.Color(32, 98, 136));
        btnBuque.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnBuque.setForeground(new java.awt.Color(255, 255, 255));
        btnBuque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ship.png"))); // NOI18N
        btnBuque.setText("Buque");
        btnBuque.setBorder(null);
        btnBuque.setBorderPainted(false);
        btnBuque.setContentAreaFilled(false);
        btnBuque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuque.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBuque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuqueMouseEntered(evt);
            }
        });
        btnBuque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuqueActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(btnBuque, gridBagConstraints);

        btnCliente.setBackground(new java.awt.Color(32, 98, 136));
        btnCliente.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer.png"))); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.setBorder(null);
        btnCliente.setBorderPainted(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
        });
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(btnCliente, gridBagConstraints);

        btnPuertos.setBackground(new java.awt.Color(32, 98, 136));
        btnPuertos.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnPuertos.setForeground(new java.awt.Color(255, 255, 255));
        btnPuertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/port (1).png"))); // NOI18N
        btnPuertos.setText("Puertos");
        btnPuertos.setBorder(null);
        btnPuertos.setBorderPainted(false);
        btnPuertos.setContentAreaFilled(false);
        btnPuertos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPuertos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPuertos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPuertos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPuertosMouseEntered(evt);
            }
        });
        btnPuertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuertosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(btnPuertos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel1.add(jPanel2, gridBagConstraints);

        ContenedorFrm.setLayout(new javax.swing.BoxLayout(ContenedorFrm, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1010;
        gridBagConstraints.ipady = 570;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.7;
        jPanel1.add(ContenedorFrm, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirForm (javax.swing.JInternalFrame frm)
    {
         if (ContenedorFrm.getSelectedFrame() != null)
        {
            ContenedorFrm.getSelectedFrame().dispose();
        }
        ContenedorFrm.add(frm);
          try {
            frm.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
          frm.show();
    }
    private void btnViajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViajesMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnViajesMouseEntered

    private void btnAgenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgenteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgenteMouseEntered

    private void btnDestinosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDestinosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDestinosMouseEntered

    private void btnVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentaMouseEntered

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
        frmVentas frm = new frmVentas(idEmpleado);
        AbrirForm(frm);

    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesActionPerformed

        // TODO add your handling code here:
        
         try
        {
            frmViajes frm = new frmViajes(this.Puesto);
        AbrirForm(frm);
        }
        catch(Exception ex)
        {
            System.out.println("Problemas."+ex);
        }
        
    }//GEN-LAST:event_btnViajesActionPerformed

    private void btnDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinosActionPerformed
        // TODO add your handling code here:
        
        try
        {
            frmDestinos form = new frmDestinos(this.Puesto);
            AbrirForm(form);
        }
        catch(Exception ex)
        {
            System.out.println("Problemas."+ex);
        }
        
    }//GEN-LAST:event_btnDestinosActionPerformed

    private void btnCamarotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCamarotesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCamarotesMouseEntered

    private void btnCamarotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamarotesActionPerformed
        // TODO add your handling code here:
        frmCamarote frm = new frmCamarote(this.Puesto);
        AbrirForm(frm);
    }//GEN-LAST:event_btnCamarotesActionPerformed

    private void btnBuqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuqueMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuqueMouseEntered

    private void btnAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgenteActionPerformed
        // TODO add your handling code here:
        frmAgentes frm = new frmAgentes(this.Puesto);
        AbrirForm(frm);
    }//GEN-LAST:event_btnAgenteActionPerformed

    private void btnBuqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuqueActionPerformed
        // TODO add your handling code here:
        frmBuque frm = new frmBuque(this.Puesto);
        AbrirForm(frm);
    }//GEN-LAST:event_btnBuqueActionPerformed

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        frmClientes frm = new frmClientes(this.Puesto);
        AbrirForm(frm);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnPuertosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuertosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPuertosMouseEntered

    private void btnPuertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuertosActionPerformed
        // TODO add your handling code here:
       frmPuertos frm = new frmPuertos(this.Puesto);
        AbrirForm(frm);
    }//GEN-LAST:event_btnPuertosActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane ContenedorFrm;
    private javax.swing.JButton btnAgente;
    private javax.swing.JButton btnBuque;
    private javax.swing.JButton btnCamarotes;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnDestinos;
    private javax.swing.JButton btnPuertos;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btnViajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
