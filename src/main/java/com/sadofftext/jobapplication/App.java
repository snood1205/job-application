package com.sadofftext.jobapplication;

import javax.swing.*;

public class App{
    public static void main(String[] args){
        JPanel form = Address.getForm();
        JFrame frame = new JFrame();
        frame.add(form);
        frame.pack();
        frame.setVisible(true);
    }
}