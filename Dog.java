public class Dog extends Animal implements Pets{
    // Constructor 1
    public Dog(String name, int age){
        // This will call the 1st constructor in Animal
        super(name, age);
    }
    // Constructor 2
    public  Dog(String name){
        // This will call the 2nd constructor in Animal
        super(name);
    }

    public void greet(){
        System.out.println("I am " + getName() + " the dog.");
    }
    public void makeNoise(){
        System.out.println("Woof Woof !");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is running in the backyard.");
    }

    @Override
    public void befFriendly() {
        System.out.println(getName() + "is wagging his tail.");

    }
    public void example(){
        // To invoke superclass methods we can use the keyword super
        super.example();
        System.out.println("Hello from Dog child-class :) ");
    }
}

