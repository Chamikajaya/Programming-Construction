package com.manage.school;

public class Principle extends Employee implements Work {
    // Constructor for the principle
    public Principle(String name, int salary){
        super(name, salary);
    }
    @Override
    public void teach() {
        System.out.println(getName() + " is monitoring the class. ");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " is managing the inventory.");
    }
    public void giveSpeech(){
        System.out.println(getName() + "is giving a speech.");
    }
}
