package wed;

public class OverloadingTest {
    public static void main(String[] args) {
        Math mathTest = new Math();

        System.out.println("mathTest.add(3,3): " + mathTest.add(3,3));
        System.out.println("mathTest.add(3L,3): " + mathTest.add(3L,3));
        System.out.println("mathTest.add(3,3L): " + mathTest.add(3,3L));
        System.out.println("mathTest.add(3L,3L): " + mathTest.add(3L,3L));
    }
}

class Math {
    int add(int a, int b) {
        System.out.print("int add(int a, int b): ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("int add(long a, int b): ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("int add(int a, int b): ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("int add(int a, int b): ");
        return a + b;
    }
}
