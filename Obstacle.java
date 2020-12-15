package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Krishna Saraiya
 */
public class Obstacle {
    private int x, y;
    private final int width, height;
    private final boolean isFinish;
    private final static Color COLOR = Color.BLACK;
    
    //3.a. constructor for Border
    public Obstacle(int x, int y, int width, int height, boolean isFinish) {    
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isFinish = isFinish;
        
    }

    //3.b draws a rectangle
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
    }
    //3.c getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isIsFinish() {
        return isFinish;
    }

    public static Color getCOLOR() {
        return COLOR;
    }

}
    
