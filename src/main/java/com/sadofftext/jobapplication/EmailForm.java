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

public class EmailForm extends Form{
  private JTextField fUsername;
  private JTextField fDomain;
  private Email email;

  public EmailForm(){
    fUsername = new JTextField(20);
    fDomain = new JTextField(20);
    email = null;
  }

  public JTextField getFUsername(){
    return fUsername;
  }

  public JTextField getFDomain(){
    return fDomain;
  }

  public Email getEmail(){
    return email;
  }

  public void setEmail(Email email){
    this.email = email;
  }

  public JPanel createForm(){
    JLabel label = new JLabel("Enter your email address in the format username@domain.tld");

    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String un = getFUsername().getText();
        String dm = getFDomain().getText();
        setEmail(new Email(un, dm));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(label, c);

    c.gridy = 1;
    c.gridwidth = 1;
    panel.add(getFUsername(), c);

    c.gridx = 1;
    panel.add(new JLabel("@"), c);

    c.gridx = 2;
    panel.add(getFDomain(), c);

    c.gridy = 2;
    c.gridx = 0;
    panel.add(submit, c);

    return panel;
  } 
}
