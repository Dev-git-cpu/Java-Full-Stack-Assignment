class Employee{
    String name;

    void work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{

    void manageTeam(){
        System.out.println("Managing the team");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manageTeam();
    }
}