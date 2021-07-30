// time complexity = o(logn)
// space complexity = o(1)
import java.util.*;
public class indexnumber{
    static int bsearch(int a[],int n , int x){
        int low=0; int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==x){
            return mid;
            }
            else if(a[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {12,14,15,87,15};
        int n= a.length;
        int x=12;
        System.out.println("index number is "+bsearch(a, n, x));

    }
}