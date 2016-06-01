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

    public Applicant(Name name, SocialSecurity ssn, Address address, Phone home, Phone cell, int age, Date birthday,
                    Email email, Date today, Day mon, Day tues, Day wed, Day thur, Day fri, Day sat, Day sun, boolean fulltime,
                    boolean parttime, int hours, boolean nights, Date available, boolean employedHereBefore, boolean certifiedToWork,
                    boolean felon, String felonExplain, boolean dl, School highSchool, School univ, School highestDegree, 
                    Military military, Work work1, Work work2, Work work3, Reference reference1, Reference reference2,
                    Reference reference3){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.home = home;
        this.cell = cell;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.today = today;
        this.mon = mon;
        this.tues = tues;
        this.wed = wed;
        this.thur = thur;
        this.fri = fri;
        this.sat = sat;
        this.sun = sun;
        this.fulltime = fulltime;
        this.parttime = parttime;
        this.hours = hours;
        this.nights = nights;
        this.available = available;
        this.employedHereBefore = employedHereBefore;
        this.certifiedToWork = certifiedToWork;
        this.felon = felon;
        this.felonExplain = felonExplain;
        this.dl = dl;
        this.highSchool = highSchool;
        this.univ = univ;
        this.highestDegree = highestDegree;
        this.military = military;
        this.work1 = work1;
        this.work2 = work2;
        this.work3 = work3;
        this.reference1 = reference1;
        this.reference2 = reference2;
        this.reference3 = reference3;
    }
}