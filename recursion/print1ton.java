// time complexity = o(n)
//space complexity = o(n)

import java.util.*;
public class print1ton {
    public static void print1ton(int n,int a){
        if(a>n){
            return ;
        }
        else{
            System.out.println(" "+a);
             print1ton(n,a+1);

        }
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        print1ton(n,a);
        sc.close();
    }
    
}
