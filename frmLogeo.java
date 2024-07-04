package Vista;

import Controlador.DatabaseConnection;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmLogeo extends javax.swing.JFrame {

    private boolean passwordVisible = false;

    public frmLogeo() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtxtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jpswClave = new javax.swing.JPasswordField();
        jbtnIngresar = new javax.swing.JButton();
        jbtnRegistrate = new javax.swing.JButton();
        btnOcultar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 33, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Iniciar Sesion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 220, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(31, 33, 36));
        jTextField1.setForeground(new java.awt.Color(31, 33, 36));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen de WhatsApp 2024-04-24 a las 23.16.35_a8a721ea.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 120));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 260, -1));

        jtxtUsuario.setBackground(new java.awt.Color(31, 33, 36));
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jtxtUsuario.setBorder(null);
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 220, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/businessman.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 30, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 90, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 260, 20));

        jpswClave.setBackground(new java.awt.Color(31, 33, 36));
        jpswClave.setForeground(new java.awt.Color(204, 204, 204));
        jpswClave.setBorder(null);
        jPanel1.add(jpswClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 220, 40));

        jbtnIngresar.setBackground(new java.awt.Color(49, 87, 44));
        jbtnIngresar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnIngresar.setForeground(new java.awt.Color(204, 204, 204));
        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 230, 40));

        jbtnRegistrate.setBackground(new java.awt.Color(61, 105, 158));
        jbtnRegistrate.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jbtnRegistrate.setForeground(new java.awt.Color(204, 204, 204));
        jbtnRegistrate.setText("Registrate");
        jbtnRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 230, 40));

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/security.png"))); // NOI18N
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });
        jPanel1.add(btnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        jPanel3.setBackground(new java.awt.Color(31, 33, 36));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen de WhatsApp 2024-04-24 a las 20.44.32_32ef3539-min (1).jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 680, 600));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 420, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        String usuario = jtxtUsuario.getText();
        String clave = new String(jpswClave.getPassword()); // Convierte el password a String

        if (usuario.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno de los espacios está vacío");
        } else {
            if (validarUsuario(usuario, clave)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                frmSistema bb = new frmSistema();
                bb.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Uno de los espacios escritos es incorrecto");
            }
        }

    }//GEN-LAST:event_jbtnIngresarActionPerformed

    private boolean validarUsuario(String usuario, String clave) {
        String query = "SELECT COUNT(*) FROM Usuarios WHERE NombreUsuario = ? AND Contrasena = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, usuario);
            stmt.setString(2, clave);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    private void jbtnRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrateActionPerformed
        frmRegistro rg = new frmRegistro();
        rg.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbtnRegistrateActionPerformed

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked

        if (MouseEvent.BUTTON1 == evt.getButton()) {
            if (!passwordVisible) {
                jpswClave.setEchoChar((char) 0);
                btnOcultar.setVisible(true);
            } else {
                jpswClave.setEchoChar('●');
                btnOcultar.setVisible(true);
            }
            passwordVisible = !passwordVisible;
        }

    }//GEN-LAST:event_btnOcultarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 50);           // ajustar la apariencia de los botones usando FlatLightLaf
        UIManager.put("TextComponent.arc", 50);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogeo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JButton jbtnRegistrate;
    private javax.swing.JPasswordField jpswClave;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
