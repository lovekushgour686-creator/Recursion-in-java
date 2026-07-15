/*Tower of Hanoi – Short Problem Statement

Given n disks placed on rod A, move all disks to rod C using rod B as an auxiliary rod.

Rules:

Move only one disk at a time.
A larger disk cannot be placed on a smaller disk.
Only the top disk of a rod can be moved.

Example:

Input:

n = 2

Output:

Move disk 1 from A to B
Move disk 2 from A to C
Move disk 1 from B to C */

import java.util.Scanner;

public class rec18 {
    static int count = 0;

    public static void Towerofhonai(int num, String from, String To, String axu) {
        if (num == 1) {
            count++;
            return;
        }

        Towerofhonai(num - 1, from, axu, To);
        count++;
        Towerofhonai(num - 1, axu, from, To);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter num :: ");
        int n = cin.nextInt();
        Towerofhonai(n, "A", "B", "C");
        System.out.println(count);
        cin.close();
    }
}
