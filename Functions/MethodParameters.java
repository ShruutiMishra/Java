package Functions;

public class MethodParameters {
    /*
     * parameters act as variables inside the method parentheses
     */

    // single parameters
    static void myMethod(String fname) {
        System.out.println(fname + " Mishra");
    }

    // multiple parameters

    static void myMethod2(String full, int age) {
        System.out.println(full + " is " + age + " years old");
    }
    /*
     * void keyword in ablove functions indicate the method does not return a value
     * to return a value, we use primitive datatypes
     * like int, char, etc. and a return keyword inside the method.
     */

    static int myMethod3(int x) {
        return 5 + x;
    }

    static int myMethod4(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod("shruti");
        myMethod("Pinki");
        myMethod2("Shruti Mishra", 19);

        System.out.println(myMethod3(9));
        System.out.println(myMethod4(5, 7));
        int z = myMethod4(5, 3);
        System.out.println(z);
    }
}
