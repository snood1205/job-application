package com.sadofftext.jobapplication;

/**
* The class Work stores work experience.
* While the class might seem trivial,
* it is simpler to have a class for work experience
* than to have many constructors for Applicant.
*/
public class Work{
    /* The company worked at */
    private String company;
    /* The name of the last supervisor */
    private Name supervisor;
    /* Number of hours worked per week */
    private int hoursPerWeek;
    /* Address of the company */
    private Address address;
    /* Start date */
    private Date startDate;
    /* End date */
    private Date endDate;
    /* Starting salary */
    private Salary startSalary;
    /* Ending salary */
    private Salary endingSalary;
    /* Phone number */
    private Phone number;
    /* Last job title */
    private String jobTitle;
    /* Reason for leaving */
    private String reasonForLeaving;
    /* Duties and obligations */
    private String duties;
    /* Contact employer? */
    private boolean contact;

    public Work(String company, Name supervisor, int hoursPerWeek, Address address, Date startDate, Date endDate, Salary startSalary,
                Salary endingSalary, Phone number, String jobTitle, String reasonForLeaving, String duties, boolean contact){
        this.company = company;
        this.supervisor = supervisor;
        this.hoursPerWeek = hoursPerWeek;
        this.address = address;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startSalary = startSalary;
        this.endingSalary = endingSalary;
        this.number = number;
        this.jobTitle = jobTitle;
        this.reasonForLeaving = reasonForLeaving;
        this.duties = duties;
        this.contact = contact;
    }
}