import java.util.*;
public class sort012optimal {
    // 2 traversal O(n) time and O(1) time
    static void sortColors(int[] nums) {
          int count=0;//intial count 
        for(int i=0; i<nums.length; i++){//traversing the array 1st time to find 0's
             
            if(nums[i]==0){ // if 0 found then swapping its value to index count
                int temp;
             temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
                count++;//increasing count every time
            }
        }
        
        for(int i=count; i<nums.length; i++){// traversing array second time to arrange 1s 
            if(nums[i]==1){
                int temp;
                 temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
                count++;
            }
        
            }
        System.out.print(Arrays.toString(nums));//printing updated array
            }

    public static void main(String[] args) {
       int arr[]={1,0,2,1,1,0,0};
       sortColors(arr);
        
    }
}
