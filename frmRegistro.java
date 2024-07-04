
package Vista;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import Controlador.DatabaseConnection;



public class frmRegistro extends javax.swing.JFrame {

    private boolean passwordVisible = false;
  
    public frmRegistro() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtNombresCompletos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbxDia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jcbxMes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcbxAño = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnOcultar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnOcultar1 = new javax.swing.JLabel();
        jtxtCorreoElectronico = new javax.swing.JTextField();
        jbtnRegistrarme = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jpswClaveConfirmacion = new javax.swing.JPasswordField();
        jpswClave = new javax.swing.JPasswordField();

        jTextField1.setBackground(new java.awt.Color(31, 33, 36));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(31, 33, 36));
        jTextField2.setForeground(new java.awt.Color(31, 33, 36));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 33, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(31, 33, 36));
        jTextField3.setForeground(new java.awt.Color(31, 33, 36));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 130));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 410, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen de WhatsApp 2024-04-24 a las 23.16.35_a8a721ea.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 110));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crea Tu Cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 250, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 410, 10));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Año");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/businessman.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 30, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Nombres Completos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/businessman.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 30, 30));

        jtxtNombresCompletos.setBackground(new java.awt.Color(31, 33, 36));
        jtxtNombresCompletos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtNombresCompletos.setForeground(new java.awt.Color(204, 204, 204));
        jtxtNombresCompletos.setBorder(null);
        jPanel1.add(jtxtNombresCompletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 380, 40));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Correo Electronico");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 30));

        jcbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccione>", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jcbxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 110, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Dia");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 30));

        jcbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccione>", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(jcbxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Mes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 30));

        jcbxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "1960", "1961" }));
        jPanel1.add(jcbxAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 110, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Confirmar contraseña");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 140, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 410, 10));

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/security.png"))); // NOI18N
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });
        jPanel1.add(btnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 30, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Contraseña");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, -1));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 410, 10));

        btnOcultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/security.png"))); // NOI18N
        btnOcultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultar1MouseClicked(evt);
            }
        });
        jPanel1.add(btnOcultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 30, 50));

        jtxtCorreoElectronico.setBackground(new java.awt.Color(31, 33, 36));
        jtxtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtCorreoElectronico.setForeground(new java.awt.Color(204, 204, 204));
        jtxtCorreoElectronico.setBorder(null);
        jPanel1.add(jtxtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 380, 40));

        jbtnRegistrarme.setBackground(new java.awt.Color(49, 87, 44));
        jbtnRegistrarme.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnRegistrarme.setForeground(new java.awt.Color(204, 204, 204));
        jbtnRegistrarme.setText("Registrarme");
        jbtnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarmeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 180, 40));

        jbtnRegresar.setBackground(new java.awt.Color(61, 105, 158));
        jbtnRegresar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnRegresar.setForeground(new java.awt.Color(204, 204, 204));
        jbtnRegresar.setText("Regresar");
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 180, 40));

        jpswClaveConfirmacion.setBackground(new java.awt.Color(31, 33, 36));
        jpswClaveConfirmacion.setForeground(new java.awt.Color(204, 204, 204));
        jpswClaveConfirmacion.setBorder(null);
        jPanel1.add(jpswClaveConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 380, 40));

        jpswClave.setBackground(new java.awt.Color(31, 33, 36));
        jpswClave.setForeground(new java.awt.Color(204, 204, 204));
        jpswClave.setBorder(null);
        jPanel1.add(jpswClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 380, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked

        if(MouseEvent.BUTTON1 == evt.getButton()){
            if (!passwordVisible) {
                jpswClaveConfirmacion.setEchoChar((char)0);
                btnOcultar.setVisible(true);
            } else {
                jpswClaveConfirmacion.setEchoChar('●');
                btnOcultar.setVisible(true);
            }
            passwordVisible = !passwordVisible;
        }
    }//GEN-LAST:event_btnOcultarMouseClicked

    private void btnOcultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOcultar1MouseClicked

    private void jbtnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarmeActionPerformed
   String nombresCompletos = jtxtNombresCompletos.getText();
    String correoElectronico = jtxtCorreoElectronico.getText();
    String contrasena = new String(jpswClave.getPassword());
    String confirmacionContrasena = new String(jpswClaveConfirmacion.getPassword());
    int diaNacimiento = Integer.parseInt(jcbxDia.getSelectedItem().toString());
    String mesNacimiento = jcbxMes.getSelectedItem().toString();
    int anioNacimiento = Integer.parseInt(jcbxAño.getSelectedItem().toString());

    // Verificar si las contraseñas coinciden
    if (!contrasena.equals(confirmacionContrasena)) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden, verifique por favor.");
        return; // Salir del método si las contraseñas no coinciden
    }

    // Llamar al método insertUsuario para insertar los datos en la base de datos
    boolean isInserted = DatabaseConnection.insertUsuario(nombresCompletos, correoElectronico, contrasena, diaNacimiento, mesNacimiento, anioNacimiento);

    if (isInserted) {
        JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el usuario.");
    }
    }//GEN-LAST:event_jbtnRegistrarmeActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
          frmLogeo rg = new frmLogeo();
       rg.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JLabel btnOcultar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbtnRegistrarme;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JComboBox<String> jcbxAño;
    private javax.swing.JComboBox<String> jcbxDia;
    private javax.swing.JComboBox<String> jcbxMes;
    private javax.swing.JPasswordField jpswClave;
    private javax.swing.JPasswordField jpswClaveConfirmacion;
    private javax.swing.JTextField jtxtCorreoElectronico;
    private javax.swing.JTextField jtxtNombresCompletos;
    // End of variables declaration//GEN-END:variables
}
