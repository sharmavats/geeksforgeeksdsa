// time complexity = o(3^n)
// space complexity = o(n) not sure check while revision
import java.util.*;
public class subset {
    public static int max (int a , int b, int c){
     if(a>b&&a>c){
     return a;
     }
     else if(b>c&&b>a){
     return b;
     }
     else if(c>a&&c>b){
     return c;
     }
     return 0;
    }
    public static int maxcuts(int n , int a, int b, int c){
        if(n==0)
        return 0;
        if(n<0)
        return -1;
        int res = max(maxcuts(n-a,a,b,c),maxcuts(n-b, a, b, c),maxcuts(n-c, a, b, c));
        if(res==-1)
        return -1;
        return (res+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b :");
        int b = sc.nextInt();
        System.out.println("enter the value of c :");
        int c = sc.nextInt();
        System.out.println("enter the value of n :");
        int n = sc.nextInt();
        int d= maxcuts(n, a, b, c);
        System.out.println("max cuts is "+d);
        sc.close();
    }
}
