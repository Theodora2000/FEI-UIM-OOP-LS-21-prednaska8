package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestFR extends JFrame implements ActionListener {

    JRadioButtonMenuItem ignore;
    PopupMenu pm;

    public TestFR(){

        JMenuBar m = new JMenuBar();
        setJMenuBar(m);

        JMenu test = new JMenu("Zatvarac okna");
        m.add(test);

        JMenuItem item = new JMenuItem("Close");
        item.addActionListener(this);

        test.add(item);

        ignore = new JRadioButtonMenuItem("Do not close");

        test.add(ignore);
        ignore.setSelected(true);

        pm = new PopupMenu();
        MenuItem mi = new MenuItem("Close");
        mi.addActionListener(this);
        pm.add(mi);
        add(pm);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger() || e.isMetaDown() || (e.getButton() == 3)){
                    pm.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });


        setSize(400, 400);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Close") && !ignore.isSelected()){
            System.exit(0);
        }
    }
}
