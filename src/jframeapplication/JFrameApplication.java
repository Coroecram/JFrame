
package jframeapplication;

import javax.swing.JFrame;

public class JFrameApplication {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("My First JFrame");
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600);
        
    }
    
}
