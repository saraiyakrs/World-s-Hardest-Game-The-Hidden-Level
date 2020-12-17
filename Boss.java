package hardestgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Krishna Saraiya
 */
public class Boss {
    private int x, y, vx, vy;
    private final static int SPEED = 19;
    private final static int WIDTH = 100, HEIGHT = 100;
    private final static Color COLOR = Color.BLACK;
    
    //4.a constructor
    public Boss(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        
    }
    
    //4.b draws a circle (oval)
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, WIDTH, HEIGHT);
        
    }
    /**
     * Check if enemy hits border, then turns around
     * @param border the boundaries of the rooms 
     */
    
    
    public void collideWorldBounds(Border border) {
        Rectangle bossBounds = new Rectangle(x, y, WIDTH, HEIGHT);
        Rectangle borderBounds = new Rectangle(border.getX() , border.getY(), border.getWidth(), border.getHeight());
        if (!borderBounds.contains(bossBounds) == true) {
            vx *= -1;
            vy *= -1;
             
        }
    }
    
    
    
    
    public void move() {
        x +=vx * SPEED;
        y +=vy * SPEED;
    }
    //4.c getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public static int getSPEED() {
        return SPEED;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
    
}