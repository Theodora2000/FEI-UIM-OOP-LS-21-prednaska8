package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestFrame extends JFrame implements ItemListener {

    List zoznam;
    Choice rozbalovacie_volby;
    String  polozky_pre_zoznam[] = {"Jablko", "Hruska", "Ceresna", "Melon", "Ananas"};
    String  polozky_pre_rozbalovacie[] = {"Jablko", "Hruska", "Ceresna", "Melon", "Ananas"};


    public TestFrame(){

        super("Test");
        setLayout(new BorderLayout());
        setSize(500,500);

        rozbalovacie_volby = new Choice();
        rozbalovacie_volby.addItemListener(this);

        zoznam = new List();
        zoznam.addItemListener(this);

        for(int i=0;i< polozky_pre_rozbalovacie.length;i++){
            rozbalovacie_volby.add(polozky_pre_rozbalovacie[i]);
        }

        for(int i=0;i< polozky_pre_zoznam.length;i++){
            zoznam.add(polozky_pre_zoznam[i]);
        }

        add(BorderLayout.CENTER, zoznam);
        add(BorderLayout.SOUTH, rozbalovacie_volby);

        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == rozbalovacie_volby){
            zoznam.select(rozbalovacie_volby.getSelectedIndex());
        }
        else if(e.getSource() ==  zoznam){
            rozbalovacie_volby.select(zoznam.getSelectedIndex());
        }

    }
}
