package tues;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        System.out.println("주민번호 7자리를 입력해주세요 ex. 011222-4");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();

        char gender = tmp.charAt(7); // 입력받은 주민번호의 8번째 문자를 gender에 저장합니다

        switch(gender) {
            case '1': case '3':
                System.out.println("남자입니다");
                break;
            case '2': case '4':
                System.out.println("여자입니다");
                break;
            default:
                System.out.println("유효하지 않습니다.");
        }
    }
}
