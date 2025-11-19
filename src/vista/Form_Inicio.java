package vista;

import CRUD.RegistroUsuario;
import java.awt.Color;
import java.util.Date;
import bd.CInicio;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author k-ort
 */
public class Form_Inicio extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Form_Inicio.class.getName());

    int xMouse, yMouse;

    public Form_Inicio() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exit_txt = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jtxt_user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        jtxt_paswd = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jbtn_Entrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtn_singUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(204, 204, 204));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5080739.jpg"))); // NOI18N

        Logo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cocinero.png"))); // NOI18N
        Logo.setText("BIFUD");

        iniciarsesion.setBackground(new java.awt.Color(115, 196, 173));
        iniciarsesion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        iniciarsesion.setForeground(new java.awt.Color(115, 196, 173));
        iniciarsesion.setText("INICIAR SESION");

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

        exit_txt.setBackground(new java.awt.Color(255, 255, 255));
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

        usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        usuario.setText("USUARIO");

        jtxt_user.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtxt_user.setForeground(new java.awt.Color(204, 204, 204));
        jtxt_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxt_user.setText("Ingrese su nombre de usuario");
        jtxt_user.setBorder(null);
        jtxt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxt_userMousePressed(evt);
            }
        });
        jtxt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_userActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 215, 198));

        contraseña.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        contraseña.setText("CONTRASEÑA");

        jtxt_paswd.setForeground(new java.awt.Color(204, 204, 204));
        jtxt_paswd.setText("********");
        jtxt_paswd.setBorder(null);
        jtxt_paswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxt_paswdMousePressed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(103, 197, 177));
        jSeparator2.setForeground(new java.awt.Color(204, 215, 198));

        jbtn_Entrar.setBackground(new java.awt.Color(115, 196, 173));
        jbtn_Entrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Entrar.setText("Login");
        jbtn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_EntrarActionPerformed(evt);
            }
        });

        jLabel1.setText("No tengo una cuenta");

        jbtn_singUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_singUp.setForeground(new java.awt.Color(255, 51, 51));
        jbtn_singUp.setText("Sign Up");
        jbtn_singUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_singUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jtxt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jbtn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jtxt_paswd, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jbtn_singUp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jtxt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jtxt_paswd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jbtn_singUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void jtxt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_userActionPerformed


    }//GEN-LAST:event_jtxt_userActionPerformed

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

    private void jtxt_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_userMousePressed
        if (jtxt_user.getText().equals("Ingrese su nombre de usuario")) {
            jtxt_user.setText("");
            jtxt_user.setForeground(Color.black);
        }
        if (String.valueOf(jtxt_paswd.getPassword()).isEmpty()) {
            jtxt_paswd.setText("********");
            jtxt_paswd.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtxt_userMousePressed

    private void jtxt_paswdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_paswdMousePressed
        if (String.valueOf(jtxt_paswd.getPassword()).equals("********")) {
            jtxt_paswd.setText("");
            jtxt_paswd.setForeground(Color.black);
        }
        if (jtxt_user.getText().isEmpty()) {
            jtxt_user.setText("Ingrese su nombre de usuario");
            jtxt_user.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtxt_paswdMousePressed

    private void jbtn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_EntrarActionPerformed

        String nombre = jtxt_user.getText().trim();
        String contrasena = String.valueOf(jtxt_paswd.getPassword()).trim();

        if (nombre.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa usuario y contraseña.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);

            if (nombre.isEmpty()) {
                jtxt_user.requestFocusInWindow();
            } else {
                jtxt_paswd.requestFocusInWindow();
            }

            return;
        }

        Usuario u = new Usuario(nombre, contrasena);
        RegistroUsuario reg = new RegistroUsuario();

        if (reg.validarUsuario(u)) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + nombre, "Acceso concedido", JOptionPane.INFORMATION_MESSAGE);

            Form_MenuPrincipal menu = new Form_MenuPrincipal();
            menu.setVisible(true);
            this.dispose(); 

        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
            jtxt_user.requestFocusInWindow();
        }
    }//GEN-LAST:event_jbtn_EntrarActionPerformed

    private void jbtn_singUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_singUpActionPerformed
        Form_RegistroUsuario menu = new Form_RegistroUsuario();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_singUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Form_Inicio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel background;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel exit_txt;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel head;
    private javax.swing.JLabel iniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_Entrar;
    private javax.swing.JButton jbtn_singUp;
    private javax.swing.JPasswordField jtxt_paswd;
    private javax.swing.JTextField jtxt_user;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
