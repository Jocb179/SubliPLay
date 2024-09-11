package store;

import Catalogo.*;
import Clases.Session;
import com.mycompany.login.FormLogin;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import store.Menu;
import store.Productos;


public class SobreNosotros extends javax.swing.JFrame {

    
    public SobreNosotros() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Empresarial");
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

        jPanel1 = new javax.swing.JPanel();
        jLabelfacebook = new javax.swing.JLabel();
        jLabelx = new javax.swing.JLabel();
        jLabelinstagram = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelUser1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        sobreTxt = new javax.swing.JLabel();
        conctactTxt = new javax.swing.JLabel();
        inTxt = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cerrar Sesión");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 80, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Perfil.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 80, 60));

        jLabelUser1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUser1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser1.setText("UserName");
        jPanel1.add(jLabelUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 4, 100, -1));

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel35.setText("Visión");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 90, 30));

        sobreTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        sobreTxt.setForeground(new java.awt.Color(240, 97, 97));
        sobreTxt.setText("Sobre Nosotros");
        jPanel1.add(sobreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 120, 20));

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
        jPanel1.add(proTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 80, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/SubliPlay._1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Inicio.png"))); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 110));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/icono_correo.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, 20));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Icono_telefono.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 30, 20));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Social Media");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, -1, 20));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("SubliplaySAS@gmail.com");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, 30));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("3213328885");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, 20));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Estaremos atentos!");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, 20));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Contactanos en caso de problermas con la web ");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 410, 20));

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Nuestras vías de contacto");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, 30));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/Inicio.png"))); // NOI18N
        jLabel33.setText("Menu");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 900, 80));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 75)); // NOI18N
        jLabel13.setText("_________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 290, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/sobreicon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 80, 50));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel14.setText("<html><div style='text-align: justify;'>SubliPlay Tu Destino Creativo para Estampados Personalizados.\n" +
            "SubliPlay es tu portal de expresión personal, donde tus diseños se convierten en estampados vibrantes y únicos. Ofrecemos una amplia gama de productos, desde ropa hasta accesorios y decoración para el hogar. Nuestra plataforma intuitiva de diseño te permite crear y visualizar tus propias creaciones en tiempo real. Con procesos de sublimación de alta calidad, garantizamos resultados duraderos y llenos de color. Únete a nuestra comunidad creativa y descubre una nueva forma de dar vida a tus ideas en SubliPlay.</div></html>");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 240, 270));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 75)); // NOI18N
        jLabel15.setText("________");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 110));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel16.setText("Sobre Nosotros");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 270, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel17.setText("Misión");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 90, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel18.setText("<html><div style='text-align: justify;'>Nacimos como emprendimientos hace más de 5 años, con una fuerte convicción y apostándole a las oportunidades que brinda la región para crecer y fortalecernos en el mercado; nuestro propósito superior enmarca el sentido humano de hacer un mundo mejor para las familias que dependen de las personas que día a día diseñan, confeccionan y personalizan nuestras prendas o artículos publicitarios. Además, queremos ser el aliado estratégico que provea soluciones de asesoría y consultoría en temas organizacionales, de esta forma podremos ayudar conseguir las metas y resultados trazados para su empresa.</div></html>");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, 270));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel19.setText("<html><div style='text-align: justify;'>En SubliPlay, nuestra misión es transformar tus ideas en piezas únicas y personalizadas que hablen de quién eres. Creemos que la autoexpresión es fundamental, y es por eso que nos dedicamos a brindarte la oportunidad de crear productos impresos que reflejen tu estilo, pasiones y momentos especiales.\n" +
            "Hacer realidad tus ideas no debería ser complicado. Nuestra plataforma en línea intuitiva te permite diseñar y personalizar tus productos de manera sencilla. Desde la elección de los colores hasta la colocación de imágenes, te proporcionamos todas las herramientas que necesitas.</div></html>");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 240, 270));

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel34.setText("Quienes Somos");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        proTxt.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_proTxtMouseEntered

    private void proTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseExited
        proTxt.setForeground(Color.white);
    }//GEN-LAST:event_proTxtMouseExited

    private void proTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTxtMouseClicked
        Productos Ventana2 = new Productos();
        this.setVisible(false);
        Ventana2.setVisible(true);
    }//GEN-LAST:event_proTxtMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        FormLogin Ventana3 = new FormLogin();
        this.setVisible(false);
        Ventana3.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setForeground(new Color(240,97,97));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setForeground(Color.white);
    }//GEN-LAST:event_jLabel5MouseExited

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
            java.util.logging.Logger.getLogger(SobreNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SobreNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SobreNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SobreNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SobreNosotros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conctactTxt;
    private javax.swing.JLabel inTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JLabel jLabelfacebook;
    private javax.swing.JLabel jLabelinstagram;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel proTxt;
    private javax.swing.JLabel sobreTxt;
    // End of variables declaration//GEN-END:variables
}
