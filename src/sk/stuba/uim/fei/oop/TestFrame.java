package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestFrame extends JFrame implements ItemListener {

    JRadioButton one;
    JRadioButton two;
    JTextField in;
    ButtonGroup bg;

    public TestFrame(){

        super("Test");
        setLayout(new BorderLayout());
        setSize(500,500);
        bg = new ButtonGroup();

        one = new JRadioButton("one");
        one.addItemListener(this);
        add(BorderLayout.NORTH, one);
        bg.add(one);

        two = new JRadioButton("two", true);
        two.addItemListener(this);
        add(BorderLayout.CENTER, two);
        bg.add(two);

        in = new JTextField();
        add(BorderLayout.SOUTH, in);
        in.setText("One is " + one.isSelected() + " and two is " + two.isSelected());

        pack();
        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == one){
            in.setText("One was changes and is " + one.isSelected() + " and two is " + two.isSelected());
        }
        else if(e.getSource() == two){
            in.setText("Two was changes and is " + two.isSelected() + " and one is " + one.isSelected());
        }

    }
}
