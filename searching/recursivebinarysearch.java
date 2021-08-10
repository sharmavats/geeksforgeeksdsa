// time complexity = o(logn)
// space complexity = o(logn)
import java.util.*;
public class recursivebinarysearch {
    public static int bsearch(int arr[],int low,int high,int x){
    int mid = (low+high)/2;
    if(arr[mid]==x){
    return mid;
    }
    else if(arr[mid]>x){
        return bsearch(arr, low, mid-1, x);
    }
    else{
        return bsearch(arr, mid+1, high, x);
    }
    }
    public static void main(String[] args) {
        System.out.println("enter the capacity of array ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("enter elements of the array ");
        for(int i=0; i<a; i++){
        arr[i] = sc.nextInt();
        }
        System.out.println("content of array");
        for(int i =0; i<a; i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter the element you want to search");
        int x=sc.nextInt();
        int b= bsearch(arr,0,a-1,x);
        System.out.println("index is "+b);
    }
}
