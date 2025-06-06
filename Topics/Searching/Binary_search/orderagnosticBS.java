package Binary_search;

public class orderagnosticBS {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,10,45,56,78,89};
        int target = 6;
        int result = OrderagnosticBS(arr, target);
        System.out.println("Index of target: " + result);
    }

    static int OrderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find if array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
