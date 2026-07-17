import java.util.Scanner;

/*Problem Statement: Reverse a String Using Recursion

Write a Java program that accepts a string from the user and prints its reverse using recursion. */
public class rec21 {

    public static void revString(String str, int i) {
        if (i < 0) {
            return;
        }

        String r = "";
        r += str.charAt(i);
        System.out.print(r);
        revString(str, i - 1);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter string :: ");
        String str = cin.nextLine().trim();
        System.out.print("Reverse String :: ");
        revString(str, str.length() - 1);
        cin.close();
    }
}
