package com.manage.school;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(234, "Chamika", 99);
        Student s2 = new Student(235, "Sam", 78);
        Student s3 = new Student(235, "Jack", 67);
        Student s4 = new Student(236, "Mike", 69);
        Student s5 = new Student(237, "Timmy", 37);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        s1.updateFeesPaid(3000);
        System.out.println(Student.revenue);

        s2.updateFeesPaid(9000);
        s3.updateFeesPaid(20000);
        s4.updateFeesPaid(12000);
        s5.updateFeesPaid(25000);
        s1.updateFeesPaid(18000);
        s2.updateFeesPaid(12000);
        s3.updateFeesPaid(23000);
        s4.updateFeesPaid(18000);
        s5.updateFeesPaid(8000);

        System.out.println(Student.revenue);

        Teacher t1 = new Teacher(10, "Mr. Mike" ,3000);
        Teacher t2 = new Teacher(11, "Mr. James" ,5000);
        Teacher t3 = new Teacher(12, "Ms. Lila" ,8000);
        Teacher t4 = new Teacher(13, "Ms. Jane" ,15000);

        Janitor j1 = new Janitor(100, "Mr. Peter", 10000);
        Janitor j2 = new Janitor(100, "Mr. John", 10000);
        Janitor j3 = new Janitor(100, "Mr. Kane", 6000);
        Janitor j4 = new Janitor(100, "Mr. Lesner", 3000);
        Janitor j5 = new Janitor(100, "Mr. Jack", 12000);

        Principle p1 = new Principle("Mr. Potato", 25000);
        Principle p2 = new Principle("Mrs. Emma", 66001);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(t1); employees.add(t2); employees.add(t3); employees.add(t4);
        employees.add(j1); employees.add(j2); employees.add(j3);
        employees.add(p1); employees.add(p2);

        for (var item : employees){
            item.getPaid();
        }
        System.out.println(Student.revenue);





    }
}
