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
    assertEquals(full,full);
    assertEquals(abbr,abbr);
    assertNotEquals(abbr,full);
    assertNotEquals(full,"");
    assertEquals(empty4,empty5);
    assertNotEquals(empty4,null);
  }

  @Test
  public void testToString(){
    String fullAssumed = "123 Main St.\n#1A\nAnytown, Maine\n12345";
    assertEquals(fullAssumed, full.toString());
  }
}