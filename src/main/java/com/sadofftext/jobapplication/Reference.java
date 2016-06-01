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
* The class Reference stores information for a reference.
* While the class might seem trivial,
* it is simpler to have a class for references
* than to have many constructors for Applicant.
*/
public class Reference{
    /* The name */
    private Name name;
    /* The phone number */
    private Phone number;
    /* The circumstances of acquaintance */
    private String circumstances;

    /**
    * This is the constructor for the class Reference.
    * @param name the name to set
    * @param number the phone number to set
    * @param circumstances the circumstances to set
    */
    public Reference(Name name, Phone number, String circumstances){
        this.name = name;
        this.number = number;
        this.circumstances = circumstances;
    }

    /**
    * This gets the name.
    * @return the name
    */
    public Name getName(){
        return name;
    }

    /**
    * This sets the name.
    * @param name the name to set
    */
    public void setName(Name name){
        this.name = name;
    }

    /**
    * This gets the phone number.
    * @return the phone number
    */
    public Phone getNumber(){
        return number;
    }

    /**
    * This sets the phone number.
    * @param number the phone number to set
    */
    public void setNumber(Phone number){
        this.number = number;
    }

    /**
    * This gets the circumstances.
    * @return the circumstances
    */
    public String getCircumstances(){
        return circumstances;
    }

    /**
    * This sets the circumstances.
    * @param circumstances the circumstances to set
    */
    public void setCircumstances(String circumstances){
        this.circumstances = circumstances;
    }
}