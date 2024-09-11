package store;
import Clases.Session;
import com.mycompany.login.FormLogin;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Venta");
        this.setResizable(false);
        this.setTitle("Main Menu");
        jLabelUser.setText(Session.getUsuario());
    }
 public Menu(String nombreUsuario) {
        initComponents();
        
    }
    private Icon normalIconface = new ImageIcon(getClass().getResource("/store/imagenes/Icono_facebook.png"));
    private Icon hoverIconface = new ImageIcon(getClass().getResource("/store/imagenes/Icono_facebook2.png"));
    
    private Icon normalIcontwit = new ImageIcon(getClass().getResource("/store/imagenes/Icono_twiter.png"));
    private Icon hoverIcontwit = new ImageIcon(getClass().getResource("/store/imagenes/Icono_twiter2.png"));
    
    private Icon normalIconinst = new ImageIcon(getClass().getResource("/store/imagenes/Icono_instagram.png"));
    private Icon hoverIconinst = new ImageIcon(getClass().getResource("/store/imagenes/Icono_instagram2.png"));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        conctactTxt = new javax.swing.JLabel();
        sobreTxt = new javax.swing.JLabel();
        jLabelfacebook = new javax.swing.JLabel();
        jLabelx = new javax.swing.JLabel();
        jLabelinstagram = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        proTxt = new javax.swing.JLabel();
        inTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser.setText("UserName");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 4, 100, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Perfil.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 80, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cerrar Sesión");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 80, -1));

        conctactTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        conctactTxt.setForeground(new java.awt.Color(255, 255, 255));
        conctactTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        conctactTxt.setText("Contactenos");
        conctactTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conctactTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conctactTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conctactTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conctactTxtMouseExited(evt);
            }
        });
        getContentPane().add(conctactTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 50, 100, 20));

        sobreTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        sobreTxt.setForeground(new java.awt.Color(255, 255, 255));
        sobreTxt.setText("Sobre Nosotros");
        sobreTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sobreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sobreTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sobreTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sobreTxtMouseExited(evt);
            }
        });
        getContentPane().add(sobreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 120, 20));

        jLabelfacebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelfacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Icono_facebook.png"))); // NOI18N
        jLabelfacebook.setText(" ");
        jLabelfacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelfacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelfacebookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelfacebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelfacebookMouseExited(evt);
            }
        });
        getContentPane().add(jLabelfacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 476, 30, 30));

        jLabelx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Icono_twiter.png"))); // NOI18N
        jLabelx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelxMouseExited(evt);
            }
        });
        getContentPane().add(jLabelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 476, 40, 30));

        jLabelinstagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelinstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Icono_instagram.png"))); // NOI18N
        jLabelinstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelinstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelinstagramMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelinstagramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelinstagramMouseExited(evt);
            }
        });
        getContentPane().add(jLabelinstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 476, 40, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/icono_correo.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 477, -1, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Icono_telefono.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 30, 30));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Social Media");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, -1, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SubliplaySAS@gmail.com");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, 40));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("3213328885");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Estaremos atentos!");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 20));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contactanos en caso de problermas con la web ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 410, 20));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nuestras vías de contacto");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 53)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Diseños Creativos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 560, 90));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 53)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hacemos ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 134, 270, 120));

        proTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        proTxt.setForeground(new java.awt.Color(255, 255, 255));
        proTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proTxt.setText("Productos");
        proTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proTxtMouseExited(evt);
            }
        });
        getContentPane().add(proTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 80, 20));

        inTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        inTxt.setForeground(new java.awt.Color(240, 97, 97));
        inTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inTxt.setText("Inicio");
        inTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inTxtMouseExited(evt);
            }
        });
        getContentPane().add(inTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/SubliPlay._1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Inicio.png"))); // NOI18N
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseClicked
    Productos Ventana2 = new Productos();
     this.setVisible(false);
            Ventana2.setVisible(true);
    }//GEN-LAST:event_proTxtMouseClicked

    private void inTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inTxtMouseEntered
        
    }//GEN-LAST:event_inTxtMouseEntered

    private void inTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inTxtMouseExited
        
    }//GEN-LAST:event_inTxtMouseExited

    private void proTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseEntered
        proTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_proTxtMouseEntered

    private void proTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseExited
        proTxt.setForeground(Color.white);
    }//GEN-LAST:event_proTxtMouseExited

    private void sobreTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseEntered
        sobreTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_sobreTxtMouseEntered

    private void sobreTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseExited
        sobreTxt.setForeground(Color.white);
    }//GEN-LAST:event_sobreTxtMouseExited

    private void sobreTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseClicked
        SobreNosotros Ventana2 = new SobreNosotros();
        this.setVisible(false);
        Ventana2.setVisible(true);
    }//GEN-LAST:event_sobreTxtMouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    FormLogin Ventana3 = new FormLogin();
        this.setVisible(false);
        Ventana3.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void conctactTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseClicked
    Contacto Ventana2 = new Contacto();
        this.setVisible(false);
        Ventana2.setVisible(true);    }//GEN-LAST:event_conctactTxtMouseClicked

    private void conctactTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseEntered
        conctactTxt.setForeground(new Color(240,97,97));    
    }//GEN-LAST:event_conctactTxtMouseEntered

    private void conctactTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseExited
        conctactTxt.setForeground(Color.white);
    }//GEN-LAST:event_conctactTxtMouseExited

    private void jLabelxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelxMouseEntered
    jLabelx.setIcon(hoverIcontwit);
    }//GEN-LAST:event_jLabelxMouseEntered

    private void jLabelfacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelfacebookMouseClicked
    try {
        // Define la URL que deseas abrir
        String url = "https://www.facebook.com/profile.php?id=61563602120345";
        
        // Verifica si Desktop es compatible con la acción de abrir una URL
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            // Crea un objeto URI con la URL
            URI uri = new URI(url);
            // Abre el enlace en el navegador predeterminado
            Desktop.getDesktop().browse(uri);
        }
    } catch (Exception e) {
        e.printStackTrace();  // Maneja cualquier excepción
    }

    }//GEN-LAST:event_jLabelfacebookMouseClicked

    private void jLabelfacebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelfacebookMouseEntered
    jLabelfacebook.setIcon(hoverIconface);    }//GEN-LAST:event_jLabelfacebookMouseEntered

    private void jLabelfacebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelfacebookMouseExited
    jLabelfacebook.setIcon(normalIconface);    }//GEN-LAST:event_jLabelfacebookMouseExited

    private void jLabelxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelxMouseExited
    jLabelx.setIcon(normalIcontwit);    }//GEN-LAST:event_jLabelxMouseExited

    private void jLabelinstagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinstagramMouseEntered
    jLabelinstagram.setIcon(hoverIconinst);    }//GEN-LAST:event_jLabelinstagramMouseEntered

    private void jLabelinstagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinstagramMouseExited
    jLabelinstagram.setIcon(normalIconinst);    }//GEN-LAST:event_jLabelinstagramMouseExited

    private void jLabelxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelxMouseClicked
    try {
        String url = "https://x.com/SubliPlay?t=veiQk5hQjeDtevNHOOtGxQ&s=08";
        
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            URI uri = new URI(url);
            Desktop.getDesktop().browse(uri);
        }
    } catch (Exception e) {
        e.printStackTrace();  
    }    }//GEN-LAST:event_jLabelxMouseClicked

    private void jLabelinstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinstagramMouseClicked
try {
        String url = "https://www.instagram.com/subliplaysas?igsh=MWp6bjR0MnVhbzNvcA==";
        
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            URI uri = new URI(url);
            Desktop.getDesktop().browse(uri);
        }
    } catch (Exception e) {
        e.printStackTrace();  }    }//GEN-LAST:event_jLabelinstagramMouseClicked
    
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    private int suma(int cantidad){
        cantidad = cantidad +1;        
        return cantidad;
    }
    private int resta(int cantidad){
        if(cantidad>0){
            cantidad = cantidad -1;
        }
        return cantidad;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conctactTxt;
    private javax.swing.JLabel inTxt;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelfacebook;
    private javax.swing.JLabel jLabelinstagram;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JLabel proTxt;
    private javax.swing.JLabel sobreTxt;
    // End of variables declaration//GEN-END:variables
}
