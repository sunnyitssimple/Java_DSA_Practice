package Topics.Searching.Binary_search;

public class basicsbinarysearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,10,45,56,78,89};
        int target = 78;
        int result = BinaryAlgo(arr, target);
        System.out.println("Index of target: " + result);
    }

    static int BinaryAlgo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start+(end-start) / 2;
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
