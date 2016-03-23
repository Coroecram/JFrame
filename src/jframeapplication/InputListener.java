package jframeapplication;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

class InputListener implements KeyListener, Runnable {
    public int x = 150, y = 50;
    public char[] directions = new char[4];

    Thread keyHandler;

    @Override
    public void run() {
        while(true){
            for(char dir : directions){
                switch(dir){
                    case 'u':
                        y -= 10;
                        break;
                    case 'd':
                        y += 10;
                        break;
                    case 'l':
                        x -= 10;
                        break;
                    case 'r':
                        x += 10;
                        break;
                }
            }
            System.out.println(this.x);
            try {
                System.out.println("here");
                Thread.sleep(1000/30);
            } catch (InterruptedException ex) {}
        }
    }

    public void start() {
        keyHandler = new Thread(this);
        keyHandler.start();
    }

    @Override
    public void keyPressed(KeyEvent key) {
        switch(key.getKeyCode()) {
            case KeyEvent.VK_UP:
                directions[0] = 'u';
                break;
            case KeyEvent.VK_DOWN:
                directions[1] = 'd';
                break;
            case KeyEvent.VK_LEFT:
                directions[2] = 'l';
                break;
            case KeyEvent.VK_RIGHT:
                directions[3] = 'r';
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent key) {
            switch(key.getKeyCode()) {
            case KeyEvent.VK_UP:
                directions[0] = '0';
                break;
            case KeyEvent.VK_DOWN:
                directions[1] = '0';
                break;
            case KeyEvent.VK_LEFT:
                directions[2] = '0';
                break;
            case KeyEvent.VK_RIGHT:
                directions[3] = '0';
                break;
        }                        
    }

    @Override
    public void keyTyped(KeyEvent key) {

    }          
}
