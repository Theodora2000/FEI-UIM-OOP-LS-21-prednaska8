package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class TestKey {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.add(new TestCanvas());
        f.setVisible(true);
        f.setSize(400,400);
    }
}
