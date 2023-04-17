package com.manage.school;
// This work interface is designed for both Teachers and the Principles
public interface Work {
    public void teach();  // Teacher + Principle
    public void manage(); // Teacher + principle
    public default void takeRest(){
        System.out.println("Taking a break");
    }
}
