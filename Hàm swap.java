import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.print(a + " " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        swap(a,b);
    }
}
