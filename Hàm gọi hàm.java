import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static int tong(int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
    public static boolean chanLe(int n){
        int cntOdd = 0,cntEven = 0;
        while(n != 0){
            if((n % 10) % 2 == 0) cntEven++;
            else cntOdd++;
            n /= 10;
        }
        return cntOdd < cntEven;
    }
    public static boolean check(int n){
        int sum = tong(n);
        return chanLe(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            if(check(i)){
                System.out.print(i + " ");
            }
        }
    }
}
