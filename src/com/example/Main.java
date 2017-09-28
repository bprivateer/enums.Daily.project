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

//        int month = ;

        switch (input) {
            case "Jan":  futureMonths.add("January");
            case "Feb":  futureMonths.add("February");
            case "Mar":  futureMonths.add("March");
            case "Apr":  futureMonths.add("April");
            case "May":  futureMonths.add("May");
            case "Jun":  futureMonths.add("June");
            case "Jul":  futureMonths.add("July");
            case "Aug":  futureMonths.add("August");
            case "Sep":  futureMonths.add("September");
            case "Oct": futureMonths.add("October");
            case "Nov": futureMonths.add("November");
            case "Dec": futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month spelling, must be exact with three letters and capitalization");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }

    }
}
