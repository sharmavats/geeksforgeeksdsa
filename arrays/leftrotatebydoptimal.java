import java.util.*;
public class leftrotatebydoptimal {
    static void rotate(int arr[],int n, int d){
         reverse(arr, 0,d-1 );//first d elements
         reverse(arr,d,n-1);//d to last
         reverse(arr, 0, n-1);//whole array

    }
    static void reverse(int arr[],int low,int high){
      while(low<high){
          swap(arr, low, high);
          low++;
          high--;
      }  
    }
    static void swap(int arr[],int low, int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  System.out.println("enter size of an array");
  int a = sc.nextInt();
  int arr[] =new int[a]; 
  System.out.println("enter array elements");
  for(int i=0; i<a; i++){
       arr[i]=sc.nextInt();
  }
  int n=arr.length;
  System.out.println("after rotation");
  rotate(arr,n,2);//also d can be provided by user
  System.out.print(Arrays.toString(arr));
  }  
    }

