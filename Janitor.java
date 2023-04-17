package com.manage.school;

public class Janitor extends Employee {
    public Janitor(int id, String name, int salary){
        super(id, name, salary);
    }

    public void clean(){
        System.out.println(getName() + " is cleaning the class room.");
    }

    public void makeTea(){
        System.out.println(getName() + " is now making tee. ");
    }




}
