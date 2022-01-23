// time complexity=o(n)
//space complexity=o(n)

import java.util.*;
public class firstmissing{
    static Integer firstMissingPositive(int[] nums) {
        HashSet<Integer> h=new HashSet<Integer>();// creating a hashset
        int n=nums.length;
       // Arrays.sort(nums);
        for(int i=0; i<n; i++ ){//traversing the array to add every element to hashset
            h.add(nums[i]);
        }
        for(Integer i=1; i<=Integer.MAX_VALUE; i++){// finding the smallest positive integer absent 
            if(!h.contains(i)){// we can also use while loop with condition (h contains i) and increase i each time and if it didn't contains it comes out of while loop and we return it
                return i;// if not then return
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,0};
        System.out.print(firstMissingPositive(arr));
    }
}