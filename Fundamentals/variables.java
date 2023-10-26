
//variables are containers for storing data values

// String,
//int 
//float
//char
//boolean

public class variables {
    public static void main(String[] args) {
        /*
         * Declare variables syntax
         * type variable_name = value;
         */
        String name = "Shruti";
        System.out.println("name is " + name);
        int age = 19;
        System.out.println("age is " + age);
        boolean mybool = true;
        char letter = 'D';
        float mark = 90.2f;

        /*
         * Final Variables
         * when we dont want to change the existing values.
         * 'final' keyword
         */

        // final int mynum = 15;
        int mynum = 20; // will generate an error
    }
}
