/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.PeliculaBD;
import controlador.FuncionBD;
import javax.swing.JOptionPane;
import modelo.Pelicula;
import modelo.Funcion;

public class VntMenu extends javax.swing.JFrame {

    Pelicula objPeli = null;
    Funcion objFuncion = null; 
    Principal objPrin = null;
    PeliculaBD pelBD =  new PeliculaBD();
    FuncionBD funBD = new FuncionBD();
    
    public VntMenu() {
        initComponents();
    }
    
    public VntMenu(Pelicula objPeli, Funcion objFuncion, Principal objPrin){
        
        this.objPeli = objPeli;
        this.objFuncion = objFuncion;
        this.objPrin = objPrin;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bntCerrarSesion = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblDuracionPeli = new javax.swing.JLabel();
        cbGeneroPeli = new javax.swing.JComboBox<>();
        lblIdiomaPeli = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lblGeneroPeli = new javax.swing.JLabel();
        tfDuracionPeli = new javax.swing.JTextField();
        lblCodigoPeli = new javax.swing.JLabel();
        tfCodigoPeli = new javax.swing.JTextField();
        cbClasificacion = new javax.swing.JComboBox<>();
        cbIdiomaPeli = new javax.swing.JComboBox<>();
        btnGuardarPeli = new javax.swing.JButton();
        lblNombrePeli = new javax.swing.JLabel();
        tfNombrePeli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bntmostrarPeli = new javax.swing.JButton();
        lblEditarPersona1 = new javax.swing.JLabel();
        bntBuscarPeli = new javax.swing.JButton();
        btnEliminarPeli = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbNumeroSala = new javax.swing.JComboBox<>();
        lblTipoSala = new javax.swing.JLabel();
        lblNumeroSala = new javax.swing.JLabel();
        lblHoraFuncion = new javax.swing.JLabel();
        tfHoraFuncion = new javax.swing.JTextField();
        tfCapacidadFuncion = new javax.swing.JTextField();
        btnGuardarFuncion = new javax.swing.JButton();
        lblNombreFuncion = new javax.swing.JLabel();
        lblCapacidadFuncion = new javax.swing.JLabel();
        tfNombreFuncion = new javax.swing.JTextField();
        lblEditarPersona = new javax.swing.JLabel();
        cbTipoSala = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnBuscarFuncion = new javax.swing.JButton();
        btnMostarfun = new javax.swing.JButton();
        btnEliminarFuncion = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CINEDL");

        bntCerrarSesion.setText("Cerrar Sesión");
        bntCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntCerrarSesion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblDuracionPeli.setIcon(new javax.swing.ImageIcon("C:\\Users\\joab9\\Desktop\\CETI\\3er semestre\\tercer parcial\\POE\\proyectoPOE\\RentaPelis\\src\\imagenes proyecto\\DuracionPeli.png")); // NOI18N
        lblDuracionPeli.setText("Duración:");

        cbGeneroPeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "suspenso", "acción", "drama", "terror", "comedia", " " }));

        lblIdiomaPeli.setIcon(new javax.swing.ImageIcon("C:\\Users\\joab9\\Desktop\\CETI\\3er semestre\\tercer parcial\\POE\\proyectoPOE\\RentaPelis\\src\\imagenes proyecto\\IdiomaPeli.png")); // NOI18N
        lblIdiomaPeli.setText("Idioma:");

        lblClasificacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\joab9\\Desktop\\CETI\\3er semestre\\tercer parcial\\POE\\proyectoPOE\\RentaPelis\\src\\imagenes proyecto\\ClasifiacionPelis.png")); // NOI18N
        lblClasificacion.setText("Clasificación:");

        lblGeneroPeli.setIcon(new javax.swing.ImageIcon("C:\\Users\\joab9\\Desktop\\CETI\\3er semestre\\tercer parcial\\POE\\proyectoPOE\\RentaPelis\\src\\imagenes proyecto\\GeneroPeili.png")); // NOI18N
        lblGeneroPeli.setText("Género:");

        tfDuracionPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDuracionPeliActionPerformed(evt);
            }
        });

        lblCodigoPeli.setIcon(new javax.swing.ImageIcon("C:\\Users\\joab9\\Desktop\\CETI\\3er semestre\\tercer parcial\\POE\\proyectoPOE\\RentaPelis\\src\\imagenes proyecto\\CodigoPelis.png")); // NOI18N
        lblCodigoPeli.setText("Código");

        tfCodigoPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoPeliActionPerformed(evt);
            }
        });

        cbClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AA - (infantil)", "A - (todo público)", "B - (12+)", "B15 - (15+)", "C - (18+)", "D - (contenido explícito)" }));

        cbIdiomaPeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Español (Castellano)", "Inglés (Subtitulado)" }));
        cbIdiomaPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdiomaPeliActionPerformed(evt);
            }
        });

        btnGuardarPeli.setText("Guardar");
        btnGuardarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPeliActionPerformed(evt);
            }
        });

        lblNombrePeli.setText("Nombre:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Clasificación", "Duración", "Género", "Imagen", "Idioma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bntmostrarPeli.setText("Mostrar");
        bntmostrarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntmostrarPeliActionPerformed(evt);
            }
        });

        lblEditarPersona1.setFont(new java.awt.Font("Segoe UI Light", 0, 25)); // NOI18N
        lblEditarPersona1.setText("Agregar Película");

        bntBuscarPeli.setText("Buscar");
        bntBuscarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarPeliActionPerformed(evt);
            }
        });

        btnEliminarPeli.setText("Eliminar");
        btnEliminarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPeliActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
        btnImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\joab9\\Desktop\\CETI\\3er semestre\\tercer parcial\\POE\\proyectoPOE\\RentaPelis\\src\\imagenes proyecto\\imagenPeli.png")); // NOI18N
        btnImagen.setText("seleccionar imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });

>>>>>>> f7b96602d6461df51971a340b6765c4ec8f6f639
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblIdiomaPeli)
                        .addGap(30, 30, 30)
                        .addComponent(cbIdiomaPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblClasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblCodigoPeli)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(tfCodigoPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntBuscarPeli))
                                .addComponent(cbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(bntmostrarPeli))
                                .addComponent(lblGeneroPeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbGeneroPeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnEliminarPeli)
                                    .addGap(52, 52, 52))))))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDuracionPeli, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombrePeli, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfNombrePeli, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDuracionPeli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnGuardarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblEditarPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblEditarPersona1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntmostrarPeli)
                            .addComponent(btnEliminarPeli)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigoPeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCodigoPeli)
                                .addComponent(tfNombrePeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombrePeli)
                                .addComponent(bntBuscarPeli)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuracionPeli)
                            .addComponent(tfDuracionPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClasificacion))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGeneroPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbGeneroPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIdiomaPeli)
                                    .addComponent(cbIdiomaPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblImagen)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btnGuardarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Películas", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cbNumeroSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lblTipoSala.setText("Tipo de Sala");

        lblNumeroSala.setText("Número de sala:");

        lblHoraFuncion.setText("Hora:");

        tfHoraFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraFuncionActionPerformed(evt);
            }
        });

        tfCapacidadFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCapacidadFuncionActionPerformed(evt);
            }
        });

        btnGuardarFuncion.setText("Guardar");
        btnGuardarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFuncionActionPerformed(evt);
            }
        });

        lblNombreFuncion.setText("Código Funcion");

        lblCapacidadFuncion.setText("Capacidad:");

        lblEditarPersona.setFont(new java.awt.Font("Segoe UI Light", 0, 25)); // NOI18N
        lblEditarPersona.setText("Crear Función");

        cbTipoSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tradicional", "3D", "4D", "Macro XE", "VIP", "Infantil" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Hora", "Número de Sala", "Capacidad", "Tipo de Sala"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnBuscarFuncion.setText("Buscar");
        btnBuscarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFuncionActionPerformed(evt);
            }
        });

        btnMostarfun.setText("Mostrar");
        btnMostarfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarfunActionPerformed(evt);
            }
        });

        btnEliminarFuncion.setText("Eliminar");
        btnEliminarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFuncionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombreFuncion)
                        .addGap(18, 18, 18)
                        .addComponent(tfNombreFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarFuncion)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCapacidadFuncion)
                                    .addComponent(lblHoraFuncion))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfHoraFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(tfCapacidadFuncion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblNumeroSala)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbNumeroSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblTipoSala)
                                        .addGap(38, 38, 38)
                                        .addComponent(cbTipoSala, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnMostarfun)
                                .addGap(38, 38, 38)
                                .addComponent(btnEliminarFuncion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGap(82, 82, 82))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEditarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblEditarPersona)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarFuncion)
                    .addComponent(tfNombreFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreFuncion))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoraFuncion)
                            .addComponent(tfHoraFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCapacidadFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCapacidadFuncion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroSala)
                            .addComponent(cbNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoSala)
                            .addComponent(cbTipoSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostarfun)
                    .addComponent(btnEliminarFuncion))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funciones", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDuracionPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDuracionPeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDuracionPeliActionPerformed

    private void tfCodigoPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoPeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoPeliActionPerformed

    private void tfCapacidadFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCapacidadFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCapacidadFuncionActionPerformed

    private void tfHoraFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraFuncionActionPerformed

    private void cbIdiomaPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdiomaPeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdiomaPeliActionPerformed

    private void bntmostrarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntmostrarPeliActionPerformed

      
    }//GEN-LAST:event_bntmostrarPeliActionPerformed

    private void btnGuardarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPeliActionPerformed

        objPeli.setCodigo(tfCodigoPeli.getText());
        objPeli.setNombre(tfNombrePeli.getText());
        objPeli.setDuracion(tfDuracionPeli.getText());
        objPeli.setClasificacion(cbClasificacion.getSelectedItem().toString());
        objPeli.setGenero(cbGeneroPeli.getSelectedItem().toString());
        objPeli.setIdioma(cbIdiomaPeli.getSelectedItem().toString());
        
        pelBD.abrir();
        pelBD.insertarRegistro(objPeli);
        pelBD.cerrar();
        
        JOptionPane.showMessageDialog(this, "La pelicula se registró de forma correcta");

        limpiarCampos();
        
    }//GEN-LAST:event_btnGuardarPeliActionPerformed

    private void bntBuscarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarPeliActionPerformed

        pelBD.abrir();
        objPeli = pelBD.consultarRegistro(tfCodigoPeli.getText());
        
        if(objPeli != null){
            JOptionPane.showMessageDialog(this, "La pelicula existe");
            tfCodigoPeli.setEditable(true);
            tfNombrePeli.setEditable(true);
            tfDuracionPeli.setEditable(true);
            
          
          
        }else{
            JOptionPane.showMessageDialog(this, "La pelicula no se encontró en la BD");
        }
        
        pelBD.cerrar();
    }//GEN-LAST:event_bntBuscarPeliActionPerformed

    private void btnEliminarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPeliActionPerformed
        
        pelBD.abrir();
        objPeli = pelBD.consultarRegistro(tfCodigoPeli.getText());
        
        if(objPeli != null){
            
            pelBD.eliminarRegistro(objPeli);
        }else{
                JOptionPane.showMessageDialog(this, "La pelicula a eliminar no existe en la BD");

        }pelBD.cerrar();
                
    }//GEN-LAST:event_btnEliminarPeliActionPerformed

    private void btnGuardarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFuncionActionPerformed

        objFuncion.setCodigoPelicula(tfNombreFuncion.getText());
        objFuncion.setHora(Integer.parseInt(tfHoraFuncion.getText()));
        objFuncion.setCapacidad(Integer.parseInt(tfCapacidadFuncion.getText()));
        objFuncion.setNumeroDeSala(Integer.parseInt(cbNumeroSala.getSelectedItem().toString()));
        objFuncion.setTipoDeSala(cbTipoSala.getSelectedItem().toString());
    }//GEN-LAST:event_btnGuardarFuncionActionPerformed

    private void btnBuscarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionActionPerformed
        
        funBD.abrir();
        objFuncion = funBD.consultarRegistro(tfNombreFuncion.getText());
        
        if(objFuncion != null){
            JOptionPane.showMessageDialog(this, "La funcion existe");
            tfNombreFuncion.setEditable(true);
            tfHoraFuncion.setEditable(true);
            tfCapacidadFuncion.setEditable(true);

        }else{
             JOptionPane.showMessageDialog(this, "La funcion no existe");

        }funBD.cerrar();
        
    }//GEN-LAST:event_btnBuscarFuncionActionPerformed

    private void bntCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCerrarSesionActionPerformed
        Principal objPrincipal = new Principal();
        objPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntCerrarSesionActionPerformed

    private void btnEliminarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFuncionActionPerformed
        
        funBD.abrir();
        objFuncion = funBD.consultarRegistro(tfNombreFuncion.getText());
        
        if(objFuncion != null){
            
            funBD.eliminarRegistro(objFuncion);
        }else{
                JOptionPane.showMessageDialog(this, "La funcion a eliminar no existe en la BD");

        }funBD.cerrar();
        
    }//GEN-LAST:event_btnEliminarFuncionActionPerformed

    private void btnMostarfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarfunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostarfunActionPerformed

    public void limpiarCampos(){
        
        tfCodigoPeli.setText("");
        tfNombrePeli.setText("");
        tfDuracionPeli.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(VntMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VntMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VntMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VntMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VntMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscarPeli;
    private javax.swing.JButton bntCerrarSesion;
    private javax.swing.JButton bntmostrarPeli;
    private javax.swing.JButton btnBuscarFuncion;
    private javax.swing.JButton btnEliminarFuncion;
    private javax.swing.JButton btnEliminarPeli;
    private javax.swing.JButton btnGuardarFuncion;
    private javax.swing.JButton btnGuardarPeli;
    private javax.swing.JButton btnMostarfun;
    private javax.swing.JComboBox<String> cbClasificacion;
    private javax.swing.JComboBox<String> cbGeneroPeli;
    private javax.swing.JComboBox<String> cbIdiomaPeli;
    private javax.swing.JComboBox<String> cbNumeroSala;
    private javax.swing.JComboBox<String> cbTipoSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCapacidadFuncion;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblCodigoPeli;
    private javax.swing.JLabel lblDuracionPeli;
    private javax.swing.JLabel lblEditarPersona;
    private javax.swing.JLabel lblEditarPersona1;
    private javax.swing.JLabel lblGeneroPeli;
    private javax.swing.JLabel lblHoraFuncion;
    private javax.swing.JLabel lblIdiomaPeli;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreFuncion;
    private javax.swing.JLabel lblNombrePeli;
    private javax.swing.JLabel lblNumeroSala;
    private javax.swing.JLabel lblTipoSala;
    private javax.swing.JTextField tfCapacidadFuncion;
    private javax.swing.JTextField tfCodigoPeli;
    private javax.swing.JTextField tfDuracionPeli;
    private javax.swing.JTextField tfHoraFuncion;
    private javax.swing.JTextField tfNombreFuncion;
    private javax.swing.JTextField tfNombrePeli;
    // End of variables declaration//GEN-END:variables
}
