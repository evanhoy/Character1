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

    public Cartman(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.blue);
        graphics.drawRect(x, y, width, height);

        //feet
        graphics.setColor(Color.BLACK);
//        graphics.fillOval(140, 390, 120, 40);
        graphics.fillOval(x + (width * 15 / 100), y + (height * 90 / 100), width * 28 / 100, height * 10 / 100);
        graphics.setColor(Color.BLACK);
//        graphics.fillOval(280, 390, 120, 40);
        graphics.fillOval(x + (width * 60 / 100), y + (height * 90 / 100), width * 28 / 100, height * 10 / 100);

        //legs
        graphics.setColor(new Color(102, 51, 0));
        //graphics.fillOval(127, 280, 290, 140);
        graphics.fillOval(x + (width * 16 / 100), y + (height * 68 / 100), width * 70 / 100, height * 30 / 100);

        //body
        graphics.setColor(new Color(226, 26, 26));
        //graphics.fillOval(108, 200, 320, 190);
        graphics.fillOval(x + (width * 11 / 100), y + (height * 50 / 100), width * 80 / 100, height * 40 / 100);

        //head
        graphics.setColor(new Color(255, 228, 181));
        //graphics.fillOval(150, 90, 240, 180);
        graphics.fillOval(x + (width * 20 / 100), y + (height * 10 / 100), width * 60 / 100, height * 50 / 100);

        //buttons
        graphics.setColor(Color.BLACK);
        //graphics.fillOval(260, 370, 10, 10);
        graphics.fillOval(x + (width * 48 / 100), y + (height * 63 / 100), width * 3 / 100, height * 3 / 100);
        graphics.setColor(Color.BLACK);
        //graphics.fillOval(260, 330, 10, 10);
        graphics.fillOval(x + (width * 48 / 100), y + (height * 73 / 100), width * 3 / 100, height * 3 / 100);
        graphics.setColor(Color.BLACK);
        //graphics.fillOval(260, 290, 10, 10);
        graphics.fillOval(x + (width * 48 / 100), y + (height * 83 / 100), width * 3 / 100, height * 3 / 100);

        //eyes
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(230, 155, 40, 60);
        graphics.fillOval(x + (width * 38 / 100), y + (height * 29 / 100), width * 10 / 100, height * 16 / 100);
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(270, 155, 40, 60);
        graphics.fillOval(x + (width * 51 / 100), y + (height * 29 / 100), width * 10 / 100, height * 16 / 100);

        //pupils and mouth
        graphics.setColor(Color.BLACK);
        //graphics.fillOval(245, 180, 10, 10);
        graphics.fillOval(x + (width * 53 / 100), y + (height * 35 / 100), width * 3 / 100, height * 3 / 100);
        graphics.setColor(Color.BLACK);
        //graphics.fillOval(280, 180, 10, 10);
        graphics.fillOval(x + (width * 43 / 100), y + (height * 35 / 100), width * 3 / 100, height * 3 / 100);
        graphics.setColor(Color.BLACK);
        //graphics.fillOval(245, 225, 45, 32);
        graphics.fillOval(x + (width * 42 / 100), y + (height * 47 / 100), width * 15 / 100, height * 9 / 100);

        //teeth
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(252, 225, 7, 12);
        graphics.fillOval(x + (width * 44 / 100), y + (height * 47 / 100), width * 2 / 100, height * 4 / 100);
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(253, 225, 7, 12);
        graphics.fillOval(x + (width * 45 / 100), y + (height * 47 / 100), width * 2 / 100, height * 4 / 100);
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(265, 223, 7, 12);
        graphics.fillOval(x + (width * 48 / 100), y + (height * 47 / 100), width * 2 / 100, height * 4 / 100);
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(266, 223, 7, 12);
        graphics.fillOval(x + (width * 49 / 100), y + (height * 47 / 100), width * 2 / 100, height * 4 / 100);
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(279, 225, 7, 12);
        graphics.fillOval(x + (width * 52 / 100), y + (height * 47 / 100), width * 2 / 100, height * 4 / 100);
        graphics.setColor(new Color(252, 245, 245));
        //graphics.fillOval(280, 225, 7, 12);
        graphics.fillOval(x + (width * 53 / 100), y + (height * 47 / 100), width * 2 / 100, height * 4 / 100);

        //hands
        graphics.setColor(Color.YELLOW);
        //graphics.fillOval(95, 300, 45, 70);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 70 / 100), width * 11 / 100, height * 17 / 100);
        graphics.setColor(Color.YELLOW);
        //graphics.fillOval(395, 300, 45, 70);
        graphics.fillOval(x + (width * 82 / 100), y + (height * 70 / 100), width * 11 / 100, height * 17 / 100);

        //hat
        graphics.setColor(Color.YELLOW);
//        graphics.fillArc(154, 81, 235, 150, 180, -180);
        graphics.fillArc(x + (width * 20 / 100), y + (height * 8 / 100), width * 59 / 100, height * 39 / 100, 0, 180);
        graphics.setColor(new Color(0, 206, 209));
//        graphics.fillArc(154, 71, 235, 150, 0, 180);
        graphics.fillArc(x + (width * 20 / 100), y + (height * 6 / 100), width * 59 / 100, height * 39 / 100, 0, 180);
        graphics.setColor(Color.YELLOW);
        //graphics.fillOval(233, 52, 70, 40);
        graphics.fillOval(x + (width * 40 / 100), y + (height * 1 / 100), width * 19 / 100, height * 10 / 100);

    }

    private int x;
    private int y;
    private int width, height;

}
