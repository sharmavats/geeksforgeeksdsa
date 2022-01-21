import java.util.*;
import java.util.Arrays;
public class setmismatch {
static int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2];
        for(int i=0; i<n; i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]*=-1;
            }
            else{
                arr[0]=Math.abs(nums[i]);
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]>0)
                arr[1]=i+1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        System.out.print(Arrays.toString(findErrorNums(arr)));
    }
}
