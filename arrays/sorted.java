// time comlexity = o(n)
// space complexity = o(1)
import java.util.*;
public class sorted {
static boolean insorted(int arr[], int n){
    for(int i=1; i<n; i++)
    if(arr[i]<arr[i-1])
    return false;
    return true;
}
    public static void main(String[] args) {
        int arr[]={26,43,24,87,15};
        int n=arr.length;
       System.out.println("array ");
       for(int i=0; i<n; i++){
           System.out.println(" "+arr[i]);
       }
       boolean a=insorted(arr, n);
       if(a==false){
       System.out.println("unsorted array ");
       }
       else{
       System.out.println("sorted array ");
       }
    }
}
