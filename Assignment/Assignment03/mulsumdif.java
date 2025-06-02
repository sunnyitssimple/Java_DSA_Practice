package Assignment.Assignment03;

public class mulsumdif {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(45));
    }
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
       while(n!=0)
       {
        int rem=n%10;
        sum=sum+rem;
        mul=mul*rem;
        n=n/10;
       }
       int result=mul-sum;
       return result;
    }
}

