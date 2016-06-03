/*
* The MIT License (MIT)
*
* Copyright (c) 2016 Eli Sadoff
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:

* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.

* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
*/

package com.sadofftext.jobapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SchoolForm extends Form{
  private JTextField fName;
  private AddressForm fAddress;
  private JTextField fYears;
  private JComboBox<String> fGraduated;
  private JTextField fMajor;
  private JTextField fDegree;
  private JTextField fGpa;
  private School school;

  public SchoolForm(){
    String[] graduated = {"Yes", "No"};
    fName = new JTextField(40);
    fAddress = new AddressForm();
    fYears = new JTextField(2);
    fGraduated = new JComboBox<String>(graduated);
    fMajor = new JTextField(20);
    fDegree = new JTextField(5);
    fGpa = new JTextField(4);
  }

  public JTextField getFName(){
    return fName;
  }

  public AddressForm getFAddress(){
    return fAddress;
  }

  public JTextField getFYears(){
    return fYears;
  }

  public JComboBox<String> getFGraduated(){
    return fGraduated;
  }

  public JTextField getFMajor(){
    return fMajor;
  }

  public JTextField getFDegree(){
    return fDegree;
  }

  public JTextField getFGpa(){
    return fGpa;
  }

  public School getSchool(){
    return school;
  }

  public void setSchool(School school){
    this.school = school;
  }

  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JButton address = new JButton("Address");
    JButton submit = new JButton("Submit");

    address.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFAddress().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String nm = getFName().getText();
        Address ad = getFAddress().getAddress();
        int yr = Integer.valueOf(getFYears().getText());
        boolean gr = (getFGraduated().getSelectedIndex() == 0);
        String mj = getFMajor().getText();
        String dg = getFDegree().getText();
        double gpa = Double.valueOf(getFGpa().getText());
        setSchool(new School(nm, ad, yr, gr, mj, dg, gpa));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 1;
    panel.add(new JLabel("Name of school:"), c);

    c.gridx = 1;
    panel.add(getFName(), c);

    c.gridx = 2;
    panel.add(address, c);

    c.gridy = 1;
    c.gridx = 0;
    panel.add(new JLabel("Years attended:"), c);

    c.gridx = 1;
    panel.add(getFYears(), c);

    c.gridy = 2;
    c.gridx = 0;
    panel.add(new JLabel("Did you graduate?"), c);

    c.gridx = 1;
    panel.add(getFGraduated(), c);

    c.gridy = 3;
    c.gridx = 0;
    panel.add(new JLabel("What was your major?"), c);

    c.gridx = 1;
    panel.add(getFMajor(), c);

    c.gridy = 4;
    c.gridx = 0;
    panel.add(new JLabel("What was your degree?"), c);

    c.gridx = 1;
    panel.add(getFDegree(), c);

    c.gridy = 5;
    c.gridx = 0;
    panel.add(new JLabel("What was your GPA?"), c);

    c.gridx = 1;
    panel.add(getFGpa(), c);

    c.gridx = 2;
    panel.add(submit, c);

    return panel;
  }
}