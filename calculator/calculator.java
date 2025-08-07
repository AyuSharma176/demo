package calculator;
import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int addition = addition(n,m);
        int subtraction = subtraction(n, m);
    }
    public static int subtraction(int n,int m){
        return (n-m);
    }
}