import java.util.Scanner;

/*
Write a program to reverse the digits of a given non-negative integer using recursion.

Input
A single non-negative integer N.

Output
Print the number obtained by reversing the digits of N.


Example 1
Input:
12345

Output:
54321
 */
public class rec16 {
    public static void revdigit(int num, int rev) {
        if (num == 0) {
            System.out.println(rev);
            return;
        }
        rev = (rev * 10) + (num % 10);
        revdigit(num / 10, rev);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        revdigit(num, 0);
        cin.close();

    }
}
