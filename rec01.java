import java.util.Scanner;

/*Problem

Print numbers from 1 to N using recursion. */
public class rec01 {

    public static void print(int num) {
        if (num == 0) {
            return;
        }

        print(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter ----> ");
        int num = cin.nextInt();
        print(num);
        cin.close();
    }
}