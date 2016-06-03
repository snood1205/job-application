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

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AddressTest{
  private Address full;
  private Address abbr;
  private Address empty4;
  private Address empty5;

  @Before
  public void setup(){
    full = new Address("123 Main St.","#1A","Anytown","Maine","12345");
    abbr = new Address("1 First Ave.","Centerville","Pennsylvania","16789");
    empty4 = new Address("","","","");
    empty5 = new Address("","","","","");
  }

  @Test
  public void testEquals(){
    assertEquals(full, full);
    assertEquals(abbr, abbr);
    assertNotEquals(abbr, full);
    assertNotEquals(full, "");
    assertEquals(empty4, empty5);
    assertNotEquals(empty4, null);
  }

  @Test
  public void testToString(){
    String fullAssumed = "123 Main St.\n#1A\nAnytown, Maine\n12345";
    String abbrAssumed = "1 First Ave.\nCenterville, Pennsylvania\n16789";
    String emptyAssumed = "\n, \n";
    assertEquals(fullAssumed, full.toString());
    assertEquals(abbrAssumed, abbr.toString());
    assertEquals(emptyAssumed, empty4.toString());
  }

  @Test
  public void testGetState(){
    String[] states = {
      "Alaska", "Alabama", "Arkansas", "Arizona", "California", "Colorado", "Connecticut",
      "Washington, DC", "Delaware", "Florida", "Georgia", "Guam", "Hawai'i", "Iowa", "Illinois",
      "Indiana", "Kansas", "Kentucky", "Louisiana", "Massachusetts", "Maryland", "Maine", 
      "Michigan", "Minnesota", "Missouri", "Mississippi", "Montana", "North Carolina", 
      "North Dakota", "Nebraska", "New Hampshire", "New Jersey", "New Mexico", "Nevada", 
      "New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", 
      "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Virgin Islands",
      "Vermont", "Washington", "Wisconsin", "West Virginia", "Wyoming"
    };

    String[] abbr = {
      "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "GU", "HI", "IA", "IL", 
      "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", 
      "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX",
      "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY"
    };

    for(int i = 0; i < states.length; i++){
      assertEquals(Address.getState(abbr[i]),states[i]);
    }

    assertEquals(Address.getState("XX"),"");
  }
}