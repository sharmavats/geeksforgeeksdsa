// time complexity = o(logn)
// space complexity = o(logn) due to recursive call
import java.util.*;
public class lastoccurenceindex {
    static int lastocc(int arr[] , int low , int high , int x , int n){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]>x){
            return lastocc(arr, low, mid-1, x, n);
        }
        else if(arr[mid] > x ){
            return lastocc(arr, mid+1, high, x, n);
        }
        else{
            if(mid==n-1||arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                return lastocc(arr, mid+1, high, x, n);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,13,14,15,16};
        System.out.println("enter the element that you want to search");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int n = arr.length;
        System.out.println("eleent preent at index no "+ lastocc(arr, 0, 5, x, n));
    }
    
}
