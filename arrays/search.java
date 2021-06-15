import java.util.*;
public class search{
    static int searcharray( int arr[], int n ,int num){
    for(int i=0; i<n; i++)
        if(arr[i]==num)
            return i ;
            return -1; 
    
    }
    public static void main(String[] args) {
        int arr []={10,15,20,17,19};
        int n= arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the element you want to search ");
        int num = sc.nextInt();
        sc.close();
       int position = searcharray(arr, n, num);
       if(position==-1){
           System.out.print("element not found ");
       }
       else{
           System.out.print("element found at position :"+(position+1));
       }
    }
}