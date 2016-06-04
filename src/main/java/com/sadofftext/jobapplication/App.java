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

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
* This class should not
* exist in the final product.
* It is used to see how the forms
* look in the interim.
* 
* TODO: Remove before publishing
* @author Eli Sadoff
*/
public class App {
  public static void main(String[] args){
    ApplicantForm af = new ApplicantForm();
    JPanel form = af.createForm();
    JFrame frame = new JFrame();
    frame.add(form);
    frame.pack();
    frame.setVisible(true);
    while(!af.isSubmitted()){
      Thread.yield();
    }
    frame.setVisible(false);

    EmailForm ef = new EmailForm();
    form = new JPanel(new GridLayout(2,1));
    form.add(new JLabel("Enter email address to send to"));
    form.add(ef.createForm());
    frame.add(form);
    frame.pack();
    frame.setVisible(true);
    while(!ef.isSubmitted()){
      Thread.yield();
    }

    NameForm nf = new NameForm();
    form = new JPanel(new GridLayout(2,1));
    form.add(new JLabel("Enter name to send to"));
    form.add(nf.createForm());
    frame.add(form);
    frame.pack();
    frame.setVisible(true);
    while(!nf.isSubmitted()){
      Thread.yield();
    }

    Applicant a = af.getApplicant();
    Email e = ef.getEmail();
    Name n = nf.getName();
    Applicant.send(a, e, n);
  }
}
