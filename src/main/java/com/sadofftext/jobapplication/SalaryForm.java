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
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SalaryForm extends Form{
  private JComboBox<String> fHourly;
  private JTextField fRate;
  private Salary salary;

  public SalaryForm(){
    String[] hourly = {"Hourly", "Salaried"};
    fHourly = new JComboBox<String>(hourly);
    fRate = new JTextField(8);
    salary = null;
  }

  public JComboBox<String> getFHourly(){
    return fHourly;
  }

  public JTextField getFRate(){
    return fRate;
  }

  public Salary getSalary(){
    return salary;
  }

  public void setSalary(Salary salary){
    this.salary = salary;
  }

  @Override
  public JPanel createForm(){
    JPanel panel = new JPanel(new GridLayout(3,2));
    JButton submit = new JButton("Submit");

    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        boolean hy = getFHourly().getSelectedIndex() == 0;
        double rate = Double.valueOf(getFRate().getText());
        setSalary(new Salary(hy, rate));
        setSubmitted(true);
      }
    });

    panel.add(new JLabel("Type of employment:"));
    panel.add(getFHourly());
    panel.add(new JLabel("Pay rate (USD):"));
    panel.add(getFRate());
    panel.add(submit);

    return panel;
  }
}