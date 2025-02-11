
@FunctionalInterface
interface TwoIntPredicate {
    boolean compare(int a, int b);
}

@FunctionalInterface
interface Increment {
    int increment(int a);
}

@FunctionalInterface
interface ConcatStrings {
    String concat(String s1, String s2);
}

@FunctionalInterface
interface ToUpperCase {
    String convert(String s);
}
