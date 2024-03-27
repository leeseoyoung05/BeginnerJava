package wed;

class PhoneClass {
    // Phone의 속성(멤버변수)
    String color;
    boolean power;
    int sound;

    PhoneClass() {};
    PhoneClass(String color, boolean power, int sound) {
        this.color = color;
        this.power = power;
        this.sound = sound;
    }
}

public class InstanceTest2 {
    public static void main(String[] args) {
        PhoneClass phone1 = new PhoneClass();
        phone1.color = "yellow";
        phone1.power = true;
        phone1.sound = 10;

        PhoneClass phone2 = new PhoneClass("black", false, 5);

        System.out.println("phone1의 color: " + phone1.color + " phone1의 sound: " + phone1.sound);
        System.out.println("phone2의 color: " + phone2.color + " phone2의 sound: " + phone2.sound);
    }
}
