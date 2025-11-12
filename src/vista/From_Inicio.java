/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.util.Locale;

/**
 *
 * @author k-ort
 */
public class From_Inicio extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(From_Inicio.class.getName());

    int xMouse, yMouse;

    public From_Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jtxt_nombre_empresa = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exit_txt = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        txt_paswd = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_login = new javax.swing.JPanel();
        btn_entrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(204, 204, 204));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cocinero.png"))); // NOI18N
        imagen.setLabelFor(imagen);
        bg.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 280, 130));

        jtxt_nombre_empresa.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jtxt_nombre_empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtxt_nombre_empresa.setText("EMPRESA DE COCINA");
        bg.add(jtxt_nombre_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 280, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background-7452427_640.jpg"))); // NOI18N
        bg.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, 510));

        Logo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guantes-de-cocina (1).png"))); // NOI18N
        Logo.setText("LOGO");
        bg.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 70));

        iniciarsesion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        iniciarsesion.setText("INICIAR SESION");
        bg.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 40));

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        exit_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_txt.setText("X");
        exit_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addComponent(exit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 769, Short.MAX_VALUE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        bg.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        usuario.setText("USUARIO");
        bg.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 30));

        txt_user.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(204, 204, 204));
        txt_user.setText("Ingrese su nombre de usuario");
        txt_user.setBorder(null);
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_userMousePressed(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        bg.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 390, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 360, 10));

        contraseña.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        contraseña.setText("CONTRASEÑA");
        bg.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 30));

        txt_paswd.setForeground(new java.awt.Color(204, 204, 204));
        txt_paswd.setText("********");
        txt_paswd.setBorder(null);
        txt_paswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_paswdMousePressed(evt);
            }
        });
        bg.add(txt_paswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 360, 20));

        btn_login.setBackground(new java.awt.Color(0, 134, 190));

        btn_entrar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_entrar.setText("ENTRAR");
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_loginLayout = new javax.swing.GroupLayout(btn_login);
        btn_login.setLayout(btn_loginLayout);
        btn_loginLayout.setHorizontalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_loginLayout.setVerticalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void exit_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_txtMouseClicked

    private void exit_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseEntered
        exitbtn.setBackground(Color.red);
    }//GEN-LAST:event_exit_txtMouseEntered

    private void exit_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseExited
        exitbtn.setBackground(Color.white);
    }//GEN-LAST:event_exit_txtMouseExited

    private void btn_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseEntered
        btn_login.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btn_entrarMouseEntered

    private void btn_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseExited
        btn_login.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btn_entrarMouseExited

    private void txt_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMousePressed
        if (txt_user.getText().equals("Ingrese su nombre de usuario")) {
            txt_user.setText("");
            txt_user.setForeground(Color.black);
        }
        if (String.valueOf(txt_paswd.getPassword()).isEmpty()) {
            txt_paswd.setText("********");
            txt_paswd.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_userMousePressed

    private void txt_paswdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_paswdMousePressed
        if (String.valueOf(txt_paswd.getPassword()).equals("********")) {
            txt_paswd.setText("");
            txt_paswd.setForeground(Color.black);
        }
        if (txt_user.getText().isEmpty()) {
            txt_user.setText("Ingrese su nombre de usuario");
            txt_user.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_paswdMousePressed

    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this,"Intento de login con los datos:\n Usuario: " + txt_user.getText() + "\n Contraseña: " + String.valueOf(txt_paswd.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_entrarMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new From_Inicio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel background;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btn_entrar;
    private javax.swing.JPanel btn_login;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel exit_txt;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel head;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel iniciarsesion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jtxt_nombre_empresa;
    private javax.swing.JPasswordField txt_paswd;
    private javax.swing.JTextField txt_user;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
