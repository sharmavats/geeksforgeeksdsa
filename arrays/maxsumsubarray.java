import java.util.*;
public class maxsumsubarray {
    static int maxsubarray(int arr[],int n){
        int maxsum=arr[0];
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=i; j<n; j++){
                count=count+arr[j];
                maxsum=Math.max(count, maxsum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,-4,9,2};
        int n=arr.length;
        int ans=maxsubarray(arr, n);
        System.out.println("answer is"+ans);
    }
}
