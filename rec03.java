import java.util.Scanner;

/*Problem

Print Reverse numbers from N to 1 using recursion. */
public class rec03 {
    public static void printnum(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printnum(num - 1);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter ------->");
        int num = cin.nextInt();
        printnum(num);
        cin.close();
    }
}
