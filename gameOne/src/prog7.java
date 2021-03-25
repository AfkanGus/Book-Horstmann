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
        Timer nt = new Timer(25, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (napr == 0) x--;
                if (napr == 1) y--;
                if (napr == 2) x++;
                if (napr == 3) y++;
                repaint();
            }
        });
        nt.start();
        try {
            img = ImageIO.read(new File("C://Users//afkan//Downloads/X.gif"));
        } catch (IOException exp) {
            System.out.println("NO pic");
        }
    }
        public void paintComponent (Graphics gr){
            gr.clearRect(x - 1, y - 1, img.getWidth(null) + 1, img.getHeight(null) + 1);
            gr.drawImage(img, x, y, null);
        }
    }



