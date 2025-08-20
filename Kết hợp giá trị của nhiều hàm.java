import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean chua6(int n){
        while(n != 0){
            if(n % 10 == 6){
                return true;
            }
            n/=10;
        }
        return false;
    }
    public static boolean tongChan(int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n/=10;
        }
        return sum % 2 == 0;
    }
    public static boolean chanLe(int n){
        int cntOdd = 0,cntEven = 0;
        while(n != 0){
            if((n % 10) % 2 == 0) cntEven++;
            else cntOdd++;
            n /= 10;
        }
        return cntOdd > cntEven;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i = a;i <= b;i++){
            if(chua6(i) && tongChan(i) && chanLe(i)){
                System.out.print(i + " ");
            }
        }
    }
}
