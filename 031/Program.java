//3.1 Date and Time - inheritance, exceptions
//
//        INHERITANCE, CONSTRUCTORS + SUPER()
//        ----------------------------------
//
//        Write a program which displays date in ISO 8601 format
//        (YYYY-MM-DD HH:MM:SS). Write your own classes:
//


//
//        Provide constructors for both classes and remember to
//        call super() in the derived *Date* class to pass
//        initial hour, minute and second values to it. An
//        example:
//
//        // Initializes time to 2015-01-20 12:00:00
//        Date date = new Date(2015, 1, 20, 12, 0, 0);
//
//        Provide common toString()[1] method that returns
//        object's data as a String. It will be called in
//        contexts requiring strings, like in displaying
//        variables:
//
//        // Displays: Time is 2015-01-20 12:00:00
//        System.out.println("Time is " + date);

public class Program {
    public static void main(String[] args) {
        Date date = new Date(2015, 1, 2, 12, 1, 1);
        System.out.println(date);
    }
}
