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
import javax.swing.JTextArea;

public class FelonForm extends Form{
  private JComboBox<String> fFelon;
  private JTextArea fExplain;
  private Felon felon;

  public FelonForm(){
    String[] felon = {"Yes", "No"};
    fFelon = new JComboBox<String>(felon);
    fExplain = new JTextArea(5, 40);
  }

  public JComboBox<String> getFFelon(){
    return fFelon;
  }

  public JTextArea getFExplain(){
    return fExplain;
  }

  public Felon getFelon(){
    return felon;
  }

  public void setFelon(Felon felon){
    this.felon = felon;
  }

  @Override
  public JPanel createForm(){
    JPanel panel = new JPanel(new GridLayout(3,2));
    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        boolean ff = (getFFelon().getSelectedIndex() == 0);
        String ex = getFExplain().getText();
        setFelon(new Felon(ff, ex));
        setSubmitted(true);
      }
    });

    panel.add(new JLabel("Are you a felon?"));
    panel.add(getFFelon());
    panel.add(new JLabel("Explanation of crime:"));
    panel.add(getFExplain());
    panel.add(submit);

    return panel;
  }
}