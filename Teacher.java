package com.manage.school;

public class Teacher extends Employee implements Work {
    //Constructor for Teacher
    public Teacher(int id, String name, int salary){
        // Calls the super class constructor with the given parameters
        super(id, name, salary);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching the class");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " is managing students' records. ");
    }

    public void mark(){
        System.out.println(getName() + " is grading the papers. ");
    }
}
