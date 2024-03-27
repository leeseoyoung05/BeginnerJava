package wed;

class Phone {
    // Phone의 속성(멤버변수)
    String color;
    boolean power;
    int sound;

    // Phone의 기능(메서드)
    void power() { power = !power; } // 전원을 키거나 끄는 기능
    void soundUp() { ++sound; } // 전원을 키거나 끄는 기능
    void soundDown() { --sound; }
}

public class InstanceTest {
    public static void main(String[] args) {
        Phone phone1;
        phone1 = new Phone();

        phone1.sound = 10;
        phone1.soundUp();
        System.out.println("현재 사운드는 " + phone1.sound + "입니다.");
    }
}
