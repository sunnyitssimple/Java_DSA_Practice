import java.util.Arrays;

public class bubblesortingalgorithm {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr) {
        boolean swapped;
        // Run the steps for n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped=false;
            // For each step, the last item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if current item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
