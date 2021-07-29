// time complexity = o(1) on average for all methods
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("programming");
        h.add("for");
        h.add("love");
        System.out.println("hashset elements" +h);
        System.out.println(h.contains("is"));
        
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
}
