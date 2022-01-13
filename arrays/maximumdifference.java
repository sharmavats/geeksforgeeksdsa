import java.util.*;
public class maximumdifference{
    static int differenece(int arr[],int n){
        int res=arr[1]-arr[0];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                
                     res=max(res,arr[j]-arr[i]);
                
            }
        }
        return res;
    }
    static int max(int a, int b){
        if(a>b)
        return a;
        return b;
    }
    public static void main(String[] args){
int arr[]={2,3,10,6,4,8,1};
int n=arr.length;
int a=differenece(arr, n);
System.out.println(a);
    }
}