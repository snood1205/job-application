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

public class SocialSecurityForm extends Form{
  private JTextField fFirstThree;
  private JTextField fMiddleTwo;
  private JTextField fLastFour;
  private SocialSecurity socialSecurity;

  public SocialSecurityForm(){
    fFirstThree = new JTextField(3);
    fMiddleTwo = new JTextField(2);
    fLastFour = new JTextField(4);
    socialSecurity = null;
  }

  public JTextField getFFirstThree(){
    return fFirstThree;
  }

  public JTextField getFMiddleTwo(){
    return fMiddleTwo;
  }

  public JTextField getFLastFour(){
    return fLastFour;
  }

  public SocialSecurity getSocialSecurity(){
    return socialSecurity;
  }

  public void setSocialSecurity(SocialSecurity socialSecurity){
    this.socialSecurity = socialSecurity;
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
        String ft = getFFirstThree().getText();
        String mt = getFMiddleTwo().getText();
        String lf = getFLastFour().getText();
        setSocialSecurity(new SocialSecurity(ft, mt, lf));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(new JLabel("Enter Social Security number in the format XXX-XX-XXXX:"), c);

    c.gridwidth = 1;
    c.gridy = 1;
    c.gridx = 1;
    panel.add(getFFirstThree(), c);

    c.gridx = 2;
    panel.add(new JLabel("-"), c);

    c.gridx = 3;
    panel.add(getFMiddleTwo(), c);

    c.gridx = 4;
    panel.add(new JLabel("-"), c);

    c.gridx = 5;
    panel.add(getFLastFour(), c);

    c.gridx = 6;
    panel.add(new JLabel(""), c);

    c.gridx = 0;
    c.gridy = 2;
    panel.add(submit, c);

    return panel;
  }
}