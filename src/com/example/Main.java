package com.example;
import com.example.common.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private String englishName;

    public String getEnglishName() {
        return englishName;
    }

    static public void main(String[] args){
        Scanner sc = new(Scanner(System.in));
        ArrayList<Month> months = new ArrayList<Month>();

        months.add(Month.JANURARY);
        months.add(Month.FEBURARY);
        months.add(Month.MARCH);
        months.add(Month.APRIL);
        months.add(Month.MAY);
        months.add(Month.JUNE);
        months.add(Month.JULY);
        months.add(Month.AUGUST);
        months.add(Month.SEPTEMBER);
        months.add(Month.OCTOBER);
        months.add(Month.NOVEMBER);
        months.add(Month.DECEMBER);

//        import static Month.*;
        System.out.println("Please enter a Month (check your spelling)!");

    }
}
