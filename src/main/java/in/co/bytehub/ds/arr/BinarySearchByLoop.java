package in.co.bytehub.ds.arr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class BinarySearchByLoop {

    public static void main(String[] args) {


        System.out.println("search(new int[] {1,2,5,8,10,34}, 10 ) = " + search(new int[]{1, 2, 5, 8, 10, 34}, 10));
        System.out.println("search(new int[] {1,2,3,4,6,7,99} , 18) = " + search(new int[]{1, 2, 3, 4, 6, 7, 99}, 18));

    }

    private static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
