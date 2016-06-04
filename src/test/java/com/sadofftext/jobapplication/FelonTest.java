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

public class FelonTest{
  private Felon zeroFalse;
  private Felon zeroTrue;
  private Felon exFalse;
  private Felon exTrue;

  @Before
  public void setup(){
    zeroFalse = new Felon(false, "");
    zeroTrue = new Felon(true, "");
    exFalse = new Felon(false, "I killed a man.");
    exTrue = new Felon(true, "I killed a man.");
  }

  @Test
  public void testEquals(){
    assertEquals(zeroFalse, zeroFalse);
    assertEquals(zeroTrue, zeroTrue);
    assertEquals(exFalse, exFalse);
    assertEquals(exTrue, exTrue);
    assertEquals(zeroFalse, exFalse);
    assertNotEquals(exFalse, exTrue);
    assertNotEquals(zeroTrue, exTrue);
  }

  @Test
  public void testToString(){
    String assumedFalse = "Applicant is not felon";
    String assumedZeroTrue = "Applicant is felon because ";
    String assumedExTrue = "Applicant is felon because I killed a man.";
    assertEquals(assumedFalse, zeroFalse.toString());
    assertEquals(assumedFalse, exFalse.toString());
    assertEquals(assumedZeroTrue, zeroTrue.toString());
    assertEquals(assumedExTrue, exTrue.toString());
  }
}