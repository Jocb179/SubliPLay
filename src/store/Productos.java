package store;

import Catalogo.Empresarial;
import Catalogo.Franelas;
import Catalogo.Gorras;
import Catalogo.Mugs;
import Clases.Session;
import com.mycompany.login.FormLogin;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Desktop;
import java.net.URI;


public class Productos extends javax.swing.JFrame {

    
    public Productos() {
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
        jLabelfacebook = new javax.swing.JLabel();
        jLabelx = new javax.swing.JLabel();
        jLabelinstagram = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelUser1 = new javax.swing.JLabel();
        sobreTxt = new javax.swing.JLabel();
        proTxt = new javax.swing.JLabel();
        conctactTxt = new javax.swing.JLabel();
        inTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        mugsBtn = new javax.swing.JPanel();
        mugsTxt = new javax.swing.JLabel();
        franelasBtn = new javax.swing.JPanel();
        franelasTxt = new javax.swing.JLabel();
        gorrasBtn = new javax.swing.JPanel();
        gorrasTxt = new javax.swing.JLabel();
        empBtn = new javax.swing.JPanel();
        empTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        getContentPane().add(jLabelfacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 30, 30));

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
        getContentPane().add(jLabelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 40, 30));

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
        getContentPane().add(jLabelinstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 40, 30));

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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Perfil.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 80, 60));

        jLabelUser1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUser1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser1.setText("UserName");
        getContentPane().add(jLabelUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 4, 100, 20));

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

        proTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        proTxt.setForeground(new java.awt.Color(240, 97, 97));
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

        inTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        inTxt.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_productos/nuestrocatalogo.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_productos/image 13.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_productos/image 27.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        jPanel5.setPreferredSize(new java.awt.Dimension(178, 0));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_productos/botas1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );

        jPanel6.setPreferredSize(new java.awt.Dimension(178, 0));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_productos/image 28.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        mugsBtn.setBackground(new java.awt.Color(255, 255, 255));

        mugsTxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        mugsTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mugsTxt.setText("Mugs");
        mugsTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mugsTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mugsTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mugsTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mugsTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mugsBtnLayout = new javax.swing.GroupLayout(mugsBtn);
        mugsBtn.setLayout(mugsBtnLayout);
        mugsBtnLayout.setHorizontalGroup(
            mugsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mugsTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mugsBtnLayout.setVerticalGroup(
            mugsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mugsTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        franelasBtn.setBackground(new java.awt.Color(255, 255, 255));

        franelasTxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        franelasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        franelasTxt.setText("Franelas");
        franelasTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        franelasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                franelasTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                franelasTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                franelasTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout franelasBtnLayout = new javax.swing.GroupLayout(franelasBtn);
        franelasBtn.setLayout(franelasBtnLayout);
        franelasBtnLayout.setHorizontalGroup(
            franelasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(franelasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        franelasBtnLayout.setVerticalGroup(
            franelasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(franelasTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gorrasBtn.setBackground(new java.awt.Color(255, 255, 255));

        gorrasTxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        gorrasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gorrasTxt.setText("Gorras");
        gorrasTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gorrasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gorrasTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gorrasTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gorrasTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout gorrasBtnLayout = new javax.swing.GroupLayout(gorrasBtn);
        gorrasBtn.setLayout(gorrasBtnLayout);
        gorrasBtnLayout.setHorizontalGroup(
            gorrasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gorrasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        gorrasBtnLayout.setVerticalGroup(
            gorrasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gorrasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        empBtn.setBackground(new java.awt.Color(255, 255, 255));

        empTxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        empTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empTxt.setText("Empresarial");
        empTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout empBtnLayout = new javax.swing.GroupLayout(empBtn);
        empBtn.setLayout(empBtnLayout);
        empBtnLayout.setHorizontalGroup(
            empBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        empBtnLayout.setVerticalGroup(
            empBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(franelasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mugsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gorrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(empBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(franelasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mugsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gorrasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Inicio.png"))); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 110));

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

    private void mugsTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mugsTxtMouseEntered
        mugsBtn.setBackground(new Color(240,97,97));
        mugsTxt.setForeground(Color.white);
    }//GEN-LAST:event_mugsTxtMouseEntered

    private void mugsTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mugsTxtMouseExited
        mugsBtn.setBackground(Color.white);
        mugsTxt.setForeground(Color.black);
    }//GEN-LAST:event_mugsTxtMouseExited

    private void franelasTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_franelasTxtMouseEntered
        franelasBtn.setBackground(new Color(240,97,97));
        franelasTxt.setForeground(Color.white);
    }//GEN-LAST:event_franelasTxtMouseEntered

    private void franelasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_franelasTxtMouseExited
        franelasBtn.setBackground(Color.white);
        franelasTxt.setForeground(Color.black);
    }//GEN-LAST:event_franelasTxtMouseExited

    private void gorrasTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gorrasTxtMouseEntered
        gorrasBtn.setBackground(new Color(240,97,97));
        gorrasTxt.setForeground(Color.white);
    }//GEN-LAST:event_gorrasTxtMouseEntered

    private void gorrasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gorrasTxtMouseExited
        gorrasBtn.setBackground(Color.white);
        gorrasTxt.setForeground(Color.black);
    }//GEN-LAST:event_gorrasTxtMouseExited

    private void empTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTxtMouseEntered
        empBtn.setBackground(new Color(240,97,97));
        empTxt.setForeground(Color.white);
    }//GEN-LAST:event_empTxtMouseEntered

    private void empTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTxtMouseExited
        empBtn.setBackground(Color.white);
        empTxt.setForeground(Color.black);
    }//GEN-LAST:event_empTxtMouseExited

    private void inTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inTxtMouseEntered
        inTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_inTxtMouseEntered

    private void inTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inTxtMouseExited
        inTxt.setForeground(Color.white);
    }//GEN-LAST:event_inTxtMouseExited

    private void proTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseEntered
       
    }//GEN-LAST:event_proTxtMouseEntered

    private void proTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseExited
        
    }//GEN-LAST:event_proTxtMouseExited

    private void mugsTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mugsTxtMouseClicked
        Mugs Ventana2 = new Mugs();
     this.setVisible(false);
            Ventana2.setVisible(true);
    }//GEN-LAST:event_mugsTxtMouseClicked

    private void gorrasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gorrasTxtMouseClicked
        Gorras Ventana2 = new Gorras();
     this.setVisible(false);
            Ventana2.setVisible(true);
    }//GEN-LAST:event_gorrasTxtMouseClicked

    private void empTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTxtMouseClicked
        Empresarial Ventana2 = new Empresarial();
     this.setVisible(false);
            Ventana2.setVisible(true);
    }//GEN-LAST:event_empTxtMouseClicked

    private void franelasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_franelasTxtMouseClicked
        Franelas Ventana2 = new Franelas();
     this.setVisible(false);
            Ventana2.setVisible(true);
    }//GEN-LAST:event_franelasTxtMouseClicked

    private void sobreTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseClicked
        SobreNosotros Ventana2 = new SobreNosotros();
        this.setVisible(false);
        Ventana2.setVisible(true);
    }//GEN-LAST:event_sobreTxtMouseClicked

    private void sobreTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseEntered
        sobreTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_sobreTxtMouseEntered

    private void sobreTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreTxtMouseExited
        sobreTxt.setForeground(Color.white);
    }//GEN-LAST:event_sobreTxtMouseExited

    private void proTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_proTxtMouseClicked

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
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void conctactTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseClicked
    Contacto Ventana2 = new Contacto();
        this.setVisible(false);
        Ventana2.setVisible(true);           
    }//GEN-LAST:event_conctactTxtMouseClicked

    private void conctactTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseEntered
    conctactTxt.setForeground(new Color(240,97,97));    }//GEN-LAST:event_conctactTxtMouseEntered

    private void conctactTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseExited
        conctactTxt.setForeground(Color.white);
    }//GEN-LAST:event_conctactTxtMouseExited

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
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conctactTxt;
    private javax.swing.JPanel empBtn;
    private javax.swing.JLabel empTxt;
    private javax.swing.JPanel franelasBtn;
    private javax.swing.JLabel franelasTxt;
    private javax.swing.JPanel gorrasBtn;
    private javax.swing.JLabel gorrasTxt;
    private javax.swing.JLabel inTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JLabel jLabelfacebook;
    private javax.swing.JLabel jLabelinstagram;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel mugsBtn;
    private javax.swing.JLabel mugsTxt;
    private javax.swing.JLabel proTxt;
    private javax.swing.JLabel sobreTxt;
    // End of variables declaration//GEN-END:variables
}
