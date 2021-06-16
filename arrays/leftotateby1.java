//time complexity = o(N)
//space complexity=o(1)
public class leftotateby1 {
    static void lrotateone(int arr[], int n){
        int temp=arr[0]; // storing 1st element in temp variable
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
            arr[n-1]=temp;
        
    }
    public static void main(String[] args) {
        int arr[]={12,53,78,13};
        int n=arr.length;
        System.out.println("BEFORE ROTATE");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        lrotateone(arr, n);
        System.out.println("AFTER ROTATE");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
    }
}
}
