// time complexity =o(n)
// space complexity =o(1)
public class reversearray {
    static void reverse(int arr[], int n){
        int low=0; int high=n-1;  // it will swap values until low<high
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[]={12,53,78,13};
        int n=arr.length;
        System.out.println("BEFORE REVERSE");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        reverse(arr, n);
        System.out.println("AFTER REVERSE");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
