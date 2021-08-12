import java.util.Arrays;
public class partialsorting {
    public static void main(String[] args) {
        int arr[]={3,5,2,87,67,9,12};
        Arrays.sort(arr,1,4);
        System.out.println("sorted partial array is "+Arrays.toString(arr));

    }
}
