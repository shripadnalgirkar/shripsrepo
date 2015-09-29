package com.infy.common.utility;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WebUtility
{
  public void formatDate()
  {
    Date curDate = new Date();
    
    SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
    
    String DateToStr = format.format(curDate);
    
    System.out.println(DateToStr);
    
    format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    DateToStr = format.format(curDate);
    
    System.out.println(DateToStr);
    
    format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
    
    DateToStr = format.format(curDate);
    
    System.out.println(DateToStr);
    
    format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
    
    DateToStr = format.format(curDate);
    
    System.out.println(DateToStr);
  }
}
