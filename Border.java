package hardestgame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Krishna Saraiya
 */
public class Border {
    private final int x, y, width, height;
    private final static Color COLOR = Color.BLACK;
    
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
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
                Graphics2D g2 = (Graphics2D) g;
                 g2.setStroke(new BasicStroke(5));
                 g2.drawRect(x,y,width,height);
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

    public static Color getCOLOR() {
        return COLOR;
    }
    
}