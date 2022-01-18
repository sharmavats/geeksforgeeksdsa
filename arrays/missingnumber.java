import java.util.*;
public class missingnumber {
    //using sum of consecutive n integer formula
//time complexity=O(N)
//space complexity=O(1)

    static int missingNumber(int[] nums) {
        int n=nums.length;//length of the array
        int sum=0;//initial sum
        int actualsum=(n*(n+1))/2;//sum of n consecutive integer
        for(int i=0; i<n; i++){//sum of array elements
            sum=sum+nums[i];
        }
        return actualsum-sum;//return the difference
    }

    public static void main(String[] args) {
       int arr[]={3,0,1};
System.out.print(missingNumber(arr));
    }
}
