//return the size of the array i.e n-1 if deleted and n if not existed and only delete 1st occurence
import java.util.*;
public class deletion {
    static int deleteelement(int arr[],int n,int x){
        int i; 
        for(i=0; i<n; i++)
        if(arr[i]==x)
        break;
        if(i==n)//if we reached to end and unable to find occurence
        return n; //size
        for(int j=i; j<n-1; j++)
        arr[j]=arr[j+1];
        return (n-1);
    }
    
   public static void main(String[] args) {
       int arr[]={5,7,9,11,14};
       int n=arr.length;
       System.out.println("before deletion ");
       for(int i=0; i<n; i++){
           System.out.println(" "+arr[i]);
       }
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter the element to be deleted ");
       int x=sc.nextInt();
       n=deleteelement(arr,n,x);
       System.out.println("after deletion ");
       for(int i=0; i<n; i++){
           System.out.println(" "+arr[i]);
       }
   } 
}
