// package com.unitconverter;

public class Converter {

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double poundsToKg(double pounds) {
        return pounds / 2.20462;
    }
}
