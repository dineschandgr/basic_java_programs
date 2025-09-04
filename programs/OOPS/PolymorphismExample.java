package OOPS;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // upcasting
        Animal a2 = new Cat();

        a1.sound(); // Dog's version
        a2.sound(); // Cat's version
    }
}
