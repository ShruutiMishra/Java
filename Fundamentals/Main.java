import java.util.*;

public class Main {
    public static void main(String[] args) {

        // variables
        String name = "shruti";
        // int age = 10;
        double price = 34.56;

        // update
        name = "strong girl";

        // INPUT
        // scanner class
        Scanner sc = new Scanner(System.in);
        // String namee = sc.next();
        // System.out.println(namee);

        // conditional statements
        int age = sc.nextInt();
        // if (age > 18) {
        // System.out.println("work hard");
        // } else if (age == 18) {
        // System.out.println("enjoy but work hard");
        // } else {
        // System.out.println("just enjoy");
        // }

        // Switch statements
        switch (age) {
            case 1:
                if (age > 18)
                    System.out.println("work hard");
                break;
            case 2:
                if (age == 18) {
                    System.out.println("enjoy but work hard");
                    break;
                }

        }
    }

}
