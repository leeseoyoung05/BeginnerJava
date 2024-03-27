package wed;

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(this.name+" 멍멍멍");
    }
}

class HouseDog extends Dog {
    @Override
    void bark() {
        System.out.println("집에서 " + this.name+ "가 멍멍멍");
    } // 이게 오버라이딩

    void bark(int time) {
        System.out.println("집에서 " + this.name+ "가 " + time + "번 멍멍멍");
    } // 이게 오버로딩
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("puppy");
        System.out.println(dog.name);
        dog.bark();

        HouseDog houseDog = new HouseDog();
        houseDog.setName("흰둥이");
        System.out.println(houseDog.name);
        houseDog.bark();
        houseDog.bark(10);
    }
}
