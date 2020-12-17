package hardestgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Krishna Saraiya
 */
public class Coin {
    private int x, y, vx, vy;
    private final static int WIDTH = 15, HEIGHT = 15;
    private final static Color COLOR = Color.YELLOW;
    
    //4.a constructor
    public Coin(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        
    }
    
    //4.b draws a circle (oval)
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLUE);
        g.drawOval(x, y, WIDTH, HEIGHT);
        
    }
   
        
    
    
   
    //4.c getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
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