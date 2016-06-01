package com.sadofftext.jobapplication;

/**
* The class Military stores military service information.
* While the class might seem trivial,
* it is simpler to have a class for military service information
* than to have many constructors for Applicant.
*/
public class Military{
    /* If has served */
    private boolean served;
    /* Branch served in */
    private String branch;
    /* Date entered */
    private Date entryDate;
    /* Date discharged */
    private Date dischargeDate;

    /**
    * This is the constructor for the class Military.
    * @param served sets if has served
    * @param branch the branch to set
    * @param entryDate the entryDate to set
    * @param dischargeDate the dischargeDate to set
    */
    public Military(boolean served, String branch, Date entryDate, Date dischargeDate){
        this.served = served;
        this.branch = branch;
        this.entryDate = entryDate;
        this.dischargeDate = dischargeDate;
    }

    /**
    * This gets if has served.
    * @return if has served
    */
    public boolean hasServed(){
        return served;
    }

    /**
    * This sets if has served.
    * @param served sets if has served 
    */
    public void setServed(boolean served){
        this.served = served;
    }

    /**
    * This gets the branch.
    * @return the branch
    */
    public String getBranch(){
        return branch;
    }

    /**
    * This sets the branch.
    * @param branch the branch to set
    */
    public void setBranch(String branch){
        this.branch = branch;
    }

    /**
    * This gets the entryDate.
    * @return the entryDate
    */
    public Date getEntryDate(){
        return entryDate;
    }

    /**
    * This sets the entryDate.
    * @param entryDate the entryDate to set
    */
    public void setEntryDate(Date entryDate){
        this.entryDate = entryDate;
    }

    /**
    * This gets the dischargeDate.
    * @return the dischargeDate
    */
    public Date getDischargeDate(){
        return dischargeDate;
    }

    /**
    * This sets the dischargeDate.
    * @param dischargeDate the dischargeDate to set
    */
    public void setDischargeDate(Date dischargeDate){
        this.dischargeDate = dischargeDate;
    }
}