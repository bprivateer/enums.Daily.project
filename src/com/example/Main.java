package com.example;
import com.example.common.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Month (check your spelling)!");
        String input = scanner.nextLine();

        java.util.ArrayList<String> futureMonths =
                new java.util.ArrayList<String>();

        int month = 0;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }

    }
}
