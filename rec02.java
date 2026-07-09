
/*Problem

Print numbers from N to 1 using recursion. */
import java.util.*;

public class rec02 {

    public static void print(int num, int i) {
        if (i == num + 1) {
            return;
        }
        System.out.println(i);
        print(num, i + 1);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter ----(n to 1)> ");
        int num = cin.nextInt();
        print(num, 1);
        cin.close();
    }
}
