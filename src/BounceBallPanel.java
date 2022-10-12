

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;

public class BounceBallPanel extends javax.swing.JPanel {
    
    Ball ballA, ballB, ballC, ballD, ballE;
    
    Timer t1;
    
    public static int sLeft = 50;
    public static int sRight = 600;
    public static int sTop = 10;
    public static int sBottom = 500;
    
    
    public BounceBallPanel() {
        
        ballA = new Ball (100, 200);
        ballA.setXChange(40);
        ballA.setYChange(20);
        
        ballB = new Ball (400, 200);
        ballB.setXChange(20);
        ballB.setYChange(25);
        
        ballC = new Ball (450, 50);
        ballC.setXChange(50);
        ballC.setYChange(26);
        
        ballD = new Ball (40, 30);
        ballD.setXChange(44);
        ballD.setYChange(10);
        
        ballE = new Ball (430, 150);
        ballE.setXChange(8);
        ballE.setYChange(2);
        
        initComponents();
        t1 = new Timer(50, new BounceBallPanel.TimerListener());
        t1.start();
    }
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(ballA.setBallX(), ballA.setBallY(), 20, 20);
        g.setColor(Color.blue);
        g.fillOval(ballB.setBallX(), ballB.setBallY(), 40, 30);
        g.setColor(Color.orange);
        g.fillOval(ballC.setBallX(), ballC.setBallY(), 30, 20);
        g.setColor(Color.pink);
        g.fillOval(ballD.setBallX(), ballD.setBallY(), 70, 30);
        g.setColor(Color.darkGray);
        g.fillOval(ballE.setBallX(), ballE.setBallY(), 5, 30);

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

