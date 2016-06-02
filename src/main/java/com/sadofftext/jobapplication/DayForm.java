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

public class DayForm extends Form {
  private String dayOfWeek;
  private JComboBox<String> fAvailable;
  private TimeForm fStart;
  private TimeForm fEnd;
  private Day day;

  public DayForm(String dayOfWeek){
    this.dayOfWeek = dayOfWeek;
    String available = {"Yes","No"};
    fAvailable = new JComboBox<String>(available);
    fStart = new TimeForm();
    fEnd = new TimeForm();
    day = null;
  }

  public String getDayOfWeek(){
    return dayOfWeek;
  }

  public JComboBox<String> getFAvailable(){
    return fAvailable;
  }

  public TimeForm getFStart(){
    return fStart;
  }

  public TimeForm getFEnd(){
    return fEnd;
  }

  public Day getDay(){
    return day;
  }

  public void setDay(Day day){
    this.day = day;
  }

  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);
  }
}