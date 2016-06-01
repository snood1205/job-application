package com.sadofftext.jobapplication;

/**
* The class Address stores someone's address.
* While the class might seem trivial,
* it is simpler to have a class for addresses
* than to have many constructors for Applicant.
*/
public class Address{
    /* Stores the first line of an address */
    private String addressLine1;
    /* Stores the optional second line of an address */
    private String addressLine2;
    /* Stores the city */
    private String city;
    /* Stores the state */
    private String state;
    /* Stores the zip code */
    private String zipcode;

    /**
    * This is the full constructor for Address.
    * This is to be used by people with a multi-line address.
    * @param addressLine1 the first address line to set
    * @param addressLine2 the second address line to set
    * @param city the city to set
    * @param state the state to set
    * @param zipcode the zip code to set
    */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    /**
    * This is the abbreviated constructor for Address.
    * This is to be used by people with a single line address.
    * @param addressLine1 the address line to set
    * @param city the city to set
    * @param state the state to set
    * @param zipcode the zip code to set
    */
    public Address(String address, String city, String state, String zipcode){
        this.addressLine1 = address;
        this.addressLine2 = "";
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

    /** 
    * This gets the first address line
    * @return the first address line
    */
    public String getAddressLine1(){
        return addressLine1;
    }

    /**
    * This sets the first address line
    * @param addressLine1 the first address line to set
    */
    public void setAddressLine1(String addressLine1){
        this.addressLine1 = addressLine1;
    }

    /** 
    * This gets the optional second address line
    * @return the optional second address line
    */
    public String getAddressLine2(){
        return addressLine2;
    }

    /**
    * This sets the option second address line
    * @param addressLine1 the optional second address line to set
    */
    public void setAddressLine2(String addressLine2){
        this.addressLine2 = addressLine2;
    }

    /** 
    * This gets the city
    * @return the city
    */
    public String getCity(){
        return city;
    }

    /**
    * This sets the city
    * @param addressLine1 the city to set
    */
    public void setCity(String city){
        this.city = city;
    }

    /** 
    * This gets the state
    * @return the state
    */
    public String getState(){
        return state;
    }

    /**
    * This sets the state
    * @param addressLine1 the state to set
    */
    public void setState(String state){
        this.state = state;
    }

    /** 
    * This gets the zip code
    * @return the zip code
    */
    public String getZipcode(){
        return zipcode;
    }

    /**
    * This sets the zip code
    * @param addressLine1 the zip code to set
    */
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
}