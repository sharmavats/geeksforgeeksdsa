// time complexity =0(n)
// space complexity =0(n)
import java.util.*;
public class palindrone {
    public static boolean ispalindrone(String str,int start,int end){
        if(start>=end){
        return true;
        }
       else{ 
           return (str.charAt(start)==str.charAt(end))&&ispalindrone(str, start+1, end-1);
       }
    }
    public static void main(String[] args) {
        System.out.println("enter a string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int start=0;
        int end=n;
        boolean s = ispalindrone(str, 0, n-1);
        if(s==true){
        System.out.println("given string is palindrone ");
        }
        else{
            System.out.print("not a palindrone ");
        }
    }
}
