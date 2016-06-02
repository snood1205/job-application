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

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

/**
* The class Date stores a date.
* While the class might seem trivial,
* it is simpler to have a class for dates
* than to have many constructors for Applicant.
*
* @since 1.0.0
* @author Eli Sadoff
*/
public class Date {
  /* Stores the day */
  private int day;
  /* Stores the month */
  private int month;
  /* Stores the year */
  private int year;

  /**
  * This is the constructor for the
  * Date class.
  * @param day the day to set
  * @param month the month to set
  * @param year the year to set
  */
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  /**
  * This gets the day.
  * @return the day
  */
  public int getDay() {
    return day;
  }

  /**
  * This sets the day.
  * @param day the day to set
  */
  public void setDay(int day) {
    this.day = day;
  }

  /**
  * This gets the month.
  * @return the month 
  */
  public int getMonth() {
    return month;
  }

  /**
  * This sets the month.
  * @param month the month to set
  */
  public void setMonth(int month) {
    this.month = month;
  }

  /**
  * This gets the year.
  * @return the year
  */
  public int getYear() {
    return year;
  }

  /**
  * This sets the year.
  * @param year the year to set
  */
  public void setYear(int year) {
    this.year = year;
  }

  /**
  * This override's Object's 
  * <code>toString</code> method.
  * @return string representation of a
  * date in the format MONTH DAY, YEAR.
  */
  @Override
  public String toString() {
    String day = Integer.toString(getDay());
    String month;
    switch (getMonth()) {
      case 1: 
        month = "January"; 
        break;
      case 2: 
        month = "February"; 
        break;
      case 3: 
        month = "March"; 
        break;
      case 4: 
        month = "April"; 
        break;
      case 5: 
        month = "May"; 
        break;
      case 6: 
        month = "June"; 
        break;
      case 7: 
        month = "July"; 
        break;
      case 8: 
        month = "August"; 
        break;
      case 9: 
        month = "September"; 
        break;
      case 10: 
        month = "October"; 
        break;
      case 11: 
        month = "November"; 
        break;
      case 12:
        month = "December";
        break;
      default:
        month = "";
    }
    String year = Integer.toString(getYear());
    return month + " " + day + ", " + year;
  }

  /**
  * This static method creates a form to
  * get the information for the date. 
  * @return A panel with date information
  */
  public static JPanel getForm() {
    Integer[] days = IntStream.rangeClosed(1,31).boxed().toArray( Integer[]::new );
    Integer[] months = IntStream.rangeClosed(1,12).boxed().toArray( Integer[]::new );
    Integer[] years = IntStream.rangeClosed(1900,2016).boxed().toArray( Integer[]::new );

    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JComboBox<Integer> month = new JComboBox<Integer>(months);
    JComboBox<Integer> year = new JComboBox<Integer>(years);
    JComboBox<Integer> day = new JComboBox<Integer>(days);

    JLabel info = new JLabel("Select date in MM/DD/YYYY format");
    JLabel slash = new JLabel("/");

    c.gridwidth = GridBagConstraints.REMAINDER;
    c.gridx = 0;
    c.gridy = 0;
    panel.add(info, c);

    c.gridy = 1;
    c.gridwidth = 1;
    panel.add(month, c);

    c.gridx = 1;
    panel.add(slash, c);

    c.gridx = 2;
    panel.add(day, c);

    c.gridx = 3;
    panel.add(slash, c);

    c.gridx = 4;
    panel.add(year, c);

    return panel;
  }
}


