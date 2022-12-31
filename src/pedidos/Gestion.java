package pedidos;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gestion extends javax.swing.JFrame {
    
    int x,y,xx,xy;        

    public Gestion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("../Images/control_panel_22756.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPPal = new javax.swing.JPanel();
        pnlBarra = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        lblMini = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        pnlDash = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        lblDash = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlContenedor = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblBienve = new javax.swing.JLabel();
        pnlRegistro = new javax.swing.JPanel();
        lblReg = new javax.swing.JLabel();
        lblIngresosMes = new javax.swing.JLabel();
        lblEgresosMes = new javax.swing.JLabel();
        lblNomina = new javax.swing.JLabel();
        lblTotalCuentasMes = new javax.swing.JLabel();
        txtEgresoMes = new javax.swing.JTextField();
        txtNomina = new javax.swing.JTextField();
        txtTotalCuentasMes = new javax.swing.JTextField();
        DateRegistros = new com.toedter.calendar.JDateChooser();
        lblFechaReg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        btnAñadirReg = new javax.swing.JButton();
        btnModificarReg = new javax.swing.JButton();
        btnEliminarReg = new javax.swing.JButton();
        btnNuevoReg = new javax.swing.JButton();
        btnPDFProveedores2 = new javax.swing.JButton();
        btnExcelProveedores2 = new javax.swing.JButton();
        lblGenerarExcel2 = new javax.swing.JLabel();
        lblGenerarExcel6 = new javax.swing.JLabel();
        txtIngresosMes = new javax.swing.JTextField();
        pnlConsultarEmpleados = new javax.swing.JPanel();
        lblEmpleado = new javax.swing.JLabel();
        lblNomEmpleado = new javax.swing.JLabel();
        lblApeEmpleado = new javax.swing.JLabel();
        lblCelEmpleado = new javax.swing.JLabel();
        lblCorrEmpleado = new javax.swing.JLabel();
        lblDirEmpleado = new javax.swing.JLabel();
        lblDocEmpleado = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        txtNomEmpleado = new javax.swing.JTextField();
        txtApeEmpleado = new javax.swing.JTextField();
        txtCelEmpleado = new javax.swing.JTextField();
        txtCorrEmpleado = new javax.swing.JTextField();
        txtDireEmpleado = new javax.swing.JTextField();
        txtDocIdEmpleado = new javax.swing.JTextField();
        DateIngresoEmpleado = new com.toedter.calendar.JDateChooser();
        DateSalidaEmpleado = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnBuscarEmpleado = new javax.swing.JButton();
        btnPDFProveedores3 = new javax.swing.JButton();
        btnExcelProveedores3 = new javax.swing.JButton();
        lblGenerarExcel3 = new javax.swing.JLabel();
        pnlProductos = new javax.swing.JPanel();
        lblProd = new javax.swing.JLabel();
        lblNomProducto = new javax.swing.JLabel();
        lblProvProducto = new javax.swing.JLabel();
        lblCantidadProducto = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        lblTotalProducto = new javax.swing.JLabel();
        lblImagenProducto = new javax.swing.JLabel();
        lblFechaProducto = new javax.swing.JLabel();
        txtNomProducto = new javax.swing.JTextField();
        txtProveedorProducto = new javax.swing.JTextField();
        txtCantProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtTotalProducto = new javax.swing.JTextField();
        txtImagenProducto = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnCargarImagenProducto = new javax.swing.JButton();
        pnlImagenProducto = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnPDFProveedores1 = new javax.swing.JButton();
        btnExcelProveedores1 = new javax.swing.JButton();
        lblGenerarExcel1 = new javax.swing.JLabel();
        pnlProveedores = new javax.swing.JPanel();
        lblProvee = new javax.swing.JLabel();
        lblEmpresaProveedor = new javax.swing.JLabel();
        lblVendedorProveedor = new javax.swing.JLabel();
        lblCelProveedor = new javax.swing.JLabel();
        lblCorrProveedor = new javax.swing.JLabel();
        lblDireProveedor = new javax.swing.JLabel();
        lblFechaProveedor = new javax.swing.JLabel();
        txtVendedorProveedor = new javax.swing.JTextField();
        txtCelProveedor = new javax.swing.JTextField();
        txtEmpresaProveedor = new javax.swing.JTextField();
        txtCorrProveedor = new javax.swing.JTextField();
        txtDireProveedor = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        btnAgregarProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        btnExcelProveedores = new javax.swing.JButton();
        btnPDFProveedores = new javax.swing.JButton();
        lblGenerarExcel = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        lblGenerarExcel7 = new javax.swing.JLabel();
        pnlClientes = new javax.swing.JPanel();
        lblClient = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnPDFProveedores4 = new javax.swing.JButton();
        btnExcelProveedores4 = new javax.swing.JButton();
        lblGenerarExcel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblGenerarExcel5 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPPal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPPal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarra.setBackground(new java.awt.Color(0, 4, 48));
        pnlBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraMouseDragged(evt);
            }
        });
        pnlBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraMousePressed(evt);
            }
        });

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1486564399-close_81512.png"))); // NOI18N
        lblSalir.setToolTipText("Close");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        lblMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar.png"))); // NOI18N
        lblMini.setToolTipText("Minimize");
        lblMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiniMouseClicked(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Russo One", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Sistema Administrativo");

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 943, Short.MAX_VALUE)
                .addComponent(lblMini)
                .addGap(18, 18, 18)
                .addComponent(lblSalir)
                .addContainerGap())
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlPPal.add(pnlBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1284, 48));

        pnlDash.setBackground(new java.awt.Color(0, 0, 25));

        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/control_panel_22756.png"))); // NOI18N

        lblDash.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        lblDash.setForeground(new java.awt.Color(255, 188, 30));
        lblDash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDash.setText("DASHBOARD");
        lblDash.setToolTipText("");

        lblInicio.setBackground(new java.awt.Color(0, 0, 25));
        lblInicio.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("Inicio");
        lblInicio.setToolTipText("Home");
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicio.setFocusable(false);
        lblInicio.setOpaque(true);
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblInicioMouseReleased(evt);
            }
        });

        lblRegistro.setBackground(new java.awt.Color(0, 0, 25));
        lblRegistro.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registros");
        lblRegistro.setToolTipText("Records");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.setFocusable(false);
        lblRegistro.setOpaque(true);
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegistroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRegistroMouseReleased(evt);
            }
        });

        lblEmpleados.setBackground(new java.awt.Color(0, 0, 25));
        lblEmpleados.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        lblEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados.setText("Empleados");
        lblEmpleados.setToolTipText("Employees");
        lblEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmpleados.setFocusable(false);
        lblEmpleados.setOpaque(true);
        lblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEmpleadosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseReleased(evt);
            }
        });

        lblProductos.setBackground(new java.awt.Color(0, 0, 25));
        lblProductos.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("Productos");
        lblProductos.setToolTipText("Products");
        lblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProductos.setFocusable(false);
        lblProductos.setOpaque(true);
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblProductosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblProductosMouseReleased(evt);
            }
        });

        lblProveedores.setBackground(new java.awt.Color(0, 0, 25));
        lblProveedores.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        lblProveedores.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProveedores.setText("Proveedores");
        lblProveedores.setToolTipText("Suppliers");
        lblProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProveedores.setFocusable(false);
        lblProveedores.setOpaque(true);
        lblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblProveedoresMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseReleased(evt);
            }
        });

        lblClientes.setBackground(new java.awt.Color(0, 0, 25));
        lblClientes.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes.setText("Clientes");
        lblClientes.setToolTipText("Customers");
        lblClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClientes.setFocusable(false);
        lblClientes.setOpaque(true);
        lblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblClientesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblClientesMouseReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlDashLayout = new javax.swing.GroupLayout(pnlDash);
        pnlDash.setLayout(pnlDashLayout);
        pnlDashLayout.setHorizontalGroup(
            pnlDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDash, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(lblInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        pnlDashLayout.setVerticalGroup(
            pnlDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDash, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pnlPPal.add(pnlDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 240, 756));

        pnlContenedor.setLayout(new java.awt.CardLayout());

        pnlInicio.setBackground(new java.awt.Color(255, 255, 255));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock.jpg"))); // NOI18N

        lblBienve.setFont(new java.awt.Font("Russo One", 1, 54)); // NOI18N
        lblBienve.setForeground(new java.awt.Color(255, 0, 0));
        lblBienve.setText("BIENVENIDOS Al:");

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lblBienve))
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblImagen)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(lblBienve)
                .addGap(51, 51, 51)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        pnlContenedor.add(pnlInicio, "card2");

        pnlRegistro.setBackground(new java.awt.Color(255, 255, 255));

        lblReg.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        lblReg.setForeground(new java.awt.Color(0, 51, 102));
        lblReg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReg.setText("Registros");

        lblIngresosMes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblIngresosMes.setForeground(new java.awt.Color(0, 51, 102));
        lblIngresosMes.setText("Ingresos Del Mes");

        lblEgresosMes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblEgresosMes.setForeground(new java.awt.Color(0, 51, 102));
        lblEgresosMes.setText("Egreso Mensual");

        lblNomina.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblNomina.setForeground(new java.awt.Color(0, 51, 102));
        lblNomina.setText("Nomina");

        lblTotalCuentasMes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblTotalCuentasMes.setForeground(new java.awt.Color(0, 51, 102));
        lblTotalCuentasMes.setText("Total Cuentas Del Mes");

        txtEgresoMes.setBackground(new java.awt.Color(255, 255, 255));
        txtEgresoMes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEgresoMes.setForeground(new java.awt.Color(0, 0, 0));

        txtNomina.setBackground(new java.awt.Color(255, 255, 255));
        txtNomina.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNomina.setForeground(new java.awt.Color(0, 0, 0));

        txtTotalCuentasMes.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalCuentasMes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTotalCuentasMes.setForeground(new java.awt.Color(0, 0, 0));

        DateRegistros.setBackground(new java.awt.Color(255, 255, 255));
        DateRegistros.setForeground(new java.awt.Color(0, 0, 0));
        DateRegistros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        lblFechaReg.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 51, 102));
        lblFechaReg.setText("Fecha");

        tblRegistros.setBackground(new java.awt.Color(255, 255, 255));
        tblRegistros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblRegistros.setForeground(new java.awt.Color(0, 0, 0));
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Ingreso Mensual", "Egreso Mensual", "Nomina", "Fecha", "Total"
            }
        ));
        tblRegistros.setToolTipText("Tabla De Registros");
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setMaxWidth(60);
            tblRegistros.getColumnModel().getColumn(4).setMaxWidth(80);
            tblRegistros.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        btnAñadirReg.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnAñadirReg.setForeground(new java.awt.Color(0, 51, 102));
        btnAñadirReg.setText("AGREGAR");
        btnAñadirReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirRegActionPerformed(evt);
            }
        });

        btnModificarReg.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnModificarReg.setForeground(new java.awt.Color(0, 51, 102));
        btnModificarReg.setText("MODIFICAR");

        btnEliminarReg.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnEliminarReg.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarReg.setText("ELIMINAR");

        btnNuevoReg.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnNuevoReg.setForeground(new java.awt.Color(0, 51, 102));
        btnNuevoReg.setText("BUSCAR");

        btnPDFProveedores2.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnPDFProveedores2.setForeground(new java.awt.Color(255, 0, 0));
        btnPDFProveedores2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png"))); // NOI18N
        btnPDFProveedores2.setText("PDF");

        btnExcelProveedores2.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnExcelProveedores2.setForeground(new java.awt.Color(0, 255, 0));
        btnExcelProveedores2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excel.png"))); // NOI18N
        btnExcelProveedores2.setText("  EXCEL");
        btnExcelProveedores2.setActionCommand("EXCEL");

        lblGenerarExcel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel2.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel2.setText("Generar");

        lblGenerarExcel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel6.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel6.setText("Generar");

        txtIngresosMes.setBackground(new java.awt.Color(255, 255, 255));
        txtIngresosMes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtIngresosMes.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRegistroLayout.createSequentialGroup()
                                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEgresosMes)
                                    .addComponent(lblIngresosMes)
                                    .addComponent(txtEgresoMes, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtIngresosMes))
                                .addGap(51, 51, 51)
                                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomina)
                                    .addComponent(txtTotalCuentasMes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotalCuentasMes))
                                .addGap(37, 37, 37)
                                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAñadirReg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNuevoReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlRegistroLayout.createSequentialGroup()
                                .addComponent(lblFechaReg)
                                .addGap(18, 18, 18)
                                .addComponent(DateRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lblGenerarExcel2)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcelProveedores2)
                                .addGap(18, 18, 18)
                                .addComponent(lblGenerarExcel6)
                                .addGap(18, 18, 18)
                                .addComponent(btnPDFProveedores2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresosMes)
                    .addComponent(lblTotalCuentasMes))
                .addGap(14, 14, 14)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalCuentasMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIngresosMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEgresosMes)
                            .addComponent(lblNomina))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEgresoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addComponent(btnAñadirReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addComponent(btnModificarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnNuevoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGenerarExcel2)
                                .addComponent(btnExcelProveedores2)
                                .addComponent(btnPDFProveedores2)
                                .addComponent(lblGenerarExcel6))
                            .addComponent(DateRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblFechaReg)))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pnlContenedor.add(pnlRegistro, "card3");

        pnlConsultarEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        pnlConsultarEmpleados.setPreferredSize(new java.awt.Dimension(1044, 756));

        lblEmpleado.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        lblEmpleado.setText("Empleados");

        lblNomEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblNomEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        lblNomEmpleado.setText("Nombres");

        lblApeEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblApeEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        lblApeEmpleado.setText("Apellidos");

        lblCelEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblCelEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        lblCelEmpleado.setText("Celular");

        lblCorrEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblCorrEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        lblCorrEmpleado.setText("Correo");

        lblDirEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblDirEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        lblDirEmpleado.setText("Dirección");

        lblDocEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblDocEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        lblDocEmpleado.setText("Documento Identidad");

        lblFechaIngreso.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblFechaIngreso.setForeground(new java.awt.Color(0, 51, 102));
        lblFechaIngreso.setText("Fecha Ingreso");

        lblFechaSalida.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblFechaSalida.setForeground(new java.awt.Color(0, 51, 102));
        lblFechaSalida.setText("Fecha Salida");

        txtNomEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtNomEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNomEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        txtApeEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtApeEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtApeEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        txtCelEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtCelEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCelEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        txtCorrEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtCorrEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCorrEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        txtDireEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtDireEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtDireEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        txtDocIdEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtDocIdEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtDocIdEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        DateIngresoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        DateIngresoEmpleado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        DateSalidaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        DateSalidaEmpleado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        tblEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        tblEmpleado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombres", "Apellidos", "Celular", "Correo", "Dirección", "Doc. Identidad", "Ingreso", "Salida"
            }
        ));
        jScrollPane2.setViewportView(tblEmpleado);
        if (tblEmpleado.getColumnModel().getColumnCount() > 0) {
            tblEmpleado.getColumnModel().getColumn(0).setMaxWidth(40);
            tblEmpleado.getColumnModel().getColumn(7).setMaxWidth(60);
            tblEmpleado.getColumnModel().getColumn(8).setMaxWidth(60);
        }

        btnAgregarEmpleado.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnAgregarEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        btnAgregarEmpleado.setText("AGREGAR");

        btnEditarEmpleado.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnEditarEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        btnEditarEmpleado.setText("MODIFICAR");

        btnEliminarEmpleado.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarEmpleado.setText("ELIMINAR");

        btnBuscarEmpleado.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(0, 51, 102));
        btnBuscarEmpleado.setText("BUSCAR");

        btnPDFProveedores3.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnPDFProveedores3.setForeground(new java.awt.Color(255, 0, 0));
        btnPDFProveedores3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png"))); // NOI18N
        btnPDFProveedores3.setText("PDF");

        btnExcelProveedores3.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnExcelProveedores3.setForeground(new java.awt.Color(0, 255, 0));
        btnExcelProveedores3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excel.png"))); // NOI18N
        btnExcelProveedores3.setText("EXCEL");

        lblGenerarExcel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel3.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel3.setText("Generar");

        javax.swing.GroupLayout pnlConsultarEmpleadosLayout = new javax.swing.GroupLayout(pnlConsultarEmpleados);
        pnlConsultarEmpleados.setLayout(pnlConsultarEmpleadosLayout);
        pnlConsultarEmpleadosLayout.setHorizontalGroup(
            pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(798, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarEmpleadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomEmpleado)
                            .addComponent(txtNomEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorrEmpleado)
                            .addComponent(txtCorrEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaIngreso)
                            .addComponent(DateIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirEmpleado)
                            .addComponent(lblApeEmpleado)
                            .addComponent(txtApeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaSalida)
                            .addComponent(DateSalidaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                                .addComponent(btnPDFProveedores3)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcelProveedores3)
                                .addGap(214, 214, 214))
                            .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                                .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenerarExcel3)
                                    .addComponent(lblCelEmpleado)
                                    .addComponent(txtCelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDocEmpleado)
                                    .addComponent(txtDocIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(44, 44, 44)))))
                .addGap(47, 47, 47))
        );
        pnlConsultarEmpleadosLayout.setVerticalGroup(
            pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleado)
                .addGap(85, 85, 85)
                .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApeEmpleado)
                            .addComponent(lblNomEmpleado)
                            .addComponent(lblCelEmpleado))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDirEmpleado)
                            .addComponent(lblCorrEmpleado)
                            .addComponent(lblDocEmpleado))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorrEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaIngreso)
                            .addComponent(lblFechaSalida)
                            .addComponent(lblGenerarExcel3)))
                    .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                        .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(DateSalidaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(DateIngresoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConsultarEmpleadosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlConsultarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPDFProveedores3)
                            .addComponent(btnExcelProveedores3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pnlContenedor.add(pnlConsultarEmpleados, "card4");

        pnlProductos.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductos.setPreferredSize(new java.awt.Dimension(1044, 756));

        lblProd.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        lblProd.setForeground(new java.awt.Color(0, 51, 102));
        lblProd.setText("Productos");

        lblNomProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblNomProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblNomProducto.setText("Nombre");

        lblProvProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblProvProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblProvProducto.setText("Proveedor");

        lblCantidadProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblCantidadProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblCantidadProducto.setText("Cantidad");

        lblPrecioProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblPrecioProducto.setText("Precio");

        lblTotalProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblTotalProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblTotalProducto.setText("Total");

        lblImagenProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblImagenProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblImagenProducto.setText("Imagen");

        lblFechaProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblFechaProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblFechaProducto.setText("Fecha");

        txtNomProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtNomProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNomProducto.setForeground(new java.awt.Color(0, 0, 0));

        txtProveedorProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtProveedorProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtProveedorProducto.setForeground(new java.awt.Color(0, 0, 0));

        txtCantProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtCantProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCantProducto.setForeground(new java.awt.Color(0, 0, 0));

        txtPrecioProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtPrecioProducto.setForeground(new java.awt.Color(0, 0, 0));

        txtTotalProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTotalProducto.setForeground(new java.awt.Color(0, 0, 0));

        txtImagenProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtImagenProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtImagenProducto.setForeground(new java.awt.Color(0, 0, 0));

        jDateChooser1.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDateChooser1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnCargarImagenProducto.setFont(new java.awt.Font("Russo One", 1, 18)); // NOI18N
        btnCargarImagenProducto.setForeground(new java.awt.Color(0, 51, 102));
        btnCargarImagenProducto.setText("CARGAR");

        javax.swing.GroupLayout pnlImagenProductoLayout = new javax.swing.GroupLayout(pnlImagenProducto);
        pnlImagenProducto.setLayout(pnlImagenProductoLayout);
        pnlImagenProductoLayout.setHorizontalGroup(
            pnlImagenProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        pnlImagenProductoLayout.setVerticalGroup(
            pnlImagenProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        tblProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblProductos.setForeground(new java.awt.Color(0, 0, 0));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Proveedor", "Precio", "Cantidad", "Total", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblProductos.getColumnModel().getColumn(3).setMaxWidth(80);
            tblProductos.getColumnModel().getColumn(4).setMaxWidth(60);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(80);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        btnAgregarProducto.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(0, 51, 102));
        btnAgregarProducto.setText("AGREGAR");

        btnModificarProducto.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(0, 51, 102));
        btnModificarProducto.setText("MODIFICAR");

        btnEliminarProducto.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarProducto.setText("ELIMINAR");

        btnBuscarProducto.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(0, 51, 102));
        btnBuscarProducto.setText("BUSCAR");

        btnPDFProveedores1.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnPDFProveedores1.setForeground(new java.awt.Color(255, 0, 0));
        btnPDFProveedores1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png"))); // NOI18N
        btnPDFProveedores1.setText("PDF");

        btnExcelProveedores1.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnExcelProveedores1.setForeground(new java.awt.Color(0, 255, 0));
        btnExcelProveedores1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excel.png"))); // NOI18N
        btnExcelProveedores1.setText("EXCEL");

        lblGenerarExcel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel1.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel1.setText("Generar");

        javax.swing.GroupLayout pnlProductosLayout = new javax.swing.GroupLayout(pnlProductos);
        pnlProductos.setLayout(pnlProductosLayout);
        pnlProductosLayout.setHorizontalGroup(
            pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductosLayout.createSequentialGroup()
                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProd, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductosLayout.createSequentialGroup()
                                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlProductosLayout.createSequentialGroup()
                                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlProductosLayout.createSequentialGroup()
                                                .addComponent(lblPrecioProducto)
                                                .addGap(82, 82, 82))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductosLayout.createSequentialGroup()
                                                .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCantidadProducto)
                                            .addComponent(txtCantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotalProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTotalProducto))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFechaProducto)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlProductosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblGenerarExcel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcelProveedores1)
                                .addGap(18, 18, 18)
                                .addComponent(btnPDFProveedores1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductosLayout.createSequentialGroup()
                                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlProductosLayout.createSequentialGroup()
                                        .addComponent(lblNomProducto)
                                        .addGap(410, 410, 410)
                                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblImagenProducto)
                                            .addGroup(pnlProductosLayout.createSequentialGroup()
                                                .addComponent(txtImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCargarImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pnlProductosLayout.createSequentialGroup()
                                        .addComponent(txtNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProvProducto)
                                            .addComponent(txtProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 15, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlProductosLayout.setVerticalGroup(
            pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProd)
                    .addComponent(lblGenerarExcel1)
                    .addComponent(btnExcelProveedores1)
                    .addComponent(btnPDFProveedores1))
                .addGap(77, 77, 77)
                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomProducto)
                            .addComponent(lblProvProducto))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addComponent(lblImagenProducto)
                        .addGap(18, 18, 18)
                        .addComponent(txtImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCargarImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalProducto)
                            .addComponent(lblCantidadProducto)
                            .addComponent(lblPrecioProducto)
                            .addComponent(lblFechaProducto))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotalProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnlImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlContenedor.add(pnlProductos, "card6");

        pnlProveedores.setBackground(new java.awt.Color(255, 255, 255));

        lblProvee.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        lblProvee.setForeground(new java.awt.Color(0, 51, 102));
        lblProvee.setText("Proveedores");

        lblEmpresaProveedor.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblEmpresaProveedor.setForeground(new java.awt.Color(0, 51, 102));
        lblEmpresaProveedor.setText("Empresa");

        lblVendedorProveedor.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblVendedorProveedor.setForeground(new java.awt.Color(0, 51, 102));
        lblVendedorProveedor.setText("Vendedor");

        lblCelProveedor.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblCelProveedor.setForeground(new java.awt.Color(0, 51, 102));
        lblCelProveedor.setText("Celular");

        lblCorrProveedor.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblCorrProveedor.setForeground(new java.awt.Color(0, 51, 102));
        lblCorrProveedor.setText("Correo");

        lblDireProveedor.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblDireProveedor.setForeground(new java.awt.Color(0, 51, 102));
        lblDireProveedor.setText("Direccion");

        lblFechaProveedor.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblFechaProveedor.setForeground(new java.awt.Color(0, 51, 102));
        lblFechaProveedor.setText("Fecha");

        txtVendedorProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtVendedorProveedor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtVendedorProveedor.setForeground(new java.awt.Color(0, 0, 0));

        txtCelProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtCelProveedor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCelProveedor.setForeground(new java.awt.Color(0, 0, 0));

        txtEmpresaProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpresaProveedor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEmpresaProveedor.setForeground(new java.awt.Color(0, 0, 0));

        txtCorrProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtCorrProveedor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCorrProveedor.setForeground(new java.awt.Color(0, 0, 0));

        txtDireProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtDireProveedor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtDireProveedor.setForeground(new java.awt.Color(0, 0, 0));

        tblProveedor.setBackground(new java.awt.Color(255, 255, 255));
        tblProveedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblProveedor.setForeground(new java.awt.Color(0, 0, 0));
        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Empresa", "Vendedor", "Celular", "Correo", "Dirección", "Fecha"
            }
        ));
        jScrollPane4.setViewportView(tblProveedor);
        if (tblProveedor.getColumnModel().getColumnCount() > 0) {
            tblProveedor.getColumnModel().getColumn(0).setMaxWidth(40);
            tblProveedor.getColumnModel().getColumn(3).setMaxWidth(146);
            tblProveedor.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        btnAgregarProveedor.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnAgregarProveedor.setForeground(new java.awt.Color(0, 51, 102));
        btnAgregarProveedor.setText("AGREGAR");

        btnModificarProveedor.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnModificarProveedor.setForeground(new java.awt.Color(0, 51, 102));
        btnModificarProveedor.setText("MODIFICAR");

        btnEliminarProveedor.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarProveedor.setText("ELIMINAR");

        btnBuscarProveedor.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnBuscarProveedor.setForeground(new java.awt.Color(0, 51, 102));
        btnBuscarProveedor.setText("BUSCAR");

        btnExcelProveedores.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnExcelProveedores.setForeground(new java.awt.Color(0, 255, 0));
        btnExcelProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excel.png"))); // NOI18N
        btnExcelProveedores.setText("  EXCEL");

        btnPDFProveedores.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnPDFProveedores.setForeground(new java.awt.Color(255, 0, 0));
        btnPDFProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png"))); // NOI18N
        btnPDFProveedores.setText("PDF");

        lblGenerarExcel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel.setText("Generar");

        jDateChooser2.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser2.setFocusable(false);
        jDateChooser2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        lblGenerarExcel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel7.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel7.setText("Generar");

        javax.swing.GroupLayout pnlProveedoresLayout = new javax.swing.GroupLayout(pnlProveedores);
        pnlProveedores.setLayout(pnlProveedoresLayout);
        pnlProveedoresLayout.setHorizontalGroup(
            pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProvee))
                    .addGroup(pnlProveedoresLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmpresaProveedor)
                                    .addComponent(lblEmpresaProveedor)
                                    .addComponent(lblCorrProveedor)
                                    .addComponent(txtCorrProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlProveedoresLayout.createSequentialGroup()
                                        .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtDireProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtVendedorProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(lblDireProveedor, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFechaProveedor)
                                            .addComponent(txtCelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlProveedoresLayout.createSequentialGroup()
                                        .addComponent(lblVendedorProveedor)
                                        .addGap(151, 151, 151)
                                        .addComponent(lblCelProveedor)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenerarExcel)
                                    .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnExcelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPDFProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblGenerarExcel7)))))
                    .addGroup(pnlProveedoresLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnModificarProveedor)
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlProveedoresLayout.setVerticalGroup(
            pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProvee)
                .addGap(86, 86, 86)
                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProveedoresLayout.createSequentialGroup()
                        .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpresaProveedor)
                            .addComponent(lblVendedorProveedor)
                            .addComponent(lblCelProveedor)
                            .addComponent(lblGenerarExcel))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVendedorProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpresaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCorrProveedor)
                                    .addComponent(lblDireProveedor)
                                    .addComponent(lblFechaProveedor)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProveedoresLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblGenerarExcel7)))
                        .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCorrProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnPDFProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pnlContenedor.add(pnlProveedores, "card7");

        pnlClientes.setBackground(new java.awt.Color(255, 255, 255));

        lblClient.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        lblClient.setForeground(new java.awt.Color(0, 51, 102));
        lblClient.setText("Clientes");

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Correo");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Celular");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Fecha");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));

        btnPDFProveedores4.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnPDFProveedores4.setForeground(new java.awt.Color(255, 0, 0));
        btnPDFProveedores4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png"))); // NOI18N
        btnPDFProveedores4.setText("PDF");

        btnExcelProveedores4.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        btnExcelProveedores4.setForeground(new java.awt.Color(0, 255, 0));
        btnExcelProveedores4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excel.png"))); // NOI18N
        btnExcelProveedores4.setText("  EXCEL");
        btnExcelProveedores4.setActionCommand("EXCEL");

        lblGenerarExcel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel4.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel4.setText("Generar");

        jButton1.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("AGREGAR");

        jButton2.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("MODIFICAR");

        jButton3.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("ELIMINAR");

        jButton4.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText("BUSCAR");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Correo", "Celular", "Fecha"
            }
        ));
        jScrollPane5.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        lblGenerarExcel5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblGenerarExcel5.setForeground(new java.awt.Color(0, 51, 102));
        lblGenerarExcel5.setText("Generar");

        jDateChooser4.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClient, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(148, 148, 148))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblGenerarExcel5)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcelProveedores4))
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton2)
                .addGap(76, 76, 76)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(lblGenerarExcel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDFProveedores4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(164, 164, 164))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClient)
                .addGap(86, 86, 86)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenerarExcel4)
                    .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcelProveedores4)
                        .addComponent(lblGenerarExcel5)
                        .addComponent(btnPDFProveedores4))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)))
                .addGap(48, 48, 48)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlClientes, "card8");

        pnlPPal.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 48, 1044, 756));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPPal, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPPal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Sistema De Ventas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int salir = JOptionPane.showConfirmDialog(null, "¿Realmente Desea Salir?", "Salir", JOptionPane.OK_OPTION);
        if(salir==0){
            System.exit(salir);
        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiniMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_lblMiniMouseClicked

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnlBarraMousePressed

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMouseDragged
        xx = evt.getXOnScreen();
        xy = evt.getYOnScreen();
        
        this.setLocation(xx-x,xy-y);
    }//GEN-LAST:event_pnlBarraMouseDragged

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        pnlInicio.setVisible(true);
        pnlConsultarEmpleados.setVisible(false);
        pnlProductos.setVisible(false);
        pnlRegistro.setVisible(false);
        pnlProveedores.setVisible(false);
        pnlClientes.setVisible(false);
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        pnlInicio.setVisible(false);
        pnlConsultarEmpleados.setVisible(false);
        pnlProductos.setVisible(false);
        pnlRegistro.setVisible(true);
        pnlProveedores.setVisible(false);
        pnlClientes.setVisible(false);
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void lblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseClicked
        pnlInicio.setVisible(false);
        pnlConsultarEmpleados.setVisible(true);
        pnlProductos.setVisible(false);
        pnlRegistro.setVisible(false);
        pnlProveedores.setVisible(false);
        pnlClientes.setVisible(false);
    }//GEN-LAST:event_lblEmpleadosMouseClicked

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        pnlInicio.setVisible(false);
        pnlConsultarEmpleados.setVisible(false);
        pnlProductos.setVisible(true);
        pnlRegistro.setVisible(false);
        pnlProveedores.setVisible(false);
        pnlClientes.setVisible(false);
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseClicked
        pnlProveedores.setVisible(true);
        pnlInicio.setVisible(false);
        pnlConsultarEmpleados.setVisible(false);
        pnlProductos.setVisible(false);
        pnlRegistro.setVisible(false);
        pnlClientes.setVisible(false);
    }//GEN-LAST:event_lblProveedoresMouseClicked

    private void lblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseClicked
        pnlClientes.setVisible(true);
        pnlProveedores.setVisible(false);
        pnlInicio.setVisible(false);
        pnlConsultarEmpleados.setVisible(false);
        pnlProductos.setVisible(false);
        pnlRegistro.setVisible(false);
    }//GEN-LAST:event_lblClientesMouseClicked

    private void btnAñadirRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirRegActionPerformed

    private void lblInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseEntered
        lblInicio.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_lblInicioMouseEntered

    private void lblInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseExited
        lblInicio.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblInicioMouseExited

    private void lblInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMousePressed
        lblInicio.setBackground(new Color(0,30,70));
    }//GEN-LAST:event_lblInicioMousePressed

    private void lblInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseReleased
        lblInicio.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblInicioMouseReleased

    private void lblClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseEntered
        lblClientes.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_lblClientesMouseEntered

    private void lblClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseExited
        lblClientes.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblClientesMouseExited

    private void lblClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMousePressed
        lblClientes.setBackground(new Color(0,30,70));
    }//GEN-LAST:event_lblClientesMousePressed

    private void lblClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseReleased
        lblClientes.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblClientesMouseReleased

    private void lblEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseEntered
        lblEmpleados.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_lblEmpleadosMouseEntered

    private void lblEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseExited
        lblEmpleados.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblEmpleadosMouseExited

    private void lblEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMousePressed
        lblEmpleados.setBackground(new Color(0,30,70));
    }//GEN-LAST:event_lblEmpleadosMousePressed

    private void lblEmpleadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseReleased
        lblEmpleados.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblEmpleadosMouseReleased

    private void lblProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseEntered
        lblProductos.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_lblProductosMouseEntered

    private void lblProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseExited
        lblProductos.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblProductosMouseExited

    private void lblProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMousePressed
        lblProductos.setBackground(new Color(0,30,70));
    }//GEN-LAST:event_lblProductosMousePressed

    private void lblProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseReleased
        lblProductos.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblProductosMouseReleased

    private void lblProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseEntered
        lblProveedores.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_lblProveedoresMouseEntered

    private void lblProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseExited
        lblProveedores.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblProveedoresMouseExited

    private void lblProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMousePressed
        lblProveedores.setBackground(new Color(0,30,70));
    }//GEN-LAST:event_lblProveedoresMousePressed

    private void lblProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseReleased
        lblProveedores.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblProveedoresMouseReleased

    private void lblRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseEntered
        lblRegistro.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_lblRegistroMouseEntered

    private void lblRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseExited
        lblRegistro.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblRegistroMouseExited

    private void lblRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMousePressed
        lblRegistro.setBackground(new Color(0,30,70));
    }//GEN-LAST:event_lblRegistroMousePressed

    private void lblRegistroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseReleased
        lblRegistro.setBackground(new Color(0,0,25));
    }//GEN-LAST:event_lblRegistroMouseReleased

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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateIngresoEmpleado;
    private com.toedter.calendar.JDateChooser DateRegistros;
    private com.toedter.calendar.JDateChooser DateSalidaEmpleado;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnAñadirReg;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnCargarImagenProducto;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarReg;
    private javax.swing.JButton btnExcelProveedores;
    private javax.swing.JButton btnExcelProveedores1;
    private javax.swing.JButton btnExcelProveedores2;
    private javax.swing.JButton btnExcelProveedores3;
    private javax.swing.JButton btnExcelProveedores4;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnModificarReg;
    private javax.swing.JButton btnNuevoReg;
    private javax.swing.JButton btnPDFProveedores;
    private javax.swing.JButton btnPDFProveedores1;
    private javax.swing.JButton btnPDFProveedores2;
    private javax.swing.JButton btnPDFProveedores3;
    private javax.swing.JButton btnPDFProveedores4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblApeEmpleado;
    private javax.swing.JLabel lblBienve;
    private javax.swing.JLabel lblCantidadProducto;
    private javax.swing.JLabel lblCelEmpleado;
    private javax.swing.JLabel lblCelProveedor;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblCorrEmpleado;
    private javax.swing.JLabel lblCorrProveedor;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblDirEmpleado;
    private javax.swing.JLabel lblDireProveedor;
    private javax.swing.JLabel lblDocEmpleado;
    private javax.swing.JLabel lblEgresosMes;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblEmpresaProveedor;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaProducto;
    private javax.swing.JLabel lblFechaProveedor;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblGenerarExcel;
    private javax.swing.JLabel lblGenerarExcel1;
    private javax.swing.JLabel lblGenerarExcel2;
    private javax.swing.JLabel lblGenerarExcel3;
    private javax.swing.JLabel lblGenerarExcel4;
    private javax.swing.JLabel lblGenerarExcel5;
    private javax.swing.JLabel lblGenerarExcel6;
    private javax.swing.JLabel lblGenerarExcel7;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenProducto;
    private javax.swing.JLabel lblIngresosMes;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMini;
    private javax.swing.JLabel lblNomEmpleado;
    private javax.swing.JLabel lblNomProducto;
    private javax.swing.JLabel lblNomina;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProvProducto;
    private javax.swing.JLabel lblProvee;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalCuentasMes;
    private javax.swing.JLabel lblTotalProducto;
    private javax.swing.JLabel lblVendedorProveedor;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlConsultarEmpleados;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JPanel pnlImagenProducto;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlPPal;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JPanel pnlProveedores;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtApeEmpleado;
    private javax.swing.JTextField txtCantProducto;
    private javax.swing.JTextField txtCelEmpleado;
    private javax.swing.JTextField txtCelProveedor;
    private javax.swing.JTextField txtCorrEmpleado;
    private javax.swing.JTextField txtCorrProveedor;
    private javax.swing.JTextField txtDireEmpleado;
    private javax.swing.JTextField txtDireProveedor;
    private javax.swing.JTextField txtDocIdEmpleado;
    private javax.swing.JTextField txtEgresoMes;
    private javax.swing.JTextField txtEmpresaProveedor;
    private javax.swing.JTextField txtImagenProducto;
    private javax.swing.JTextField txtIngresosMes;
    private javax.swing.JTextField txtNomEmpleado;
    private javax.swing.JTextField txtNomProducto;
    private javax.swing.JTextField txtNomina;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtProveedorProducto;
    private javax.swing.JTextField txtTotalCuentasMes;
    private javax.swing.JTextField txtTotalProducto;
    private javax.swing.JTextField txtVendedorProveedor;
    // End of variables declaration//GEN-END:variables
}
