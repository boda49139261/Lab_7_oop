package oop;

import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseListener;

public class Main extends JPanel implements MouseListener {

    int x1 = 0;
    int x2 = 50;
    int x3 = 100;
    int y1 = 50;
    int y2 = 0;
    int y3 = 50;

    int xPoly[] = {x1, x2, x3};
    int yPoly[] = {y1, y2, y3};

    public Main(){
        super();
        addMouseListener(this);

    }

    public static void main(String[] args){

        JFrame frame = new JFrame();
        Main panel = new Main();

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillPolygon(xPoly, yPoly, 3);
    }

    @Override
    public void mousePressed(MouseEvent e) {

        xPoly= new int[]{x1 + e.getX()-50, x2 + e.getX()-50, x3 + e.getX()-50};
        yPoly= new int[]{y1 + e.getY()-25, y2 + e.getY()-25, y3 + e.getY()-25};

        removeAll();
        repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
