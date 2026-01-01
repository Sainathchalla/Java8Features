package Optional.Example2;

import java.util.Optional;


// If we see here carefully, if we have Optional<String> which might return you the string/null then we use Optional.ofNullable() method.
// If somehow from DB, we get null value, this method return an empty Box i.e Optional.Empty.
// However, null value from DB returns Empty Optional, that means you cannot do get() on empty box without checking the label i.e isPresent() right.
public class Main {
    public static void main(String[] args) {
//        Optional<String> optionalString = getName(2);

        // Method - 1
//        if (optionalString.isPresent()) {
//            System.out.println(optionalString.get().toUpperCase());
//        }

        // Method - 2
//        optionalString.ifPresent((s) -> System.out.println(s.toUpperCase()));

        // Method - 3
//        System.out.println(optionalString.orElse("NA"));

        // Method - 4
//        optionalString.ifPresentOrElse((s) -> System.out.println(s.toUpperCase()), () -> System.out.println("Null Value from DB"));

//        Method - 5
//        System.out.println(optionalString.orElseThrow(RuntimeException::new));

//        Method - 6
        Optional<String> optionalString1 = getName(2);
        Optional<String> resultOptional = optionalString1.map((s) -> s.toUpperCase());
        System.out.println(resultOptional.orElse("No mapping done because of null value from DB"));
    }


    static Optional<String> getName(int id) {
        // Db related stuff
        Optional<String> optionalString = Optional.ofNullable(null);
        return optionalString;
    }
}
