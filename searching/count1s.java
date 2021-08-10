import java.util.*;
public class count1s {
    static int count(int arr[], int n){
        int low =0; int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return (n-mid);
                }
            }
        }
        return 0;
    }
   public static void main(String[] args) {
    int arr[] = {0,0,1,1,1};
    int n = arr.length;
    System.out.println(" no of 1's is  "+ count(arr, n));
   } 
}
