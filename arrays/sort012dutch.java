// using dutch national flag algorithm using 3 pointers
//time complexity=O(N)
//space complexity=O(1)
import java.util.*;
public class sort012dutch {
    static void sortColors(int[] nums) {
        int n=nums.length;
        int start=0; int p=0; int end=n-1;
        int temp;
        while(p<=end){// traversing whole array using p
            if(nums[p]==0){// if 0 comes than swap with start
                temp=nums[p];
                nums[p]=nums[start];
                nums[start]=temp;
                start++;
                p++;
            }
            else if(nums[p]==1){
                p++;
            }
            else{// if 2 comes swap end end pointer or iterator
                temp=nums[p];
                nums[p]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
        System.out.print(Arrays.toString(nums));//printing array
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,1,0,1};
        int n=arr.length;
        sortColors(arr);
    }
}
