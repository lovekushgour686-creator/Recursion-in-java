import java.util.Scanner;

/*Factorial of a Number
Problem
Main is void (no return type ;)
Find factorial using recursion. */
public class rec06 {
    public static void printFactorial(int num, int fac) {
        if (num == 1) {
            fac *= num;
            System.out.println(fac);
            return;
        }
        fac *= num;
        printFactorial(num - 1, fac);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.print("Factorial of " + num + " is ::-> ");
        printFactorial(num, 1);
        cin.close();
    }
}
