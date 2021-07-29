import java.util.*;
public class implementationofchaining{
    static int bucket;
    static ArrayList <LinkedList<Integer>>table;
    public static void myhash(int b){  // myhash function 
     bucket=b;
     table=new ArrayList<LinkedList<Integer>>();
     for(int i=0; i<b; i++){
     table.add(new LinkedList<Integer>());
    }
    }

     public static void insert(int key){   //insert function
         int i=key%bucket;
         table.get(i).add(key); //get(i) to go to a specific index in array list 
         System.out.println(key+" is inserted");
     }

     public static void delete(int key ){    // delete or remove function
         int i=key%bucket;
         table.get(i).remove((Integer)i); // ready made functn , typecasted (object so that it dont beheive as index)
         System.out.println(key+" is deleted");
        }

     public static boolean search(int key){    //search function 
         int i=key%bucket;
         return (table.get(i).contains(key)); // function contains if the key is present or not 
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bucket size ");
        int b = sc.nextInt();
        sc.close();
        myhash(b);
        insert(70);
        System.out.println(""+search(70)); 
        insert(71);
        insert(78);
        insert(65);
        delete(65);
        System.out.println(""+search(78));
    }
}