import java.util.*;
public class frequency {
    
    static int findFrequency(int a[], int x){
                int count = 0;
                for(int i = 0;i<a.length;i++){
                    if(a[i]==x)
                        count++;
                }
                return count;
            }
        
    
 public static void main(String[] args) {
     int arr[]={1,1,1,1,2,3,1,1};
     int c=findFrequency(arr, 1);
     System.out.println(c);
 }  
 
}

