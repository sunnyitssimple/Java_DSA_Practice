package Topics.Arrays_and_Aaraylist;

import java.util.Arrays;

public class SwapinArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr, int start, int end){
        while(start < end){
            Swap(arr, start, end);
            start++;
            end--;
        }
    }
    static int[] Swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
        // System.out.println(Arrays.toString(arr));
    }
}
