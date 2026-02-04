package Topics.Arrays_and_Aaraylist;
import java.util.*;

public class arraybasics{
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
    //    int[] num = new int[5];
    //    num[0]=23;
    //    num[1]=45;
    //    num[2]=46;
    //    num[3]=32;
    //    num[4]=74;
    //    System.out.println(num[3]);
    // System.out.println("enter the number to fill  in array:");
    //    for(int i=0;i<5;i++){
        
    //     num[i] = sc.nextInt();
    //    }
       // Print the array elements
    //    for(int i=0; i<5; i++) {
    //        System.out.println(num[i]);
    //    }
    // System.out.println(Arrays.toString(num));
    // }

        String[] str = new String[5];
        System.out.print("enter the string input:");
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        // Optionally print the array to verify input
        System.out.println(Arrays.toString(str));
    }
}
