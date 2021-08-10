//time complexity = o(logn)
// space complexity = 0(1)
import java.util.*;
public class lastoccurenceiterative{
    static int lastocc(int arr[] , int n , int x){
        int low=0; int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low = mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                if(mid!=n-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,13,14,15,16};
        System.out.println("enter the element that you want to search");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int n = arr.length;
        System.out.println("element preent at index no "+ lastocc(arr, n,x));
        
    }
}