package ro.siit.time;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("What time is it? ");
        int hh = s.nextInt();
        int mm = s.nextInt();
        boolean b = validTime(hh, mm);
        if (b) {
            if (mm < 10) {
                System.out.println("The time is " + hh + ":0" + mm + " now.");
            } else {
                System.out.println("The time is " + hh + ":" + mm + " now.");
            }
        } else {
            System.out.println("Incorrect time!");
        }
    }

    public static boolean validTime(int hh, int mm) {
        if ((hh >= 0) && (hh <= 24) && (mm >= 0) && (mm < 60)) {
            return true;
        } else {
            return false;
        }
    }
}

