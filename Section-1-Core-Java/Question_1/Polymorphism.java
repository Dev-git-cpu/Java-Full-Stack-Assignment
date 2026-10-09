
class Employee{
    double calculateSalary(){
        return 0;
    }
}
class Manager extends Employee{
    @Override
    double calculateSalary() {
        return 50000;
    }
}
class Developer extends Employee{
    double calculateSalary(){
        return 45000;
    }
}
public class Polymorphism{
    public static void main(String[] args) {
Manager m = new Manager();
        System.out.println(m.calculateSalary());
Developer d = new Developer();
        System.out.println(d.calculateSalary());    }
}