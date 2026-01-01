package Optional.Background;


// Here when we asked name for a ID, we may get a correct String/null from db. Obviously we need to handle cases for null right. SO everywhere we need to write if checks before performing anything.
public class Main {
    public static void main(String[] args) {
        String str = getName(2);
//        System.out.println(str);
        if (str != null) {
            System.out.println(str.toUpperCase());
        }
    }

    static String getName(int id) {
        // db related stuff, and at end it returned a value;
        String str = null;
        return str;
    }
}