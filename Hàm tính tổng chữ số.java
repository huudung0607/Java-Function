import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static int solve(long n){
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
        System.out.print(solve(n));
    }
}
