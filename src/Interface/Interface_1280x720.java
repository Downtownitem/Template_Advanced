package Interface;

import java.awt.Color;

public class Interface_1280x720 extends javax.swing.JFrame {

    public Interface_1280x720() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));

        // Invisible
        superiorBar.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        Background = new CustomSwing.PanelRound();
        superiorBar = new CustomSwing.PanelRound();
        exitButton = new CustomSwing.PanelRound();
        exitButtonLabel = new javax.swing.JLabel();
        minimizeButton = new CustomSwing.PanelRound();
        minimizeButtonLabel = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setRoundBottomLeft(25);
        Background.setRoundBottomRight(25);
        Background.setRoundTopLeft(25);
        Background.setRoundTopRight(25);
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superiorBar.setBackground(new java.awt.Color(51, 51, 51));
        superiorBar.setRoundTopLeft(25);
        superiorBar.setRoundTopRight(25);
        superiorBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorBarMouseDragged(evt);
            }
        });
        superiorBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorBarMousePressed(evt);
            }
        });
        superiorBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setBackground(new java.awt.Color(253, 253, 255));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setRoundTopRight(25);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitButtonMouseReleased(evt);
            }
        });
        exitButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButtonLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        exitButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        exitButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButtonLabel.setText("X");
        exitButton.add(exitButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        superiorBar.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 60, 30));

        minimizeButton.setBackground(new java.awt.Color(253, 253, 255));
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setRoundBottomLeft(25);
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseReleased(evt);
            }
        });
        minimizeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeButtonLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        minimizeButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        minimizeButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeButtonLabel.setText("-");
        minimizeButton.add(minimizeButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        superiorBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 60, 30));

        Background.add(superiorBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Superior Bar movement events
    int mouseX, mouseY;

    private void superiorBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_superiorBarMousePressed

    private void superiorBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_superiorBarMouseDragged

    // Exit Button Events
    boolean exitButtonFocused = false;

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButtonFocused = true;
        exitButton.setBackground(new Color(255, 0, 0));
        exitButtonLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButtonFocused = false;
        exitButton.setBackground(new Color(253, 253, 255));
        exitButtonLabel.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMousePressed
        if (exitButtonFocused) {
            exitButton.setBackground(new Color(180, 0, 0, 255));
            exitButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_exitButtonMousePressed

    private void exitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseReleased
        if (exitButtonFocused) {
            exitButton.setBackground(new Color(255, 0, 0));
            exitButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_exitButtonMouseReleased

    // Minimize Button Events
    boolean minimizeButtonFocused = false;

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void minimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseEntered
        minimizeButtonFocused = true;
        minimizeButton.setBackground(new Color(161, 161, 161));
        minimizeButtonLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_minimizeButtonMouseEntered

    private void minimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseExited
        minimizeButtonFocused = false;
        minimizeButton.setBackground(new Color(253, 253, 255));
        minimizeButtonLabel.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_minimizeButtonMouseExited

    private void minimizeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMousePressed
        if (minimizeButtonFocused) {
            minimizeButton.setBackground(new Color(87, 87, 87));
            minimizeButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_minimizeButtonMousePressed

    private void minimizeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseReleased
        if (minimizeButtonFocused) {
            minimizeButton.setBackground(new Color(161, 161, 161));
            minimizeButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_minimizeButtonMouseReleased

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
            java.util.logging.Logger.getLogger(Interface_1280x720.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_1280x720.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_1280x720.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_1280x720.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_1280x720().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.PanelRound Background;
    private CustomSwing.PanelRound exitButton;
    private javax.swing.JLabel exitButtonLabel;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private CustomSwing.PanelRound minimizeButton;
    private javax.swing.JLabel minimizeButtonLabel;
    private CustomSwing.PanelRound superiorBar;
    // End of variables declaration//GEN-END:variables

}
