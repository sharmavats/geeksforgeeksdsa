//timee complexity =o(n)
//space complexity =o(1)
public class secondlargest {
    static int secondlargestelement(int arr[], int n){
        int res=-1,largest=0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]<arr[largest]){
                if(res==-1||arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={23,76,13,56,77};
        int n=arr.length;
        System.out.println("array ");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        int a=secondlargestelement(arr, n);
        System.out.println("2nd largest element "+arr[a]);
    }
}
