

package Topics.Arrays_and_Aaraylist;


public class MaxinArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,45,6,7};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
       System.out.println(max);
    }
}
