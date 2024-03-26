package tues;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        String[] nameArray = new String[4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("같은 조지미 팀원의 이름을 적어보세요.");
        for(int i = 0; i < nameArray.length; i++) {
            nameArray[i] = scanner.nextLine();
        }

        for(int i = 0; i < nameArray.length; i++) {
            System.out.println((i+1) + "번째는 " + nameArray[i]);
        }
    }
}
