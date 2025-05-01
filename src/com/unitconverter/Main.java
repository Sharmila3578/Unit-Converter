// package com.unitconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Unit Converter CLI");

        do {
            System.out.println("\nChoose conversion:");
            System.out.println("1. Km to Miles");
            System.out.println("2. Miles to Km");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. Fahrenheit to Celsius");
            System.out.println("5. Kg to Pounds");
            System.out.println("6. Pounds to Kg");
            System.out.println("0. Exit");

            System.out.print("Enter option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter kilometers: ");
                    double km = Double.parseDouble(scanner.nextLine());
                    System.out.println("Miles: " + Converter.kmToMiles(km));
                    break;
                case "2":
                    System.out.print("Enter miles: ");
                    double miles = Double.parseDouble(scanner.nextLine());
                    System.out.println("Kilometers: " + Converter.milesToKm(miles));
                    break;
                case "3":
                    System.out.print("Enter Celsius: ");
                    double c = Double.parseDouble(scanner.nextLine());
                    System.out.println("Fahrenheit: " + Converter.celsiusToFahrenheit(c));
                    break;
                case "4":
                    System.out.print("Enter Fahrenheit: ");
                    double f = Double.parseDouble(scanner.nextLine());
                    System.out.println("Celsius: " + Converter.fahrenheitToCelsius(f));
                    break;
                case "5":
                    System.out.print("Enter Kg: ");
                    double kg = Double.parseDouble(scanner.nextLine());
                    System.out.println("Pounds: " + Converter.kgToPounds(kg));
                    break;
                case "6":
                    System.out.print("Enter Pounds: ");
                    double p = Double.parseDouble(scanner.nextLine());
                    System.out.println("Kg: " + Converter.poundsToKg(p));
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (!choice.equals("0"));
    }
}
