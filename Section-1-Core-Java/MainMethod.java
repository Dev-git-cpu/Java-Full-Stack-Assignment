class MainMethod{
    void main(){
        AgeChecker ac = new AgeChecker();
        ac.CheckAge(45);

    }
}
class AgeChecker{
    void CheckAge(int age){
        if(age<18){
            IO.println("Can not Vote");
        }
        else{
            IO.println("Can Vote");
        }
    }
}