import java.util.ArrayList;
import java.util.Scanner;

/*Given an integer array nums, move all 0's to the end of it while maintaining 
the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
  */
public class rec25 {
    static int count = 0;

    public static void maintainZero(int[] nums, int i, int[] a, int idx, int last) {

        if (i == nums.length) {
            return;
        }

        for (int s = 0; s < nums.length; s++) {
            if (nums[i] != 0) {
                a[idx] = nums[i];
                maintainZero(nums, i + 1, a, idx + 1, last);
            } else {
                a[last] = nums[i];
                maintainZero(nums, i + 1, a, idx, last - 1);
            }

        }

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.print("Enter array size ::--> ");
        int s = cin.nextInt();
        System.out.println("Write element in array :: -> ");
        int nums[] = new int[s];
        for (int i = 0; i < s; i++) {
            nums[i] = cin.nextInt();
        }

        int a[] = new int[s];
        int l = s - 1;
        maintainZero(nums, 0, a, 0, l);
        System.out.println(" Order of the non-zero elements :: -> ");
        for (int i = 0; i < nums.length; i++) {
            List.add(a[i]);
        }
        System.out.println(List);
        cin.close();

    }
}
