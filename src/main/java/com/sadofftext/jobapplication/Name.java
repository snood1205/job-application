package com.sadofftext.jobapplication;

/**
* The class Name stores someone's name.
* While the class might seem trivial,
* it is simpler to have a class for Names
* than to have many constructors for Applicant.
*/
public class Name{
    /* Stores the first name */
    private String firstName;
    /* Stores the middle name */
    private String middleName;
    /* Stores the last name */
    private String lastName;

    /**
    * This is the full constructor for the name class. This
    * constructor is for those with a middle name.
    * @param firstName the firstName to set
    * @param middleName the middleName to set 
    * @param lastName the lastName to set
    */
    public Name(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }  

    /**
    * This is the abbreviated constructor for the name class. This
    * constructor is for those without a middle name.
    * @param firstName the firstName to set
    * @param lastName the lastName to set
    */
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
    }

    /**
    * This gets the first name
    * @return the first name 
    */
    public String getFirstName(){
        return firstName;
    }

    /**
    * This sets the first name
    * @param firstName the first name to set 
    */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
    * This gets the middle name
    * @return the middle name 
    */
    public String getMiddleName(){
        return middleName;
    }

    /**
    * This sets the middle name
    * @param middleName the middle name to set 
    */
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    /**
    * This gets the last name
    * @return the last name 
    */
    public String getLastName(){
        return lastName;
    }

    /**
    * This sets the last name
    * @param lastName the last name to set 
    */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}