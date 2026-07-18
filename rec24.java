/*Given a string s, move all occurrences of the character 
'x' to the end of the string while keeping the order of other characters unchanged.

Input:
axbxcdx

Output:
abcdxxx

*/

import java.util.Scanner;

public class rec24 {
    static int count = 0;
    static String r = "";

    public static void stringarrange(String str, int i, char ch) {

        if (i == str.length()) {
            return;
        }

        if (str.charAt(i) == ch) {
            count++;
            stringarrange(str, i + 1, ch);
        } else {
            r += str.charAt(i);
            stringarrange(str, i + 1, ch);
        }

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter String :: ");
        String str = cin.next().trim();
        char ch = 'x';
        stringarrange(str, 0, ch);
        for (int i = 0; i < count; i++) {
            r += 'x';
        }
        System.out.println("---->" + r);
        cin.close();

    }
}
