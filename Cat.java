public class Cat extends Animal implements Pets {
    // Constructor 1
    public Cat(String name, int age){
        // This will call the 1st constructor in Animal
        super(name, age);
    }
    // Constructor 2
    public  Cat(String name){
        // This will call the 2nd constructor in Animal
        super(name);
    }
    public void greet(){
        System.out.println("I am " + getName() + " the cat.");
    }
    public void makeNoise(){
        System.out.println("Meow Meow !");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball.");
    }

    @Override
    public void befFriendly() {
        System.out.println(getName() + "is now licking you.");
    }
}

