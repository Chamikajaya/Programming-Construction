package com.manage.school;

public class Student {
    public static int revenue = 0;  // Better if we had implemented a separate School class to take care of student enrollment + payments etc
    private int id;
    private String name;
    private int grade;
    private int feesPaid = 0;
    final private int totalFees = 30000;  // Fee which a student has to pay


    // constructor
    public Student(int id, String name, int grade){
        // Validation code
        if (id <= 0 || grade < 0){
            System.out.println("Id / grade can not be negative");
            return;
        }
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    // Setter for setting the grade --> We need a separate setter for grade, if the school decides to change the student's current grade
    public void setGrade(int grade) {
        if (this.grade >= 0 && this.grade <= 100) {
            this.grade = grade;
        }
        else {
            System.out.println("Invalid grade.");
        }
    }
    // getters
    public int getId() {
        return id;
    }
    public int getFeesPaid() {
        return feesPaid;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }

    // We do not need setters for id and name since they are final.
    public void updateFeesPaid(int fees){
        if (feesPaid == totalFees){
            System.out.println("You have already paid the total fee. No need to pay again");
            return;
        }
        int x = fees + feesPaid;
        if (x == totalFees){
            System.out.println("Thank you. You have completely paid the total fee.");
        }
        else if (x > totalFees) {
            System.out.println("Thank you. You have completely paid the total fee.");
            System.out.println("Here is your balance --> " + (x - totalFees));
        }
        else {
            System.out.println("Thank you. You still have to pay " + (totalFees - x));
            this.feesPaid = x;
        }
        revenue += fees;
        return;

    }


}
