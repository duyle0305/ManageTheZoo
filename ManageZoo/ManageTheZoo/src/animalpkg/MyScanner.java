/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalpkg;

import java.util.Scanner;

/**
 *
 * @author duyme
 */
public class MyScanner {

    public static Scanner sc = new Scanner(System.in);

    public static boolean getBoolean(String message) {
        String a;
        System.out.format("%s-(T/F, Y/N, 1/0): ", message);
        a = sc.nextLine().trim().toUpperCase();
        char c = a.charAt(0);
        if (c == 'T' || c == 'Y' || c == '1') {
            return true;
        } else {
            return false;
        }
    }

    public static double getDouble(String message, double min, double max) {
        double a;
        do {
            System.out.format("%s(%f...%f): ", message, min, max);
            a = sc.nextDouble();
        } while (a < min || a > max);
        return a;
    }

    public static double getDouble(String message, double max) {
        double a;
        do {
            System.out.format("%s(%f...%f): ", message, 0, max);
            a = Double.parseDouble(sc.nextLine().trim());
        } while (a < 0 || a > max);
        return a;
    }

    public static int getInt(String message, int min, int max) {
        int a;
        do {
            System.out.format("%s(%d...%d): ", message, min, max);
            a = Integer.parseInt(sc.nextLine().trim());
        } while (a < min || a > max);
        return a;
    }

    public static int getInt(String message, int max) {
        int a;
        do {
            System.out.format("%s(%d...%d): ", message, 0, max);
            a = Integer.parseInt(sc.nextLine().trim());
        } while (a < 0 || a > max);
        return a;
    }

    public static String getNonBlankStr(String message) {
        String a;
        do {
            System.out.format("%s: ", message);
            a = sc.nextLine();
        } while (a == null);
        return a;
    }
}
