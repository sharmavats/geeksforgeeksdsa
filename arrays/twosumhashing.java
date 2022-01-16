// time complexity =O(N) as hashmap only take o(1) time to insert and retrieve elements
// space complexity =O(N) as we hashmap increase lineraly as n grows
import java.util.*;
public class twosumhashing {
    static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
    HashMap<Integer,Integer> h=new HashMap<>();// creating empty hashmap
        for(int i=0; i<n; i++){// iterating the array
            int temp=target-nums[i]; // difference or complement
            if(h.containsKey(temp)){ // if it contains the complement then just return key and value
                return new int[]{i,h.get(temp)};
            }
            else{
                h.put(nums[i],i); // else put the elements in hashmap
            }
        }
        return null;// null if didn't find answer
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,9,8};
        int target=6;
        System.out.print(Arrays.toString(twoSum(arr, target)));
    }
}
/*
if we dont have to return index this will work
public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> h = new HashSet<Integer>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            int temp=target-nums[i];
            if(h.contains(temp)){
                return new int[]{nums[i],temp};
            }
            else{
                h.add(nums[i]);
            }
        }
        throw new IllegalArgumentException("no two sum solution"); 
    }
*/


