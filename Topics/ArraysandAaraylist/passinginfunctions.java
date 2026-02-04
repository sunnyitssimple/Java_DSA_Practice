package Topics.Arrays_and_Aaraylist;
import java.util.*;
public class passinginfunctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        Change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void Change(int[] nums){
        nums[0]=99;
    }
}
