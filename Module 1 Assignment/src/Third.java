////Qus3. Explain the difference between method overloading and method overriding in Java. Provide code examples to illustrate both concepts.


//Method Overloading: Method overloading occurs when multiple methods in the same class have the same name
//        but different parameter lists. The return type can be different,
//        but it's not enough to distinguish overloaded methods. Overloading is a form of compile-time polymorphism,
//        meaning the method to be called is determined at compile time based on the arguments passed.


public class Third {
    public static void main(String[] args) {
//        MathOperations obj = new MathOperations();
//
//        System.out.println("Sum (int, int): " + obj.add(5, 10));
//        System.out.println("Sum (int, int, int): " + obj.add(5, 10, 15));
//        System.out.println("Sum (double, double): " + obj.add(5.5, 10.2));


        Xyz abc = new ABC();  // Parent reference, SBI object
        Xyz rqs = new Pra(); // Parent reference, ICICI object

        System.out.println("SBI Interest Rate: " + abc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + rqs.getInterestRate() + "%");
    }
}

//Example of method overloading
//class MathOperations {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    // Overloaded method with three int parameters
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // Overloaded method with double parameters
//    public double add(double a, double b) {
//        return a + b;
//    }
//}


//    Method Overriding: Method overriding happens when a subclass provides a specific implementation for a method
//        that is already defined in the parent class. The method in the subclass must have the same method signature
//        (name and parameter list) and return type (or a covariant return type). This enables runtime polymorphism, where
//        the method to be executed is determined at runtime based on the actual object.


//Example of methor overriding
// Parent class
class Xyz {
    // Method to be overridden
    public double getInterestRate() {
        return 5.0; // Default interest rate
    }
}

// Child class overriding the method
class ABC extends Xyz {
    @Override
    public double getInterestRate() {
        return 6.5; // SBI-specific interest rate
    }
}

// Another child class overriding the method
class Pra extends Xyz {
    @Override
    public double getInterestRate() {
        return 7.0; // ICICI-specific interest rate
    }
}

