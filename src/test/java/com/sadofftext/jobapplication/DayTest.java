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

public class DayTest {
  private Day zeroFalse;
  private Day zeroTrue;
  private Day oneFalse;
  private Day oneTrue;

  @Before
  public void setup(){
    zeroFalse = new Day("", false, null, null);
    zeroTrue = new Day("", true, new Time(0, 0, true), new Time(0, 0, true));
    oneFalse = new Day("Monday", false, null, null);
    oneTrue = new Day("Monday", true, new Time(1, 0, false), new Time(1, 0, true));
  }

  @Test
  public void testEquals(){
    assertEquals(zeroFalse, zeroFalse);
    assertNotEquals(zeroFalse, zeroTrue);
    assertNotEquals(oneFalse, oneTrue);
    assertNotEquals(oneFalse, zeroFalse);
    assertNotEquals(oneTrue, zeroTrue);
    assertEquals(zeroFalse, new Day("", false, null, null));
  }

  @Test
  public void testToString(){
    String assumedZeroFalse = "Not available on .";
    String assumedZeroTrue = "Available on  from 0:00 PM to 0:00 PM.";
    String assumedOneFalse = "Not available on Monday.";
    String assumedOneTrue = "Available on Monday from 1:00 AM to 1:00 PM.";
    assertEquals(assumedZeroFalse, zeroFalse.toString());
    assertEquals(assumedZeroTrue, zeroTrue.toString());
    assertEquals(assumedOneFalse, oneFalse.toString());
    assertEquals(assumedOneTrue, oneTrue.toString());
  }
}