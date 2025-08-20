import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean reverse(long n){
        long sum = 0;
        long tmp = n;
        while(n != 0){
            sum = sum * 10 + (n % 10);
            n/=10;
        }
        return sum == tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(long i = a; i <= b;i++){
            if(reverse(i)){
                System.out.print(i + " ");
            }
        }
    }
}
