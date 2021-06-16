//time complexity =o(n)
//space complexity o(1)
public class removeduplicate {
    static int remduplicate(int arr[],int n){
        int res=1;
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
    
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,30,30,30}; //sorted array
        int n=arr.length;
        System.out.println(" before removing duplicates in array ");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        n=remduplicate(arr, n);//getting res value in it
        System.out.println("after removing duplicates ");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
