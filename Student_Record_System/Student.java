package Student_Record_System;

public class Student {
    String name;
    int age;
    int grade;
    
    public Student(String name,int age,int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void showDetails(){
        System.out.print("Name: " + name + " ");
        System.out.print("Age: " + age + " ");
        System.out.println("Grade: " +grade);
    }
}
