// time complexity = o(logn)
// auxillary space = o(1)
import java.util.*;
public class firstoccurenceiterative {
    static int firstocc(int arr[] , int n , int x ){
        int low=0 , high=n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>x){
                high = mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[] = {11,12,13,14,15};
       int n = arr.length;
       System.out.println("enter the element you want to search");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("element prsent at index no" + firstocc(arr, n, x));
       sc.close();
        
    }
}
