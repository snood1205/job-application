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