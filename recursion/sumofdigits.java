import java.util.Scanner;
import java.util.*;
public class sumofdigits {
    public static int sum(int n){
        if(n<10)
        return n;
        return sum(n/10)+(n%10);
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sum(n);
        System.out.println(" sum of digits is "+a);
    }
    
}
