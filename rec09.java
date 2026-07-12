import java.util.Scanner;

public class rec09 {
    public static void printFibo(int num, int a, int b) {
        if (num == 0) {

            return;
        }
        int c = a + b;
        System.out.println(a);
        printFibo(num - 1, b, c);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.println("Fibonacci :--------->\n");
        printFibo(num, 0, 1);
        cin.close();

    }

}
