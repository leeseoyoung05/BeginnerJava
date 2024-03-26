package tues;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade = ""; String opt = "";

        if (score >= 90) {
            grade = "A";
            if (score >= 98) opt = "+";
            else if (score <= 92) opt = "-";
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) opt = "+";
            else if (score <= 82) opt = "-";
        } else if (score >= 70) {
            grade = "C";
            if (score >= 78) opt = "+";
            else if (score <= 72) opt = "-";
        } else {
            grade = "D";
        }

        grade = grade + opt;
        System.out.println(grade);
    }
}
