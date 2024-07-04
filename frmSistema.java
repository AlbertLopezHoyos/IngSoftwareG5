package Vista;

import Modelo.CarritoItem;
import Modelo.Articulo;
import Modelo.Queja;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet; 
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmSistema extends javax.swing.JFrame {

    private DefaultTableModel modeloTablaReservas;
    private List<CarritoItem> carrito;

    public frmSistema() {
        
        initComponents();
        
         // Configurar el modelo de tabla para jtablahorariocancha
        modeloTablaReservas = new DefaultTableModel();
        modeloTablaReservas.addColumn("NumeroCampo");
        modeloTablaReservas.addColumn("HoraInicio");
        modeloTablaReservas.addColumn("HoraFin");
          modeloTablaReservas.addColumn("Fecha");
        jtablahorariocancha.setModel(modeloTablaReservas);

        // Llamar al método para cargar los datos al iniciar la ventana
        cargarDatosReservas();
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        guardarDatosEncargado();
    }
});
    }
private void cargarDatosReservas() {
    try {
        // Establecer la conexión con la base de datos
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Laredonda;encrypt=true;trustServerCertificate=true", "sa", "12345678");

        // Consulta SQL para obtener los datos de reservas y campos
        String query = "SELECT r.NumeroCampo, c.HoraInicio, c.HoraFin, r.TipoDeDeporte " +
                       "FROM Reservas r " +
                       "JOIN campos c ON r.NumeroCampo = c.id";

        try (PreparedStatement pst = connection.prepareStatement(query)) {
            ResultSet rs = pst.executeQuery();

            // Limpiar el modelo de la tabla antes de agregar nuevos datos
            modeloTablaReservas.setRowCount(0);

            // Agregar los datos recuperados a la tabla
            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("NumeroCampo"),
                    rs.getString("HoraInicio"),
                    rs.getString("HoraFin"),
                    rs.getString("TipoDeDeporte")
                };
                modeloTablaReservas.addRow(fila);
            }
        }

        // Cerrar la conexión
        connection.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        e.printStackTrace();
    }
}

 

    // Lista para almacenar las quejas
private List<Queja> listaQuejas = new ArrayList<>();

