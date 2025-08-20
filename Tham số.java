import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void display(long a, long b, long c){
        System.out.println(b + " " + a + " " + c);
        System.out.println(a + b + c);
        System.out.println("KET THUC !");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        display(a,b,c);
    }
}
