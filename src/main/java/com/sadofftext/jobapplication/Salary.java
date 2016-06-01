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
* The class Salary stores salaries.
* While the class might seem trivial,
* it is simpler to have a class for salaries
* than to have many constructors for Work.
*/
public class Salary{
    /* If the wage is hourly */
    private boolean hourly;
    /* Rate per yr or per hr */
    private double rate;

    /**
    * This is the constructor for the class Salary.
    * @param hourly sets if the wage is hourly
    * @param rate the rate to set 
    */
    public Salary(boolean hourly, double rate){
        this.hourly = hourly;
        this.rate = rate;
    }

    /**
    * This gets if the wage is hourly.
    * @return if the wage is hourly.
    */
    public boolean isHourly(){
        return hourly;
    }

    /**
    * This sets if the wage is hourly.
    * @param hourly sets if the wage is hourly
    */
    public void setHourly(boolean hourly){
        this.hourly = hourly;
    }

    /**
    * This gets the rate.
    * @return the rate
    */
    public double getRate(){
        return rate;
    }

    /**
    * This sets the rate.
    * @param rate the rate to set
    */
    public void setRate(double rate){
        this.rate = rate;
    }
}