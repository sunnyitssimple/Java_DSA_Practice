package Topics.Arrays_and_Aaraylist;

import java.util.Arrays;
import java.util.Scanner;

public class multidimentionalarray {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("input the 2d array:");
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j  < arr[i].length; j ++) {
                arr[i][j]=sc.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(arr));
        // for (int i = 0; i <arr.length; i++) {
        //     for (int j = 0; j  < arr[i].length; j ++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
