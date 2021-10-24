package com.company;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometeresPerHour) {
        long milesPerHour = Math.round(kilometeresPerHour / 1.609);
        if (kilometeresPerHour < 0) {
            return -1;
        } else {
            return milesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}

