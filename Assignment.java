
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}


public class Assignment {
    public static void main(String[] args) {
        
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();

        
        Dog dog = new Dog();
        dog.makeSound();

        
        Cat cat = new Cat();
        cat.makeSound();
    }
}