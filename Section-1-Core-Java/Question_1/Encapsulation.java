
class Employee {
    private double balance;

    public void deosit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
public class Encapsulation{
   public static void main(String[] args) {
       Employee e = new Employee();
       e.deosit(3000);
       System.out.println("Deposit Amount: "+ e.getBalance());
    }
}