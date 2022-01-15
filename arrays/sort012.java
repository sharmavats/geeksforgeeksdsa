import java.util.*;
public class sort012 {
    public static void sort(int a[], int n)
    {
        int count0=0;
        int count1=0; 
        int count2=0;
        for(int i=0; i<n; i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0; i<count0; i++){
            a[i]=0;
        }
        for(int i=count0; i<(count0+count1); i++){
            a[i]=1;
        }
        for(int i=(count0+count1); i<n; i++){
            a[i]=2;
        }
        
    }


   public static void main(String[] args) {
       int a[]={1,1,1,0,1,2,0};
       int n=a.length;
       sort(a, n);
       System.out.print(Arrays.toString(a));

   } 
}
