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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PhoneNumberForm extends Form{
  private JTextField fAreacode;
  private JTextField fExchange;
  private JTextField fLastFour;
  private PhoneNumber phoneNumber;

  public PhoneNumberForm(){
    fAreacode = new JTextField(3);
    fExchange = new JTextField(3);
    fLastFour = new JTextField(4);
    phoneNumber = null;
  }

  public JTextField getFAreacode(){
    return fAreacode;
  }

  public JTextField getFExchange(){
    return fExchange;
  }

  public JTextField getFLastFour(){
    return fLastFour;
  }

  public PhoneNumber getPhoneNumber(){
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneNumber phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  @Override
  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String ac = getFAreacode().getText();
        String ex = getFExchange().getText();
        String lf = getFLastFour().getText();
        setPhoneNumber(new PhoneNumber(ac, ex, lf));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(new JLabel("<html><body>Enter phone number in the format (XXX) XXX-XXXX:<body><html>"), c);
    
    c.gridy = 1;
    c.gridx = 1;
    c.gridwidth = 1;
    panel.add(new JLabel("(", SwingConstants.RIGHT), c);

    c.gridx = 2;
    panel.add(getFAreacode(), c);

    c.gridx = 3;
    panel.add(new JLabel(")"), c);

    c.gridx = 4;
    panel.add(getFExchange(), c);

    c.gridx = 5;
    panel.add(new JLabel("-"), c);

    c.gridx = 6;
    panel.add(getFLastFour(), c);

    c.gridx = 7;
    panel.add(new JLabel(""), c);

    c.gridx = 0;
    c.gridy = 2;
    panel.add(submit, c);

    return panel;
  }
}