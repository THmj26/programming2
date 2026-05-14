package eleven;

import java.util.*;
import java.util.function.Consumer;

// http://codingjam.it/java-8-lambda-in-7-minuti-o-quasi/

public class LambdaTest {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Qui", "Quo", "Qua");

        for (String s : words) // "for-each" iteration, uses an object (words) of type Iterable
            System.out.println(s);

        /* In Java 8 interface Itarable provides a new way to iterate: the forEach *method*!
         forEach inputs an object of type Consumer. Consumer is a generic functional interface
         with a (unique) abstract void method accept (T t).
         */

        Consumer<String> printer = new Consumer<String>() { // anonymous class implementing method accept
            public void accept(String s) {
                System.out.println(s);
            }
        };

        words.forEach(printer);

        /*
        Same thing by using lambda expressions
         */

        words.forEach((String s) -> System.out.println(s));
        // type inference: the lambda expression denotes an instance of interface Consumer
        words.forEach(s -> System.out.println(s)); // type inference on the type of s

    }
}