private void guardarDatosQueja() {
    String numeroCampo = jcbxNCampo.getSelectedItem().toString();
    String resena = jtxResena.getText();
    String usuario = "UsuarioActual"; // Obtener el nombre del usuario actual
}
  private void agregarAlCarrito(Articulo articulo, int cantidad) {
        CarritoItem item = new CarritoItem(articulo, cantidad);
        carrito.add(item);
        modeloTablaReservas.addRow(new Object[]{item.getArticulo().getNombre(), item.getCantidad(), item.getArticulo().getPrecioUnitario(), item.getPrecioTotal()});
        calcularTotal();
    }

    private void calcularTotal() {
        double total = 0.0;
        for (CarritoItem item : carrito) {
            total += item.getPrecioTotal();
        }
        jtxtTotalPagar.setText("S/. " + String.format("%.2f", total));
    }

    // ... (resto de tu código)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jbtnReservar = new javax.swing.JButton();
        jbtnEventos = new javax.swing.JButton();
        jbtnPagos = new javax.swing.JButton();
        jbtnQuejas = new javax.swing.JButton();
        jtbPaneles = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpReserva = new javax.swing.JPanel();
        pCampos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pDatoEncargado = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pHorarios = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtbReserva = new javax.swing.JTabbedPane();
        pHome = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        pDatos = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbtnCancelarD = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jtxtCelular = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jcbxNCampo1 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jcbxTDeporte = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        pHorario = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jbtnCancelarH = new javax.swing.JButton();
        jbtnAceptarH = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablahorariocancha = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        pCancha = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jbtnCancelarC = new javax.swing.JButton();
        jbtnAceptarC = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jbtnCampo3 = new javax.swing.JButton();
        jbtnCampo5 = new javax.swing.JButton();
        jbtnCampo2 = new javax.swing.JButton();
        jbtnCampo4 = new javax.swing.JButton();
        jbtnCampo6 = new javax.swing.JButton();
        jbtnCampo1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        pEquipamiento1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jbtnCancelarE = new javax.swing.JButton();
        jbtnAceptarE = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jcbx6 = new javax.swing.JComboBox<>();
        jcbx1 = new javax.swing.JComboBox<>();
        jcbx2 = new javax.swing.JComboBox<>();
        jcbx3 = new javax.swing.JComboBox<>();
        jcbx4 = new javax.swing.JComboBox<>();
        jcbx5 = new javax.swing.JComboBox<>();
        jbtnAgregar4 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jbtnAgregar3 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jbtnAgregar1 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jbtnAgregar2 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jbtnAgregarLays8 = new javax.swing.JButton();
        jbtnAgregar6 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jbtnAgregar5 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jButton51 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCarrito = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jtxtTotalPagar = new javax.swing.JTextField();
        jbtnReservarCarrito = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jpEventos = new javax.swing.JPanel();
        pDatosEvento = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pHorari = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jtbEventos = new javax.swing.JTabbedPane();
        pHouse = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        pProgramacion = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jbtnCancelarD1 = new javax.swing.JButton();
        jbtnGuardarEvento = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jtxtNombre1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jtxtNInstitucion = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jcbxNCampo2 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel60 = new javax.swing.JLabel();
        jtxtDescrip = new javax.swing.JTextField();
        jcbxHasta = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        jcbxDesde = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        pHorarioEventos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        jpPagos = new javax.swing.JPanel();
        jtbPagos = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jtxtFecha = new javax.swing.JTextField();
        jtxtNombreImage = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jtxtHora = new javax.swing.JTextField();
        jtxtNCancha = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        jbtnguardarimagen = new javax.swing.JButton();
        jbtnSubirImagen1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel89 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jbtnYape = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbtnCancelarD2 = new javax.swing.JButton();
        jbtnGuardar2 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        pCamposPago = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jpQuejas = new javax.swing.JPanel();
        pRealizarQueja = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        pDetalleQueja = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jtbQuejas = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jpRealizarQuejas = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jbtnVer = new javax.swing.JButton();
        jbtnEnviar = new javax.swing.JButton();
        jcbxNCampo = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxResena = new javax.swing.JTextArea();
        jLabel75 = new javax.swing.JLabel();
        jpDetallesQuejas = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jbtnCancelarD6 = new javax.swing.JButton();
        jbtnGuardarEvento4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtblQuejas = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 71, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("LA REDONDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 80, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 100));

        jPanel2.setBackground(new java.awt.Color(115, 153, 142));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/booking (2).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reservar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 60));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eventos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 60));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pagos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quejas");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 80, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salir");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/calendar.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/debit-card.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 90, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/complaint.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/log-out.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 40, 80));

        jbtnSalir.setBackground(new java.awt.Color(60, 71, 84));
        jbtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 140, 60));

        jbtnReservar.setBackground(new java.awt.Color(60, 71, 84));
        jbtnReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnReservarMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 60));

        jbtnEventos.setBackground(new java.awt.Color(60, 71, 84));
        jbtnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnEventosMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 140, 60));

        jbtnPagos.setBackground(new java.awt.Color(60, 71, 84));
        jbtnPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPagosMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, 60));

        jbtnQuejas.setBackground(new java.awt.Color(60, 71, 84));
        jbtnQuejas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnQuejasMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnQuejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 140, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 830, 100));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" a todos peloteros y a repartir chocolateee!!");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 610, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("y los sueños se entrelazan con el balón, les damos la bienvenida");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 800, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("En estas canchas, donde el césped se convierte en escenario ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 800, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer (1).png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 280, 260));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 540));

        jtbPaneles.addTab("Home", jPanel4);

        jpReserva.setBackground(new java.awt.Color(60, 71, 84));
        jpReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCampos.setBackground(new java.awt.Color(204, 204, 204));
        pCampos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pCamposMouseMoved(evt);
            }
        });
        pCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCamposMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCamposMouseExited(evt);
            }
        });
        pCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Campos");
        pCampos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 30));
        pCampos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jpReserva.add(pCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 70));

        pDatoEncargado.setBackground(new java.awt.Color(204, 204, 204));
        pDatoEncargado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pDatoEncargadoMouseMoved(evt);
            }
        });
        pDatoEncargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDatoEncargadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pDatoEncargadoMouseExited(evt);
            }
        });
        pDatoEncargado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Datos ");
        pDatoEncargado.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 60, 30));
        pDatoEncargado.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jpReserva.add(pDatoEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 70));

        pHorarios.setBackground(new java.awt.Color(204, 204, 204));
        pHorarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pHorariosMouseMoved(evt);
            }
        });
        pHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pHorariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pHorariosMouseExited(evt);
            }
        });
        pHorarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Horarios");
        pHorarios.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 30));
        pHorarios.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jpReserva.add(pHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 70));

        pHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pHome.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -30, 1170, 600));

        jtbReserva.addTab("Home", pHome);

        pDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(60, 71, 84));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarD.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarD.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarD.setText("Cancelar");
        jbtnCancelarD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarDMouseMoved(evt);
            }
        });
        jbtnCancelarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarDMouseExited(evt);
            }
        });
        jPanel5.add(jbtnCancelarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 40));

        jbtnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnGuardarMouseMoved(evt);
            }
        });
        jbtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnGuardarMouseExited(evt);
            }
        });
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 40));

        pDatos.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 470, 1020, 80));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Encargado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 14))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, -1));

        jLabel40.setText("Nombre");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel9.add(jtxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, -1));

        jLabel41.setText("Celular");
        jPanel9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel42.setText("Fecha");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel44.setText("N° campo");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jcbxNCampo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione >>", "01", "02", "03", "04", "05", "06" }));
        jPanel9.add(jcbxNCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 160, 20));

        jLabel46.setText("Tipo de deporte");
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jcbxTDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione >>", "Futbol", "Voley" }));
        jPanel9.add(jcbxTDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 20));
        jPanel9.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        jLabel49.setText("Dni");
        jPanel9.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel9.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, -1));

        pDatos.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 410, 410));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen de WhatsApp 2024-04-18 a las 11.05.35_092b8e65 (1) (1).jpg"))); // NOI18N
        pDatos.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 350, 230));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imagen de la cancha deportiva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 12))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pDatos.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 370, 280));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pDatos.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 580));

        jtbReserva.addTab("Datos", pDatos);

        pHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(60, 71, 84));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarH.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarH.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarH.setText("Cancelar");
        jbtnCancelarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarHMouseMoved(evt);
            }
        });
        jbtnCancelarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarHMouseExited(evt);
            }
        });
        jPanel6.add(jbtnCancelarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 140, 40));

        jbtnAceptarH.setBackground(new java.awt.Color(204, 204, 204));
        jbtnAceptarH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAceptarH.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAceptarH.setText("Limpiar");
        jbtnAceptarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnAceptarHMouseMoved(evt);
            }
        });
        jbtnAceptarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAceptarHMouseExited(evt);
            }
        });
        jPanel6.add(jbtnAceptarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 140, 40));

        pHorario.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 470, 1020, 80));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Horario de canchas reservadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(51, 68, 87))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtablahorariocancha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Campo", "Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jScrollPane2.setViewportView(jtablahorariocancha);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 570, 310));

        pHorario.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 590, 360));

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pHorario.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 150, 50));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<<<Seleccione>>>>", "01", "02", "03", "04", "05", "06" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "N° Campo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 14))); // NOI18N
        pHorario.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 170, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pHorario.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 580));

        jtbReserva.addTab("Horario", pHorario);

        pCancha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(60, 71, 84));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarC.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarC.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarC.setText("Cancelar");
        jbtnCancelarC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarCMouseMoved(evt);
            }
        });
        jbtnCancelarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarCMouseExited(evt);
            }
        });
        jPanel7.add(jbtnCancelarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 140, 40));

        jbtnAceptarC.setBackground(new java.awt.Color(204, 204, 204));
        jbtnAceptarC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAceptarC.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAceptarC.setText("Aceptar");
        jbtnAceptarC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnAceptarCMouseMoved(evt);
            }
        });
        jbtnAceptarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAceptarCMouseExited(evt);
            }
        });
        jPanel7.add(jbtnAceptarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 140, 40));

        pCancha.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 470, 1020, 80));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 180, -1, 120));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 320, -1, 100));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 60, 100));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 60, 100));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 60, 100));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 60, 90));

        jbtnCampo3.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo3.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo3.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo3.setText("        CAMPO 3");
        jbtnCampo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo3ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 300, 120));

        jbtnCampo5.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo5.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo5.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo5.setText("        CAMPO 5");
        jbtnCampo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo5ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 300, 120));

        jbtnCampo2.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo2.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo2.setText("        CAMPO 2");
        jbtnCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo2ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 300, 120));

        jbtnCampo4.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo4.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo4.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo4.setText("        CAMPO 4");
        jbtnCampo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo4ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 300, 120));

        jbtnCampo6.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo6.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo6.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo6.setText("        CAMPO 6");
        jbtnCampo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo6ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 300, 120));

        jbtnCampo1.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo1.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo1.setText("        CAMPO 1");
        jbtnCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo1ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 120));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pCancha.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 580));

        jtbReserva.addTab("Campos", pCancha);

        pEquipamiento1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(60, 71, 84));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarE.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarE.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarE.setText("Cancelar");
        jbtnCancelarE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarEMouseMoved(evt);
            }
        });
        jbtnCancelarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarEMouseExited(evt);
            }
        });
        jPanel8.add(jbtnCancelarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 140, 40));

        jbtnAceptarE.setBackground(new java.awt.Color(204, 204, 204));
        jbtnAceptarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAceptarE.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAceptarE.setText("Aceptar");
        jbtnAceptarE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnAceptarEMouseMoved(evt);
            }
        });
        jbtnAceptarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAceptarEMouseExited(evt);
            }
        });
        jPanel8.add(jbtnAceptarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 140, 40));

        pEquipamiento1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 470, 1020, 80));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer-boots.png"))); // NOI18N
        pEquipamiento1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 80));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer-boots.png"))); // NOI18N
        pEquipamiento1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 80));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/gloves (1).png"))); // NOI18N
        pEquipamiento1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 80, 60));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer (2).png"))); // NOI18N
        pEquipamiento1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 80, 80));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-shirt (2).png"))); // NOI18N
        pEquipamiento1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 276, 60, 80));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/red-card.png"))); // NOI18N
        pEquipamiento1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 80, 80));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-long-socks-with-white-lines (1).png"))); // NOI18N
        pEquipamiento1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 80, 70));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-long-socks-with-white-lines (1).png"))); // NOI18N
        pEquipamiento1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 80, 70));

        jcbx6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento1.add(jcbx6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jcbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento1.add(jcbx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 160, -1, -1));

        jcbx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento1.add(jcbx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jcbx3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento1.add(jcbx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jcbx4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento1.add(jcbx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jcbx5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento1.add(jcbx5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jbtnAgregar4.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar4.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregar4.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar4.setText("Agregar al carrito");
        jbtnAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregar4ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnAgregar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 20));

        jButton47.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, 170));

        jbtnAgregar3.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar3.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar3.setText("Agregar al carrito");
        jbtnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregar3ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 120, 20));

        jButton48.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 140, 170));

        jbtnAgregar1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar1.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar1.setText("Agregar al carrito");
        jbtnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregar1ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 20));

        jButton49.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 170));

        jbtnAgregar2.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar2.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar2.setText("Agregar al carrito");
        jbtnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregar2ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 120, 20));

        jButton50.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 140, 170));

        jbtnAgregarLays8.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays8.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays8.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays8.setText("Agregar al carrito");
        jbtnAgregarLays8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays8ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnAgregarLays8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, 20));

        jbtnAgregar6.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar6.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregar6.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar6.setText("Agregar al carrito");
        jbtnAgregar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregar6ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnAgregar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 120, 20));

        jButton52.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 170));

        jbtnAgregar5.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar5.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregar5.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar5.setText("Agregar al carrito");
        jbtnAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregar5ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnAgregar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 120, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Tu Carrito");
        pEquipamiento1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 95, 90, 40));

        jButton51.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, 170));

        jtblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Articulo", "Cantidad", "Precio U.", "Precio T."
            }
        ));
        jScrollPane1.setViewportView(jtblCarrito);

        pEquipamiento1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 270, 160));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        pEquipamiento1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 270, 130));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Tu Total");
        pEquipamiento1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 60, -1));

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("S/.");
        pEquipamiento1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 20, 20));

        jtxtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalPagarActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jtxtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 130, -1));

        jbtnReservarCarrito.setBackground(new java.awt.Color(0, 0, 0));
        jbtnReservarCarrito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jbtnReservarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReservarCarrito.setText("Reservar");
        jbtnReservarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReservarCarritoActionPerformed(evt);
            }
        });
        pEquipamiento1.add(jbtnReservarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 230, -1));
        pEquipamiento1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 270, 130));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pEquipamiento1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 590));

        jtbReserva.addTab("Equipamiento", pEquipamiento1);

        jpReserva.add(jtbReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -40, 830, 580));

        jtbPaneles.addTab("Reservar", jpReserva);

        jpEventos.setBackground(new java.awt.Color(60, 71, 84));
        jpEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pDatosEvento.setBackground(new java.awt.Color(204, 204, 204));
        pDatosEvento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pDatosEventoMouseMoved(evt);
            }
        });
        pDatosEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDatosEventoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pDatosEventoMouseExited(evt);
            }
        });
        pDatosEvento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("de reservas");
        pDatosEvento.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Programacion");
        pDatosEvento.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 30));

        jpEventos.add(pDatosEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 70));

        pHorari.setBackground(new java.awt.Color(204, 204, 204));
        pHorari.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pHorariMouseMoved(evt);
            }
        });
        pHorari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pHorariMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pHorariMouseExited(evt);
            }
        });
        pHorari.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Horarios de eventos");
        pHorari.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        jpEventos.add(pHorari, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 70));

        pHouse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pHouse.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -30, 1170, 600));

        jtbEventos.addTab("Home", pHouse);

        pProgramacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(60, 71, 84));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarD1.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarD1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarD1.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarD1.setText("Cancelar");
        jbtnCancelarD1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarD1MouseMoved(evt);
            }
        });
        jbtnCancelarD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarD1MouseExited(evt);
            }
        });
        jPanel14.add(jbtnCancelarD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 40));

        jbtnGuardarEvento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnGuardarEvento.setForeground(new java.awt.Color(0, 0, 0));
        jbtnGuardarEvento.setText("Guardar");
        jbtnGuardarEvento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnGuardarEventoMouseMoved(evt);
            }
        });
        jbtnGuardarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnGuardarEventoMouseExited(evt);
            }
        });
        jbtnGuardarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarEventoActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnGuardarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 40));

        pProgramacion.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 450, 1020, 90));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Encargado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 14))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jtxtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, -1));

        jLabel54.setText("Nombre");
        jPanel12.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel12.add(jtxtNInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, -1));

        jLabel55.setText("Nombre de la Institucion");
        jPanel12.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel56.setText("Fecha");
        jPanel12.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel57.setText("N° campo");
        jPanel12.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jcbxNCampo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione >>", "01", "02", "03", "04", "05", "06" }));
        jPanel12.add(jcbxNCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 160, 20));

        jLabel59.setText("Hasta");
        jPanel12.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        jPanel12.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        jLabel60.setText("Descripcion del evento");
        jPanel12.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel12.add(jtxtDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, -1));

        jcbxHasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00" }));
        jPanel12.add(jcbxHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 150, -1));

        jLabel61.setText("Hora");
        jPanel12.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jcbxDesde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00" }));
        jcbxDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxDesdeActionPerformed(evt);
            }
        });
        jPanel12.add(jcbxDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, -1));

        pProgramacion.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 410, 410));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imagen de la cancha deportiva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 12))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen de WhatsApp 2024-04-18 a las 11.05.35_092b8e65 (1) (1).jpg"))); // NOI18N
        jPanel13.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 350, 230));

        pProgramacion.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 370, 280));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pProgramacion.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -30, 1170, 600));

        jtbEventos.addTab("Programacion de Reservas", pProgramacion);

        pHorarioEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        pHorarioEventos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 690, 420));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pHorarioEventos.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -30, 1170, 600));

        jtbEventos.addTab("Horario de eventos", pHorarioEventos);

        jpEventos.add(jtbEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -40, 830, 580));

        jtbPaneles.addTab("Eventos", jpEventos);

        jpPagos.setBackground(new java.awt.Color(60, 71, 84));
        jpPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        jPanel15.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -20, 1180, 590));

        jtbPagos.addTab("home", jPanel15);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel86.setText("Fecha:");
        jPanel16.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel90.setText("Detalles de la Reserva");
        jPanel16.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
        jPanel16.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, 40));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel88.setText("Precio:");
        jPanel16.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        jPanel16.add(jtxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 40));
        jPanel16.add(jtxtNombreImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 310, 40));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel84.setText("Información de Pago");
        jPanel16.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel85.setText("Método de Pago");
        jPanel16.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        jPanel16.add(jtxtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, 40));
        jPanel16.add(jtxtNCancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 40));
        jPanel16.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 310, 170));

        jbtnguardarimagen.setText("GUARDAR IMAGEN");
        jbtnguardarimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarimagenActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnguardarimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 140, 50));

        jbtnSubirImagen1.setText("SUBIR IMAGEN");
        jbtnSubirImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirImagen1ActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnSubirImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 140, 50));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Yape o Plin", "Adelanto" }));
        jPanel16.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 180, 40));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel89.setText("Cancha:");
        jPanel16.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel87.setText("Hora:");
        jPanel16.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jbtnYape.setText("QR");
        jPanel16.add(jbtnYape, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 100, 30));

        jPanel18.setBackground(new java.awt.Color(60, 71, 84));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarD2.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarD2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarD2.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarD2.setText("Cancelar");
        jbtnCancelarD2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarD2MouseMoved(evt);
            }
        });
        jbtnCancelarD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarD2MouseExited(evt);
            }
        });
        jPanel18.add(jbtnCancelarD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 40));

        jbtnGuardar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnGuardar2.setForeground(new java.awt.Color(0, 0, 0));
        jbtnGuardar2.setText("Guardar");
        jbtnGuardar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnGuardar2MouseMoved(evt);
            }
        });
        jbtnGuardar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnGuardar2MouseExited(evt);
            }
        });
        jbtnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardar2ActionPerformed(evt);
            }
        });
        jPanel18.add(jbtnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 40));

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 430, 1020, 120));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        jPanel16.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -30, 1170, 600));

        jtbPagos.addTab("pago campo", jPanel16);

        jpPagos.add(jtbPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -40, 830, 530));

        pCamposPago.setBackground(new java.awt.Color(204, 204, 204));
        pCamposPago.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pCamposPagoMouseMoved(evt);
            }
        });
        pCamposPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCamposPagoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCamposPagoMouseExited(evt);
            }
        });
        pCamposPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("pagar campo");
        pCamposPago.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 30));

        jpPagos.add(pCamposPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 70));

        jtbPaneles.addTab("Pagos", jpPagos);

        jpQuejas.setBackground(new java.awt.Color(60, 71, 84));
        jpQuejas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pRealizarQueja.setBackground(new java.awt.Color(204, 204, 204));
        pRealizarQueja.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pRealizarQuejaMouseMoved(evt);
            }
        });
        pRealizarQueja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pRealizarQuejaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pRealizarQuejaMouseExited(evt);
            }
        });
        pRealizarQueja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Realizar Queja");
        pRealizarQueja.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jpQuejas.add(pRealizarQueja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 70));

        pDetalleQueja.setBackground(new java.awt.Color(204, 204, 204));
        pDetalleQueja.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pDetalleQuejaMouseMoved(evt);
            }
        });
        pDetalleQueja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDetalleQuejaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pDetalleQuejaMouseExited(evt);
            }
        });
        pDetalleQueja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Detalle de la Queja");
        pDetalleQueja.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        jpQuejas.add(pDetalleQueja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 70));

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        jPanel23.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -20, 1180, 590));

        jtbQuejas.addTab("home", jPanel23);

        jpRealizarQuejas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(60, 71, 84));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnVer.setBackground(new java.awt.Color(51, 126, 232));
        jbtnVer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnVer.setForeground(new java.awt.Color(0, 0, 0));
        jbtnVer.setText("Ver");
        jbtnVer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnVerMouseMoved(evt);
            }
        });
        jbtnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnVerMouseExited(evt);
            }
        });
        jbtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerActionPerformed(evt);
            }
        });
        jPanel20.add(jbtnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 40));

        jbtnEnviar.setBackground(new java.awt.Color(0, 139, 84));
        jbtnEnviar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnEnviar.setText("Enviar");
        jbtnEnviar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnEnviarMouseMoved(evt);
            }
        });
        jbtnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnEnviarMouseExited(evt);
            }
        });
        jbtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEnviarActionPerformed(evt);
            }
        });
        jPanel20.add(jbtnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 40));

        jpRealizarQuejas.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 450, 1020, 100));

        jcbxNCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<<<<<<<<Seleccione >>>>>>>>>", "01", "02", "03", "04", "05", "06" }));
        jcbxNCampo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "N° Campo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jpRealizarQuejas.add(jcbxNCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 250, 50));

        jtxResena.setColumns(20);
        jtxResena.setRows(5);
        jtxResena.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valoraciones y Reseñas:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jtxResena.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(jtxResena);

        jpRealizarQuejas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 390, 270));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        jpRealizarQuejas.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -20, 1180, 590));

        jtbQuejas.addTab("Realizar Queja", jpRealizarQuejas);

        jpDetallesQuejas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(60, 71, 84));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarD6.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarD6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarD6.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarD6.setText("Cancelar");
        jbtnCancelarD6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarD6MouseMoved(evt);
            }
        });
        jbtnCancelarD6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarD6MouseExited(evt);
            }
        });
        jPanel21.add(jbtnCancelarD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 40));

        jbtnGuardarEvento4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnGuardarEvento4.setForeground(new java.awt.Color(0, 0, 0));
        jbtnGuardarEvento4.setText("Aceptar");
        jbtnGuardarEvento4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnGuardarEvento4MouseMoved(evt);
            }
        });
        jbtnGuardarEvento4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnGuardarEvento4MouseExited(evt);
            }
        });
        jbtnGuardarEvento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarEvento4ActionPerformed(evt);
            }
        });
        jPanel21.add(jbtnGuardarEvento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 40));

        jpDetallesQuejas.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 450, 1020, 100));

        jtblQuejas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° Campo", "Reseña", "Usuario"
            }
        ));
        jScrollPane5.setViewportView(jtblQuejas);

        jpDetallesQuejas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 610, 270));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        jpDetallesQuejas.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -20, 1180, 590));

        jtbQuejas.addTab("Detalle de las Quejas", jpDetallesQuejas);

        jpQuejas.add(jtbQuejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -40, 830, 580));

        jtbPaneles.addTab("Quejas", jpQuejas);

        getContentPane().add(jtbPaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1020, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnReservarMouseClicked
        jtbPaneles.setSelectedIndex(1);
    }//GEN-LAST:event_jbtnReservarMouseClicked

    private void jbtnEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEventosMouseClicked
        jtbPaneles.setSelectedIndex(2);
    }//GEN-LAST:event_jbtnEventosMouseClicked

    private void jbtnPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPagosMouseClicked
        jtbPaneles.setSelectedIndex(3);
    }//GEN-LAST:event_jbtnPagosMouseClicked

    private void jbtnQuejasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnQuejasMouseClicked
        jtbPaneles.setSelectedIndex(4);
    }//GEN-LAST:event_jbtnQuejasMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jtbPaneles.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jbtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jbtnSalirMouseClicked

    private void pCamposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposMouseMoved
        pCampos.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pCamposMouseMoved

    private void pCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposMouseClicked
        jtbReserva.setSelectedIndex(3);
    }//GEN-LAST:event_pCamposMouseClicked

    private void pCamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposMouseExited
        pCampos.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pCamposMouseExited

    private void pDatoEncargadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatoEncargadoMouseMoved
        pDatoEncargado.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pDatoEncargadoMouseMoved

    private void pDatoEncargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatoEncargadoMouseClicked
        jtbReserva.setSelectedIndex(1);
    }//GEN-LAST:event_pDatoEncargadoMouseClicked

    private void pDatoEncargadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatoEncargadoMouseExited
        pDatoEncargado.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pDatoEncargadoMouseExited

    private void pHorariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariosMouseMoved
        pHorarios.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pHorariosMouseMoved

    private void pHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariosMouseClicked
        jtbReserva.setSelectedIndex(2);
    }//GEN-LAST:event_pHorariosMouseClicked

    private void pHorariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariosMouseExited
        pHorarios.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pHorariosMouseExited

    private void jbtnAceptarEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarEMouseMoved
        jbtnAceptarE.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_jbtnAceptarEMouseMoved

    private void jbtnCancelarEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarEMouseMoved
        jbtnCancelarE.setBackground(new Color(178, 68, 75));
    }//GEN-LAST:event_jbtnCancelarEMouseMoved

    private void jbtnAceptarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarEMouseExited
        jbtnAceptarE.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnAceptarEMouseExited

    private void jbtnCancelarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarEMouseExited
        jbtnCancelarE.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnCancelarEMouseExited

    private void jbtnAceptarCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarCMouseMoved
        jbtnAceptarC.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_jbtnAceptarCMouseMoved

    private void jbtnAceptarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarCMouseExited
        jbtnAceptarC.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnAceptarCMouseExited

    private void jbtnCancelarCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarCMouseMoved
        jbtnCancelarC.setBackground(new Color(178, 68, 75));
    }//GEN-LAST:event_jbtnCancelarCMouseMoved

    private void jbtnCancelarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarCMouseExited
        jbtnCancelarC.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnCancelarCMouseExited

    private void jbtnAceptarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarHMouseMoved
        jbtnAceptarH.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_jbtnAceptarHMouseMoved

    private void jbtnAceptarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarHMouseExited
        jbtnAceptarH.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnAceptarHMouseExited

    private void jbtnCancelarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarHMouseMoved
        jbtnCancelarH.setBackground(new Color(178, 68, 75));
    }//GEN-LAST:event_jbtnCancelarHMouseMoved

    private void jbtnCancelarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarHMouseExited
        jbtnCancelarH.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnCancelarHMouseExited

    private void jbtnGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarMouseMoved
        jbtnGuardar.setBackground(new Color(51, 135, 204));
    }//GEN-LAST:event_jbtnGuardarMouseMoved

    private void jbtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarMouseExited
        jbtnGuardar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnGuardarMouseExited

    private void jbtnCancelarDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarDMouseMoved
        jbtnCancelarD.setBackground(new Color(178, 68, 75));
    }//GEN-LAST:event_jbtnCancelarDMouseMoved

    private void jbtnCancelarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarDMouseExited
        jbtnCancelarD.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jbtnCancelarDMouseExited

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jbtnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregar4ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jbtnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregar3ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jbtnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregar1ActionPerformed

    private void jbtnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregar2ActionPerformed

    private void jbtnAgregarLays8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays8ActionPerformed

    private void jbtnAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregar6ActionPerformed

    private void jbtnAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregar5ActionPerformed

    private void jtxtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalPagarActionPerformed

    private void jbtnCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo1ActionPerformed
        Campo_1 campo1 = new Campo_1();
        campo1.setVisible(true);
    }//GEN-LAST:event_jbtnCampo1ActionPerformed

    private void jbtnCampo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo6ActionPerformed
        Campo_6 campo6 = new Campo_6();
        campo6.setVisible(true);
    }//GEN-LAST:event_jbtnCampo6ActionPerformed

    private void jbtnCampo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo4ActionPerformed
        Campo_4 campo4 = new Campo_4();
        campo4.setVisible(true);
    }//GEN-LAST:event_jbtnCampo4ActionPerformed

    private void jbtnCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo2ActionPerformed
        Campo_2 campo2 = new Campo_2();
        campo2.setVisible(true);
    }//GEN-LAST:event_jbtnCampo2ActionPerformed

    private void jbtnCampo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo5ActionPerformed
        Campo_5 campo5 = new Campo_5();
        campo5.setVisible(true);
    }//GEN-LAST:event_jbtnCampo5ActionPerformed

    private void jbtnCampo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo3ActionPerformed
        Campo_3 campo3 = new Campo_3();
        campo3.setVisible(true);
    }//GEN-LAST:event_jbtnCampo3ActionPerformed

    private void jbtnReservarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReservarCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnReservarCarritoActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        guardarDatosEncargado();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void pDatosEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatosEventoMouseClicked
         jtbEventos.setSelectedIndex(1);
    }//GEN-LAST:event_pDatosEventoMouseClicked

    private void pHorariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariMouseClicked
        jtbEventos.setSelectedIndex(2);
    }//GEN-LAST:event_pHorariMouseClicked

    private void pDatosEventoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatosEventoMouseMoved
         pDatosEvento.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pDatosEventoMouseMoved

    private void pDatosEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatosEventoMouseExited
        pDatosEvento.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pDatosEventoMouseExited

    private void pHorariMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariMouseMoved
        pHorari.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pHorariMouseMoved

    private void pHorariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariMouseExited
         pHorari.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pHorariMouseExited

    private void jbtnCancelarD1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarD1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCancelarD1MouseMoved

    private void jbtnCancelarD1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarD1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCancelarD1MouseExited

    private void jbtnGuardarEventoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarEventoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarEventoMouseMoved

    private void jbtnGuardarEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarEventoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarEventoMouseExited

    private void jbtnGuardarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarEventoActionPerformed
        guardarDatosEvento();
    }//GEN-LAST:event_jbtnGuardarEventoActionPerformed

    private void pCamposPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposPagoMouseClicked
        jtbPagos.setSelectedIndex(1);
        

