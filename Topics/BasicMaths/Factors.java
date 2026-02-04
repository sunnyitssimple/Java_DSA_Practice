package Topics.BasicMaths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors4(20,1);
    }

    //O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
    // both time and space with be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    //by   recursion
     public static void factors4(int n,int i){
        if(i*i > n) return;
        if(i*i == n) System.out.print(i+" ");
        else if(n%i==0){
            System.out.print(i+" ");
            factors4(n,i+1);
            System.out.print(n/i+" ");
        }
        else factors4(n,i+1);
    }

}