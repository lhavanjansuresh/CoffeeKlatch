

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;

public class BounceBallPanel extends javax.swing.JPanel {
    
    Ball ballA;
    
    Timer t1;
    
    public static int sLeft = 50;
    public static int sRight = 600;
    public static int sTop = 10;
    public static int sBottom = 500;
    
    
    public BounceBallPanel() {
        ballA = new Ball (100, 200);
        initComponents();
        t1 = new Timer(50, new BounceBallPanel.TimerListener());
        t1.start();
    }
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(ballA.setBallX(), ballA.setBallY(), 20, 20);

    }
    
    private class TimerListener implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent ae) {
            repaint();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

