package store;

import Catalogo.Empresarial;
import Catalogo.Franelas;
import Catalogo.Gorras;
import Catalogo.Mugs;
import Clases.Session;
import com.mycompany.login.FormLogin;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Contacto extends javax.swing.JFrame {

    
    public Contacto() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Productos");
        jLabelUser1.setText(Session.getUsuario());
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

        jLabelUser = new javax.swing.JLabel();
        jLabelx = new javax.swing.JLabel();
        jLabelfacebook = new javax.swing.JLabel();
        jLabelinstagram = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelUser1 = new javax.swing.JLabel();
        sobreTxt = new javax.swing.JLabel();
        proTxt = new javax.swing.JLabel();
        inTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        conctactTxt = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextMensaje = new javax.swing.JTextField();
        jButtonMensaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jLabelUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser.setText("UserName");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jLabelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 40, 30));

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
        getContentPane().add(jLabelfacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 30, 30));

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
        getContentPane().add(jLabelinstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 40, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Perfil.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 80, 60));

        jLabelUser1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser1.setText("UserName");
        getContentPane().add(jLabelUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 4, 100, 20));

        sobreTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
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

        proTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
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

        inTxt.setBackground(new java.awt.Color(0, 0, 0));
        inTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        inTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inTxt.setText("Inicio");
        inTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inTxtMouseClicked(evt);
            }
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, -1, -1));

        conctactTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        conctactTxt.setForeground(new java.awt.Color(240, 97, 97));
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
        jPanel2.add(conctactTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 54, -1, 13));

        jTextNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTextNombre.setText("Nombre");
        jTextNombre.setSelectionColor(new java.awt.Color(240, 97, 97));
        jTextNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNombreMouseClicked(evt);
            }
        });
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jPanel2.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 201, 225, -1));

        jTextEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextEmail.setText("Email");
        jTextEmail.setSelectionColor(new java.awt.Color(240, 97, 97));
        jTextEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextEmailMouseClicked(evt);
            }
        });
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 201, 225, -1));

        jTextMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextMensaje.setForeground(new java.awt.Color(153, 153, 153));
        jTextMensaje.setText("Tu Mensaje");
        jTextMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextMensaje.setSelectionColor(new java.awt.Color(240, 97, 97));
        jTextMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextMensajeMouseClicked(evt);
            }
        });
        jTextMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMensajeActionPerformed(evt);
            }
        });
        jPanel2.add(jTextMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 239, 456, 159));

        jButtonMensaje.setBackground(new java.awt.Color(240, 97, 97));
        jButtonMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMensaje.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMensaje.setText("Enviar Mensaje");
        jButtonMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMensajeMouseClicked(evt);
            }
        });
        jButtonMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensajeActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 404, 456, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Contactenos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 145, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Información de contacto");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 203, -1, 30));

        jLabel6.setText("Pongase en contacto con nosotros y nos pondremos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel7.setText("en contacto con usted dentro de las 24 horas");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("______________");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 51, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/ubicacion.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, 40));

        jLabel10.setText("Cúcuta - Colombia");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 110, 10));

        jLabel11.setText("AV 1 No. 20-51 Reservas de San Luis");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 200, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/gmail.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 20, 20));

        jLabel13.setText("SubliPlaySAS@gmail.com");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/llamar.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        jLabel15.setText("3213328885");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 394, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 490));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/icono_correo.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, -1, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Icono_telefono.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 30, 30));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Social Media");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, -1, 30));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("SubliplaySAS@gmail.com");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, 40));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("3213328885");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, 30));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Estaremos atentos!");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 20));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Contactanos en caso de problermas con la web ");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 410, 20));

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Nuestras vías de contacto");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 30));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Inicio.png"))); // NOI18N
        jLabel33.setText("Menu");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 900, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inTxtMouseClicked
        Menu Ventana2 = new Menu();
            this.setVisible(false);
            Ventana2.setVisible(true);
            
    }//GEN-LAST:event_inTxtMouseClicked
                                           


    private void inTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inTxtMouseEntered
        inTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_inTxtMouseEntered

    private void inTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inTxtMouseExited
        inTxt.setForeground(Color.black);
    }//GEN-LAST:event_inTxtMouseExited

    private void proTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseEntered
        proTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_proTxtMouseEntered

    private void proTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseExited
        proTxt.setForeground(Color.black);
    }//GEN-LAST:event_proTxtMouseExited

    private void sobreTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseClicked
        SobreNosotros Ventana2 = new SobreNosotros();
        this.setVisible(false);
        Ventana2.setVisible(true);
    }//GEN-LAST:event_sobreTxtMouseClicked

    private void sobreTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseEntered
        sobreTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_sobreTxtMouseEntered

    private void sobreTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseExited
        sobreTxt.setForeground(Color.black);
    }//GEN-LAST:event_sobreTxtMouseExited

    private void proTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseClicked
    Productos Ventana3 = new Productos();
        this.setVisible(false);
        Ventana3.setVisible(true);    }//GEN-LAST:event_proTxtMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        FormLogin Ventana3 = new FormLogin();
        this.setVisible(false);
        Ventana3.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseExited

    private void conctactTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_conctactTxtMouseClicked

    private void conctactTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_conctactTxtMouseEntered

    private void conctactTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_conctactTxtMouseExited

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMensajeActionPerformed

    private void jTextNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNombreMouseClicked
        if (jTextNombre.getText().equals("Nombre")) {
        jTextNombre.setText("");
        jTextNombre.setForeground(Color.black);
    }
    if (jTextEmail.getText().isEmpty()) {
        jTextEmail.setText("Email");
        jTextEmail.setForeground(new Color(153,153,153));
    }
    if (jTextMensaje.getText().isEmpty()) {
        jTextMensaje.setText("Tu Mensaje");
        jTextMensaje.setForeground(new Color(153,153,153));
    }
         
    }//GEN-LAST:event_jTextNombreMouseClicked

    private void jTextEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextEmailMouseClicked
        if (jTextEmail.getText().equals("Email")) {
        jTextEmail.setText("");
        jTextEmail.setForeground(Color.black);
    }
    if (jTextNombre.getText().isEmpty()) {
        jTextNombre.setText("Nombre");
        jTextNombre.setForeground(new Color(153,153,153));
    }
    if (jTextMensaje.getText().isEmpty()) {
        jTextMensaje.setText("Tu Mensaje");
        jTextMensaje.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_jTextEmailMouseClicked

    private void jTextMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMensajeMouseClicked
       if (jTextMensaje.getText().equals("Tu Mensaje")) {
        jTextMensaje.setText("");
        jTextMensaje.setForeground(Color.black);
    }
    if (jTextNombre.getText().isEmpty()) {
        jTextNombre.setText("Nombre");
        jTextNombre.setForeground(new Color(153,153,153));
    }
    if (jTextEmail.getText().isEmpty()) {
        jTextEmail.setText("Email");
        jTextEmail.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_jTextMensajeMouseClicked

    private void jButtonMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMensajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMensajeMouseClicked

    private void jButtonMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensajeActionPerformed
String nombre = jTextNombre.getText();
    String email = jTextEmail.getText();
    String mensaje = jTextMensaje.getText();
    
    if (!nombre.isEmpty() && !email.isEmpty() && !mensaje.isEmpty()) {
        EmailSender emailSender = new EmailSender("subliplaysas@gmail.com", "bpgt ucdy stio lvmq");
        
        
        String asunto = "Nuevo mensaje de: " + nombre;
        String cuerpo = "Nombre: " + nombre + "\nEmail: " + email + "\n\nMensaje:\n" + mensaje;

        
        emailSender.enviarCorreo("subliplaysas@gmail.com", asunto, cuerpo);

        
        JOptionPane.showMessageDialog(this, "El mensaje ha sido enviado exitosamente.");

    } else {
        
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
    }

    }//GEN-LAST:event_jButtonMensajeActionPerformed

    private void jLabelfacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelfacebookMouseClicked
        try {
            String url = "https://www.facebook.com/profile.php?id=61563602120345";

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI(url);
                Desktop.getDesktop().browse(uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabelfacebookMouseClicked

    private void jLabelfacebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelfacebookMouseEntered
        jLabelfacebook.setIcon(hoverIconface);
    }//GEN-LAST:event_jLabelfacebookMouseEntered

    private void jLabelfacebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelfacebookMouseExited
        jLabelfacebook.setIcon(normalIconface);
    }//GEN-LAST:event_jLabelfacebookMouseExited

    private void jLabelxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelxMouseClicked
        try {
            String url = "https://x.com/SubliPlay?t=veiQk5hQjeDtevNHOOtGxQ&s=08";

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI(url);
                Desktop.getDesktop().browse(uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabelxMouseClicked

    private void jLabelxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelxMouseEntered
        jLabelx.setIcon(hoverIcontwit);
    }//GEN-LAST:event_jLabelxMouseEntered

    private void jLabelxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelxMouseExited
        jLabelx.setIcon(normalIcontwit);
    }//GEN-LAST:event_jLabelxMouseExited

    private void jLabelinstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinstagramMouseClicked
        try {
            String url = "https://www.instagram.com/subliplaysas?igsh=MWp6bjR0MnVhbzNvcA==";

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI(url);
                Desktop.getDesktop().browse(uri);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabelinstagramMouseClicked

    private void jLabelinstagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinstagramMouseEntered
        jLabelinstagram.setIcon(hoverIconinst);
    }//GEN-LAST:event_jLabelinstagramMouseEntered

    private void jLabelinstagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinstagramMouseExited
        jLabelinstagram.setIcon(normalIconinst);
    }//GEN-LAST:event_jLabelinstagramMouseExited

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conctactTxt;
    private javax.swing.JLabel inTxt;
    private javax.swing.JButton jButtonMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JLabel jLabelfacebook;
    private javax.swing.JLabel jLabelinstagram;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextMensaje;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JLabel proTxt;
    private javax.swing.JLabel sobreTxt;
    // End of variables declaration//GEN-END:variables
}
