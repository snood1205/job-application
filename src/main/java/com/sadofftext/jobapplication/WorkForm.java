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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WorkForm extends Form{
  private JTextField fCompany;
  private NameForm fSupervisor;
  private JTextField fHoursPerWeek;
  private AddressForm fAddress;
  private DateForm fStartDate;
  private DateForm fEndDate;
  private SalaryForm fStartingSalary;
  private SalaryForm fEndingSalary;
  private PhoneNumberForm fNumber;
  private JTextField fJobTitle;
  private JTextField fReasonForLeaving;
  private JTextArea fDuties;
  private JComboBox<String> fContact;
  private Work work;

  public WorkForm(){
    String[] contact = {"Yes", "No"};
    fCompany = new JTextField(20);
    fSupervisor = new NameForm();
    fHoursPerWeek = new JTextField(2);
    fAddress = new AddressForm();
    fStartDate = new DateForm();
    fEndDate = new DateForm();
    fStartingSalary = new SalaryForm();
    fEndingSalary = new SalaryForm();
    fNumber = new PhoneNumberForm();
    fJobTitle = new JTextField(20);
    fReasonForLeaving = new JTextField(20);
    fDuties = new JTextArea(5, 20);
    fContact = new JComboBox<String>(contact);
    work = null;
  }

  public JTextField getFCompany(){
    return fCompany;
  }

  public NameForm getFSupervisor(){
    return fSupervisor;
  }

  public JTextField getFHoursPerWeek(){
    return fHoursPerWeek;
  }

  public AddressForm getFAddress(){
    return fAddress;
  }

  public DateForm getFStartDate(){
    return fStartDate;
  }

  public DateForm getFEndDate(){
    return fEndDate;
  }

  public SalaryForm getFStartingSalary(){
    return fStartingSalary;
  }

  public SalaryForm getFEndingSalary(){
    return fEndingSalary;
  }

  public PhoneNumberForm getFNumber(){
    return fNumber;
  }

  public JTextField getFJobTitle(){
    return fJobTitle;
  }

  public JTextField getFReasonForLeaving(){
    return fReasonForLeaving;
  }

  public JTextArea getFDuties(){
    return fDuties;
  }

  public JComboBox<String> getFContact(){
    return fContact;
  }

  public Work getWork(){
    return work;
  }

  public void setWork(Work work){
    this.work = work;
  }

  @Override
  public JPanel createForm(){
    JPanel panel = new JPanel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    panel.setLayout(gridbag);

    JButton supervisor = new JButton("Supervisor");
    JButton address = new JButton("Address");
    JButton sDate = new JButton("Start Date");
    JButton eDate = new JButton("End Date");
    JButton sSalary = new JButton("Starting Salary");
    JButton eSalary = new JButton("Ending Salary");
    JButton number = new JButton("Company's Phone Number");
    JButton submit = new JButton("Submit");

    supervisor.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFSupervisor().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    address.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFAddress().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    sDate.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFStartDate().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    eDate.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFEndDate().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    sSalary.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFStartingSalary().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    eSalary.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFEndingSalary().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    number.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fn = new JFrame();
        fn.add(getFNumber().createForm());
        fn.pack();
        fn.setVisible(true);
      }
    });

    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String cp = getFCompany().getText();
        Name sv = getFSupervisor().getName();
        int hw = Integer.valueOf(getFHoursPerWeek().getText());
        Address ad = getFAddress().getAddress();
        Date sd = getFStartDate().getDate();
        Date ed = getFEndDate().getDate();
        Salary ss = getFStartingSalary().getSalary();
        Salary es = getFEndingSalary().getSalary();
        PhoneNumber pn = getFNumber().getPhoneNumber();
        String jt = getFJobTitle().getText();
        String rl = getFReasonForLeaving().getText();
        String dt = getFDuties().getText();
        boolean ct = (getFContact().getSelectedIndex() == 0);
        setWork(new Work(cp, sv, hw, ad, sd, ed, ss, es, pn, jt, rl, dt, ct));
        setSubmitted(true);
      }
    });

    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 1;
    panel.add(new JLabel("Name of company:"), c);

    c.gridx = 1;
    panel.add(getFCompany(), c);

    c.gridx = 2;
    panel.add(supervisor, c);

    c.gridy = 1;
    c.gridx = 0;
    panel.add(new JLabel("Hours per week:"), c);

    c.gridx = 1;
    panel.add(getFHoursPerWeek(), c);

    c.gridx = 2;
    panel.add(address, c);

    c.gridx = 3;
    panel.add(number, c);

    c.gridy = 2;
    c.gridx = 0;
    panel.add(sDate, c);

    c.gridx = 1;
    panel.add(eDate, c);

    c.gridx = 2;
    panel.add(sSalary, c);

    c.gridx = 3;
    panel.add(eSalary, c);

    c.gridy = 3;
    c.gridx = 0;
    panel.add(new JLabel("Last job title:"), c);

    c.gridx = 1;
    panel.add(getFJobTitle(), c);

    c.gridx = 2;
    panel.add(new JLabel("Reason for leaving"), c);

    c.gridx = 3;
    panel.add(getFReasonForLeaving(), c);


    c.gridy = 4;
    c.gridx = 0;
    panel.add(new JLabel("Duties:"), c);

    c.gridx = 1;
    panel.add(getFDuties(), c);

    c.gridy = 5;
    c.gridx = 0;
    panel.add(new JLabel("May we contact this employer?"), c);

    c.gridx = 1;
    panel.add(getFContact(), c);

    c.gridy = 6;
    c.gridx = 0;
    panel.add(submit, c);

    return panel;
  }
}
