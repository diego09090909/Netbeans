package vista;

import CRUD.MinutaDetallePP;
import javax.swing.JOptionPane;
import modelo.MinutaDetalle;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import modelo.Minuta;

/**
 *
 * @author ikari
 */
public class From_MinutaDetalle extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(From_MinutaDetalle.class.getName());

    /**
     * Creates new form From_MinutaDetalle
     */
    public From_MinutaDetalle() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void limpiar() {
        jtxt_IdDetalle.setText("");
        jtxt_Minuta.setText("");
        jtxt_Acompanamiento.setText("");
        jtxt_Plato.setText("");
        jtxt_Comida.setText("");
        jtxt_Bebida.setText("");
        jtxt_Postre.setText("");
        jtxt_Observaciones.setText("");

        jtxt_IdDetalle.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtble_detalleMinuta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbtn_Salir = new javax.swing.JButton();
        jbtn_Volver = new javax.swing.JButton();
        jbtn_Limpiar = new javax.swing.JButton();
        jbtn_Actualizar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_Buscar = new javax.swing.JButton();
        jbtn_listar = new javax.swing.JButton();
        jtbtn_agregar = new javax.swing.JButton();
        jbtn_detalleIngrediente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxt_IdDetalle = new javax.swing.JTextField();
        jtxt_Minuta = new javax.swing.JTextField();
        jtxt_Acompanamiento = new javax.swing.JTextField();
        jtxt_Plato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxt_Comida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxt_Bebida = new javax.swing.JTextField();
        jtxt_Postre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxt_Observaciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cocinero.png"))); // NOI18N
        jLabel13.setText("BIFUD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jtble_detalleMinuta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Minuta", "ID Detalle", "Comida", "Plato Principal", "Acompañamiento", "Postre", "Bebida", "Observacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtble_detalleMinuta);

        jPanel2.setBackground(new java.awt.Color(248, 246, 231));

        jbtn_Salir.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Salir.setText("Salir");
        jbtn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_SalirActionPerformed(evt);
            }
        });

        jbtn_Volver.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Volver.setText("Volver");
        jbtn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_VolverActionPerformed(evt);
            }
        });

        jbtn_Limpiar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Limpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Limpiar.setText("Limpiar");
        jbtn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_LimpiarActionPerformed(evt);
            }
        });

        jbtn_Actualizar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Actualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Actualizar.setText("Actualizar");
        jbtn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ActualizarActionPerformed(evt);
            }
        });

        jbtn_eliminar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jbtn_Buscar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_Buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_Buscar.setText("Buscar");
        jbtn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_BuscarActionPerformed(evt);
            }
        });

        jbtn_listar.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_listar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_listar.setText("Listar");
        jbtn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarActionPerformed(evt);
            }
        });

        jtbtn_agregar.setBackground(new java.awt.Color(204, 215, 198));
        jtbtn_agregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtbtn_agregar.setText("Agregar");
        jtbtn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtn_agregarActionPerformed(evt);
            }
        });

        jbtn_detalleIngrediente.setBackground(new java.awt.Color(204, 215, 198));
        jbtn_detalleIngrediente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtn_detalleIngrediente.setText("Ver detalle Ingredientes");
        jbtn_detalleIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_detalleIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbtn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_detalleIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_detalleIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(248, 246, 231));

        jLabel14.setBackground(new java.awt.Color(204, 215, 198));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(115, 196, 173));
        jLabel14.setText("Detalle de Minuta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 215, 198));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ingrese datos de minuta");

        jLabel2.setText("Id Detalle:");

        jLabel3.setText("Id Minuta:");

        jLabel4.setText("Acompañamiento:");

        jLabel10.setText("Plato Principal:");

        jtxt_IdDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_IdDetalleActionPerformed(evt);
            }
        });

        jLabel5.setText("Comida:");

        jLabel6.setText("Postre:");

        jLabel7.setText("Bebida:");

        jLabel8.setText("Observaciones:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxt_Minuta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(52, 52, 52)
                                        .addComponent(jtxt_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxt_IdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(98, 98, 98)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jtxt_Plato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_Postre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_Acompanamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_Minuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_Acompanamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jtxt_Postre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_IdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxt_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxt_Plato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtxt_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtn_SalirActionPerformed

    private void jbtn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_VolverActionPerformed
        Form_MenuPrincipal menu = new Form_MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_VolverActionPerformed

    private void jbtn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_LimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jbtn_LimpiarActionPerformed

    private void jbtn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ActualizarActionPerformed

        MinutaDetalle md = new MinutaDetalle();

// Crear objeto Minuta y asignar ID desde el TextField
        Minuta m = new Minuta();
        m.setIdMinuta(Integer.parseInt(jtxt_Minuta.getText()));

        md.setIdMinuta(m);

        md.setIdDetalle(Integer.parseInt(jtxt_IdDetalle.getText()));
        md.setComida(jtxt_Comida.getText());
        md.setPlatoPrincipal(jtxt_Plato.getText());
        md.setAcompanamiento(jtxt_Acompanamiento.getText());
        md.setPostre(jtxt_Postre.getText());
        md.setBebida(jtxt_Bebida.getText());
        md.setObservaciones(jtxt_Observaciones.getText());

// Llamas a tu DAO
        MinutaDetallePP dao = new MinutaDetallePP();

        if (dao.actualizar(md)) {
            JOptionPane.showMessageDialog(this, "Registro actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el registro");
        }
    }//GEN-LAST:event_jbtn_ActualizarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed

        int fila = jtble_detalleMinuta.getSelectedRow();

        // Validar selección
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirmación
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar este registro?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion != JOptionPane.YES_OPTION) {
            return; // Si el usuario cancela, no se elimina nada
        }

        // Obtener ID desde la tabla (columna 0)
        int idDetalle = Integer.parseInt(jtble_detalleMinuta.getValueAt(fila, 0).toString());

        // Llamar al método eliminar()
        MinutaDetallePP dao = new MinutaDetallePP();
        boolean eliminado = dao.eliminar(idDetalle);

        if (eliminado) {
            JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");

        } else {
            JOptionPane.showMessageDialog(this, "ERROR al eliminar el registro.");
        }
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jbtn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_BuscarActionPerformed

        if (jtxt_IdDetalle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID de detalle para buscar.");
            return;
        }

        int id = Integer.parseInt(jtxt_IdDetalle.getText());

        MinutaDetallePP pp = new MinutaDetallePP();
        MinutaDetalle min = pp.buscarPorId(id);

        if (min != null) {
            jtxt_IdDetalle.setText(String.valueOf(min.getIdDetalle()));
            jtxt_Minuta.setText(String.valueOf(min.getIdMinuta()));
            jtxt_Acompanamiento.setText(min.getAcompanamiento());
            jtxt_Plato.setText(min.getPlatoPrincipal());
            jtxt_Bebida.setText(min.getBebida());
            jtxt_Postre.setText(min.getPostre());
            jtxt_Observaciones.setText(min.getObservaciones());
        } else {
            JOptionPane.showMessageDialog(this, "No existe un registro con ese ID.");
        }

    }//GEN-LAST:event_jbtn_BuscarActionPerformed
    private void jbtn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarActionPerformed

        MinutaDetallePP reg = new MinutaDetallePP();
        DefaultTableModel modelo = (DefaultTableModel) this.jtble_detalleMinuta.getModel();
        modelo.setRowCount(0); // Limpiar tabla

        List<MinutaDetalle> lista = reg.listar(); // Obtener todo el personal

        for (MinutaDetalle min : lista) {
            modelo.addRow(new Object[]{
                min.getIdDetalle(),
                min.getIdMinuta(),
                min.getComida(),
                min.getPlatoPrincipal(),
                min.getAcompanamiento(),
                min.getPostre(),
                min.getBebida(),
                min.getObservaciones()
            });
        }
    }//GEN-LAST:event_jbtn_listarActionPerformed

    private void jtbtn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtn_agregarActionPerformed


        Minuta m = new Minuta();
        m.setIdMinuta(Integer.parseInt(jtxt_Minuta.getText()));


        MinutaDetalle md = new MinutaDetalle();

        md.setIdMinuta(m); 
        md.setIdDetalle(Integer.parseInt(jtxt_IdDetalle.getText()));
        md.setComida(jtxt_Comida.getText());
        md.setPlatoPrincipal(jtxt_Plato.getText());
        md.setAcompanamiento(jtxt_Acompanamiento.getText());
        md.setPostre(jtxt_Postre.getText());
        md.setBebida(jtxt_Bebida.getText());
        md.setObservaciones(jtxt_Observaciones.getText());


        MinutaDetallePP pp = new MinutaDetallePP();
        boolean exito = pp.insertar(md);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Detalle agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "ERROR al agregar el detalle.");
        }
    }//GEN-LAST:event_jtbtn_agregarActionPerformed

    private void jtxt_IdDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_IdDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_IdDetalleActionPerformed

    private void jbtn_detalleIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_detalleIngredienteActionPerformed
        Form_DetalleIngrediente menu = new Form_DetalleIngrediente();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_detalleIngredienteActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
//            logger.log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> new From_MinutaDetalle().setVisible(true));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_Actualizar;
    private javax.swing.JButton jbtn_Buscar;
    private javax.swing.JButton jbtn_Limpiar;
    private javax.swing.JButton jbtn_Salir;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JButton jbtn_detalleIngrediente;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_listar;
    private javax.swing.JTable jtble_detalleMinuta;
    private javax.swing.JButton jtbtn_agregar;
    private javax.swing.JTextField jtxt_Acompanamiento;
    private javax.swing.JTextField jtxt_Bebida;
    private javax.swing.JTextField jtxt_Comida;
    private javax.swing.JTextField jtxt_IdDetalle;
    private javax.swing.JTextField jtxt_Minuta;
    private javax.swing.JTextField jtxt_Observaciones;
    private javax.swing.JTextField jtxt_Plato;
    private javax.swing.JTextField jtxt_Postre;
    // End of variables declaration//GEN-END:variables
}
