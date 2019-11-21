package com.LickingHeights;



import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner person;
        person = new Scanner(System.in);
        int monthNumber;
        int year;
        int birthday;
        System.out.println("What is the month you were born on? (the number not the name) ");
        monthNumber = person.nextInt();
        System.out.println("What year were you born?");
        year = person.nextInt();
        
        System.out.println( month(monthNumber, year));
        if (monthNumber == 1){
            System.out.println("january");
        }else if (monthNumber == 2){
            System.out.println("february");
        }else if (monthNumber == 3){
            System.out.println("march");
        }else if (monthNumber == 4){
            System.out.println("april");
        }else if (monthNumber == 5){
            System.out.println("may");
        }else if (monthNumber == 6){
            System.out.println("june");
        }else if (monthNumber == 7){
            System.out.println("july");
        }else if (monthNumber == 8){
            System.out.println("august");
        }else if (monthNumber == 9){
            System.out.println("september");
        }else if (monthNumber == 10){
            System.out.println("october");
        }else if (monthNumber == 11){
            System.out.println("november");
        }else System.out.println("december");


    }
    public static int month(int month, int year) {
        switch (month) {
            case 1:
            case 8:
            case 7:
            case 10:
            case 3:
            case 5:
            case 12:
                return 31;
            case 2:
                if (year % 4 == 0 || year % 400 == 0) {
                    return 29;
                } else return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
         }

         return month;
    }

}
