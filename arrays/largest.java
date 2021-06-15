public class largest {
    static int getlargest(int arr[],int n){
        int res=0;  // intializing index no 0 as largest 
        for(int i=1; i<n; i++)
        if(arr[i]>arr[res])
        res=i;
        return res;
    }
    public static void main(String[] args) {
        int arr[]={12,24,6,76,14};
        int n=arr.length;
        
        System.out.println("array");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        int x=getlargest(arr,n); //get the index of largest element
        System.out.println("largest element is " + arr[x]);
    }
}
