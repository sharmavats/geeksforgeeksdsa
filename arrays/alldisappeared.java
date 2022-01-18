import java.util.*;
public class alldisappeared {
    //using cyclic sort 
// time complexity=O(N)
//space complexity=O(N)
//instead of using nums[i]!=n use nums[i]!i+1 as we want to shift last element also but not when our i is at last index as from o to n-1 index , elements are from 1 to n so i+1 is okay at i .


    static List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> l = new ArrayList<Integer>();//creating empty arraylist
        int i=0;
        while(i<n){//until i<n
            int correct=nums[i]-1;//correct value of the index for that element
            if(nums[i]!=i+1&&nums[i]!=nums[correct]){
                swap(nums,i,correct);//calling swap function
            }
            else{
                i++;//move forward
            }
        }
        for( int j=0; j<n; j++){//traversing the array and find out which elemnet is not at correct position
            if(nums[j]!=j+1){//index 0 for element 1
                l.add(j+1);//adding to list
            }
        }
        return l;//returing list
    }
    static void swap(int arr[],int a,int b){//swap function
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> l2=new ArrayList<Integer>(findDisappearedNumbers(arr));
        System.out.print(l2);

    }
}
