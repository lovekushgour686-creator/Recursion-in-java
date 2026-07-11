import java.util.Scanner;

/*Factorial of a Number
Problem
Main function int (Return type)
Find factorial using recursion. */
public class rec07 {
    public static int printFact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return printFact(num - 1) * num;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.println("Factorial :: " + printFact(num));
        cin.close();
    }
}
