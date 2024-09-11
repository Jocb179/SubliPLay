package Catalogo;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import store.Contacto;
import store.Menu;
import store.Productos;
import store.SobreNosotros;


public class Gorras extends javax.swing.JFrame {

    
    public Gorras() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    private Icon normalIconface = new ImageIcon(getClass().getResource("/store/imagenes/Icono_facebook.png"));
    private Icon hoverIconface = new ImageIcon(getClass().getResource("/store/imagenes/Icono_facebook2.png"));
    
    private Icon normalIcontwit = new ImageIcon(getClass().getResource("/store/imagenes/Icono_twiter.png"));
    private Icon hoverIcontwit = new ImageIcon(getClass().getResource("/store/imagenes/Icono_twiter2.png"));
    
    private Icon normalIconinst = new ImageIcon(getClass().getResource("/store/imagenes/Icono_instagram.png"));
    private Icon hoverIconinst = new ImageIcon(getClass().getResource("/store/imagenes/Icono_instagram2.png"));
    
    private Icon normalIconflecha = new ImageIcon(getClass().getResource("/store/imagenes/flecha.png"));
    private Icon hoverIconflecha = new ImageIcon(getClass().getResource("/store/imagenes/flecha2.png"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelfacebook = new javax.swing.JLabel();
        jLabelx = new javax.swing.JLabel();
        jLabelinstagram = new javax.swing.JLabel();
        inTxt = new javax.swing.JLabel();
        conctactTxt = new javax.swing.JLabel();
        sobreTxt = new javax.swing.JLabel();
        proTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jLabelfacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 30, 30));

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
        jPanel1.add(jLabelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 40, 30));

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
        jPanel1.add(jLabelinstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 40, 30));

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
        jPanel1.add(inTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, 20));

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
        jPanel1.add(conctactTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 50, 100, 20));

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
        jPanel1.add(sobreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 120, 20));

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
        jPanel1.add(proTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 80, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/SubliPlay._1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Inicio.png"))); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 110));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/icono_correo.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Icono_telefono.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 30, 30));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Social Media");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, 30));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("SubliplaySAS@gmail.com");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, -1, 40));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("3213328885");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, 30));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Estaremos atentos!");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, 20));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Contactanos en caso de problermas con la web ");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 410, 20));

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Nuestras vías de contacto");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 30));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Inicio.png"))); // NOI18N
        jLabel33.setText("Menu");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 900, 90));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_productos/imagegorras.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 190, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/flecha.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, 60));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (1).png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 150));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 150));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 160, 150));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (4).png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 160, 150));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (5).png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 160, 150));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (6).png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 160, 150));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (7).png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 160, 150));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Gorras (8).png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 160, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        inTxt.setForeground(Color.white);
    }//GEN-LAST:event_inTxtMouseExited

    private void proTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseEntered
        
    }//GEN-LAST:event_proTxtMouseEntered

    private void proTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseExited
      
    }//GEN-LAST:event_proTxtMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Productos pro = new Productos();
        this.setVisible(false);
        pro.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
        Productos pro = new Productos();
        this.setVisible(false);
        pro.setVisible(true);
    }//GEN-LAST:event_proTxtMouseClicked

    private void conctactTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseClicked
        Contacto Ventana2 = new Contacto();
        this.setVisible(false);
        Ventana2.setVisible(true);
    }//GEN-LAST:event_conctactTxtMouseClicked

    private void conctactTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conctactTxtMouseEntered
        conctactTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_conctactTxtMouseEntered

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

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
    jLabel4.setIcon(hoverIconflecha);    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
    jLabel4.setIcon(normalIconflecha);    }//GEN-LAST:event_jLabel4MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Gorras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gorras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gorras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gorras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gorras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conctactTxt;
    private javax.swing.JLabel inTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabelfacebook;
    private javax.swing.JLabel jLabelinstagram;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel proTxt;
    private javax.swing.JLabel sobreTxt;
    // End of variables declaration//GEN-END:variables
}
