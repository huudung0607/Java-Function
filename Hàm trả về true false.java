import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean solve(long n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n/=10;
        }
        return sum % 10 == 8;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(solve(n)) System.out.println("28tech");
        else System.out.print("29tech");
    }
}
