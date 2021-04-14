import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class prog7 {
    public static void main(String[] args) {
        Frame okno = new Frame();
    }
}

class Frame extends JFrame {

    public Frame() {
        Panel panel = new Panel();
        Container cont = getContentPane();
        cont.add(panel);
        setBounds(10, 10, 500, 500);
        setVisible(true);
    }
}

class Panel extends JPanel {
    private int x = 0, y = 0;
    private int napr = 2;
    private Image img;

    private class myKey implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {
            int key_ = e.getKeyCode();
            if (key_ == 37) napr = 0;
            if (key_ == 39) napr = 2;
            if (key_ == 38) napr = 1;
            if (key_ == 40) napr = 3;
        }

        public void keyReleased(KeyEvent e) {
        }

        public void keyTyped(KeyEvent e) {
        }
    }

    public Panel() {
        addKeyListener(new myKey());
        setFocusable(true);
        Timer nt = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (napr == 0) x -= 3;
                {
                    x -= 3;
                    y -= 3;
                }
                if (napr == 1) y -= 3;
                if (napr == 2) x += 3;
                {
                    x += 2;
                    y += 2;
                }
                if (napr == 3) y += 3;
                repaint();
            }
        });
        nt.start();
        try {
            img = ImageIO.read(new File("C://Users//af//Downloads/X.gif"));
        } catch (IOException exp) {
            System.out.println("NO pic");
        }
    }

    public void paintComponent(Graphics gr) {
        gr.clearRect(x - 3, y - 3, img.getWidth(null) + 3, img.getHeight(null) + 3);
        gr.drawImage(img, x, y, x, y, null);
    }
}



