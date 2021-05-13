package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class ScrollTest {
    public static void main(String args[]){
        JFrame f = new JFrame();
        ScrollPane ms = new ScrollPane();
        MyCanvas paper = new MyCanvas();
        paper.setSize(500,500);
        ms.add(paper);
        f.add(ms);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
