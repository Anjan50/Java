/**
 * Write an efficient program to find the sum of contiguous subarray
 * within a one-dimensional array of numbers that has the largest sum.
 */
public class LargestSubarraySum {

    private static int largestSum(int[] arr) {
        int curMax = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curMax = Math.max(arr[i], curMax + arr[i]);
            max = Math.max(max, curMax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(largestSum(input));
    }

}
