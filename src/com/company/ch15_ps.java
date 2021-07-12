package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class ch15_ps {
    public static void main(String[] args) {
        //Arraylist
        /*
        ArrayList<String>  arr = new ArrayList<>(11);
        arr.add("rahul");
        arr.add("ramesh");
        arr.add("james");
        arr.add("parv");
        arr.add("sahil");
        arr.add("pedro");
        arr.add("luis");
        arr.add("okay");
        arr.add("Noone");
        arr.add("prg");
        for (String e:arr) {
            System.out.println(e);
        }


        //Date class in java to print time on the following format
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String sol = df.format(dt);
        System.out.println(sol);
*/
        //Repeating above one using calender class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+12+":"+ c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.SECOND));

        Date d= new Date();
        System.out.println(d.getHours()+ ":"+d.getMinutes()+":"+d.getSeconds() );
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(122);
        hs.add(123);
        hs.add(124);
        hs.add(125);
        hs.add(12);
        System.out.println(hs);
    }
}
