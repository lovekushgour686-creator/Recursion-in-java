import java.util.Scanner;

/*Find the First and Last Occurrence of a Character in a String

Given a string and a target character, write a program to find the first and last occurrence of the character in the string.

Example ::
String: abracadabra
Character: a
*/
public class rec22 {
    static int f = -1;
    static int l = -1;

    public static void occelement(String str, int i, char ch) {
        if (i == str.length()) {
            System.out.println("First :: " + f);
            System.out.println("Second :: " + l);
            return;
        }

        if (str.charAt(i) == ch) {
            if (f == -1) {
                f = i;
            } else {
                l = i;
            }
        }
        occelement(str, i + 1, ch); 

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter String :: ");
        String str = cin.nextLine().trim();

        System.out.print("Enter Character :: ");
        char ch = cin.next().charAt(0);
        occelement(str, 0, ch);
        cin.close();
    }
}
