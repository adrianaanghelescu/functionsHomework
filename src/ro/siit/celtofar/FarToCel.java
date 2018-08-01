package ro.siit.celtofar;

import java.util.Scanner;

public class FarToCel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Your body temperature in Fahreinheit degrees: ");
        float f = s.nextInt();
        float c = convertFarToCel(f);
        if (c >= 37) {
            System.out.println("Your body temperature in Celsius degrees is " + c);
            System.out.println("YOU ARE ILL!");
        } else {
            System.out.println("Your body temperature in Celsius degrees is " + c);
        }
    }

    // the method convert Fahreinheit to Celsius degrees
    public static float convertFarToCel(float f) {
        return ((f - 32) * 5) / 9;

    }
}