package Topics.Patten_Printing;

public class BasicsPattern {
    public static void main(String[] args) {
        pattern8(7);
    }
      static void pattern8(int n){
        for (int row = 0; row <= n; row++) { 
            // for every row run the column
            int NumberOfColumn=2*row-1>n? 2*n-2*row+1:2*row-1;
            int NumberOfSpace=(n-NumberOfColumn)/2;
            for (int space = 0; space < NumberOfSpace; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < NumberOfColumn; col++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row = 0; row <= n; row++) { 
            // for every row run the column
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 0; row < n; row++) { 
            // for every row run the column
            for (int col = 0; col < row; col++) {
                System.out.print(row); 
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) { 
            int totalColumnInRow= row>n ? 2*n-row-1:row;
            // for every row run the column
            for (int col = 0; col < totalColumnInRow; col++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    static void pattern4(int n){
        for (int row = 0; row < n; row++) { 
            // for every row run the column
            for (int col = 0; col < row; col++) {
                System.out.print(col+1);
            }
            System.out.println(); 
        }
    }
    static void pattern3(int n){
        for (int row = 0; row < n; row++) { // Initialize and condition corrected
            // for every row run the column
            for (int col = 0; col <n- row; col++) {
                System.out.print("* "); // Use print instead of println for same line
            }
            System.out.println(); // Move to next line after each row
        }
    }
    
    static void pattern2(int n){
        for (int row = 0; row < n; row++) { // Initialize and condition corrected
            // for every row run the column
            for (int col = 0; col <= row; col++) {
                System.out.print("* "); // Use print instead of println for same line
            }
            System.out.println(); // Move to next line after each row
        }
    }
    static void pattern1(int n){
        for (int row = 0; row < n; row++) { // Initialize and condition corrected
            // for every row run the column
            for (int col = 0; col < n; col++) {
                System.out.print("* "); // Use print instead of println for same line
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
