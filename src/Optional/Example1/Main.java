package Optional.Example1;

import java.util.Optional;


// Here we are guaranteed that getName(id) will return Optional<String? which has String in it. It won't return null at any cost. Because Optional.of(null) never accepts null.
// So we are sure that Optional<String> which we get has string/empty string in it. So we can directly peek into g=box using get() method without fear of null value.
// But we are restricting the Optional to have value right, but we can make it return null as well, for handling any edge cases in your code which might trigger any default values or methods etc..
public class Main {
    public static void main(String[] args) {
        Optional<String> optionalString = getName(2);
        if (optionalString.isPresent()) {
            System.out.println(optionalString.get().toUpperCase());
        }
    }

    static Optional<String> getName(int id) {
        // Db related stuff
        Optional<String> optionalString = Optional.of("");
        System.out.println(optionalString);
        return optionalString;
    }
}
