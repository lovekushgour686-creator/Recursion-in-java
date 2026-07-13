import java.util.Scanner;

/*Write a program to find the sum of all digits of a given positive integer using recursion.

Input
A single positive integer N.

Output
Print the sum of the digits of N.

Example 1
Input:
1234

Output:
10

Explanation:
1 + 2 + 3 + 4 = 10 
*/
public class rec14 {

    public static void sumD(int num, int sum) {
        if (num == 0) {

            System.out.println(sum);
            return;
        }

        sum += (num % 10);
        sumD(num / 10, sum);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.print("Sum of digits :: ");
        sumD(num, 0);
        cin.close();
    }
}
