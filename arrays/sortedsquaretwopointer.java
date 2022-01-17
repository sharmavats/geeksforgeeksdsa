import java.util.*;
public class sortedsquaretwopointer {
    // using 2 pointer approach 
//time complexity =O(N)
//space complexity=O(N)

    static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int start=0; int end=n-1;// two pointers start and end
        int pos=n-1;//last index of the newly created array arr as we will insert from the end
        int arr[]=new int[n];
        while(start<=end){
            if(Math.abs(nums[start])>Math.abs(nums[end])){//comparing the mod of both values
                arr[pos]=nums[start]*nums[start];//squaring 
                start++;
            }
            else {
                arr[pos]=nums[end]*nums[end];
                end--;
            }
            pos--;//decreasing index number of arr
        }
        return arr;//returning new sorted array
    }



    public static void main(String[] args) {
        int array[]={-4,-1,0,3,10};
        sortedSquares(array);
        System.out.println(Arrays.toString(sortedSquares(array)));
    }
}
