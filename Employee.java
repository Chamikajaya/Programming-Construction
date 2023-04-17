package com.manage.school;

public abstract class Employee {
    private int id;
    private String name;
    private int salary;
    // Constructor 1 -> for teachers and janitors
    public Employee(int id, String name, int salary){
        // Validation code
        if (id <= 0 || salary < 0){
            System.out.println("Id / grade can not be negative");
            return;
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Constructor 2 -> for the principle (Why -> I assumed the principle does not have an Id)
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    // Implement that profit - salary paid thing here




    // getters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }

    public void getPaid(){
        if (Student.revenue >= this.salary ){
            System.out.println(this.name + " got paid " + this.salary);
            Student.revenue -= this.salary;
        }
        else {
            System.out.println("Not sufficient funds to pay the salary. Funds left --> " + Student.revenue + " $." );
        }

    }
}
