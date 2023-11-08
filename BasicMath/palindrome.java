package BasicMath;

import java.util.*;

public class palindrome {
    static int reverse(int n) {
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
        int n = sc.nextInt();
        int rev = reverse(n);
        if (n == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