// TODO add your handling code here:
    }//GEN-LAST:event_pCamposPagoMouseClicked

    private void jbtnCancelarD2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarD2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCancelarD2MouseMoved

    private void jbtnCancelarD2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarD2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCancelarD2MouseExited

    private void jbtnGuardar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardar2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardar2MouseMoved

    private void jbtnGuardar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardar2MouseExited

    private void jbtnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardar2ActionPerformed

    private void jcbxDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxDesdeActionPerformed

    private void pRealizarQuejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRealizarQuejaMouseClicked
       jtbQuejas.setSelectedIndex(1);
    }//GEN-LAST:event_pRealizarQuejaMouseClicked

    private void pDetalleQuejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDetalleQuejaMouseClicked
        jtbQuejas.setSelectedIndex(2);
    }//GEN-LAST:event_pDetalleQuejaMouseClicked

    private void pCamposPagoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposPagoMouseMoved
         pCamposPago.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pCamposPagoMouseMoved

    private void pCamposPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposPagoMouseExited
         pCamposPago.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pCamposPagoMouseExited

    private void pRealizarQuejaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRealizarQuejaMouseExited
         pRealizarQueja.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pRealizarQuejaMouseExited

    private void pRealizarQuejaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRealizarQuejaMouseMoved
        pRealizarQueja.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pRealizarQuejaMouseMoved

    private void pDetalleQuejaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDetalleQuejaMouseMoved
        pDetalleQueja.setBackground(new Color(115, 153, 142));
    }//GEN-LAST:event_pDetalleQuejaMouseMoved

    private void pDetalleQuejaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDetalleQuejaMouseExited
        pDetalleQueja.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_pDetalleQuejaMouseExited

    private void jbtnVerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnVerMouseMoved

    private void jbtnVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVerMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnVerMouseExited

    private void jbtnEnviarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEnviarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEnviarMouseMoved

    private void jbtnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEnviarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEnviarMouseExited

    private void jbtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEnviarActionPerformed
        guardarDatosQueja();
    }//GEN-LAST:event_jbtnEnviarActionPerformed

    private void jbtnCancelarD6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarD6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCancelarD6MouseMoved

    private void jbtnCancelarD6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarD6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCancelarD6MouseExited

    private void jbtnGuardarEvento4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarEvento4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarEvento4MouseMoved

    private void jbtnGuardarEvento4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarEvento4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarEvento4MouseExited

    private void jbtnGuardarEvento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarEvento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarEvento4ActionPerformed

    private void jbtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerActionPerformed

        jtbQuejas.setSelectedIndex(2);
    }//GEN-LAST:event_jbtnVerActionPerformed

    private void jbtnSubirImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirImagen1ActionPerformed
      String Ruta = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif" );
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if(respuesta == jFileChooser.APPROVE_OPTION){
            Ruta = jFileChooser.getSelectedFile().getPath();
            
            Image mImagen = new ImageIcon(Ruta).getImage();
            ImageIcon mIcon = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(mIcon);

        }
    }//GEN-LAST:event_jbtnSubirImagen1ActionPerformed

    private void jbtnguardarimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarimagenActionPerformed
   /*  try {
            GuardarImagen();
        } catch (IOException ex) {
            Logger.getLogger(frmSistema.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jbtnguardarimagenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //int ncampo = jComboBox7.getSelectedIndex();
        
        //mostrarDatosHorario(ncampo);
    }//GEN-LAST:event_jButton3ActionPerformed

   /*
    metodo para buscar en los campos:
    public void mostrarDatosHorario(int ncampo) {

         DefaultTableModel horario = new DefaultTableModel();
        horario.addColumn("NCampo");
        horario.addColumn("HoraInicio");
        horario.addColumn("HoraFin");
        horario.addColumn("Fecha");
        horario.addColumn("TipoDeDeporte"); 
        jTable2.setModel(horario);
        String codsql = null;

        if (ncampo == 0 ) {
            codsql = "SELECT * FROM Reservas";
        } else {
            if (ncampo == 1 ) {
                codsql = "SELECT * FROM Reservas WHERE NumeroCampo = '1'";
            } else {
                if (ncampo == 2 ) {
                    codsql = "SELECT * FROM Reservas WHERE NumeroCampo = '2'";
                } else {
                    if (ncampo == 3 ) {
                        codsql = "SELECT * FROM Reservas WHERE NumeroCampo = '3'";
                } else{
                        if (ncampo == 4) {
                            codsql = "SELECT * FROM Reservas WHERE NumeroCampo = '4'";
                        } else{
                            if (ncampo == 5){
                                codsql = "SELECT * FROM Reservas WHERE NumeroCampo = '5'";
                            } else{
                                if (ncampo == 6){
                                    codsql = "SELECT * FROM Reservas WHERE NumeroCampo = '6'";
                                }
                            }
                        }
                    }
            }
        }
        }
        String[] datos = new String[5];
        try {
            java.sql.Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery(codsql);

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);

                jTable2.addRow(datos);
            }
            jTable2.setModel(horario);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }
    */
    public void GuardarImagen() throws IOException {
  
}

    
    
    
    
