// time complexity = o(n)
// space complexity = O(1)
public class zerotoend {
    static void movezeroes(int arr[],int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
               arr= swap(arr,i,count);
                count++;
            }
        }
    }
    static int[] swap(int arr[],int i, int count){
    int temp=arr[i];
    arr[i]=arr[count];
    arr[count]=temp;
    return arr;
    }
    public static void main(String[] args) {
        int arr[]={10,0,20,0,30,30}; 
        int n=arr.length;
        System.out.println(" before  ");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        movezeroes(arr,n);
        System.out.println("after  ");
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
    }
}
}
