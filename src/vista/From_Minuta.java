
package vista;


import java.awt.Color;
import javax.swing.JOptionPane;
import CRUD.MinutaPP;
import java.util.Date;

/**
 *
 * @author k-ort
 */
public class From_Minuta extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(From_Minuta.class.getName());


    public From_Minuta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    public void limpiar() {
        //agregue esto para que se pueda editar el texto 
        
        this.jtxt_nombre.setText("");
        this.jtxt_fecha.setText("");
        this.jtextA_descripcion.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_datos = new javax.swing.JTable();
        jpan_Opciones = new javax.swing.JPanel();
        jtbtn_guardar = new javax.swing.JButton();
        jbtn_abrirDetalle = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_Limpiar = new javax.swing.JButton();
        jbtn_Volver = new javax.swing.JButton();
        jbtn_Salir = new javax.swing.JButton();
        jbtn_Actualizar = new javax.swing.JButton();
        jpnl_titulo = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jpnl_logo = new javax.swing.JPanel();
        jpnl_menuDatos = new javax.swing.JPanel();
        jlbl_tipo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jlbl_platillo = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_fecha = new javax.swing.JTextField();
        jlbl_descripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtextA_descripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jlbl_ID = new javax.swing.JLabel();
        jtxt_id = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbl_datos.setAutoCreateRowSorter(true);
        jtbl_datos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Detalle", "Tipo", "Plato", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_datos.setMaximumSize(new java.awt.Dimension(1180, 80));
        jScrollPane1.setViewportView(jtbl_datos);

        jpan_Opciones.setBackground(new java.awt.Color(248, 246, 231));

        jtbtn_guardar.setBackground(new java.awt.Color(204, 215, 198));
        jtbtn_guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtbtn_guardar.setText("Guardar");
        jtbtn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtn_guardarActionPerformed(evt);
            }
        });

        jbtn_abrirDetalle.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_abrirDetalle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_abrirDetalle.setText("Detalle del inventario");
        jbtn_abrirDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_abrirDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_abrirDetalleActionPerformed(evt);
            }
        });

        jbtn_eliminar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jbtn_Limpiar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Limpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Limpiar.setText("Limpiar");
        jbtn_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_LimpiarActionPerformed(evt);
            }
        });

        jbtn_Volver.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Volver.setText("Volver");
        jbtn_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_VolverActionPerformed(evt);
            }
        });

        jbtn_Salir.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Salir.setText("Salir");
        jbtn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_SalirActionPerformed(evt);
            }
        });

        jbtn_Actualizar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Actualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Actualizar.setText("Agregar Plato");
        jbtn_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpan_OpcionesLayout = new javax.swing.GroupLayout(jpan_Opciones);
        jpan_Opciones.setLayout(jpan_OpcionesLayout);
        jpan_OpcionesLayout.setHorizontalGroup(
            jpan_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpan_OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpan_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_abrirDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbtn_guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpan_OpcionesLayout.setVerticalGroup(
            jpan_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpan_OpcionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbtn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_abrirDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnl_titulo.setBackground(new java.awt.Color(248, 246, 231));

        jLabel14.setBackground(new java.awt.Color(204, 215, 198));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(115, 196, 173));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Minuta de la Empresa");

        javax.swing.GroupLayout jpnl_tituloLayout = new javax.swing.GroupLayout(jpnl_titulo);
        jpnl_titulo.setLayout(jpnl_tituloLayout);
        jpnl_tituloLayout.setHorizontalGroup(
            jpnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnl_tituloLayout.setVerticalGroup(
            jpnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_tituloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jpnl_logo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnl_logoLayout = new javax.swing.GroupLayout(jpnl_logo);
        jpnl_logo.setLayout(jpnl_logoLayout);
        jpnl_logoLayout.setHorizontalGroup(
            jpnl_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnl_logoLayout.setVerticalGroup(
            jpnl_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnl_menuDatos.setBackground(new java.awt.Color(204, 215, 198));
        jpnl_menuDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jlbl_tipo.setText("Tipo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diaria", "Semanal", "Mensual" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha");

        jlbl_platillo.setText("Nombre del Platillo");

        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jlbl_descripcion.setText("Descripcion");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 0));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 0));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 0));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 0));

        jtextA_descripcion.setColumns(20);
        jtextA_descripcion.setRows(5);
        jScrollPane2.setViewportView(jtextA_descripcion);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" dd-mm-aaaa");

        jlbl_ID.setText("ID");

        jSeparator4.setBackground(new java.awt.Color(102, 102, 0));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jpnl_menuDatosLayout = new javax.swing.GroupLayout(jpnl_menuDatos);
        jpnl_menuDatos.setLayout(jpnl_menuDatosLayout);
        jpnl_menuDatosLayout.setHorizontalGroup(
            jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                        .addComponent(jlbl_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                                .addComponent(jlbl_platillo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                                    .addComponent(jlbl_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                        .addComponent(jlbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnl_menuDatosLayout.setVerticalGroup(
            jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl_menuDatosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_menuDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_platillo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnl_menuDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpan_Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                    .addComponent(jpnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnl_menuDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnl_menuDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpan_Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_abrirDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_abrirDetalleActionPerformed
        From_MinutaDetalle menu = new From_MinutaDetalle();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_abrirDetalleActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
//        //obtiene el rut ingresado por el usuario
//        Date fecha = jtxt_fecha();
//
//        //inicializar el registro para llamar el metodo
//        MinutaPP MPP = new MinutaPP();
//
//        //devuelve el error si se aprieta borra y no hay rut escrito
//        if (rut.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Debes ingresar un RUT para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        //mensaje que pregunta si quieres, el 1 es mas que nada un indicador tipo de mensaje
//        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar?", "Aviso", 1);
//
//        //si o no para borrar y los error
//        if (opcion == JOptionPane.YES_OPTION) {
//            boolean eliminar = MPP.eliminar(fecha);
//            JOptionPane.showMessageDialog(this, "Minuta Eliminada", "Eliminado", 1);
//        } else {
//            JOptionPane.showMessageDialog(this, "Minuta NO Eliminada", "Eliminada", 2);
//        }
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jbtn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_LimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jbtn_LimpiarActionPerformed

    private void jbtn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_VolverActionPerformed
        Form_MenuPrincipal menu = new Form_MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_VolverActionPerformed

    private void jbtn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtn_SalirActionPerformed

    private void jtbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtn_guardarActionPerformed

    }//GEN-LAST:event_jtbtn_guardarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jbtn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ActualizarActionPerformed

    }//GEN-LAST:event_jbtn_ActualizarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new From_Minuta().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbtn_Actualizar;
    private javax.swing.JButton jbtn_Limpiar;
    private javax.swing.JButton jbtn_Salir;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JButton jbtn_abrirDetalle;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JLabel jlbl_ID;
    private javax.swing.JLabel jlbl_descripcion;
    private javax.swing.JLabel jlbl_platillo;
    private javax.swing.JLabel jlbl_tipo;
    private javax.swing.JPanel jpan_Opciones;
    private javax.swing.JPanel jpnl_logo;
    private javax.swing.JPanel jpnl_menuDatos;
    private javax.swing.JPanel jpnl_titulo;
    private javax.swing.JTable jtbl_datos;
    private javax.swing.JButton jtbtn_guardar;
    private javax.swing.JTextArea jtextA_descripcion;
    private javax.swing.JTextField jtxt_fecha;
    private javax.swing.JTextField jtxt_id;
    private javax.swing.JTextField jtxt_nombre;
    // End of variables declaration//GEN-END:variables
}
