import java.util.Scanner;
/* Problem
main Function int (return type)
Calculate xⁿ recursively.*/

// optimize method :
public class rec12 {

    public static int printp(int num, int p) {
        if (p == 0) {
            return 1;
        }
        if (num == 0) {
            return 0;
        }
        int method = printp(num, p / 2);
        if (p % 2 == 0) {
            return method * method;
        } else {
            return method * method * num;
        }

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int num = cin.nextInt();
        System.out.print("Enter power :: ");
        int p = cin.nextInt();
        System.out.println("Power ---> " + printp(num, p));
        cin.close();

    }
}
