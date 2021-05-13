package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestCanvas extends Canvas implements KeyListener {

    public TestCanvas(){
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key typed " + e.getKeyChar());
        System.out.println("------------------------");


    }

    //
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.isActionKey()){
            System.out.println("key pressed " + e.getKeyCode());
        }
        else{
            System.out.println(" pressed other " +e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
            System.out.println("key released " + e.getKeyCode());
            System.out.println("------------------------");

    }
}
