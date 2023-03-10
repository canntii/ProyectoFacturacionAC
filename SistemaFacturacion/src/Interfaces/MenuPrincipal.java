/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author gblan
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    int xPos, yPos;

    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        subMenu = new javax.swing.JDesktopPane();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        menuBg = new javax.swing.JPanel();
        workerBtn = new javax.swing.JPanel();
        workerText = new javax.swing.JLabel();
        clientBtn = new javax.swing.JPanel();
        clientText = new javax.swing.JLabel();
        terrenoBtn = new javax.swing.JPanel();
        terrenoText = new javax.swing.JLabel();
        accountBg = new javax.swing.JPanel();
        nombreMenu = new javax.swing.JLabel();
        ventasBtn = new javax.swing.JPanel();
        ventasText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subMenu.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout subMenuLayout = new javax.swing.GroupLayout(subMenu);
        subMenu.setLayout(subMenuLayout);
        subMenuLayout.setHorizontalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        subMenuLayout.setVerticalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        bg.add(subMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 910, 690));

        header.setBackground(new java.awt.Color(0, 78, 106));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(0, 78, 106));

        exitText.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        exitText.setForeground(new java.awt.Color(255, 255, 255));
        exitText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitText.setText("X");
        exitText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1243, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBg.setBackground(new java.awt.Color(0, 39, 54));

        workerBtn.setBackground(new java.awt.Color(0, 39, 54));

        workerText.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        workerText.setForeground(new java.awt.Color(255, 255, 255));
        workerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workerText.setText("Empleados");
        workerText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workerTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workerTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workerTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout workerBtnLayout = new javax.swing.GroupLayout(workerBtn);
        workerBtn.setLayout(workerBtnLayout);
        workerBtnLayout.setHorizontalGroup(
            workerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workerText, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        workerBtnLayout.setVerticalGroup(
            workerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workerBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(workerText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        clientBtn.setBackground(new java.awt.Color(0, 39, 54));

        clientText.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        clientText.setForeground(new java.awt.Color(255, 255, 255));
        clientText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientText.setText("Clientes");
        clientText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout clientBtnLayout = new javax.swing.GroupLayout(clientBtn);
        clientBtn.setLayout(clientBtnLayout);
        clientBtnLayout.setHorizontalGroup(
            clientBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientBtnLayout.createSequentialGroup()
                .addComponent(clientText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        clientBtnLayout.setVerticalGroup(
            clientBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientText, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        terrenoBtn.setBackground(new java.awt.Color(0, 39, 54));

        terrenoText.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        terrenoText.setForeground(new java.awt.Color(255, 255, 255));
        terrenoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        terrenoText.setText("Propiedades");
        terrenoText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrenoTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                terrenoTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                terrenoTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout terrenoBtnLayout = new javax.swing.GroupLayout(terrenoBtn);
        terrenoBtn.setLayout(terrenoBtnLayout);
        terrenoBtnLayout.setHorizontalGroup(
            terrenoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrenoBtnLayout.createSequentialGroup()
                .addComponent(terrenoText, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        terrenoBtnLayout.setVerticalGroup(
            terrenoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, terrenoBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(terrenoText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        accountBg.setBackground(new java.awt.Color(0, 39, 47));

        nombreMenu.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        nombreMenu.setForeground(new java.awt.Color(255, 255, 255));
        nombreMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafacturacion/imagenes/Proflie_Icon2__1_-removebg-preview.png"))); // NOI18N
        nombreMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout accountBgLayout = new javax.swing.GroupLayout(accountBg);
        accountBg.setLayout(accountBgLayout);
        accountBgLayout.setHorizontalGroup(
            accountBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountBgLayout.createSequentialGroup()
                .addComponent(nombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        accountBgLayout.setVerticalGroup(
            accountBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountBgLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(nombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ventasBtn.setBackground(new java.awt.Color(0, 39, 54));

        ventasText.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        ventasText.setForeground(new java.awt.Color(255, 255, 255));
        ventasText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventasText.setText("Ventas");
        ventasText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ventasTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ventasTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ventasBtnLayout = new javax.swing.GroupLayout(ventasBtn);
        ventasBtn.setLayout(ventasBtnLayout);
        ventasBtnLayout.setHorizontalGroup(
            ventasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventasText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventasBtnLayout.setVerticalGroup(
            ventasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventasText, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuBgLayout = new javax.swing.GroupLayout(menuBg);
        menuBg.setLayout(menuBgLayout);
        menuBgLayout.setHorizontalGroup(
            menuBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBgLayout.createSequentialGroup()
                .addGroup(menuBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terrenoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ventasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuBgLayout.createSequentialGroup()
                        .addGroup(menuBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(workerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menuBgLayout.setVerticalGroup(
            menuBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBgLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(accountBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(workerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terrenoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        bg.add(menuBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 720));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xPos = evt.getX();
        yPos = evt.getY();

    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xPos, y - yPos);
    }//GEN-LAST:event_headerMouseDragged

    private void nombreMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMenuMouseClicked

    private void workerTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerTextMouseEntered
        // TODO add your handling code here:
        workerBtn.setBackground(new Color(0, 61, 83));
    }//GEN-LAST:event_workerTextMouseEntered

    private void workerTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerTextMouseExited
        // TODO add your handling code here:
        workerBtn.setBackground(new Color(0, 39, 54));

    }//GEN-LAST:event_workerTextMouseExited

    private void workerTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerTextMouseClicked
        // TODO add your handling code here:
        Empleados e = new Empleados();
        e.setSize(910, 690);
        e.setLocation(0, 0);

        subMenu.removeAll();
        subMenu.add(e, BorderLayout.CENTER);
        subMenu.revalidate();
        subMenu.repaint();

        e.setVisible(true);
    }//GEN-LAST:event_workerTextMouseClicked

    private void clientTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTextMouseEntered
        // TODO add your handling code here:
        clientBtn.setBackground(new Color(0, 61, 83));

    }//GEN-LAST:event_clientTextMouseEntered

    private void clientTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTextMouseExited
        // TODO add your handling code here:
        clientBtn.setBackground(new Color(0, 39, 54));

    }//GEN-LAST:event_clientTextMouseExited

    private void clientTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTextMouseClicked
        // TODO add your handling code here:
        Clientes c = new Clientes();
        c.setSize(910, 690);
        c.setLocation(0, 0);

        subMenu.removeAll();
        subMenu.add(c, BorderLayout.CENTER);
        subMenu.revalidate();
        subMenu.repaint();

        c.setVisible(true);
    }//GEN-LAST:event_clientTextMouseClicked

    private void terrenoTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrenoTextMouseEntered
        // TODO add your handling code here:
        terrenoBtn.setBackground(new Color(0, 61, 83));

    }//GEN-LAST:event_terrenoTextMouseEntered

    private void terrenoTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrenoTextMouseExited
        // TODO add your handling code here:
        terrenoBtn.setBackground(new Color(0, 39, 54));

    }//GEN-LAST:event_terrenoTextMouseExited

    private void terrenoTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrenoTextMouseClicked
        // TODO add your handling code here:
        Terrenos t = new Terrenos();
        t.setSize(910, 690);
        t.setLocation(0, 0);

        subMenu.removeAll();
        subMenu.add(t, BorderLayout.CENTER);
        subMenu.revalidate();
        subMenu.repaint();

        t.setVisible(true);


    }//GEN-LAST:event_terrenoTextMouseClicked

    private void ventasTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTextMouseEntered
        // TODO add your handling code here:
        ventasBtn.setBackground(new Color(0, 61, 83));

    }//GEN-LAST:event_ventasTextMouseEntered

    private void ventasTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTextMouseExited
        // TODO add your handling code here:
        ventasBtn.setBackground(new Color(0, 39, 54));


    }//GEN-LAST:event_ventasTextMouseExited

    private void ventasTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTextMouseClicked
        // TODO add your handling code here:
        Ventas v = new Ventas();
        v.setSize(910, 690);
        v.setLocation(0, 0);

        subMenu.removeAll();
        subMenu.add(v, BorderLayout.CENTER);
        subMenu.revalidate();
        subMenu.repaint();

        v.setVisible(true);

    }//GEN-LAST:event_ventasTextMouseClicked

    private void exitTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseEntered
        // TODO add your handling code here:
        exitBtn.setBackground(Color.red);

    }//GEN-LAST:event_exitTextMouseEntered

    private void exitTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseExited
        // TODO add your handling code here:
        exitBtn.setBackground(new Color(0, 78, 106));

    }//GEN-LAST:event_exitTextMouseExited

    private void exitTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitTextMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public void nombreAccount(String name) {
        nombreMenu.setText(name);
    }

    public void nombre(String nombre) {
        nombreMenu = new javax.swing.JLabel();
        nombreMenu.setText(nombre);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountBg;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel clientBtn;
    private javax.swing.JLabel clientText;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitText;
    private javax.swing.JPanel header;
    private javax.swing.JPanel menuBg;
    private javax.swing.JLabel nombreMenu;
    private javax.swing.JDesktopPane subMenu;
    private javax.swing.JPanel terrenoBtn;
    private javax.swing.JLabel terrenoText;
    private javax.swing.JPanel ventasBtn;
    private javax.swing.JLabel ventasText;
    private javax.swing.JPanel workerBtn;
    private javax.swing.JLabel workerText;
    // End of variables declaration//GEN-END:variables
}
