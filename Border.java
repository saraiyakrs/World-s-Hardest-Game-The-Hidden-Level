package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Krishna Saraiya
 */
public class Border {
    private final int x, y, width, height;
    private final static Color COLOR = Color.CYAN;
    
    //2.a. constructor for Border
    public Border(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width; 
        this.height = height;        
    }

    //2.b draws a rectangle
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
    }
    //2.c getters

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
    
}