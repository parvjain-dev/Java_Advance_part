package com.company;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_time {
    public static void main(String[] args) {
        LocalDateTime l = LocalDateTime.now();
        System.out.println(l);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime t = LocalTime.now();
        System.out.println(t);



    }
}
