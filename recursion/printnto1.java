// time complexity = 0(n)
// space complexity = 0(n)
import java.util.Scanner;
import java.util.*;
public class printnto1 {
    public static void printn(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(" "+n);
            printn(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printn(n);
    }
}
