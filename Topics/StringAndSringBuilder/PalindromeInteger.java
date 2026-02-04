public class PalindromeInteger {
    public static void main(String[] args) {
        int n=133;
       System.out.println(Ispalindrome(n));
    }
    public static boolean Ispalindrome(int n){
        int temp=n;
        int reverse=0;
       while(n>0){
        reverse=reverse*10+n%10;
        n=n/10;
       }
       return reverse==temp;
    }
}