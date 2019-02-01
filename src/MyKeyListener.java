import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener extends JFrame implements KeyListener {


    public static boolean moveUp = false;
    public static boolean moveDown = false;
    public static boolean moveLeft = false;
    public static boolean moveRight = false;


    JLabel label;

    public MyKeyListener() {
        JPanel p = new JPanel();
        label = new JLabel("Key Listener!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (moveDown == true) {
                    break;
                }
                moveUp = true;
                moveDown = false;
                moveLeft = false;
                moveRight = false;
                break;
            case KeyEvent.VK_DOWN:
                if (moveUp == true) {
                    break;
                }
                moveDown = true;
                moveUp = false;
                moveLeft = false;
                moveRight = false;
                break;
            case KeyEvent.VK_LEFT:
                if (moveRight == true) {
                    break;
                }
                moveLeft = true;
                moveUp = false;
                moveDown = false;
                moveRight = false;
                break;
            case KeyEvent.VK_RIGHT:
                if (moveLeft == true) {
                    break;
                }
                moveRight = true;
                moveUp = false;
                moveDown = false;
                moveLeft = false;
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (moveDown == true) {
                    break;
                }
                moveUp = true;
                moveDown = false;
                moveLeft = false;
                moveRight = false;
                break;
            case KeyEvent.VK_DOWN:
                if (moveUp == true) {
                    break;
                }
                moveDown = true;
                moveUp = false;
                moveLeft = false;
                moveRight = false;
                break;
            case KeyEvent.VK_LEFT:
                if (moveRight == true) {
                    break;
                }
                moveLeft = true;
                moveUp = false;
                moveDown = false;
                moveRight = false;
                break;
            case KeyEvent.VK_RIGHT:
                if (moveLeft == true) {
                    break;
                }
                moveRight = true;
                moveUp = false;
                moveDown = false;
                moveLeft = false;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (moveDown == true) {
                    break;
                }
                moveUp = true;
                moveDown = false;
                moveLeft = false;
                moveRight = false;
                break;
            case KeyEvent.VK_DOWN:
                if (moveUp == true) {
                    break;
                }
                moveDown = true;
                moveUp = false;
                moveLeft = false;
                moveRight = false;
                break;
            case KeyEvent.VK_LEFT:
                if (moveRight == true) {
                    break;
                }
                moveLeft = true;
                moveUp = false;
                moveDown = false;
                moveRight = false;
                break;
            case KeyEvent.VK_RIGHT:
                if (moveLeft == true) {
                    break;
                }
                moveRight = true;
                moveUp = false;
                moveDown = false;
                moveLeft = false;
                break;
        }
    }
}
