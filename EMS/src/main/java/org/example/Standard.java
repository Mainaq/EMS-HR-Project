package org.example;
import java.awt.*;
import javax.swing.*;

public class Standard extends JFrame{
    public Standard(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(700,700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}