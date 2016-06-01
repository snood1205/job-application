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

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
* The class Address stores someone's address.
* While the class might seem trivial,
* it is simpler to have a class for addresses
* than to have many constructors for Applicant.
*/
public class Address{
    /* Stores the first line of an address */
    private String addressLine1;
    /* Stores the optional second line of an address */
    private String addressLine2;
    /* Stores the city */
    private String city;
    /* Stores the state */
    private String state;
    /* Stores the zip code */
    private String zipcode;

    /**
    * This is the full constructor for Address.
    * This is to be used by people with a multi-line address.
    * @param addressLine1 the first address line to set
    * @param addressLine2 the second address line to set
    * @param city the city to set
    * @param state the state to set
    * @param zipcode the zip code to set
    */
    public Address(String addressLine1, String addressLine2, String city, String state, 
                   String zipcode){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    /**
    * This is the abbreviated constructor for Address.
    * This is to be used by people with a single line address.
    * @param addressLine1 the address line to set
    * @param city the city to set
    * @param state the state to set
    * @param zipcode the zip code to set
    */
    public Address(String address, String city, String state, String zipcode){
        this.addressLine1 = address;
        this.addressLine2 = "";
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    /** 
    * This gets the first address line
    * @return the first address line
    */
    public String getAddressLine1(){
        return addressLine1;
    }

    /**
    * This sets the first address line
    * @param addressLine1 the first address line to set
    */
    public void setAddressLine1(String addressLine1){
        this.addressLine1 = addressLine1;
    }

    /** 
    * This gets the optional second address line
    * @return the optional second address line
    */
    public String getAddressLine2(){
        return addressLine2;
    }

    /**
    * This sets the option second address line
    * @param addressLine1 the optional second address line to set
    */
    public void setAddressLine2(String addressLine2){
        this.addressLine2 = addressLine2;
    }

    /** 
    * This gets the city
    * @return the city
    */
    public String getCity(){
        return city;
    }

    /**
    * This sets the city
    * @param addressLine1 the city to set
    */
    public void setCity(String city){
        this.city = city;
    }

    /** 
    * This gets the state
    * @return the state
    */
    public String getState(){
        return state;
    }

    /**
    * This sets the state
    * @param addressLine1 the state to set
    */
    public void setState(String state){
        this.state = state;
    }

    /** 
    * This gets the zip code
    * @return the zip code
    */
    public String getZipcode(){
        return zipcode;
    }

    /**
    * This sets the zip code
    * @param addressLine1 the zip code to set
    */
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

    /**
    * This override's Object's 
    * <code>toString</code> method.
    * @return string representation of an
    * address in the format:<br> 
    * ADDRESS LINE 1 <br>
    * ADDRESS LINE 2 (If exists) <br>
    * CITY, STATE <br>
    * ZIPCODE
    */
    @Override
    public String toString(){
        String addressLine;
        if(getAddressLine2().equals("")){
            addressLine = getAddressLine1();
        } else{
            addressLine = getAddressLine1() + "\n" + getAddressLine2();
        }
        return addressLine + "\n" + getCity() + ", " + getState() + "\n" + getZipcode();
    }

    public static JPanel getForm(){
        String[] stateAbbr = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", 
                              "GU", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", 
                              "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", 
                              "NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", 
                              "TN", "TX", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY"};

        JLabel lAddressLine1 = new JLabel("Address Line 1");
        JLabel lAddressLine2 = new JLabel("Address Line 2");
        JLabel lCity = new JLabel("City");
        JLabel lState = new JLabel("State");
        JLabel lZipcode = new JLabel("Zip Code");

        JTextField addressLine1 = new JTextField(40);
        JTextField addressLine2 = new JTextField(40);
        JTextField city = new JTextField(20);
        JComboBox<String> state = new JComboBox<String>(stateAbbr);
        JTextField zipcode = new JTextField(6);

        JPanel panel = new JPanel();
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        panel.setLayout(gridbag);

        c.gridx = 0;
        c.gridy = 0;
        panel.add(lAddressLine1, c);

        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(addressLine1, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        panel.add(lAddressLine2, c);

        c.gridx = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(addressLine2, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        panel.add(lCity, c);

        c.gridx = 1;
        panel.add(city, c);

        c.gridx = 2;
        panel.add(lState, c);

        c.gridx = 3;
        panel.add(state, c);

        c.gridx = 4;
        panel.add(lZipcode, c);

        c.gridx = 5;
        panel.add(zipcode, c);

        return panel;
    }

    public static String getState(String stateAbbr){
        switch (stateAbbr) {
            case "AK": return "Alaska";
            case "AL": return "Alabama";
            case "AR": return "Arkansas";
            case "AZ": return "Arizona";
            case "CA": return "California";
            case "CO": return "Colorado";
            case "CT": return "Connecticut";
            case "DC": return "Washington, DC";
            case "DE": return "Delaware";
            case "FL": return "Florida";
            case "GA": return "Georgia";
            case "GU": return "Guam";
            case "HI": return "Hawai'i";
            case "IA": return "Iowa";
            case "IL": return "Illinois";
            case "IN": return "Indiana";
            case "KS": return "Kansas";
            case "KY": return "Kentucky";
            case "LA": return "Louisiana";
            case "MA": return "Massachusetts";
            case "MD": return "Maryland";
            case "ME": return "Maine";
            case "MI": return "Michigan";
            case "MN": return "Minnesota";
            case "MO": return "Missouri";
            case "MS": return "Mississippi";
            case "MT": return "Montana";
            case "NC": return "North Carolina";
            case "ND": return "North Dakota";
            case "NE": return "Nebraska";
            case "NH": return "New Hampshire";
            case "NJ": return "New Jersey";
            case "NM": return "New Mexico";
            case "NV": return "Nevada";
            case "NY": return "New York";
            case "OH": return "Ohio";
            case "OK": return "Oklahoma";
            case "OR": return "Oregon";
            case "PA": return "Pennsylvania";
            case "PR": return "Puerto Rico";
            case "RI": return "Rhode Island";
            case "SC": return "South Carolina";
            case "SD": return "South Dakota";
            case "TN": return "Tennessee";
            case "TX": return "Texas";
            case "UT": return "Utah";
            case "VA": return "Virginia";
            case "VI": return "Virgin Islands";
            case "VT": return "Vermont";
            case "WA": return "Washington";
            case "WI": return "Wisconsin";
            case "WV": return "West Virginia";
            case "WY": return "Wyoming";
            default: return "";
        }
    }
}