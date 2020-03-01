package com.erikriosetiawan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static String timeConversion(String s) {
        String condition = s.substring(8, 10);
        String result = "";

        if (condition.equalsIgnoreCase("AM")) {
            if (s.substring(0, 2).equals("12")) {
                result = "00".concat(s.substring(2, 8));
            } else {
                result = s.substring(0, 8);
            }
        } else {
            if (s.substring(0, 2).equals("12")) {
                result = s.substring(0, 8);
            } else {
                int hours = Integer.parseInt(s.substring(0, 2));
                hours += 12;
                result = String.valueOf(hours).concat(s.substring(2, 8));
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
