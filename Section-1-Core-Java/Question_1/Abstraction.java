
abstract class Vehical{
    abstract void start();
 }
 class Car extends Vehical{
    void start(){
        System.out.println("Start the Car");
    }
 }

public class Abstraction{
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
    }
}