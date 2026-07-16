/*You are given n disks placed on a starting rod (from), with the smallest disk on top and the largest at the bottom. 
There are three rods: the starting rod(from), the target rod (to), and an auxiliary rod (aux).
You have to calculate the minimum number of moves required to transfer all n disks from the starting rod to the target rod,
following these rules:
      1. Only one disk can be moved at a time.
      2. A disk can only be placed on top of a larger disk or on an empty rod.
Return the minimum number of moves needed to complete the task.

Examples:

Input: n = 2
Output: 3
Explanation: For n = 2, total 3 steps will be taken. Steps are as follows -
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3

Input: n = 3
Output: 7

Input: n = 0
Output: 0

*/

import java.util.Scanner;

public class rec19 {

    public static int towerOfHanoi(int num, int from, int to, int aux) {
        if (num == 1) {
            return 1;
        }
        // from (1st rod) to(2nd rod) aux (3rd rod);
        return towerOfHanoi(num - 1, from, to, aux) + 1 + towerOfHanoi(num - 1, aux, from, to);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int num = cin.nextInt();
        System.out.print("Steps count :: " + towerOfHanoi(num, 1, 2, 3));
        cin.close();
    }
}
