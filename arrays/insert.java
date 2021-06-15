import java.util.*;
public class insert{
    static int insertfunc(int arr[],int n , int x , int cap ,int pos){ // n =sizeofarray(6) x=no to be inserted cap=capacity(7) pos=position
        if(n==cap)
        return n;
        int idx=pos-1;
        for(int i=n-1; i>=idx; i--)
        arr[i+1]=arr[i];
        arr[idx]=x;
        return (n+1);
    }
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0]=10;
        arr[1]=30;
        arr[2]=40;
        arr[3]=50;
        arr[4]=60;
        arr[5]=70;
        int cap =7;
        int n=6; // not use arr.length as it gives capacity of array ie 7
      System.out.println("before inserting ");
      for(int i=0; i<n; i++){
          System.out.print(" "+arr[i]);
      }
      System.out.println("enter the position where you want to insert ");
      Scanner sc = new Scanner(System.in);
      int pos= sc.nextInt();
      System.out.print("enter the number to insert");
      Scanner b = new Scanner(System.in);
      int x = b.nextInt();
      n = insertfunc(arr,n,x,cap,pos);
      System.out.println("after insertion ");
      for(int i=0; i<n; i++){
        System.out.println(" "+arr[i]);
    }

    }
}