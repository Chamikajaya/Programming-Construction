abstract public class Animal{
    // We are not able to instantiate objects from an abstract class
    // Note that if we have at least 1 abstract method inside a class then we have to make that class abstract
    // An abstract can have both abstract and concrete methods
    private String name;
    private int age;
    // Static variables are shared by all instances -> (1 per the whole class)
    // whereas a non-static variable is 1 per instance;
    private static int animalCount = 0;

    // This code (Constructor) was added later.
    // Overloaded Constructors
    // Constructor 1 -> Takes both name and age
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        animalCount++;
    }
    //Constructor 2 -> takes name only
    public Animal(String name){
        this.name = name;
        animalCount++;
    }
    /* In Java, static methods cannot access non-static methods and non-static instance variables directly,
    but they can access them indirectly by creating an object of the class and accessing the non-static members
     through that object.
     */

    // Static method
    public static void getCount(){
        System.out.println("You have created " + animalCount + " animals.");

        // Indirectly accessing the non static variables and non static methods by creating an object
    }
    public String getName() {  // Non-abstract method
        return name;
    }
    public int getAge(){return age;}
    public void setName(String name) {  // Non-abstract method

        this.name = name;
    }
    public abstract void greet();  // abstract method
    public abstract void makeNoise();  // abstract method

    public void example(){
        System.out.println("Hello from animal superclass :) ");
    }


}

