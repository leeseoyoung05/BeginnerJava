package wed;

public class MethodEx {
    static int sum(int a, int b) { // 입력 출력 모두 존재
        int result =  a + b;
        return result;
    }

    static String printName() { // 출력만 존재
        return "주영빈";
    }

    static void multiple(int a, int b) { // 입력만 존재
        int result = a * b;
        System.out.println(result);
    }

    static void printSchoolNum() { // 입력 출력 모두 없음
        String schoolNum = "202114041";
        System.out.println(schoolNum);
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(printName());
        multiple(3,5);
        printSchoolNum();
    }

}
