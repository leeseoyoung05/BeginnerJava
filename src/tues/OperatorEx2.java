package tues;

public class OperatorEx2 {
    public static void main(String[] args) {
        int num1 = 5; int num2 = 10;

        // 단항 연산자
        System.out.println(++num1 + " " + num2--);

        // 산술 연산자
        System.out.println((num1 + num2) + " " + (num1 - num2) + " " + (num1 * num2));

        // 비교 연산자
        System.out.println(num1 > num2);
        System.out.println(num1 != num2);

        // 논리 연산자
        System.out.println(num1 == 5 && num2 == 5); // &&는 AND 연산
        System.out.println(num1 == 5 || num2 == 5); // ||는 OR 연산
    }
}
