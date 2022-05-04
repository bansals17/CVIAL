package org.practice.jav;

import java.util.Scanner;

public class a {

    public void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

   public void  addition(){

        int a = 4;
        int b = 5;

        int sum = a+b;
        System.out.print(sum);
   }
   static Scanner scn = new Scanner(System.in);
   public static void main(String [] args){
       System.out.print("Enter value of a");
       int a = scn.nextInt();
       System.out.print("Enter value of b");
       int b = scn.nextInt();
       System.out.print("Enter value of str");
       String str = scn.next();

   }

}
