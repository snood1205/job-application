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
* This class contains
* all the information of 
* the applicant.
*
* @since 1.0.0
* @author Eli Sadoff
*/
public class Applicant {
  /* The name */
  private Name name; 
  /* The social security number */
  private SocialSecurity ssn;
  /* The address */
  private Address address;
  /* The home phone number */
  private PhoneNumber home;
  /* The cell phone number */
  private PhoneNumber cell;
  /* The age */
  private int age;
  /* The birthday */
  private Date birthday;
  /* The email address */
  private Email email;
  /* The date today */
  private Date today;
  /* Monday availability */
  private Day mon;
  /* Tuesday availability */
  private Day tues;
  /* Wednesday availability */
  private Day wed;
  /* Thursday availability */
  private Day thur;
  /* Friday availability */
  private Day fri;
  /* Saturday availability */
  private Day sat;
  /* Sunday availability */
  private Day sun;
  /* Can work full time */
  private boolean fulltime;
  /* Can work part time */
  private boolean parttime;
  /* Number of hours a week */
  private int hours;
  /* Can work nights */
  private boolean workNights;
  /* Date available to begin */
  private Date available;
  /* Has been employed here before */
  private boolean employedHereBefore;
  /* Is certified to work in the US */
  private boolean certifiedToWork;
  /* Has commited a felony */
  private Felon felon;
  /* Has a drivers license */
  private boolean dl;
  /* Last high school attended */
  private School highSchool;
  /* Last university attended */
  private School univ;
  /* Highest degree ascertained (above Univ.) */
  private School highestDegree;
  /* Military service information */
  private Military military;
  /* Most recent work experience */
  private Work work1;
  /* Second most recent work experience */
  private Work work2;
  /* Third most recent work experience */
  private Work work3;
  /* First reference */
  private Reference reference1;
  /* Second reference */
  private Reference reference2;
  /* Third reference */
  private Reference reference3;

  public Applicant(Name name, SocialSecurity ssn, Address address, PhoneNumber home, 
                  PhoneNumber cell, int age, Date birthday, Email email, Date today, Day mon, 
                  Day tues, Day wed, Day thur, Day fri, Day sat, Day sun, boolean fulltime, 
                  boolean parttime, int hours, boolean workNights, Date available, 
                  boolean employedHereBefore, boolean certifiedToWork, Felon felon, 
                  boolean dl, School highSchool, School univ, School highestDegree, 
                  Military military, Work work1, Work work2, Work work3, Reference reference1,
                  Reference reference2, Reference reference3) {
    this.name = name;
    this.ssn = ssn;
    this.address = address;
    this.home = home;
    this.cell = cell;
    this.age = age;
    this.birthday = birthday;
    this.email = email;
    this.today = today;
    this.mon = mon;
    this.tues = tues;
    this.wed = wed;
    this.thur = thur;
    this.fri = fri;
    this.sat = sat;
    this.sun = sun;
    this.fulltime = fulltime;
    this.parttime = parttime;
    this.hours = hours;
    this.workNights = workNights;
    this.available = available;
    this.employedHereBefore = employedHereBefore;
    this.certifiedToWork = certifiedToWork;
    this.felon = felon;
    this.dl = dl;
    this.highSchool = highSchool;
    this.univ = univ;
    this.highestDegree = highestDegree;
    this.military = military;
    this.work1 = work1;
    this.work2 = work2;
    this.work3 = work3;
    this.reference1 = reference1;
    this.reference2 = reference2;
    this.reference3 = reference3;
  }

  /**
  * This gets the name.
  * @return the name
  */
  public Name getName() {
    return name;
  }

  /**
  * This sets the name.
  * @param name the name to set
  */
  public void setName(Name name) {
    this.name = name;
  }

  /**
  * This gets the SSN.
  * @return the SSN
  */
  public SocialSecurity getSsn() {
    return ssn;
  }

