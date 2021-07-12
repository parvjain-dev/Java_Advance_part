package com.company;


import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); //THIS THE DATE
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY");  //THIS IS THE FORMAT
        String mydate = dt.format(df);    //CREATING  DATE STRING USING DATE AND FORMAT
        System.out.println(mydate);

        DateTimeFormatter df2 = DateTimeFormatter.BASIC_ISO_DATE;
        String mydate1 = dt.format(df2);
        System.out.println(mydate1);

        DateTimeFormatter df3 = DateTimeFormatter.ISO_DATE;
        String mydate2 = dt.format(df3);
        System.out.println(mydate2);

        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("H:m");
        String mydate3 = dt.format(df4);
        System.out.println(mydate3);
    }
}
