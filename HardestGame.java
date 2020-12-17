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

    
    private int frameCount = 0;
    private Player player;
    private Border border;
    private Enemy enemy1;
    private Enemy enemy2;
    private Goal start;
    private Goal finish;
    private Timer timer;
    private Boss boss;
    private Coin coin1;
    private Coin coin2;
    private Coin coin3;
    private Coin coin4;
    private Obstacle obstacle1;
    private Obstacle obstacle2;
    private Obstacle obstacle3;
    private Obstacle obstacle4;
    
    
    public HardestGame() {
         this.player = new Player(25,125);
        this.enemy1 = new Enemy(25,350,-2,0);
       this.enemy2 = new Enemy(25,400,1,0);
        this.start = new Goal(0,100,100,100,false);
        this.finish = new Goal(700,100,100,100,false);
        this.border = new Border(0,100,800,600);
        this.boss = new Boss(350,350,0,-1);
        this.obstacle1 = new Obstacle(100,98,100,200,false);
        this.obstacle2 = new Obstacle(100,500,100,200,false);
        this.obstacle3 = new Obstacle(600,98,100,200,false);
        this.obstacle4 = new Obstacle(600,500,100,200,false);
        this.coin1 = new Coin(45,250,10,10);
        this.coin2 = new Coin(45,550,10,10);
        this.coin3 = new Coin(730,250,10,10);
        this.coin4 = new Coin(730,550,10,10);
        
         
    timer = new Timer();	
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12); 
        
    }
    
     
                

     @Override
     
     
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        frameCount++;
    
        this.setBackground( Color.CYAN );		
       border.draw(g);
        start.draw(g); 
        finish.draw(g);
        player.draw(g);
        enemy1.draw(g);
        enemy2.draw(g);
        obstacle1.draw(g);
        obstacle2.draw(g);
        obstacle3.draw(g);
        obstacle4.draw(g);
        boss.draw(g);
        coin1.draw(g);
        coin2.draw(g);
        coin3.draw(g);
        coin4.draw(g);
        //5.c. draw all objects
        
       
        
        
        enemy1.move();
        enemy2.move();
        
        boss.move();
        
        enemy1.collideWorldBounds(border);
        enemy2.collideWorldBounds(border);
        
        boss.collideWorldBounds(border);
        
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
        j.setSize(950, 750);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.addKeyListener((KeyListener) c);
        j.addMouseListener((MouseListener) c);
    }
    
     @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 87) {
            player.move(0,-1,border);
            
            //if player x = coin x and player y = coin y
            
    }
        if (e.getKeyCode() == 83) {
            player.move(0,1,border);
        }
        if (e.getKeyCode() == 65) {
            player.move(-1,0,border);
        }
         if (e.getKeyCode() == 68) {
            player.move(1,0,border);
        }
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