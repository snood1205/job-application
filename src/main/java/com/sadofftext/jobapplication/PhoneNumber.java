package com.sadofftext.jobapplication;

/**
* The class PhoneNumber stores someone's phone number.
* While the class might seem trivial,
* it is simpler to have a class for phone numbers
* than to have many constructors for Applicant.
*/
public class PhoneNumber{
    /* Stores the area code */
    private String areacode;
    /* Stores the exchange */
    private String exchange;
    /* Stores the last four */
    private String lastFour;

    public PhoneNumber(int areacode, int exchange, int lastFour){
        this.areacode = areacode;
        this.exchange = exchange;
        this.lastFour = lastFour;
    }

    public int getAreacode(){
        return areacode;
    }

    public void setAreacode(int areacode){
        this.areacode = areacode;
    }

    public int getExchange(){
        return exchange;
    }

    public void setExchange(int exchange){
        this.exchange = exchange;
    }

    public int getLastFour(){
        return lastFour;
    }

    public void setLastFour(int lastFour){
        this.lastFour = lastFour;
    }
}