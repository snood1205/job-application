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

/**
* The class Work stores work experience.
* While the class might seem trivial,
* it is simpler to have a class for work experience
* than to have many constructors for Applicant.
*
* @since 1.0.0
* @author Eli Sadoff
*/
public class Work {
  /* The company worked at */
  private String company;
  /* The name of the last supervisor */
  private Name supervisor;
  /* Number of hours worked per week */
  private int hoursPerWeek;
  /* Address of the company */
  private Address address;
  /* Start date */
  private Date startDate;
  /* End date */
  private Date endDate;
  /* Starting salary */
  private Salary startingSalary;
  /* Ending salary */
  private Salary endingSalary;
  /* PhoneNumber number */
  private PhoneNumber number;
  /* Last job title */
  private String jobTitle;
  /* Reason for leaving */
  private String reasonForLeaving;
  /* Duties and obligations */
  private String duties;
  /* Contact employer? */
  private boolean contact;

  /**
  * This is the constructor for work.
  * @param company the company to set
  * @param supervisor the supervisor to set
  * @param hoursPerWeek the hours per week to set
  * @param address the address to set
  * @param startDate the start date to set
  * @param endDate the end date to set
  * @param startingSalary the starting salary to set
  * @param endingSalary the ending salary to set
  * @param number the phone number to set
  * @param jobTitle the job title to set
  * @param reasonForLeaving the reason for leaving to set
  * @param duties the duties to set
  * @param contact set if can be contacted
  */
  public Work(String company, Name supervisor, int hoursPerWeek, Address address, 
    Date startDate, Date endDate, Salary startingSalary, Salary endingSalary, 
    PhoneNumber number, String jobTitle, String reasonForLeaving, String duties, 
    boolean contact) {
    this.company = company;
    this.supervisor = supervisor;
    this.hoursPerWeek = hoursPerWeek;
    this.address = address;
    this.startDate = startDate;
    this.endDate = endDate;
    this.startingSalary = startingSalary;
    this.endingSalary = endingSalary;
    this.number = number;
    this.jobTitle = jobTitle;
    this.reasonForLeaving = reasonForLeaving;
    this.duties = duties;
    this.contact = contact;
  }

  /**
  * This gets the company.
  * @return the company
  */
  public String getCompany() {
    return company;
  }

  /** 
  * This sets the company.
  * @param company the company to set
  */
  public void setCompany(String company) {
    this.company = company;
  }

  /**
  * This gets the supervisor.
  * @return the supervisor
  */
  public Name getSupervisor() {
    return supervisor;
  }

  /**
  * This sets the supervisor.
  * @param supervisor the supervisor to set
  */
  public void setSupervisor(Name supervisor) {
    this.supervisor = supervisor;
  }

  /**
  * This gets the hours per week.
  * @return the hours per week
  */
  public int getHoursPerWeek() {
    return hoursPerWeek;
  }

  /**
  * This sets the hours per week.
  * @param hoursPerWeek the hours per week to set
  */
  public void setHoursPerWeek(int hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  /**
  * This gets the address.
  * @return the address
  */
  public Address getAddress() {
    return address;
  }

  /**
  * This sets the address.
  * @param address the address to set
  */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
  * This gets the start date.
  * @return the start date
  */
  public Date getStartDate() {
    return startDate;
  }

  /**
  * This sets the start date.
  * @param startDate the start date to set
  */
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
  * This gets the end date.
  * @return the end date
  */
  public Date getEndDate() {
    return endDate;
  }

  /**
  * This sets the end date.
  * @param endDate the end date to set
  */
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
  * This gets the starting salary.
  * @return the starting salary
  */
  public Salary getStartingSalary() {
    return startingSalary;
  }

  /**
  * This sets the starting salary.
  * @param startingSalary the starting salary to set
  */
  public void setStartingSalary(Salary startingSalary) {
    this.startingSalary = startingSalary;
  }

  /**
  * This gets the ending salary.
  * @return the ending salary
  */
  public Salary getEndingSalary() {
    return endingSalary;
  }

  /**
  * This sets the ending salary.
  * @param endingSalary the ending salary to set
  */
  public void setEndingSalary(Salary endingSalary) {
    this.endingSalary = endingSalary;
  }

  /**
  * This gets the phone number.
  * @return the phone nubmer
  */
  public PhoneNumber getNumber() {
    return number;
  }

  /**
  * This sets the phone number.
  * @param number the phone number to set
  */
  public void setNumber(PhoneNumber number) {
    this.number = number;
  }

  /**
  * This gets the job title.
  * @return the job title
  */
  public String getJobTitle() {
    return jobTitle;
  }

  /**
  * This sets the job title.
  * @param jobTitle the job title to set
  */
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  /**
  * This gets the reason for leaving.
  * @return the reason for leaving
  */
  public String getReasonForLeaving() {
    return reasonForLeaving;
  }

  /**
  * This sets the reason for leaving.
  * @param reasonForLeaving the reason for leaving to set
  */
  public void setReasonForLeaving(String reasonForLeaving) {
    this.reasonForLeaving = reasonForLeaving;
  }

  /**
  * This gets the duties.
  * @return the duties
  */
  public String getDuties() {
    return duties;
  }

  /**
  * This sets the duties.
  * @param duties the duties to set
  */
  public void setDuties(String duties) {
    this.duties = duties;
  }

  /**
  * This gets if can be contacted.
  * @return if can be contacted
  */
  public boolean canContact() {
    return contact;
  }

  /**
  * This sets if can be contacted.
  * @param contact sets if can be contacted
  */
  public void setContact(boolean contact) {
    this.contact = contact;
  }

  @Override
  public String toString(){
    String cp = "Company:\t" + getCompany() + "\n";
    String sv = "Supervisor:\t" + getSupervisor().toString() + "\n";
    String hw = "Hours per week:\t" + Integer.toString(getHoursPerWeek()) + "\n";
    String ad = "Address:\n" + getAddress().toString() + "\n";
    String sd = "Start date:\t" + getStartDate().toString() + "\n";
    String ed = "End date:\t" + getEndDate().toString() + "\n";
    String ss = "Starting Salary:\t" + getStartingSalary().toString() + "\n";
    String es = "Ending Salary:\t" + getEndingSalary().toString() + "\n";
    String nb = "Phone Number:\t" + getNumber().toString() + "\n";
    String jt = "Job Title:\t" + getJobTitle() + "\n";
    String rl = "Reason for leaving:\t" + getReasonForLeaving() + "\n";
    String dt = "Duties:\n" + getDuties() + "\n";
    String ct = "Contact:\t" + Boolean.toString(canContact()) + "\n";
    return cp + sv + hw + ad + sd + ed + ss + es + nb + jt + rl + dt + ct;
  }
}