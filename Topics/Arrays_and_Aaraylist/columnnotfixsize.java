package Topics.Arrays_and_Aaraylist;

public class columnnotfixsize {
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3,4},
            {2,3},
            {2,4,2}
        };
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
