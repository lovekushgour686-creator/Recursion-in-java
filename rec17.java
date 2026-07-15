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
public class rec17 {
    public static int revP(int num, int r) {
        if (num == 0) {
            return r;
        }

        return revP(num / 10, ((r * 10) + num % 10));

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.println(revP(num, 0));
        cin.close();
    }
}
