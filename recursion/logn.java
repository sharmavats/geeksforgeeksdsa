// time complexity = o(log(n))
// space complexity = 0(n)

import java.util.*;
public class logn{
    public static int returnlog(int n){
        if(n==1)
        return 0;
        else
        return (1+returnlog(n/2));
    }
    public static void main(String[] args) {
        System.out.println("enter the number whose log base 2 value you want to find");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=returnlog(n);
        System.out.println("answer is "+a);
    }
}