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
