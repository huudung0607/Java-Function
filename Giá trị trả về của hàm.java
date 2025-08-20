import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static long solve(int a,int b,int c){
        System.out.print("28tech.com.vn\n");
        System.out.println(2 * a + " " + 3 * b + " " + 4 * c);
        return 1l * a * b * c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(solve(a, b, c));
    }
}
