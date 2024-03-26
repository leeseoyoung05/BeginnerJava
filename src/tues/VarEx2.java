package tues;

public class VarEx2 {
    public static void main(String[] args) {
        boolean bValue = true;
        char cValue = 'A';
        int iValue = 24;
        double dValue = 2.4;
        String sValue = "rommmu";

        System.out.println("boolean:" + bValue);
        System.out.println("int:" + iValue + " double:" + dValue);
        System.out.println("char:" + cValue + " String:" + sValue);

        System.out.printf("boolean: %b \n", bValue);
        System.out.printf("int: %d double: %f \n", iValue, dValue);
        System.out.printf("char: %c String: %s \n", cValue, sValue);
    }
}
