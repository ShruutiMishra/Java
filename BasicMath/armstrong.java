package BasicMath;

import java.util.*;

public class armstrong {
    static boolean ArmstrognNumber(int n) {
        int original = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sumofpower = 0;
        while (n != 0) {
            int d = n % 10;
            sumofpower += Math.pow(d, count);
            n /= 10;
        }
        return (sumofpower == original);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (ArmstrognNumber(n)) {
            System.out.println("an armstrong  number");
        } else {
            System.out.println("not an armstrong number");
        }
    }
}
