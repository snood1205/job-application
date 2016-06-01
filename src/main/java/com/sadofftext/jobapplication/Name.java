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
* The class Name stores someone's name.
* While the class might seem trivial,
* it is simpler to have a class for names
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
    * @param firstName the first name to set
    * @param middleName the middle name to set 
    * @param lastName the last name to set
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
    * This gets the first name.
    * @return the first name 
    */
    public String getFirstName(){
        return firstName;
    }

    /**
    * This sets the first name.
    * @param firstName the first name to set 
    */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
    * This gets the middle name.
    * @return the middle name 
    */
    public String getMiddleName(){
        return middleName;
    }

    /**
    * This sets the middle name.
    * @param middleName the middle name to set 
    */
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    /**
    * This gets the last name.
    * @return the last name 
    */
    public String getLastName(){
        return lastName;
    }

    /**
    * This sets the last name.
    * @param lastName the last name to set 
    */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
    * This override's Object's 
    * <code>toString</code> method.
    * @return string representation of a
    * name in the format FIRST NAME MIDDLE NAME
    * (if one exists) LAST NAME.
    */
    @Override
    public String toString(){
        if(getMiddleName().equals("")){
            return getFirstName() + " " + getLastName();
        }
        return getFirstName() + " " + getMiddleName() + " " + getLastName();
    }
}