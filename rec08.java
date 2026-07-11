import java.util.Scanner;

/*Problem
Find nth Fibonacci number. */
public class rec08 {
    public static int printFib(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        }
        int n = printFib(num - 1) + printFib(num - 2);
        return n;

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.print("Fibonacci number ::> " + printFib(num));
        cin.close();
    }
}
