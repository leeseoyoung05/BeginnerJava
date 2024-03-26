package tues;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력해주세요");
        String input = scanner.nextLine(); // 입력이 문자열로 저장
        int number = Integer.parseInt(input); // 입력을 int로 변환한다

        System.out.println("입력:" +  input);
        System.out.printf("입력: %s \n", input);
        System.out.printf("입력: %d", number);
    }
}