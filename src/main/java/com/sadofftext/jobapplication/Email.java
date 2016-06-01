package com.sadofftext.jobapplication;

/**
* The class Email stores an email address.
* While the class might seem trivial,
* it is simpler to have a class for email addresses
* than to have many constructors for Applicant.
*/
public class Email{
    /* Stores the username */
    private String username;
    /* Stores the domain */
    private String domain;

    /**
    * This is the constructor for the 
    * Email class.
    * @param username the username to set
    * @param domain the domain to set
    */
    public Email(String username, String domain){
        this.username = username;
        this.domain = domain;
    }

    /**
    * This gets the username.
    * @return the username 
    */
    public String getUsername(){
        return username;
    }

    /**
    * This sets the username.
    * @param username the username to set
    */
    public void setUsername(String username){
        this.username = username;
    }

    /**
    * This gets the domain.
    * @return the domain
    */
    public String getDomain(){
        return domain;
    }

    /**
    * This sets the domain.
    * @param domain the domain to set
    */
    public void setDomain(String domain){
        this.domain = domain;
    }

    /**
    * This override's Object's 
    * <code>toString</code> method.
    * @return string representation of an
    * email address in the format USERNAME@DOMAIN
    */
    @Override
    public String toString(){
        return getUsername() + "@" + getDomain();
    }
}
