package com.sadofftext.jobapplication;

/**
* The class School stores school information.
* While the class might seem trivial,
* it is simpler to have a class for school information
* than to have many constructors for Applicant.
*/
public class School{
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

    /**
    * This is the constructor for the class school.
    * @param name the name to set
    * @param address the address to set
    * @param years the years to set
    * @param graduated set if graduated
    * @param major the major to set
    * @param degree the degree to set 
    */
    public School(String name, Address address, int years, boolean graduated, String major, String degree){
        this.name = name;
        this.address = address;
        this.years = years;
        this.graduated = graduated;
        this.major = major;
        this.degree = degree;
    }

    /**
    * This gets the name.
    * @return the name
    */
    public String getName(){
        return name;
    }

    /**
    * This sets the name.
    * @param name sets the name.
    */
    public void setName(String name){
        this.name = name;
    }

    /**
    * This gets the years.
    * @return the years.
    */
    public int getYears(){
        return years;
    }

    /**
    * This sets the years.
    * @param years the years to set
    */
    public void setYears(int years){
        this.years = years;
    }

    /**
    * This gets the graduated status.
    * @return if has graduated
    */
    public boolean hasGraduated(){
        return graduated;
    }

    /**
    * This sets if graduated.
    * @param graduated sets if graduated.
    */
    public void setGraduated(boolean graduated){
        this.graduated = graduated;
    }

    /**
    * This gets the major.
    * @return the major
    */
    public String getMajor(){
        return major;
    }

    /**
    * This sets the major.
    * @param major the major to set
    */
    public void setMajor(String major){
        this.major = major;
    }

    /**
    * This gets the degree.
    * @return the degree
    */
    public String getDegree(){
        return degree;
    }

    /**
    * This sets the degree.
    * @param degree the degree to set
    */
    public void setDegree(String degree){
        this.degree = degree;
    }
}
