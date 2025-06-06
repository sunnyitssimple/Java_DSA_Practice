// package Assignment.Assignment03;

// import java.util.Scanner;

// public class input_till_0 {
//     // 25. Take integer inputs till the user enters 0 and print the largest number from all.
//     public static void main(String[] args) {
//         int result=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number:");
//         int n = sc.nextInt();
//         while (n != 0) {
//             result=largerin(n);
//             System.out.println("Again input:");
//             n = sc.nextInt();
//         } 
//         System.out.println(result);
//     }
//     static int largerin(int n){
//         int a=0;
//         if(n>a){
//             a=n;
//         }
//         return a;
//     }
// }
package Assignment.Assignment03;

import java.util.Scanner;

public class input_till_0 {
    // 25. Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n > max) {
                max = n;
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number: " + max);
        }
    }
}
// nice optimistation the Integer.MIN_VALUE returns the most posibble smallest number in java that it can hold.