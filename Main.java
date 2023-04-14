import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*
        ArrayList<Animal> my_animals = new ArrayList<>();
        Doctor doctor1 = new Doctor();
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Animal wolf1 = new Wolf();
        my_animals.add(dog1);
        my_animals.add(cat1);
        my_animals.add(wolf1);
        dog1.setName("Rex");
        cat1.setName("Kitty");
        System.out.println(dog1.getClass());
        System.out.println(wolf1.getClass());

        for (var animal:my_animals){
            // You can call a method on an object only if
            //the class of the reference variable has that
            //method  (i.e since the class of our ref variable is animal, animal class must have greet method  )
            //Just remember that the compiler checks the class
            //of the reference variable, not the class of the actual
            //object at the other end of the reference.
            animal.greet();
            //doctor1.give_shot(animal);
        }
        Dog d1 = new Dog();
        d1.setName("Naveen");
        d1.befFriendly();
        d1.play();
        d1.example();
        System.out.println();

        Cat c1 = new Cat();
        c1.setName("Dulina");
        c1.befFriendly();
        c1.play();*/

        /*Animal.getCount();

        ArrayList<Animal> animalList = new ArrayList<>();
        Animal a1 = new Dog("Rex", 23);
        Animal a2 = new Dog("Timmy");
        Animal c1 = new Cat("Garfield", 4);
        Animal c2 = new Cat("Tom");
        Animal w1 = new Wolf("Greg", 34);
        Animal w2 = new Wolf("Chamika");


        animalList.add(a1);
        animalList.add(a2);
        animalList.add(c1);
        animalList.add(c2);
        animalList.add(w1);
        animalList.add(w2);


        for (var animal : animalList){
            System.out.println(animal.getName() + " --> " + animal.getAge());
        }
        //Note that if we want to call a static method we need to do it through its class, not via its objects.
        // We do not need instance of Animal class to call getcount static methods
        Animal.getCount(); */

        // Useful wrapper classes' static utility methods
        int a = Integer.parseInt("4");  // This will convert the given string val into an int value
        System.out.println(a+ 5);

        double b = Double.parseDouble("2.25");  // This will convert the given string into a double value
        System.out.println(b - 0.25);

        String s1 = Integer.toString(21);  // Convert an int -> String
        String s2 = Double.toString(3000.58);  // Converts a double into String
        System.out.println("I am " + s1 + " and my salary is " + s2);





    }
}