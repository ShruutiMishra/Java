/*
 * this is a common approach 1.
 */
// package BasicMath;

// import java.util.Scanner;

// /**
//  * countDigits
//  */
// public class countDigits {

//     static int CountDigits(int n) {
//         int count = 0;
//         while (n != 0) {
//             
//             n = n / 10;
//             count++;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number ");
//         int n = sc.nextInt();
//         System.out.println(" the number of digits are " + CountDigits(n));
//         ;
//     }
// }

/*
 * a better approach
 */
package BasicMath;

import java.util.*;

public class countDigits {
    static int CountDigits(int n) {
        String n2 = Integer.toString(n);
        return n2.length();
    }

    public static void main(String[] args) {
        int n = 123456789;
        System.out.println("number of digits are: " + CountDigits(n));
    }
}