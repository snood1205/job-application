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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameForm extends Form{
  private JTextField fFirstName;
  private JTextField fMiddleName;
  private JTextField fLastName;
  private Name name;

  public NameForm(){
    fFirstName = new JTextField(20);
    fMiddleName = new JTextField(20);
    fLastName = new JTextField(20);
    name = null;
  }

  public JTextField getFFirstName(){
    return fFirstName;
  }

  public JTextField getFMiddleName(){
    return fMiddleName;
  }

  public JTextField getFLastName(){
    return fLastName;
  }

  public Name getName(){
    return name;
  }

  public void setName(Name name){
    this.name = name;
  }

  public JPanel createForm(){
    JPanel panel = new JPanel(new GridLayout(3,3));

    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String fn = getFFirstName().getText();
        String mn = getFMiddleName().getText();
        String ln = getFLastName().getText();
        setName(new Name(fn, mn, ln));
        setSubmitted(true);
      }
    });

    panel.add(new JLabel("First Name"));
    panel.add(new JLabel("Middle Name"));
    panel.add(new JLabel("Last Name"));
    panel.add(getFFirstName());
    panel.add(getFMiddleName());
    panel.add(getFLastName());
    panel.add(submit);

    return panel;
  }
}