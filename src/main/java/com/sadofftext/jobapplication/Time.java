package com.sadofftext.jobapplication;

/**
* The class Time stores a time.
* While the class might seem trivial,
* it is simpler to have a class for times
* than to have many constructors for Applicant.
*/
public class Time{
    /* Stores the hour */
    private int hour;
    /* Stores the minutes */
    private int minutes;
    /* Stores if PM */
    private boolean pm;

    /**
    * This is the constructor for the time class.
    * @param hour the hour to set 
    * @param minutes the minutes to set
    * @param pm sets if it is pm
    */
    public Time(int hour, int minutes, boolean pm){
        this.hour = hour;
        this.minutes = minutes;
        this.pm = pm;
    }

    /**
    * This gets the hour.
    * @return the hour
    */
    public int getHour(){
        return hour;
    }

    /**
    * This sets the hour.
    * @param hour the hour to set
    */
    public void setHour(int hour){
        this.hour = hour;
    }

    /**
    * This gets the minutes.
    * @return the minutes
    */
    public int getMinutes(){
        return minutes;
    }

    /**
    * This sets the minutes.
    * @param minutes the minutes to set
    */
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    /**
    * This gets if it is pm.
    * @return is pm?
    */
    public boolean isPM(){
        return pm;
    }

    /**
    * This sets if it is pm.
    * @param pm sets if it is pm
    */
    public void setPM(boolean pm){
        this.pm = pm;
    }

    /**
    * This override's Object's 
    * <code>toString</code> method.
    * @return string representation of a
    * time address in the format HH:MM AM/PM
    */
    @Override
    public String toString(){
        String hour = Integer.toString(getHour());
        String minutes;
        if(getMinutes() < 10){
            minutes = "0" + Integer.toString(getMinutes());
        } else{
            minutes = Integer.toString(getMinutes());
        }
        if(isPM()){
            return hour + ":" + minutes + " PM";
        }
        return hour + ":" + minutes + " AM";
    }
}