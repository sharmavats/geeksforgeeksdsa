import java.util.*;
public class leftrotatebyd {
    static void rotate(int arr[],int d){
    int temp[]=new int[d];
    for(int i=0; i<d; i++){//copying first d elements into the temp array
        temp[i]=arr[i];
    }
    for(int i=d; i<arr.length; i++){//changing indexes of rest of the array
        arr[i-d]=arr[i];
    }
    for(int i=0; i<d; i++){//assigning temp array elements in old array at last
        arr[arr.length-d+i]=temp[i];
    }
    }
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter size of an array");
  int a = sc.nextInt();
  int arr[] =new int[a]; 
  System.out.println("enter array elements");
  for(int i=0; i<a; i++){
       arr[i]=sc.nextInt();
  }
  System.out.println("after rotation");
  rotate(arr, 2);//also d can be provided by user
  System.out.print(Arrays.toString(arr));
  }  
}
