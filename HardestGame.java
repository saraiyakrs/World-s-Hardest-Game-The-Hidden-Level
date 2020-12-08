package hardestgame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Krishna Saraiya
 */
public class HardestGame extends JPanel implements KeyListener, MouseListener {

    private Timer timer;
    private int frameCount = 0;
    private Player player;
    /*5.a. Declare these variables:
    ? What is the correct data type for each?
    -leftWall
    -rightWall
    -topWall
    -leftWall
    -enemy1
    -enemy2
    -start
    -finish
    */
    
    public HardestGame() {
        this.player = new Player(50,300);
        /*5.b initialize all variables from 5.a
        ? What values need to be passed to the constructor?
        -walls form a simple rectangle
        -enemies somewhat in the middle but spaced apart
        -start on left side, finish on right
        -player actually is inside start
        */
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
    }
    
     @Override
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        frameCount++;
        
        this.setBackground( Color.CYAN );		
        
        player.draw(g);
        //5.c. draw all objects
    }
     
    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {
            repaint();
        }
    }
    
    public static void main(String[] args) {
        JFrame j = new JFrame("Blobby Game");
        Container c = new HardestGame();
        j.add(c);
        j.pack();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(800, 600);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.addKeyListener((KeyListener) c);
        j.addMouseListener((MouseListener) c);
    }
    
     @Override
    public void keyPressed(KeyEvent e) {
        System.out.printf("\nKeyCode: %d was pressed",e.getKeyCode());
    }
    
     @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.printf("\nMouse Clicked at (%d,%d)",e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}