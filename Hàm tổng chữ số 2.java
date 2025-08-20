import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static int solve(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 0; i < n ;i++){
            int x = sc.nextInt();
            System.out.print(solve(x) + " ");
        }
    }
}
