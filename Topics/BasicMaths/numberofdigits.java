package Topics.BasicMaths;

public class numberofdigits {
    public static void main(String[] args) {
        int n=2;
        int b=2;
        System.out.println(numberdigi(n,b));
    }
    static int numberdigi(int n,int b){
        return (((int)(Math.log(n)/Math.log(b)))+1);
    }
}
