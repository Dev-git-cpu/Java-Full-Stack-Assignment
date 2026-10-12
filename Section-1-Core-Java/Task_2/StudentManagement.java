import java.util.*;

class Student{
    public int id;
    public String name;
    public double marks;

    public Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public void display(){
        IO.println("ID: "+id+"Name: "+name+"Marks: "+marks);
    }

}

class StudentManagement{
    void main(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101,"Dev",95));
        students.add(new Student(102,"Ram",92));
        students.add(new Student(103,"Aaditya",90));

        Student topper = students.get(0);

        for(Student s:students){
            s.display();
            if(s.marks > topper.marks){
                topper = s;
            }
        }
        IO.println("Topper name: "+topper.name);
        IO.println("Marks: "+topper.marks);



    }
}