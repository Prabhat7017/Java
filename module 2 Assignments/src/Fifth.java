//Qus. Implement multiple inheritance with default method inside interface.

// First interface with a default method
interface InterfaceA {
    default void display() {
        System.out.println("InterfaceA's display method");
    }

    void abstractMethodA();  // Abstract method to be implemented by the class
}

// Second interface with a default method
interface InterfaceB {
    default void display() {
        System.out.println("InterfaceB's display method");
    }

    void abstractMethodB();  // Abstract method to be implemented by the class
}

public class Fifth implements InterfaceA, InterfaceB {
    @Override
    public void abstractMethodA() {
        System.out.println("Implemented abstractMethodA from InterfaceA");
    }

    @Override
    public void abstractMethodB() {
        System.out.println("Implemented abstractMethodB from InterfaceB");
    }

    // Resolving conflict between default methods of InterfaceA and InterfaceB
    @Override
    public void display() {
        InterfaceA.super.display();  // Call InterfaceA's display method
        InterfaceB.super.display();  // Call InterfaceB's display method
        System.out.println("Custom display method in the class");
    }

    public static void main(String[] args) {
        Fifth obj = new Fifth();

        // Calling implemented methods
        obj.abstractMethodA();
        obj.abstractMethodB();

        // Calling display method (resolving conflict)
        obj.display();
    }
}
