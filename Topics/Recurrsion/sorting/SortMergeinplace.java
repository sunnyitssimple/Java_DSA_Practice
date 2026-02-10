package Topics.Recurrsion.sorting;

import java.util.Arrays;

public class SortMergeinplace {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2, and the end of the combined space
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

        // Merge from the back to the front to stay "in-place"
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        SortMergeinplace sol = new SortMergeinplace();

        // Test Case
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // m=3 valid elements, total size=6
        int m = 3;
        int[] nums2 = {2, 5, 6};         // n=3 valid elements
        int n = 3;

        System.out.println("Before merging: " + Arrays.toString(nums1));
        
        // Call the method
        sol.merge(nums1, m, nums2, n);

        System.out.println("After merging:  " + Arrays.toString(nums1));
    }
}

