/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author evanhoy
 */
class CharacterEnvironment extends Environment {

    private Cartman theChamp, theWee;

    public CharacterEnvironment() {
        theChamp = new Cartman(100, 100, 400, 400);
        theWee = new Cartman(550, 100, 200, 200);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (theChamp != null) {
            theChamp.draw(graphics);
        }
        if (theWee != null) {
            theWee.draw(graphics);
        }
    }

}
