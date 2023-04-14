public class Wolf extends Animal {
    // Constructor 1
    public Wolf(String name, int age){
        // This will call the 1st constructor in Animal
        super(name, age);
    }
    // Constructor 2
    public  Wolf(String name){
        // This will call the 2nd constructor in Animal
        super(name);
    }
    public void greet() {
        System.out.println("I am " + getName() + " the wolf");
    }
    public void makeNoise(){
        System.out.println("Aww Aww !");
    }
}
