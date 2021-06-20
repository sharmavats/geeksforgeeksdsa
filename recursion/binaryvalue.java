import java.util.*;
public class binaryvalue {
    public static int binary(int n){
        if(n==0){
        return n;
        }
        else{
        binary(n/2);
        System.out.print(""+(n%2));
        }
        return 0;
    }
   public static void main(String[] args) {
       System.out.println("enter the decimal number whose binary value you want to found");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       sc.close();
       System.out.println("binary value is ");
       binary(n);
   } 
}
