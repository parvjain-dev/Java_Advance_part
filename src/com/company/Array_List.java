package com.company;

//--> ArrayList is just a modified Array
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
     ArrayList<Integer> l1 = new ArrayList<>();
     ArrayList<Integer> l2 = new ArrayList<>();

     l1.add(6);
     l1.add(7);
     l1.add(9);
     l1.add(6);

     l2.add(121);
     l2.add(221);
     l2.add(321);
     l2.add(421);

        //System.out.println(l1);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }


        System.out.println();



l1.add(2,8);
        //System.out.println(l1);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }


        System.out.println();


        l1.addAll(0,l2);
        /*for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
        }*/
        System.out.println(l1);

        //l1.clear();
        //System.out.println(l1);

        System.out.println(l1.contains(34));   //kya isme 34 hai ya nhi return true or false

        System.out.println(l1.indexOf(6));

        System.out.println(l1.lastIndexOf(6));

        l1.remove(3);
        System.out.println(l1);

        l1.set(2,2000);        //knsi index pe kya hata ke kya dalna chate ho
        System.out.println(l1);

         l1.removeIf(n -> (n %2 ==0));    // apply removeIf() method
        System.out.println(l1);            // we are  going to remove numbers divisible by 3

        l1.removeIf(n -> (n +2 ==9));      //idhar agar n +2 hota hai 9 toh voh haat jayega jaise 7+2 =9 toh voh hat gya
        System.out.println(l1);

        System.out.print("_________");
        l1.retainAll(l2);         //ek specific array ko lena
        System.out.println(l1);
    }

}
