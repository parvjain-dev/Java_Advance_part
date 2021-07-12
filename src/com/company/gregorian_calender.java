package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregorian_calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":"+ c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.DATE)+" / "+ "0"+c.get(Calendar.MONTH)+" / "+ c.get(Calendar.YEAR));


        GregorianCalendar g= new GregorianCalendar();
        System.out.println(g.isLeapYear(2016));
    }
}
