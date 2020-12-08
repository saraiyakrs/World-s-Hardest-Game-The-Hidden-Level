/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Krishna Saraiya
 */
public class Goal {
    private int x, y;
    private final int width, height;
    private final boolean isFinish;
    private final static Color COLOR = Color.GREEN;
    
    //3.a. constructor for Border
    public Goal(int x, int y, int width, int height, boolean isFinish) {
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
}