//space complexity=o(1)
//time complexity=o(n) (1 traversal)
import java.util.*;
public class maxdiffoptimal {
    static int max(int arr[],int n){
        int minvalue=arr[0]; int res=arr[1]-arr[0];
        for(int j=1; j<n; j++){
            res=max(res,arr[j]-minvalue);
            minvalue=min(minvalue,arr[j]);
        }
        return res;
    }
    static int max(int a, int b){
        if(a>b)
        return a;
        return b;
    }
    static int min(int a, int b){
        if(a<b)
        return a;
        return b;
    }
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1};
        int n=arr.length;
        int a=max(arr, n);
        System.out.println(a);
        
    }
}
