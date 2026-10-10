
abstract class Animal{
    abstract void sound();

    void sleep(){
        System.out.println("Animal is Sleeping");
    }
}
interface Flyable{
    void fly();
}

class Bird extends Animal implements Flyable{
    public void fly(){
        System.out.println("Bird Flying");
    }

   public void sound(){
        System.out.println("Bird Sound");
    }

}

public class Main{
    public static void main(String[] args) {

        Bird b = new Bird();
        b.fly();
        b.sound();
        b.sleep();
    }
}