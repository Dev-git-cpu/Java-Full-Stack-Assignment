class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }
}