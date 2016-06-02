package com.sadofftext.jobapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddressForm{
  private JTextField fAddressLine1;
  private JTextField fAddressLine2;
  private JTextField fCity;
  private JComboBox<String> fState;
  private JTextField fZipcode;
  private Address address;
  private boolean submitted;

  public AddressForm(){
    String[] stateAbbr = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "GU", 
                          "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", 
                          "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", 
                          "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VA", 
                          "VI", "VT", "WA", "WI", "WV", "WY"};
    fAddressLine1 = new JTextField(40);
    fAddressLine2 = new JTextField(40);
    fCity = new JTextField(20);
    fState = new JComboBox<String>(stateAbbr);
    fZipcode = new JTextField(6);
    address = null;
    submitted = false;
  }

  public JTextField getFAddressLine1(){
    return fAddressLine1;
  }

  public JTextField getFAddressLine2(){
    return fAddressLine2;
  }

  public JTextField getFCity(){
    return fCity;
  }

  public JComboBox<String> getFState(){
    return fState;
  }

  public JTextField getFZipcode(){
    return fZipcode;
  }

  public boolean isSubmitted(){
    return submitted;
  }

  public void setSubmitted(boolean submitted){
    this.submitted = submitted;
  }

  public Address getAddress(){
    return address;
  }

  public void setAddress(Address address){
    this.address = address;
  }

  public JPanel createForm(){
    JLabel lAddressLine1 = new JLabel("Address Line 1");
    JLabel lAddressLine2 = new JLabel("Address Line 2");
    JLabel lCity = new JLabel("City");
    JLabel lState = new JLabel("State");
    JLabel lZipcode = new JLabel("Zip Code");

    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String al1 = getFAddressLine1().getText();
        String al2 = getFAddressLine2().getText();
        String ci = getFCity().getText();
        String st = getFState().getItemAt(getFState().getSelectedIndex());
        String zc = getFZipcode().getText();
        st = Address.getState(st);
        Address ad = new Address(al1, al2, ci, st, zc);
        setAddress(ad);
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    panel.add(lAddressLine1, c);

    c.gridx = 1;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(getFAddressLine1(), c);

    c.gridx = 0;
    c.gridy = 1;
    c.gridwidth = 1;
    panel.add(lAddressLine2, c);

    c.gridx = 1;
    c.gridwidth = GridBagConstraints.REMAINDER;
    panel.add(getFAddressLine2(), c);

    c.gridx = 0;
    c.gridy = 2;
    c.gridwidth = 1;
    panel.add(lCity, c);

    c.gridx = 1;
    panel.add(getFCity(), c);

    c.gridx = 2;
    panel.add(lState, c);

    c.gridx = 3;
    panel.add(getFState(), c);

    c.gridx = 4;
    panel.add(lZipcode, c);

    c.gridx = 5;
    panel.add(getFZipcode(), c);

    c.gridy = 3;
    c.gridx = 0;
    panel.add(submit, c);

    c.gridx = 1;
    panel.add(new JLabel(""), c);

    return panel;
  }
}