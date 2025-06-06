package Topics.Searching;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums={1,3,4,54,3,2,33,45,6,65};
        int target=54;
        int ans=LinearSearch(nums, target);
        System.out.println(ans);


    }
    static int LinearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
