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
* The class Date stores a date.
* While the class might seem trivial,
* it is simpler to have a class for dates
* than to have many constructors for Applicant.
*/
public class Date{
    /* Stores the day */
    private int day;
    /* Stores the month */
    private int month;
    /* Stores the year */
    private int year;

    /**
    * This is the constructor for the
    * Date class.
    * @param day the day to set
    * @param month the month to set
    * @param year the year to set
    */
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
    * This gets the day.
    * @return the day
    */
    public int getDay(){
        return day;
    }

    /**
    * This sets the day.
    * @param day the day to set
    */
    public void setDay(int day){
        this.day = day;
    }

    /**
    * This gets the month.
    * @return the month 
    */
    public int getMonth(){
        return month;
    }

    /**
    * This sets the month.
    * @param month the month to set
    */
    public void setMonth(int month){
        this.month = month;
    }

    /**
    * This gets the year.
    * @return the year
    */
    public int getYear(){
        return year;
    }

    /**
    * This sets the year.
    * @param year the year to set
    */
    public void setYear(int year){
        this.year = year;
    }

    /**
    * This override's Object's 
    * <code>toString</code> method.
    * @return string representation of a
    * date in the format MONTH DAY, YEAR.
    */
    @Override
    public String toString(){
        String day = Integer.toString(getDay());
        String month;
        switch (getMonth()) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            default: month = "December";
        }
        String year = Integer.toString(getYear());
        return month + " " + day + ", " + year;
    }
}