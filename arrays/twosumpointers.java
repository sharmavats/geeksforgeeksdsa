//we use two pointer approach to solve this problem in O(n+nlogn) time i.e O(nlogn)
// time complexity=O(nlogn)
//space complexity=O(n)
import java.util.*;
public class twosumpointers {
    static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int arr[] = new int[2];//iniializing array of size 2 to return as a result
        int copy[]= Arrays.copyOf(nums,n);//copy he array elements from nums
        Arrays.sort(copy);//sorting takes O(nlogn) time as it uses dual pivot quick sort
        int left=0; int right=n-1;// two pointers left and right
        while(left<right){
            if(copy[left]+copy[right]==target){
                break;
            }
            else if(copy[left]+copy[right]<target){
                left++;
            }
            else {
                right--;
            }
            
        }
        for(int i=0; i<n; i++){//checking first element index in original array and storing in arr
            if(nums[i]==copy[left]){
                arr[0]=i;
            }
        }
        for(int i=n-1; i>=0; i--){//checking second element index in original array nums and storing it in arr
            if(nums[i]==copy[right]){
                arr[1]=i;
            }
        }
        return arr;//returning the array 
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,7};
        int target=6;
        System.out.print(Arrays.toString(twoSum(arr, target)));
    }
}