  /**
  * This sets the SSN.
  * @param ssn the SSN to set
  */
  public void setSsn(SocialSecurity ssn) {
    this.ssn = ssn;
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
  * This gets the home phone number.
  * @return the home phone number
  */
  public PhoneNumber getHome() {
    return home;
  }

  /**
  * This sets the home phone number.
  * @param home the home phone number to set
  */
  public void setHome(PhoneNumber home) {
    this.home = home;
  }

  /**
  * This gets the cell phone number.
  * @return the cell phone number
  */
  public PhoneNumber getCell() {
    return cell;
  }

  /**
  * This sets the cell phone number.
  * @param cell the cell phone number to set
  */
  public void setCell(PhoneNumber cell) {
    this.cell = cell;
  }

  /**
  * This gets the age.
  * @return the age
  */
  public int getAge() {
    return age;
  }

  /**
  * This sets the age.
  * @param age the age to set
  */
  public void setAge(int age) {
    this.age = age;
  }

  /**
  * This gets the birthday.
  * @return the birthday
  */
  public Date getBirthday() {
    return birthday;
  }

  /**
  * This sets the birthday.
  * @param birthday the birthday to set
  */
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
  * This gets the email.
  * @return the email
  */
  public Email getEmail() {
    return email;
  }

  /**
  * This sets the email.
  * @param email the email to set
  */
  public void setEmail(Email email) {
    this.email = email;
  }

  /**
  * This gets the date today.
  * @return the date today
  */
  public Date getToday() {
    return today;
  }

  /**
  * This sets the date today.
  * @param today the date today to set
  */
  public void setToday(Date today) {
    this.today = today;
  }

  /**
  * This gets the availbility on Monday.
  * @return the availbility on Monday
  */
  public Day getMon() {
    return mon;
  }

  /**
  * This sets the availability on Monday.
  * @param mon the availability on Monday to set
  */
  public void setMon(Day mon) {
    this.mon = mon;
  }

  /**
  * This gets the availbility on Tuesday.
  * @return the availbility on Tuesday
  */
  public Day getTues() {
    return tues;
  }

  /**
  * This sets the availability on Tuesday.
  * @param mon the availability on Tuesday to set
  */
  public void setTues(Day tues) {
    this.tues = tues;
  }

  /**
  * This gets the availbility on Wednesday.
  * @return the availbility on Wednesday
  */
  public Day getWed() {
    return wed;
  }

  /**
  * This sets the availability on Wednesday.
  * @param mon the availability on Wednesday to set
  */
  public void setWed(Day wed) {
    this.wed = wed;
  }

  /**
  * This gets the availbility on Thursday.
  * @return the availbility on Thursday
  */
  public Day getThur() {
    return thur;
  }

  /**
  * This sets the availability on Thursday.
  * @param mon the availability on Thursday to set
  */
  public void setThur(Day thur) {
    this.thur = thur;
  }

  /**
  * This gets the availbility on Friday.
  * @return the availbility on Friday
  */
  public Day getFri() {
    return fri;
  }

  /**
  * This sets the availability on Friday.
  * @param mon the availability on Friday to set
  */
  public void setFri(Day fri) {
    this.fri = fri;
  }

  /**
  * This gets the availbility on Saturday.
  * @return the availbility on Saturday
  */
  public Day getSat() {
    return sat;
  }

  /**
  * This sets the availability on Saturday.
  * @param mon the availability on Saturday to set
  */
  public void setSat(Day sat) {
    this.sat = sat;
  }

  /**
  * This gets the availbility on Sunday.
  * @return the availbility on Sunday
  */
  public Day getSun() {
    return sun;
  }

  /**
  * This sets the availability on Sunday.
  * @param mon the availability on Sunday to set
  */
  public void setSun(Day sun) {
    this.sun = sun;
  }

  /**
  * This gets if the applicant can work fulltime
  * @return if the applicant can work fulltime
  */
  public boolean isFulltime() {
    return fulltime;
  }

  /**
  * This sets if the applicant can work fulltime
  * @param fulltime sets if the applicant can work fulltime
  */
  public void setFulltime(boolean fulltime) {
    this.fulltime = fulltime;
  }

  /**
  * This gets if the applicant can work parttime
  * @return if the applicant can work parttime
  */
  public boolean isParttime() {
    return parttime;
  }

  /**
  * This sets if the applicant can work parttime
  * @param parttime sets if the applicant can work parttime
  */
  public void setParttime(boolean parttime) {
    this.parttime = parttime;
  }

  /**
  * This gets the number of hours.
  * @return the number of hours
  */
  public int getHours() {
    return hours;
  }

  /**
  * This sets the number of hours.
  * @param hours the number of hours to set
  */
  public void setHours(int hours) {
    this.hours = hours;
  }

  /**
  * This gets if the applicant can work nights
  * @return if the applicant can work nights
  */
  public boolean canWorkNights() {
    return workNights;
  }

  /**
  * This sets if the applicant can work nights
  * @param workNights sets if the applicant can work nights
  */
  public void setWorkNights(boolean workNights) {
    this.workNights = workNights;
  }

  /**
  * This gets the date available
  * @return the date available
  */
  public Date getAvailable() {
    return available;
  }

  /**
  * This sets the date available.
  * @param available the date available to set
  */
  public void setAvailable(Date available) {
    this.available = available;
  }

  /**
  * This gets if the applicant was employed here before.
  * @return if the applicant was employed here before
  */
  public boolean isEmployedHereBefore() {
    return employedHereBefore;
  }

  /**
  * This sets if the applicant was employed here before.
  * @param employedHereBefore sets if the applicant was employed here before
  */
  public void setEmployedHereBefore(boolean employedHereBefore) {
    this.employedHereBefore = employedHereBefore;
  }

  /**
  * This gets if the applicant is certified to work in the US.
  * @return if the applicant is certified to work in the US
  */
  public boolean isCertifiedToWork() {
    return certifiedToWork;
  }

  /**
  * This sets if the applicant is certified to work in the US.
  * @param certifiedToWork sets if the applicant is certified to work in the US.
  */
  public void setCertifiedToWork(boolean certifiedToWork) {
    this.certifiedToWork = certifiedToWork;
  }

  /**
  * This gets if the applicant is a felon.
  * @return if the applicant is a felon
  */
  public Felon getFelon() {
    return felon;
  }

  /**
  * This sets if the applicant is a felon.
  * @param felon sets if the applicant is a felon
  */
  public void setFelon(Felon felon) {
    this.felon = felon;
  }

  /**
  * This gets if the applicant has a driver's license.
  * @return if the applicant has a driver's license
  */
  public boolean hasDl() {
    return dl;
  }

  /**
  * This sets if the applicant has a driver's license.
  * @param dl sets if the applicant has a driver's license
  */
  public void setDl(boolean dl) {
    this.dl = dl;
  }

  /**
  * This gets the high school attended.
  * @return the high school
  */
  public School getHighSchool() {
    return highSchool;
  }

  /**
  * This sets the high school attended.
  * @param highSchool the high school attended
  */
  public void setHighSchool(School highSchool) {
    this.highSchool = highSchool;
  }

  /**
  * This gets the university attended.
  * @return the university attended
  */
  public School getUniv() {
    return univ;
  }

  /**
  * This sets the university attended.
  * @param univ the university to set
  */
  public void setUniv(School univ) {
    this.univ = univ;
  }

  /**
  * This gets the highest degree ascertained.
  * @return the highest degree ascertained
  */
  public School getHighestDegree() {
    return highestDegree;
  }

  /**
  * This sets the highest degree ascertained.
  * @param highestDegree the highest degree ascertained
  */
  public void setHighestDegree(School highestDegree) {
    this.highestDegree = highestDegree;
  }

  /**
  * This gets the applicant's military service.
  * @return the military service
  */
  public Military getMilitary() {
    return military;
  }

  /**
  * This sets the applicant's military service.
  * @param military the military service to set
  */
  public void setMilitary(Military military) {
    this.military = military;
  }

  /**
  * This gets the most recent work experience.
  * @return the most recent work experience
  */
  public Work getWork1() {
    return work1;
  }

  /**
  * This sets the most recent work experience.
  * @param work1 the most recent work experience to set
  */
  public void setWork1(Work work1) {
    this.work1 = work1;
  }

  /**
  * This gets the second most recent work experience.
  * @return the second most recent work experience
  */
  public Work getWork2() {
    return work2;
  }

  /**
  * This sets the most recent work experience.
  * @param work2 the second most recent work experience to set
  */
  public void setWork2(Work work2) {
    this.work2 = work2;
  }

  /**
  * This gets the third most recent work experience.
  * @return the third most recent work experience
  */
  public Work getWork3() {
    return work3;
  }

  /**
  * This sets the most recent work experience.
  * @param work3 the third most recent work experience to set
  */
  public void setWork3(Work work3) {
    this.work3 = work3;
  }

  /**
  * This gets the first reference.
  * @return the first reference
  */
  public Reference getReference1() {
    return reference1;
  }

  /**
  * This sets the first reference.
  * @param reference1 the first reference to set
  */
  public void setReference1(Reference reference1) {
    this.reference1 = reference1;
  }

  /**
  * This gets the second reference.
  * @return the second reference
  */
  public Reference getReference2() {
    return reference2;
  }

  /**
  * This sets the second reference.
  * @param reference2 the second reference to set
  */
  public void setReference2(Reference reference2) {
    this.reference2 = reference2;
  }

  /**
  * This sets the third reference.
  * @param reference3 the third reference to set
  */
  public Reference getReference3() {
    return reference3;
  }

  /**
  * @param reference3 the reference3 to set
  */
  public void setReference3(Reference reference3) {
    this.reference3 = reference3;
  }
}
