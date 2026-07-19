
/*Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25 */
import java.util.Scanner;

public class rec26 {
    public static double calPower(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1.0 / calPower(x, -n);

        }
        return x * calPower(x, n - 1);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        double x = cin.nextDouble();
        System.out.print("Enter power :: ");
        int n = cin.nextInt();
        System.out.println(calPower(x, n));
        cin.close();
    }
}
