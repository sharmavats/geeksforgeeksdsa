import java.util.*;
public class 3sum{
    static int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int closestsum=Integer.MAX_VALUE;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);//sorting the array
        for(int i=0; i<n-2; i++){// traversing the array n-2 because at that we will find out result and after it two pointer condition start<end fail 
            int start=i+1;// start pointer
            int end=n-1;// end pointer
            while(start<end){
                int localdiff;//diff bw target and sum
              int sum=nums[i]+nums[start]+nums[end];
                if(sum==target){// if equal then just return it
                    return sum;
                }
                else if(sum>target){
                    localdiff=sum-target;//calculate localdiff
                    if(localdiff<diff){//if localdiff is smaller 
                        diff=localdiff;// update diff and closestsum
                        closestsum=sum;
                    }
                    end--;// decrease end pointer
                }
                else{// else inc start
                    localdiff=target-sum;
                    if(localdiff<diff){
                        diff=localdiff;
                        closestsum=sum;
                    }
                    start++;
                }
            }
        
        }
        return closestsum;//return closest sum
    }
    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        int target=1;
        System.out.println(threesumclosest(arr,target));
    }
}