import java.util.*;
public class towerofhanoi{
   public static void tower(int n , char A , char B , char C ){
        if(n==1){
            System.out.println("move 1 from"+A+"to"+C);
            return;
        }
        tower(n-1, A, B, C);
        System.out.println("move"+n+"from"+A+"to"+C);
        tower(n-1, B,A, C);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        char A='A'; char B='B'; char C='C';
        tower(n, A, B, C);
        sc.close();
    }
}