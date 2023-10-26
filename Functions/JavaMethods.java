package Functions;
//methods also called functions

/*
 * A method is block of code that runs only when it is called
 * define once and use many times
 */

public class JavaMethods {
    // creating a method

    static void myMethod() {
        // code to be executed

        System.out.println("first method executed");
    }

    /*
     * static : means mehtod belong to the main class and not an object of the main
     * class
     * void : means the method does not return a value
     */

    public static void main(String[] args) {
        // Calling a method
        myMethod();
    }

    /*
     * method can be called multiple times also
     */
}