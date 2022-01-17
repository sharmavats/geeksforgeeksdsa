import java.util.*;
public class sortedsquare {
    // nlogn solution brute force 
// just traverse through the array and square the elements
//after squaring just apply sort function and retirn the array

    static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            nums[i]=(nums[i]*nums[i]);
                 }
        Arrays.sort(nums);
        return nums;
    }



    public static void main(String[] args) {
        int arr[]= {-4,-1,0,3,10};
        sortedSquares(arr);
        System.out.print(Arrays.toString(arr));
    }
}
