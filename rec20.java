import java.util.Scanner;

public class rec20 {
    public static void pattern(int p, int n) {

        if (n > p) {
            return;
        }
        printStars(n);
        System.out.println();

        pattern(p, n + 1);

    }

    public static void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter num to print pattern :: ");
        int p = cin.nextInt();
        pattern(p, 1);

        cin.close();
    }
}
