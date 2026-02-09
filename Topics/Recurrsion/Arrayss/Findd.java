import java.util.ArrayList;

public class Findd {
    public static void main(String[] args) {
        int []arr={2,40,40,60,80};
        //System.out.println(linear(arr, 40, 0));
        // System.out.println(findIndexLast(arr, 60, arr.length-1));
        // System.out.println(findAllIndex(arr,40,0));
        // findAllIndex(arr,40,0);
        // System.out.println(list);
        // ArrayList<Integer> answer=new ArrayList<>();
        // System.out.println(findAllIndex(arr,40,0,answer));
        System.out.println(findAllIndex2(arr,40,0));
    }
    static boolean linear(int[]arr,int target,int idx){
        if(idx==arr.length){
            return false;
        }
        return arr[idx]==target||linear(arr, target, idx+1);
    }
     static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
    //index from last
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }
    //if we have to find all index use arraylist to store it
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
    //if i  have to return the arraylist of index 
     static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    //now try to  return the list but dont take the arraylist in the argument
    //Challenges
    //we know the return type will be an arraylist
    //problem is that every call will have the new list  so we have to think like that is some sort of way 
    //that pass the data of function call above think like that
    //you have to tell above function that please store my answer also and then return it collectively later after all the calls 
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
