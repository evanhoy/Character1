/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author evanhoy
 */
public class Cartman {

    public Cartman(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics graphics) {
        //feet
        graphics.setColor(Color.BLACK);
        graphics.fillOval(140, 390, 120, 40);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(280, 390, 120, 40);
        //legs
        graphics.setColor(new Color(102, 51, 0));
        graphics.fillOval(127, 280, 290, 140);
        //body
        graphics.setColor(new Color(226, 26, 26));
        graphics.fillOval(108, 200, 320, 190);
        //head
        graphics.setColor(new Color(255, 228, 181));
        graphics.fillOval(150, 90, 240, 180);
        //buttons
        graphics.setColor(Color.BLACK);
        graphics.fillOval(260, 370, 10, 10);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(260, 330, 10, 10);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(260, 290, 10, 10);
        //eyes
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(230, 155, 40, 60);
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(270, 155, 40, 60);
        //pupils and mouth
        graphics.setColor(Color.BLACK);
        graphics.fillOval(245, 180, 10, 10);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(280, 180, 10, 10);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(245, 225, 45, 32);
        //teeth
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(252, 225, 7, 12);
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(253, 225, 7, 12);
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(265, 223, 7, 12);
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(266, 223, 7, 12);
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(279, 225, 7, 12);
        graphics.setColor(new Color(252, 245, 245));
        graphics.fillOval(280, 225, 7, 12);
        //hands
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(95, 300, 45, 70);
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(395, 300, 45, 70);
        //hat
        graphics.setColor(Color.YELLOW);
        graphics.fillArc(154, 81, 235, 150, 180, -180);
        graphics.setColor(new Color(0, 206, 209));
        graphics.fillArc(154, 71, 235, 150, 180, -180);
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(233, 52, 70, 40);
        
    }

    private int x;
    private int y;

}
