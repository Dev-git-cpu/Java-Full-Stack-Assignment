class Employee{
    public int id;
    public String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public double calculateSalary(){
        return 0.00;
    }

    public void displaySalary(){
        IO.println("ID: "+id);
        IO.println("Name: "+name);
        IO.println("Salary: "+calculateSalary());
    }
}
class Manager extends Employee{
    public double salary;

    public Manager(int id, String name, double salary){
        super(id,name);
        this.salary= salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class Developer extends Employee{
    public double salary;

    public Developer(int id, String name, double salary){
        super(id,name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class Main{
    void main(){

        Employee manager = new Manager(1, "Dev", 80000);
        Employee developer = new Developer(2, "Ram", 70000);

        IO.println("Manager Details: ");
        manager.displaySalary();
        IO.println("\nDeveloper Details: ");
        developer.displaySalary();

    }
}