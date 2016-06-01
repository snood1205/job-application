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

    /**
    * This is the constructor for the 
    * PhoneNumber class.
    * @param areacode the area code (the first three digits)
    * @param exchange the exchange (the middle three digits)
    * @param lastFour the last four digits
    */
    public PhoneNumber(String areacode, String exchange, String lastFour){
        this.areacode = areacode;
        this.exchange = exchange;
        this.lastFour = lastFour;
    }

    /**
    * This gets the area code.
    * @return the area code 
    */
    public String getAreacode(){
        return areacode;
    }

    /**
    * This sets the area code.
    * @param areacode the area code to set 
    */
    public void setAreacode(String areacode){
        this.areacode = areacode;
    }

    /**
    * This gets the exchange.
    * @return the exchange
    */
    public String getExchange(){
        return exchange;
    }

    /**
    * This sets the exchange.
    * @param exchange the exchange to set
    */
    public void setExchange(String exchange){
        this.exchange = exchange;
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
    * phone number in the format (AREACODE) EXCHANGE
    * - LAST FOUR.
    */
    @Override
    public String toString(){
        return "(" + getAreacode() + ") " + getExchange() + " - " + getLastFour();
    }
}