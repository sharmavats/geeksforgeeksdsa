import java.util.Scanner;

import java.util.*;
public class longestconsecutive1 {
     static int maxConsecutiveOnes(int N) {
        String a = Integer.toBinaryString(N);
        int maxcount=0; int count=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='1'){
                count++;
                if(count>maxcount){
                    maxcount=count;
                }
            }
            else{
                count=0;
            }
        }
        return maxcount;
        
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(maxConsecutiveOnes(N));
    }
}