private void guardarDatosEncargado() {
    String nombre = jtxtNombre.getText();
    String celular = jtxtCelular.getText();
    String dni = jtxtDNI.getText();
    String tipoDeporte = jcbxTDeporte.getSelectedItem().toString();
    String numeroCampoStr = jcbxNCampo1.getSelectedItem().toString();

    // Validar que el campo seleccionado sea un número válido
    int numeroCampo;
    try {
        numeroCampo = Integer.parseInt(numeroCampoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor seleccione un número de campo válido.");
        return;
    }

    try {
        // Establecer la conexión con la base de datos
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LaRedonda;encrypt=true;trustServerCertificate=true", "sa", "12345678");

        // Crear la consulta SQL para la inserción de datos
        String query = "INSERT INTO Reservas (Nombre, Celular, DNI, TipoDeDeporte, NumeroCampo) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pst = connection.prepareStatement(query)) {
            // Establecer los parámetros de la consulta
            pst.setString(1, nombre);
            pst.setString(2, celular);
            pst.setString(3, dni);
            pst.setString(4, tipoDeporte);
            pst.setInt(5, numeroCampo);

            // Ejecutar la consulta
            pst.executeUpdate();

            // Limpiar los campos de entrada
            jtxtNombre.setText("");
            jtxtCelular.setText("");
            jtxtDNI.setText("");
            jcbxTDeporte.setSelectedIndex(0);
            jcbxNCampo1.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Registro exitoso");
        }

        // Cerrar la conexión
        connection.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
    }
}

   
    
    private void guardarDatosEvento() {
   String nombre = jtxtNombre.getText();
    String celular = jtxtCelular.getText();
    String dni = jtxtDNI.getText();
    String tipoDeporte = jcbxTDeporte.getSelectedItem().toString();
    String numeroCampo = jcbxNCampo1.getSelectedItem().toString();
    
    // Formatear la fecha actual como yyyy-MM-dd
    String fechaActual = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    try {
        // Establecer la conexión con la base de datos
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LaRedonda;encrypt=true;trustServerCertificate=true", "sa", "12345678");

        // Crear la consulta SQL para la inserción de datos
        String query = "INSERT INTO Reservas (Nombre, Celular, DNI, Fecha, TipoDeDeporte, NumeroCampo) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pst = connection.prepareStatement(query)) {
            // Establecer los parámetros de la consulta
            pst.setString(1, nombre);
            pst.setString(2, celular);
            pst.setString(3, dni);
            pst.setString(4, fechaActual);
            pst.setString(5, tipoDeporte);
            pst.setInt(6, Integer.parseInt(numeroCampo));

            // Ejecutar la consulta
            pst.executeUpdate();

            // Cerrar la conexión
            connection.close();

            // Limpiar los campos de entrada
            jtxtNombre.setText("");
            jtxtCelular.setText("");
            jtxtDNI.setText("");
            jcbxTDeporte.setSelectedIndex(0);
            jcbxNCampo1.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Registro exitoso");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
    }
    }
    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 50);
        UIManager.put("TextComponent.arc", 50);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAceptarC;
    private javax.swing.JButton jbtnAceptarE;
    private javax.swing.JButton jbtnAceptarH;
    private javax.swing.JButton jbtnAgregar1;
    private javax.swing.JButton jbtnAgregar2;
    private javax.swing.JButton jbtnAgregar3;
    private javax.swing.JButton jbtnAgregar4;
    private javax.swing.JButton jbtnAgregar5;
    private javax.swing.JButton jbtnAgregar6;
    private javax.swing.JButton jbtnAgregarLays8;
    private javax.swing.JButton jbtnCampo1;
    private javax.swing.JButton jbtnCampo2;
    private javax.swing.JButton jbtnCampo3;
    private javax.swing.JButton jbtnCampo4;
    private javax.swing.JButton jbtnCampo5;
    private javax.swing.JButton jbtnCampo6;
    private javax.swing.JButton jbtnCancelarC;
    private javax.swing.JButton jbtnCancelarD;
    private javax.swing.JButton jbtnCancelarD1;
    private javax.swing.JButton jbtnCancelarD2;
    private javax.swing.JButton jbtnCancelarD6;
    private javax.swing.JButton jbtnCancelarE;
    private javax.swing.JButton jbtnCancelarH;
    private javax.swing.JButton jbtnEnviar;
    private javax.swing.JButton jbtnEventos;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnGuardar2;
    private javax.swing.JButton jbtnGuardarEvento;
    private javax.swing.JButton jbtnGuardarEvento4;
    private javax.swing.JButton jbtnPagos;
    private javax.swing.JButton jbtnQuejas;
    private javax.swing.JButton jbtnReservar;
    private javax.swing.JButton jbtnReservarCarrito;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnSubirImagen1;
    private javax.swing.JButton jbtnVer;
    private javax.swing.JButton jbtnYape;
    private javax.swing.JButton jbtnguardarimagen;
    private javax.swing.JComboBox<String> jcbx1;
    private javax.swing.JComboBox<String> jcbx2;
    private javax.swing.JComboBox<String> jcbx3;
    private javax.swing.JComboBox<String> jcbx4;
    private javax.swing.JComboBox<String> jcbx5;
    private javax.swing.JComboBox<String> jcbx6;
    private javax.swing.JComboBox<String> jcbxDesde;
    private javax.swing.JComboBox<String> jcbxHasta;
    private javax.swing.JComboBox<String> jcbxNCampo;
    private javax.swing.JComboBox<String> jcbxNCampo1;
    private javax.swing.JComboBox<String> jcbxNCampo2;
    private javax.swing.JComboBox<String> jcbxTDeporte;
    private javax.swing.JPanel jpDetallesQuejas;
    private javax.swing.JPanel jpEventos;
    private javax.swing.JPanel jpPagos;
    private javax.swing.JPanel jpQuejas;
    private javax.swing.JPanel jpRealizarQuejas;
    private javax.swing.JPanel jpReserva;
    private javax.swing.JTable jtablahorariocancha;
    private javax.swing.JTabbedPane jtbEventos;
    private javax.swing.JTabbedPane jtbPagos;
    private javax.swing.JTabbedPane jtbPaneles;
    private javax.swing.JTabbedPane jtbQuejas;
    private javax.swing.JTabbedPane jtbReserva;
    private javax.swing.JTable jtblCarrito;
    private javax.swing.JTable jtblQuejas;
    private javax.swing.JTextArea jtxResena;
    private javax.swing.JTextField jtxtCelular;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtDescrip;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JTextField jtxtHora;
    private javax.swing.JTextField jtxtNCancha;
    private javax.swing.JTextField jtxtNInstitucion;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNombre1;
    private javax.swing.JTextField jtxtNombreImage;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtTotalPagar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPanel pCampos;
    private javax.swing.JPanel pCamposPago;
    private javax.swing.JPanel pCancha;
    private javax.swing.JPanel pDatoEncargado;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatosEvento;
    private javax.swing.JPanel pDetalleQueja;
    private javax.swing.JPanel pEquipamiento1;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pHorari;
    private javax.swing.JPanel pHorario;
    private javax.swing.JPanel pHorarioEventos;
    private javax.swing.JPanel pHorarios;
    private javax.swing.JPanel pHouse;
    private javax.swing.JPanel pProgramacion;
    private javax.swing.JPanel pRealizarQueja;
    // End of variables declaration//GEN-END:variables
}
