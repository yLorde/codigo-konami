import javax.swing.*;
import java.awt.event.*;

public class KonamiCodeListener extends JFrame implements KeyListener {
    private final String[] konamiSequence = {
        "UP", "UP", "DOWN", "DOWN",
        "LEFT", "RIGHT", "LEFT", "RIGHT",
        "B", "A"
    };
    private int currentPosition = 0;

    public KonamiCodeListener() {
        super("Konami Code");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        String keyName = KeyEvent.getKeyText(e.getKeyCode()).toUpperCase();
        if (keyName.equals(konamiSequence[currentPosition])) {
            currentPosition++;
            if (currentPosition == konamiSequence.length) {
                JOptionPane.showMessageDialog(this, "KONAMI!");
                currentPosition = 0;
            }
        } else {
            currentPosition = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new KonamiCodeListener();
    }
}
