import java.util.Scanner;

/* Problem
main Function int (return type)
Calculate xⁿ recursively.*/
public class rec11 {
    public static int printPow(int num, int P) {
        if (P == 0) {
            return 1;

        }
        if (num == 0) {
            return 0;
        }
        return num * printPow(num, P - 1);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.print("Enter Power :: ");
        int P = cin.nextInt();
        System.out.print(num + " the power " + P + " --> " + printPow(num, P));
        cin.close();
    }
}
