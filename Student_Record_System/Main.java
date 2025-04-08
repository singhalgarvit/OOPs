package Student_Record_System;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Garvit",21,3);       //creating the obj and calling the constructor with parameters
        Student student2 = new Student("Divanshu",51,5);
        Student student3 = new Student("Yatharth",10,1);
        Student student4 = new Student("Sagar",25,8);
        student1.showDetails();
        student2.showDetails();
        student3.showDetails();
        student4.showDetails();

    }
}
