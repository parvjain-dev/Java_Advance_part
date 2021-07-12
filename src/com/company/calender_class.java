package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class calender_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getWeekYear());
        System.out.println(c.getTimeZone());
        System.out.println(c.getWeeksInWeekYear());


        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c2.getTimeZone());
    }
}
