package com.sadofftext.jobapplication;

public class Applicant{
    /* The name */
    private Name name; 
    /* The social security number */
    private SocialSecurity ssn;
    /* The address */
    private Address address;
    /* The home phone number */
    private Phone home;
    /* The cell phone number */
    private Phone cell;
    /* The age */
    private int age;
    /* The birthday */
    private Date birthday;
    /* The email address */
    private Email email;
    /* The date today */
    private Date today;
    /* Monday availability */
    private Day mon;
    /* Tuesday availability */
    private Day tues;
    /* Wednesday availability */
    private Day wed;
    /* Thursday availability */
    private Day thur;
    /* Friday availability */
    private Day fri;
    /* Saturday availability */
    private Day sat;
    /* Sunday availability */
    private Day sun;
    /* Can work full time */
    private boolean fulltime;
    /* Can work part time */
    private boolean parttime;
    /* Number of hours a week */
    private int hours;
    /* Can work nights */
    private boolean nights;
    /* Date available to begin */
    private Date available;
    /* Has been employed here before */
    private boolean employedHereBefore;
    /* Is certified to work in the US */
    private boolean certifiedToWork;
    /* Has commited a felony */
    private boolean felon;
    /* Explanation for felony committed */
    private String felonExplain;
    /* Has a drivers license */
    private boolean dl;
    /* Last high school attended */
    private School highSchool;
    /* Last university attended */
    private School univ;
    /* Highest degree ascertained (above Univ.) */
    private School highestDegree;
    /* Military service information */
    private Military military;
    /* Most recent work experience */
    private Work work1;
    /* Second most recent work experience */
    private Work work2;
    /* Third most recent work experience */
    private Work work3;
    /* First reference */
    private Reference reference1;
    /* Second reference */
    private Reference reference2;
    /* Third reference */
    private Reference reference3;
}