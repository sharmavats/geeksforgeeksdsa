// Hashset is used to store key value pairs
//time complexities = o(1)
//space complexity = o(n) where n is no of entries in hashmap
import java.util.*;
public class Hashmap {
 public static void main(String[] args) {
     HashMap<String,Integer> m = new HashMap<String,Integer>();
     m.put("gfg",10);
     m.put("ide",15);
     m.put("courses",12);
     System.out.println(m);
     System.out.println(m.size());

     for(Map.Entry<String, Integer> e : m.entrySet()){
         System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
     }
//other methods m.containsKey(" keyname") and m.containsvalues(15) etc
 }   
}
