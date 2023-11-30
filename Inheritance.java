// Base class or Parent class
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Derived class 1 or Child class 1
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

// Derived class 2 or Child class 2
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        // Creating objects of derived classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Accessing methods from the base class and derived classes
        System.out.println("Dog:");
        myDog.eat(); // Inherited method from Animal class
        myDog.bark(); // Method from Dog class

        System.out.println("\nCat:");
        myCat.eat(); // Inherited method from Animal class
        myCat.meow(); // Method from Cat class
    }
}
