package com.sadofftext.jobapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class DateForm{
  private JComboBox<Integer> fMonth;
  private JComboBox<Integer> fYear;
  private JComboBox<Integer> fDay;
  private Date date;
  private boolean submitted;

  public DateForm(){
    Integer[] days = IntStream.rangeClosed(1,31).boxed().toArray( Integer[]::new );
    Integer[] months = IntStream.rangeClosed(1,12).boxed().toArray( Integer[]::new );
    Integer[] years = IntStream.rangeClosed(1900,2016).boxed().toArray( Integer[]::new );

    fMonth = new JComboBox<Integer>(months);
    fYear = new JComboBox<Integer>(years);
    fDay = new JComboBox<Integer>(days);

    date = null;
    submitted = false;
  }

  public JComboBox<Integer> getFMonth(){
    return fMonth;
  }

  public JComboBox<Integer> getFYear(){
    return fYear;
  }

  public JComboBox<Integer> getFDay(){
    return fDay;
  }

  public Date getDate(){
    return date;
  }

  public void setDate(Date date){
    this.date = date;
  }

  public boolean isSubmitted(){
    return submitted;
  }

  public void setSubmitted(boolean submitted){
    this.submitted = submitted;
  }

  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JLabel info = new JLabel("Select date in MM/DD/YYYY format");

    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        int day = getFDay().getItemAt(getFDay().getSelectedIndex());
        int month = getFMonth().getItemAt(getFMonth().getSelectedIndex());
        int year = getFYear().getItemAt(getFYear().getSelectedIndex());
        Date date = new Date(day, month, year);
        setDate(date);
        setSubmitted(true);
      }
    });

    c.gridwidth = GridBagConstraints.REMAINDER;
    c.gridx = 0;
    c.gridy = 0;
    panel.add(info, c);

    c.gridy = 1;
    c.gridwidth = 1;
    panel.add(getFMonth(), c);

    c.gridx = 1;
    panel.add(new JLabel("/"), c);

    c.gridx = 2;
    panel.add(getFDay(), c);

    c.gridx = 3;
    panel.add(new JLabel("/"), c);

    c.gridx = 4;
    panel.add(getFYear(), c);

    c.gridy = 2;
    c.gridx = 0;
    panel.add(submit, c);

    c.gridx = 1;
    panel.add(new JLabel(""), c);

    return panel;
  }
}