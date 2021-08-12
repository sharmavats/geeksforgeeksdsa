//time complexity = o(nlogn) // worst case
//auxillary space = o(logn)
import java.util.Arrays;
public class arraysort{
    public static void main (String args[]){
        int arr[]={5,7,8,9,14,2,34};
        char arr2[]={'K','A','M','A','L'};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("sorted array arr is "+Arrays.toString(arr));
        System.out.println("sorted array arr2 is "+Arrays.toString(arr2));

    }
}