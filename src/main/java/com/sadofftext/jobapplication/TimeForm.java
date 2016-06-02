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
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimeForm extends Form {
  private JComboBox<Integer> fHour;
  private JComboBox<String> fMinute;
  private JComboBox<String> fPm;
  private Time time;

  public TimeForm() {
    Integer[] hours = IntStream.rangeClosed(1,12).boxed().toArray( Integer[]::new );
    String[] minutes = new String[60];
    for(int i = 0; i < 60; i++){
      if(i < 10){
        minutes[i] = "0" + Integer.toString(i);
      } else{
        minutes[i] = Integer.toString(i);
      }
    }
    String[] pm = {"AM", "PM"};
    fHour = new JComboBox<Integer>(hours);
    fMinute = new JComboBox<String>(minutes);
    fPm = new JComboBox<String>(pm);
    time = null;
  }

  public JComboBox<Integer> getFHour() {
    return fHour;
  }

  public JComboBox<String> getFMinute() {
    return fMinute;
  }

  public JComboBox<String> getFPm() {
    return fPm;
  }

  public Time getTime(){
    return time;
  }

  public void setTime(Time time){
    this.time = time;
  }

  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JLabel info = new JLabel("Enter a time in HH:MM form");

    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        int hour = getFHour().getItemAt(getFHour().getSelectedIndex());
        int minute = getFMinute().getSelectedIndex();
        boolean pm = getFPm().getItemAt(getFPm().getSelectedIndex()).equals("PM");
        setTime(new Time(hour, minute, pm));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(info, c);

    c.gridy = 1;
    c.gridwidth = 1;
    panel.add(getFHour(), c);

    c.gridx = 1;
    panel.add(new JLabel(": "), c);

    c.gridx = 2;
    panel.add(getFMinute(), c);

    c.gridx = 3;
    panel.add(getFPm(), c);

    c.gridy = 2;
    c.gridx = 0;
    panel.add(submit, c);

    c.gridx = 1;
    panel.add(new JLabel(""), c);

    return panel;
  }
}