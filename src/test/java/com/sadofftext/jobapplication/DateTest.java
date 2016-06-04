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

public class DateTest{
  private Date zero;
  private Date one;
  private Date preEpoch;

  @Before
  public void setup(){
    zero = new Date(0, 0, 0);
    one = new Date(1, 1, 1);
    preEpoch = new Date(31, 12, 1969);
  }

  @Test
  public void testEquals(){
    Date dec3170 = new Date(31, 12, 1970);
    assertNotEquals(dec3170, preEpoch);
    assertEquals(preEpoch, new Date(31, 12, 1969));
    assertNotEquals(preEpoch, "");
  }

  @Test
  public void testToString(){
    String zeroAssumed = " 0, 0";
    String oneAssumed = "January 1, 1";
    String preEpochAssumed = "December 31, 1969";
    assertEquals(zero.toString(),zeroAssumed);
    assertEquals(one.toString(), oneAssumed);
    assertEquals(preEpoch.toString(), preEpochAssumed);
  }
}