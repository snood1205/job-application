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
* The class School stores school information.
* While the class might seem trivial,
* it is simpler to have a class for school information
* than to have many constructors for Applicant.
*
* @since 1.0.0
* @author Eli Sadoff
*/
public class School {
  /* The name of the school */
  private String name;
  /* The address of the school */
  private Address address;
  /* The number of years school was attended */
  private int years;
  /* If graduated from school */
  private boolean graduated;
  /* Major at school */
  private String major;
  /* Degree acheived from school */
  private String degree;
  /* The GPA */
  private double gpa;

  /**
  * This is the constructor for the class school.
  * @param name the name to set
  * @param address the address to set
  * @param years the years to set
  * @param graduated set if graduated
  * @param major the major to set
  * @param degree the degree to set 
  */
  public School(String name, Address address, int years, boolean graduated, String major, 
    String degree, double gpa) {
    this.name = name;
    this.address = address;
    this.years = years;
    this.graduated = graduated;
    this.major = major;
    this.degree = degree;
    this.gpa = gpa;
  }

  /**
  * This gets the name.
  * @return the name
  */
  public String getName() {
    return name;
  }

  /**
  * This sets the name.
  * @param name sets the name.
  */
  public void setName(String name) {
    this.name = name;
  }

  /**
  * This gets the address.
  * @return the address
  */
  public Address getAddress(){
    return address;
  }

  /**
  * This sets the address.
  * @param address the address to est
  */
  public void setAddress(Address address){
    this.address = address;
  }

  /**
  * This gets the years.
  * @return the years.
  */
  public int getYears() {
    return years;
  }

  /**
  * This sets the years.
  * @param years the years to set
  */
  public void setYears(int years) {
    this.years = years;
  }

  /**
  * This gets the graduated status.
  * @return if has graduated
  */
  public boolean hasGraduated() {
    return graduated;
  }

  /**
  * This sets if graduated.
  * @param graduated sets if graduated.
  */
  public void setGraduated(boolean graduated) {
    this.graduated = graduated;
  }

  /**
  * This gets the major.
  * @return the major
  */
  public String getMajor() {
    return major;
  }

  /**
  * This sets the major.
  * @param major the major to set
  */
  public void setMajor(String major) {
    this.major = major;
  }

  /**
  * This gets the degree.
  * @return the degree
  */
  public String getDegree() {
    return degree;
  }

  /**
  * This sets the degree.
  * @param degree the degree to set
  */
  public void setDegree(String degree) {
    this.degree = degree;
  }

  /**
  * This gets the GPA.
  * @return the GPA
  */
  public double getGpa() {
    return gpa;
  }

  /**
  * This sets the GPA.
  * @param gpa the GPA to set
  */
  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  @Override
  public String toString(){
    String nm = "Name:\t" + getName() + "\n";
    String ad = "Address:\n" + getAddress().toString() + "\n";
    String yr = "Years:\t" + Integer.toString(getYears()) + "\n";
    String gr = "Graduated:\t" + Boolean.toString(hasGraduated()) + "\n";
    String mj = "Major:\t" + getMajor() + "\n";
    String dg = "Degree:\t" + getDegree() + "\n";
    String gpa = "GPA:\t" + Double.toString(getGpa());
    return nm + ad + yr + gr + mj + dg + gpa; 
  }
}
