import java.util.Scanner;

/*Problem
main function void (No return type )
Calculate xⁿ recursively. */
public class rec10 {
    public static void printpower(int num, int p, int F) {
        if (p == 1) {
            F = F * num;
            System.out.println(F);
            return;
        }
        F = F * num;

        printpower(num, p - 1, F);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.print("Enter Power :: ");
        int p = cin.nextInt();
        System.out.print(num + " the power " + p + " --> ");
        printpower(num, p, 1);
        cin.close();
    }
}
