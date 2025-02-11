//Qus. Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.

public class Second {
    public static void main(String[] args) {

        MathOperations mathOps = new MathOperations();

        // Using instance method references for addition and subtraction
        MathOperation add = mathOps::add;
        MathOperation subtract = mathOps::subtract;

        // Using static method reference for multiplication
        MathOperation multiply = MathOperations::multiply;

        // Applying the methods
        int resultAdd = add.operate(5, 3);       // 5 + 3 = 8
        int resultSubtract = subtract.operate(5, 3); // 5 - 3 = 2
        int resultMultiply = multiply.operate(5, 3); // 5 * 3 = 15

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
    }
}


