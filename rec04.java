/*Problem
Main function Void ;
Find the sum of first N natural numbers. */

import java.util.Scanner;

public class rec04 {

    public static void printsum(int num, int sum, int start) {
        if (start == num) {
            sum += start;
            System.out.println(sum);
            return;
        }
        sum += start;
        printsum(num, sum, start + 1);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :-------->");
        int num = cin.nextInt();
        printsum(num, 0, 1);
        cin.close();
    }
}
