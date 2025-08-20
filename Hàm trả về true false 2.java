import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean solve(int n){
        int cntEven = 0, cntOdd = 0;
        while(n != 0){
            if((n % 10) % 2 == 0) cntEven++;
            else cntOdd++;
            n/=10;
        }
        return cntEven == cntOdd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 1;i <= n;i++){
            if(solve(i)) System.out.print(i + " ");
        }
    }
}
