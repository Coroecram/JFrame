
package jframeapplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class JFrameApplication {

    public static void main(String[] args) {
        
        class InputListener implements KeyListener {

            @Override
            public void keyPressed(KeyEvent key) {
                System.out.println(key.getKeyChar() + " is pressed.");
            }

            @Override
            public void keyReleased(KeyEvent key) {
                System.out.println(key.getKeyChar() + " is released.");
            }
            
            @Override
            public void keyTyped(KeyEvent key) {
                
            }
           
        }
        
        JFrame frame = new JFrame("My First JFrame") {
            
            @Override
            public void paint(Graphics g) {
            
                
            }
            
        };
        
        InputListener inputListener = new InputListener();
        frame.addKeyListener(inputListener);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        
       
    }
    
}
