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

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
* The class SocialSecurity stores someone's
* social security number.
* While the class might seem trivial,
* it is simpler to have a class for SSNs
* than to have many constructors for Applicant.
*
* @since 1.0.0
* @author Eli Sadoff
*/
public class SocialSecurity {
  /* Stores the first three numbers */
  private String firstThree;
  /* Stores the middle two numbers */
  private String middleTwo;
  /* Stores the last four */
  private String lastFour;

  /**
  * This is the constructor for the 
  * SocialSecurity class.
  * @param firstThree the first three digits
  * @param middleTwo the middle two digits
  * @param lastFour the last four digits
  */
  public SocialSecurity(String firstThree, String middleTwo, String lastFour) {
    this.firstThree = firstThree;
    this.middleTwo = middleTwo;
    this.lastFour = lastFour;
  }

  /**
  * This gets the first three digits.
  * @return the first three digit
  */
  public String getFirstThree() {
    return firstThree;
  }

  /**
  * This sets the first three digits.
  * @param firstThree the first three digits to set 
  */
  public void setFirstThree(String firstThree) {
    this.firstThree = firstThree;
  }

  /**
  * This gets the middle two digits.
  * @return the middle two digits
  */
  public String getMiddleTwo() {
    return middleTwo;
  }

  /**
  * This sets the middle two digits.
  * @param middleTwo the middle two digits to set
  */
  public void setMiddleTwo(String middleTwo) {
    this.middleTwo = middleTwo;
  }

  /**
  * This gets the last four digits.
  * @return the last four digits 
  */
  public String getLastFour() {
    return lastFour;
  }

  /**
  * This sets the last four digits.
  * @param lastFour the last four digits to set
  */
  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }

  /**
  * This override's Object's 
  * <code>toString</code> method.
  * @return string representation of a
  * SSN in the format XXX-XX-XXXX
  */
  @Override
  public String toString() {
    return getFirstThree() + "-" + getMiddleTwo() + "-" + getLastFour();
  }

  /**
  * This static method creates a form to
  * get the information for a social security number. 
  * @return A panel with ssn information
  */
  public static JPanel getForm(){
    JTextField firstThree = new JTextField(3);
    JTextField middleTwo = new JTextField(2);
    JTextField lastFour = new JTextField(4);

    JLabel label = new JLabel("Enter your SSN in the format XXX-XX-XXXX");

    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(label, c);

    c.gridy = 1;
    c.gridx = 0;
    c.gridwidth = 1;
    panel.add(firstThree, c);

    c.gridx = 1;
    panel.add(new JLabel("-"), c);

    c.gridx = 2;
    panel.add(middleTwo, c);

    c.gridx = 3;
    panel.add(new JLabel("-"), c);

    c.gridx = 4;
    panel.add(lastFour, c);

    c.gridx = 5;
    panel.add(new JLabel(""), c);

    return panel;
  }
}