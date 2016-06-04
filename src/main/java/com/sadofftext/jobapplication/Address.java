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
* The class Address stores someone's address.
* While the class might seem trivial,
* it is simpler to have a class for addresses
* than to have many constructors for Applicant.
*
* @since 1.0.0
* @author Eli Sadoff
*/
public class Address {
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
                 String zipcode) {
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }

  /**
  * This is the abbreviated constructor for Address.
  * This is to be used by people with a single line address.
  * @param address the address line to set
  * @param city the city to set
  * @param state the state to set
  * @param zipcode the zip code to set
  */
  public Address(String address, String city, String state, String zipcode) {
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
  public String getAddressLine1() {
    return addressLine1;
  }

  /**
  * This sets the first address line
  * @param addressLine1 the first address line to set
  */
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /** 
  * This gets the optional second address line
  * @return the optional second address line
  */
  public String getAddressLine2() {
    return addressLine2;
  }

  /**
  * This sets the option second address line
  * @param addressLine2 the optional second address line to set
  */
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  /** 
  * This gets the city
  * @return the city
  */
  public String getCity() {
    return city;
  }

  /**
  * This sets the city
  * @param city the city to set
  */
  public void setCity(String city) {
    this.city = city;
  }

  /** 
  * This gets the state
  * @return the state
  */
  public String getState() {
    return state;
  }

  /**
  * This sets the state
  * @param state the state to set
  */
  public void setState(String state) {
    this.state = state;
  }

  /** 
  * This gets the zip code
  * @return the zip code
  */
  public String getZipcode() {
    return zipcode;
  }

  /**
  * This sets the zip code
  * @param zipcode the zip code to set
  */
  public void setZipcode(String zipcode) {
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
  public String toString() {
    String addressLine;
    if(getAddressLine2().equals("")) {
      addressLine = getAddressLine1();
    } else{
      addressLine = getAddressLine1() + "\n" + getAddressLine2();
    }
    return addressLine + "\n" + getCity() + ", " + getState() + "\n" + getZipcode();
  }

  @Override
  public boolean equals(Object o){
    if(o instanceof Address){
      Address a = (Address) o;
      boolean al1 = getAddressLine1().equals(a.getAddressLine1());
      boolean al2 = getAddressLine2().equals(a.getAddressLine2());
      boolean cy = getCity().equals(a.getCity());
      boolean st = getState().equals(a.getState());
      boolean zc = getZipcode().equals(a.getZipcode());
      return al1 && al2 && cy && st && zc;
    }
    return false;
  }

  public static String getState(String stateAbbr) {
    switch (stateAbbr) {
      case "AK": 
        return "Alaska";
      case "AL": 
        return "Alabama";
      case "AR": 
        return "Arkansas";
      case "AZ": 
        return "Arizona";
      case "CA": 
        return "California";
      case "CO": 
        return "Colorado";
      case "CT": 
        return "Connecticut";
      case "DC": 
        return "Washington, DC";
      case "DE": 
        return "Delaware";
      case "FL": 
        return "Florida";
      case "GA": 
        return "Georgia";
      case "GU": 
        return "Guam";
      case "HI": 
        return "Hawai'i";
      case "IA": 
        return "Iowa";
      case "IL": 
        return "Illinois";
      case "IN": 
        return "Indiana";
      case "KS": 
        return "Kansas";
      case "KY": 
        return "Kentucky";
      case "LA": 
        return "Louisiana";
      case "MA": 
        return "Massachusetts";
      case "MD": 
        return "Maryland";
      case "ME": 
        return "Maine";
      case "MI": 
        return "Michigan";
      case "MN": 
        return "Minnesota";
      case "MO": 
        return "Missouri";
      case "MS": 
        return "Mississippi";
      case "MT": 
        return "Montana";
      case "NC": 
        return "North Carolina";
      case "ND": 
        return "North Dakota";
      case "NE": 
        return "Nebraska";
      case "NH": 
        return "New Hampshire";
      case "NJ": 
        return "New Jersey";
      case "NM": 
        return "New Mexico";
      case "NV": 
        return "Nevada";
      case "NY": 
        return "New York";
      case "OH": 
        return "Ohio";
      case "OK": 
        return "Oklahoma";
      case "OR": 
        return "Oregon";
      case "PA": 
        return "Pennsylvania";
      case "PR": 
        return "Puerto Rico";
      case "RI": 
        return "Rhode Island";
      case "SC": 
        return "South Carolina";
      case "SD": 
        return "South Dakota";
      case "TN": 
        return "Tennessee";
      case "TX": 
        return "Texas";
      case "UT": 
        return "Utah";
      case "VA": 
        return "Virginia";
      case "VI": 
        return "Virgin Islands";
      case "VT": 
        return "Vermont";
      case "WA": 
        return "Washington";
      case "WI": 
        return "Wisconsin";
      case "WV": 
        return "West Virginia";
      case "WY": 
        return "Wyoming";
      default: 
        return "";
    }
  }
}
