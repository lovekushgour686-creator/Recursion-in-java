import java.util.Scanner;

/*Given an array arr[], check whether it is sorted in non-decreasing order.
 Return true if it is sorted otherwise false. 
 
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.

 */

public class rec23 {

    public static boolean arraysort(int a[], int s) {
        if (s == a.length - 1) {

            return true;
        }

        if (a[s] >= a[s + 1]) {

            return false;
        }
        return arraysort(a, s + 1);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter size :: ");
        int size = cin.nextInt();
        int a[] = new int[size];

        System.out.println("Write element in array :: -> ");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println(arraysort(a, 0));
        cin.close();

    }
}