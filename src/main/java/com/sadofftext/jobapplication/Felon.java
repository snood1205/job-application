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

public class Felon{
  private boolean felon;
  private String explain;

  public Felon(boolean felon, String explain){
    this.felon = felon;
    this.explain = explain;
  }

  public boolean isFelon(){
    return felon;
  }

  public void setFelon(boolean felon){
    this.felon = felon;
  }

  public String getExplain(){
    return explain;
  }

  public void setExplain(String explain){
    this.explain = explain;
  }

  @Override
  public String toString(){
    if(isFelon()){
      return "Applicant is felon because " + getExplain();
    }
    return "Applicant is not felon";
  }

  @Override
  public boolean equals(Object o){
    if(o instanceof Felon){
      Felon f = (Felon) o;
      boolean fl = (isFelon() == f.isFelon());
      if(!isFelon()){
        return fl;
      }
      boolean ex = getExplain().equals(f.getExplain());
      return fl && ex;
    }
    return false;
  }
}