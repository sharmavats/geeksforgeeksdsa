// time complexity = o(n)
// auxillary space = o(n)
import java.util.Scanner;

public class naturalsum {
  public static int sum(int n){
      if(n==0)
      return 0;
      return n + sum(n-1);
  }
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       int a= sum(n);
       System.out.println("sum is "+a);
       sc.close();
    }
}
