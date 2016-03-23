package jframeapplication;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class JFrameApplication {

    public static void main(String[] args) {

        InputListener inputListener = new InputListener();
        
        JFrame frame = new JFrame("My First JFrame") {
            
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.RED);
                g.fillOval(inputListener.x, inputListener.y, 50, 50);
                
                repaint();
            }
            
        };
        inputListener.start();
        frame.addKeyListener(inputListener);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); 
        
    }
}
