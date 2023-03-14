package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Message extends javax.swing.JFrame {

    public Message(String txt, int delay, String dark) {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        text.setText(txt);

        if (dark.equalsIgnoreCase("dark")) {
            background.setBackground(new Color(3, 0, 39));
            text.setForeground(Color.white);
        } else {
            background.setBackground(Color.white);
            text.setForeground(new Color(204, 204, 204));
        }

        timer.setDelay(delay);
        timer.start();
    }

    public Message(String txt, int delay) {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        text.setText(txt);
        timer.setDelay(delay);
        timer.start();
    }

    public Message(String txt) {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        text.setText(txt);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new CustomSwing.PanelRound();
        text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(253, 253, 255));
        background.setRoundBottomLeft(25);
        background.setRoundBottomRight(25);
        background.setRoundTopLeft(25);
        background.setRoundTopRight(25);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        text.setForeground(new java.awt.Color(204, 204, 204));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Text");
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 170));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Exit Button Events
    boolean exitButtonFocused = false;
    // Minimize Button Events
    boolean minimizeButtonFocused = false;
    // Superior Bar Events
    int mouseX, mouseY;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.PanelRound background;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables

    Timer timer = new Timer(3000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            close();
        }
    });

    void close() {
        this.dispose();
        timer.stop();
    }

}
