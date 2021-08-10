// time complexity = o(logn)
// space complexity = o(logn)
import java.util.*;
public class firstoccurence{
    static int firstoccur(int arr[] , int low , int high , int x){
        if(low>high)
        return -1;
        int mid = (low+high)/2;
        if(x>arr[mid]){
            return firstoccur(arr, mid+1, high, x);
        }
        else if(x<arr[mid]){
            return firstoccur(arr, low, mid-1, x);
        }
        else{
            if(mid==0||arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return firstoccur(arr, low, mid-1, x);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={23,24,25,24,27,29};
        System.out.println("enter the element that you want to find ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int a = firstoccur(arr, 0, 5, x);
        System.out.println("element index number is "+a);
    }
}