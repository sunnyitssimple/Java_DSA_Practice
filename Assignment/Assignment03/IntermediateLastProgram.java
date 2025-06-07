// package Assignment.Assignment03;
// 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

// import java.util.Scanner;

// public class IntermediateLastProgram {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int sumpos=0;
//         int sumneg=0;
//         System.out.println("Enter numbers to find segregated sum(0 to exit):");
//         int n=sc.nextInt();
//         while(n!=0){
//             System.out.println("Enter numbers to find segregated sum(0 to exit):");
//              n=sc.nextInt();
//              if(n<0){
                
//                 sumneg=sumneg+n;
//              }
//              else if(n>0){
                
//                 sumpos=sumpos+n;
//              }
//         }
//         System.out.println(sumneg);
//         System.out.println(sumpos);

//     }
// }
package Assignment.Assignment03;
import java.util.Scanner;
public class IntermediateLastProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNeg = 0;
        int sumPosEven = 0;
        int sumPosOdd = 0;
        System.out.println("Enter numbers (0 to exit):");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n < 0) {
                sumNeg += n;
            } else if (n % 2 == 0) {
                sumPosEven += n;
            } else {
                sumPosOdd += n;
            }
        }
        System.out.println("Sum of negative numbers: " + sumNeg);
        System.out.println("Sum of positive even numbers: " + sumPosEven);
        System.out.println("Sum of positive odd numbers: " + sumPosOdd);
    }
}
