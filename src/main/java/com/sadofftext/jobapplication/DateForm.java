package com.sadofftext.jobapplication;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.stream.IntStream;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class DateForm extends Date{
  private final Integer[] months = IntStream.rangeClosed(1,12).boxed().toArray( Integer[]::new );
  private final Integer[] years = IntStream.rangeClosed(1900,2016).boxed().toArray( Integer[]::new );

  private JPanel panel = new JPanel();

  private JComboBox<Integer> month;
  private JComboBox<Integer> year;
  private JComboBox<Integer> day;

  public DateForm(){
    super(1,1,1900);
    month = new JComboBox<Integer>(months);
    year = new JComboBox<Integer>(years);
    day = new JComboBox<Integer>(new Integer[2]);
  }

  public Integer[] getMonths(){
    return months;
  }

  public Integer[] getYears(){
    return years;
  }

  public JPanel getPanel(){
    return panel;
  }

  public void setPanel(JPanel panel){
    this.panel = panel;
  }

  public JComboBox<Integer> getMonthBox(){
    return month;
  }

  public void setMonthBox(JComboBox<Integer> month){
    this.month = month;
  }

  public JComboBox<Integer> getYearBox(){
    return year;
  }

  public void setYearBox(JComboBox<Integer> year){
    this.year = year;
  }

  public JComboBox<Integer> getDayBox(){
    return day;
  }

  public void setDayBox(JComboBox<Integer> day){
    this.day = day;
  }

  public Integer[] getMonthN(int days){
    return IntStream.rangeClosed(1, days).boxed().toArray( Integer[]::new );
  }

  public void createForm(){
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    JPanel panel = getPanel();
    panel.setLayout(gridbag);
    JComboBox<Integer> month = getMonthBox();
    JComboBox<Integer> year = getYearBox();
    JComboBox<Integer> day = getDayBox();

    month.addItemListener(new ItemListener(){
      public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED);
          Integer item = month.getSelectedIndex() + 1;
          boolean leap = ((int)year.getSelectedItem() % 4 == 0);
          int days;
          if(item == 2 && leap) {
            days = 29;
          } else if(item == 2) {
            days = 28;
          } else if(item == 4 || item == 6 || item == 9 || item == 11) {
            days = 30;
          } else {
            days = 31;
          }
          setDayBox(new JComboBox<Integer>(getMonthN(days)));
          setPanel(getDayBox())
        }
    });

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

    setPanel(panel);
  }
}