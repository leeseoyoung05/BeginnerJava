package tues;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = " java";
        String str3 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        String str4 = new String("hello");
        System.out.println(str1.equals(str4));
        System.out.println(str1 == str4);

        String str5 = str1 + str2; // hello java
        System.out.println(str5);

        System.out.println("indexOf");
        System.out.println(str5.indexOf("java"));
        System.out.println();

        System.out.println("contains");
        System.out.println(str5.contains("jav"));
        System.out.println(str5.contains("pyt"));
        System.out.println();

        System.out.println("charAt");
        System.out.println(str5.charAt(5));
        System.out.println(str5.charAt(6));
        System.out.println();

        System.out.println("substring");
        System.out.println(str5.substring(6, 9));
        System.out.println();
    }
}
