import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(int n){
        int lastNum = n % 10;
        n/=10;
        while(n != 0){
            int lastNum2 = n % 10;
            if(lastNum >= lastNum2) return false;
            lastNum = lastNum2;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i = a; i <= b;i++){
            if(check(i)){
                System.out.print(i + " ");
            }
        }
    }
}
