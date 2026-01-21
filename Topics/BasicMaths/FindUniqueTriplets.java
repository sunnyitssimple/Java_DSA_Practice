package Topics.BasicMaths;

public class FindUniqueTriplets {

    /**
     * Finds the number that appears once in an array where all other numbers 
     * appear exactly three times.
     * @param arr The input array of integers.
     * @return The single unique number.
     */
    public static int findUnique(int[] arr) {
        int result = 0;
        
        // Iterate through all 32 bits of an integer
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            
            // Count how many numbers in the array have the i-th bit set
            for (int n : arr) {
                if (((n >> i) & 1) == 1) {
                    sum++;
                }
            }
            
            // If the total count modulo 3 is not zero, the unique number 
            // has this bit set.
            if (sum % 3 != 0) {
                // Set the i-th bit in the result
                result |= (1 << i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {2, 2, 2, 4, 4, 4, 5}; 
        System.out.println("The unique number in arr1 is: " + findUnique(arr1)); // Output: 5

        int[] arr2 = {10, 10, 10, 3};
        System.out.println("The unique number in arr2 is: " + findUnique(arr2)); // Output: 3
    }
}
