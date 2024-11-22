// Superclass
class Animal {
    String name;

    // Constructor of the superclass
    Animal(String name) {
        this.name = name;  // Using 'this' to refer to the current class member
    }

    // Method to display the name
    void display() {
        System.out.println("Animal's name is: " + name);
    }
}

// Subclass
class Dog extends Animal {

    // Constructor of the subclass
    Dog(String name) {
        // Calling the superclass constructor using 'super'
        super(name);
    }

    void display() {
        // Calling the superclass method using 'super'
        super.display();
        System.out.println("Dog is a type of animal.");
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bulldog");
        dog.display();
    }
}
