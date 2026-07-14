import java.util.Scanner;

/*Write a program to find the product of all digits of a given non-negative integer using recursion.

Input
A single non-negative integer N.

Output
Print the product of all digits of N.

Example 1
Input:
1234

Output:
24

Explanation:
1 × 2 × 3 × 4 = 24
 */
public class rec15 {
    public static int proddigit(int num) {
        if (num == 0) {
            return 1;
        }
        int p = 1;
        p *= (num % 10);
        return p * proddigit(num / 10);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.println("Product :: " + proddigit(num));
        cin.close();

    }
}
