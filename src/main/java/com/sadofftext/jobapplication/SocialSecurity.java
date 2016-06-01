package com.sadofftext.jobapplication;

/**
* The class SocialSecurity stores someone's
* social security number.
* While the class might seem trivial,
* it is simpler to have a class for SSNs
* than to have many constructors for Applicant.
*/
public class SocialSecuriy{
    /* Stores the first three numbers */
    private String firstThree;
    /* Stores the middle two numbers */
    private String middleTwo;
    /* Stores the last four */
    private String lastFour;

    /**
    * This is the constructor for the 
    * SocialSecurity class.
    * @param firstThree the first three digits
    * @param middleTwo the middle two digits
    * @param lastFour the last four digits
    */
    public PhoneNumber(String firstThree, String middleTwo, String lastFour){
        this.firstThree = firstThree;
        this.middleTwo = middleTwo;
        this.lastFour = lastFour;
    }

    /**
    * This gets the first three digits.
    * @return the first three digit
    */
    public String getFirstThree(){
        return firstThree;
    }

    /**
    * This sets the first three digits.
    * @param firstThree the first three digits to set 
    */
    public void setFirstThree(String firstThree){
        this.firstThree = firstThree;
    }

    /**
    * This gets the middle two digits.
    * @return the middle two digits
    */
    public String getMiddleTwo(){
        return middleTwo;
    }

    /**
    * This sets the middle two digits.
    * @param middleTwo the middle two digits to set
    */
    public void setMiddleTwo(String middleTwo){
        this.middleTwo = middleTwo;
    }

    /**
    * This gets the last four digits.
    * @return the last four digits 
    */
    public String getLastFour(){
        return lastFour;
    }

    /**
    * This sets the last four digits.
    * @param lastFour the last four digits to set
    */
    public void setLastFour(String lastFour){
        this.lastFour = lastFour;
    }

    /**
    * This override's Object's 
    * <code>toString</code> method.
    * @return string representation of a
    * SSN in the format XXX-XX-XXXX
    */
    @Override
    public String toString(){
        return getFirstThree() + "-" + getMiddleTwo() + "-" + getLastFour();
    }
}