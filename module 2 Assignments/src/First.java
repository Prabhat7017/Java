//Qus. Write the following a functional interface and implement it using lambda:
//
//        -> First number is greater than second number or not Parameter (int ,int ) Return boolean
//        ->  Increment the number by 1 and return incremented value Parameter (int) Return int
//        -> Concatination of 2 string Parameter (String , String ) Return (String)
//        -> Convert a string to uppercase and return . Parameter (String) Return (String)

public class First {
    public static void main(String[] args) {
        //compare two values
        TwoIntPredicate isGreater = (a, b) -> a > b;
        System.out.println("Is 10 greater than 5? " + isGreater.compare(10, 5));

        //increment the number
        Increment incrementByOne = a -> a + 1;
        System.out.println("Incremented value of 5: " + incrementByOne.increment(5));

        //concatenate two strings
        ConcatStrings concat = (s1, s2) -> s1 + s2;
        System.out.println("Concatenation of 'Hello' and 'World': " + concat.concat("Hello", "World"));

        //convert a string to uppercase
        ToUpperCase toUpper = s -> s.toUpperCase();
        System.out.println("Uppercase of 'hello': " + toUpper.convert("hello"));
    }
}
