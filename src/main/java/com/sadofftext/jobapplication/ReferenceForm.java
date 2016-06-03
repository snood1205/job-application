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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReferenceForm extends Form{
  private NameForm fName;
  private PhoneNumberForm fPhoneNumber;
  private JTextArea fCircumstances;
  private Reference reference;

  public ReferenceForm(){
    fName = new NameForm();
    fPhoneNumber = new PhoneNumberForm();
    fCircumstances = new JTextArea(10, 80);
    reference = null;
  }

  public NameForm getFName(){
    return fName;
  }

  public PhoneNumberForm getFPhoneNumber(){
    return fPhoneNumber;
  }

  public JTextArea getFCircumstance(){
    return fCircumstances;
  }

  public Reference getReference(){
    return reference;
  }

  public void setReference(Reference reference){
    this.reference = reference;
  }

  @Override
  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JButton name = new JButton("Reference Name");
    JButton number = new JButton("Reference Phone Number");
    JButton submit = new JButton("Submit");

    name.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFName().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    number.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFPhoneNumber().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Name name = getFName().getName();
        PhoneNumber pn = getFPhoneNumber().getPhoneNumber();
        String ci = getFCircumstance().getText();
        setReference(new Reference(name, pn, ci));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 1;
    panel.add(name, c);

    c.gridx = 1;
    panel.add(number, c);

    c.gridx = 0;
    c.gridy = 1;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(getFCircumstance(), c);

    c.gridy = 2;
    panel.add(new JLabel("Circumstances that you know this reference"), c);

    c.gridy = 3;
    c.gridwidth = 1;
    panel.add(submit, c);

    return panel;
  }
}