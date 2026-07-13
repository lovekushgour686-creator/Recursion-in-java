/*Implement the function power(b, e), which calculates b raised to the power of e (i.e. be).

Examples:

Input: b = 3.00000, e = 5
Output: 243.00000

Input: b = 0.55000, e = 3
Output: 0.16638

Input: b = -0.67000, e = -7
Output: -16.49971 
*/

import java.util.Scanner;

public class rec13 {

    public static double Calpow(double b, int e) {
        if (e == 0) {
            return 1;
        }
        if (e < 0) {
            return 1.0 / Calpow(b, -e);
        }

        double method = Calpow(b, e / 2);

        if (e % 2 == 0) {
            return method * method;
        } else {
            return method * method * b;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num (b)--> ");
        double b = cin.nextDouble();
        System.out.print("Enter power (e) -->");
        int e = cin.nextInt();
        System.out.println("--> " + Calpow(b, e));
        cin.close();
    }
}
