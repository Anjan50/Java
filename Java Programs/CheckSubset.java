import java.util.HashSet;
import java.util.Set;

/**
 * Find whether an array is subset of another array
 * Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not.
 * Both the arrays are not in sorted order.
 * It may be assumed that elements in both array are distinct.
 */
public class CheckSubset {

    private static boolean checkSubset(int[] arr, int[] subArr) {
        if(subArr.length > arr.length)
            return false;

        Set<Integer> set = new HashSet<>();
        int i;
        for (i = 0; i < subArr.length; i++) {
            set.add(arr[i]);
            set.add(subArr[i]);
        }
        for (; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        System.out.println(checkSubset(arr1, arr2));
    }

}
