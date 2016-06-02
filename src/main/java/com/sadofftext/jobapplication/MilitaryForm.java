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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MilitaryForm extends Form {
  private JComboBox<String> fServed;
  private JComboBox<String> fBranch;
  private DateForm fEntryDate;
  private DateForm fDischargeDate;
  private Military military;

  public MilitaryForm(){
    String[] served = {"Yes", "No"};
    String[] branch = {"Army", "Navy", "Marine Corps", "Coast Guard", "Air Force"};
    fServed = new JComboBox<String>(served);
    fBranch = new JComboBox<String>(branch);
    fEntryDate = new DateForm();
    fDischargeDate = new DateForm();
  }

  public JComboBox<String> getFServed(){
    return fServed;
  }

  public JComboBox<String> getFBranch(){
    return fBranch;
  }

  public DateForm getFEntryDate(){
    return fEntryDate;
  }

  public DateForm getFDischargeDate(){
    return fDischargeDate;
  }

  public Military getMilitary(){
    return military;
  }

  public void setMilitary(Military military){
    this.military = military;
  }

  @Override
  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JButton start = new JButton("Entry Date");
    JButton end = new JButton("Discharge Date");
    JButton submit = new JButton("Submit");

    start.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame tf = new JFrame();
        tf.add(getFEntryDate().createForm());
        tf.pack();
        tf.setVisible(true);
      }
    });

    end.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame tf = new JFrame();
        tf.add(getFDischargeDate().createForm());
        tf.pack();
        tf.setVisible(true);
      }
    });

    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        boolean sr = getFServed().getSelectedIndex() == 0;
        String br = getFBranch().getItemAt(getFBranch().getSelectedIndex());
        Date st = getFEntryDate().getDate();
        Date end = getFDischargeDate().getDate();
        setMilitary(new Military(sr, br, st, end));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    panel.add(new JLabel("Did you serve in the military?"), c);

    c.gridx = 1;
    panel.add(getFServed());

    c.gridx = 0;
    c.gridy = 1;
    panel.add(new JLabel("In what branch did you serve?"));

    c.gridx = 1;
    panel.add(getFBranch());

    c.gridx = 0;
    c.gridy = 2;
    panel.add(start, c);

    c.gridx = 1;
    panel.add(end, c);

    c.gridx = 0;
    c.gridy = 3;
    panel.add(submit, c);

    c.gridx = 1;
    panel.add(new JLabel(""), c);

    return panel;
  }
}