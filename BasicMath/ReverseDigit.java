package BasicMath;

import java.util.*;

public class ReverseDigit {
    static int reverse_number(int n) {
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("reverse of number " + n + " = " + reverse_number(n));
    }
}
