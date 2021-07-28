//time complexity = o(2^n)
//aux space = o(log(n))

import java.util.*;
public class allsubstring{
    public static void substrings(String str,String curr,int index){
      if(index==str.length()){
          System.out.print(curr+" ");
          return;
      }
     substrings(str,curr,index+1);
     substrings(str,curr+str.charAt(index),index+1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        String curr =" ";
        sc.close();
       substrings(str, curr ,0);
    }
}