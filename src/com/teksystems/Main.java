package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int ChinaYear = year.nextInt();
        switch (ChinaYear%12)
        {
            case 0: System.out.println("Year of the Monkey");
                break;
            case 1: System.out.println("Year of the Rooster");
                break;
            case 2: System.out.println("Year of the Dog");
                break;
            case 3: System.out.println("Year of the Pig");
                break;
            case 4: System.out.println("Year of the Rat");
                break;
            case 5: System.out.println("Year of the Ox");
                break;
            case 6: System.out.println("Year of the Tiger");
                break;
            case 7: System.out.println("Year of the Rabbit");
                break;
            case 8: System.out.println("Year of the Dragon");
                break;
            case 9: System.out.println("Year of the Snake");
                break;
            case 10: System.out.println("Year of the Horse");
                break;
            case 11: System.out.println("Year of the Sheep");
                break;
        }

        double tuition = 10000;
        int tyear =0;
        while (tuition < 20000) {
            tyear++;
            tuition = 1.07*tuition;
        }
        System.out.printf("Tuition doubles in %d years%n", tyear);
        System.out.printf("Tuition is %f", tuition);
    }
}
