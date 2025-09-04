package OOPS;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // from Dog
    }
}
