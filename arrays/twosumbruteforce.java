import java.util.*;
public class twosumbruteforce {
    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
         throw new IllegalArgumentException("no two sum solution");
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,8,9};
        int target=5;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
