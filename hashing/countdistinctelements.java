// time complexity = 0(n)
// space complexity = 0(n)
import java.util.*;
public  class countdistinctelements {
    static int countdistinct(int arr[]){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            s.add(arr[i]);
        }
        System.out.println("hashset elements" +s);
        return s.size();
    }
    public static void main(String[] args) {
        int[] a={21,22,21,34,77,34};
        System.out.print(countdistinct(a));
        
    }
}
