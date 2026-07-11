/*Problem
Main function int (return type);
Find the sum of first N natural numbers. */

import java.util.Scanner;

public class rec05 {

    public static int printsum(int num) {
        if (num == 0) {
            return 0;
        }

        return printsum(num - 1) + num;

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :-------->");
        int num = cin.nextInt();
        System.out.println("Sum of natural num :: -> " + printsum(num));
        cin.close();
    }
}
