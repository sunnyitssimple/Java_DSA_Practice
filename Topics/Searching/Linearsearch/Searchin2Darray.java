package Topics.Searching;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int[][] nums={
            {1,2,3,4,5,6},
            {7,8,9},
            {10,11,12,13}
        };
        int target=11;
        int[]ans=SearchIN2DArray(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] SearchIN2DArray(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element= arr[row][col];
                if(element==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
