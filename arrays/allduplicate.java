import java.util.*;
public class allduplicate {
    
        static List<Integer> findDuplicates(int[] nums) {
            int n=nums.length;
            List<Integer> l=new ArrayList<Integer>();
            for(int i=0; i<n; i++){
                int index=Math.abs(nums[i]);
                if(nums[index-1]<0){
                    l.add(Math.abs(nums[i]));
                    
                }
                else{
                    nums[index-1]*=-1;
                }
                }
            
            
        return l;
        }
    
    public static void main(String[] args) {
        int arr[]={1,1,2};
        List<Integer> l2=new ArrayList<>(findDuplicates(arr));
        System.out.println(l2);
    }
}
