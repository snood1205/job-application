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
* The class Day stores a day.
* While the class might seem trivial,
* it is simpler to have a class for days
* than to have many constructors for Applicant.
*/
public class Day{
    /* The day of the week */
    private String dayOfWeek;
    /* If available this day */
    private boolean available;
    /* Time applicant can start */
    private Time start;
    /* Time applicant ends working */
    private Time end;

    /**
    * This is the constructor for Day.
    * @param dayOfWeek the day of the week to set 
    * @param available sets if applicant is available
    * @param start the start time to set 
    * @param end the end time to set
    */
    public Day(String dayOfWeek, boolean available, Time start, Time end){
        this.dayOfWeek = dayOfWeek;
        this.available = available;
        this.start = start;
        this.end = end;
    }

    /**
    * This gets the day of the week.
    * @return the day of the week
    */
    public String getDayOfWeek(){
        return dayOfWeek;
    }

    /**
    * This sets the day of the week.
    * @param dayOfWeek the day of the week to set 
    */
    public void setDayOfWeek(String dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }

    /**
    * This gets if the applicant is available.
    * @return if the applicant is available
    */
    public boolean isAvailable(){
        return available;
    }

    /**
    * This sets if the applicant is available.
    * @param available sets if the applicant is available. 
    */
    public void setAvailable(boolean available){
        this.available = available;
    }

    /**
    * This gets the start time.
    * @return the start time
    */
    public Time getStart(){
        return start;
    }

    /**
    * This sets the start time.
    * @param start the start time to set
    */
    public void setStart(Time start){
        this.start = start;
    }

    /**
    * This gets the end time.
    * @return the end time
    */
    public Time getEnd(){
        return end;
    }

    /**
    * This sets the end time.
    * @return the end time.
    */
    public void setEnd(Time end){
        this.end = end;
    }

    /**
    * This override's Object's 
    * <code>toString</code> method.
    * @return string representation of a
    * day in the format:<br>
    * (Not) Available on  DAY OF WEEK (from START to END).
    */
    @Override
    public String toString(){
        if(isAvailable()){
            return "Available on " + getDayOfWeek() + " from " + getStart().toString() + " to " + getEnd().toString() + ".";
        }
        return "Not available on " + getDayOfWeek() + ".";
    }
}