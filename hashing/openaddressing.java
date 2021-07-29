import java.util.*;
class myhash{
    int[] arr;
    int cap , size ; // capacity and size 
    public myhash(int c){   // constructor of myhash class , c while making object of this class 
    cap=c; // initial capacity is c
    size=0; // initial size is zero 
    arr= new int[cap];
    for(int i=0; i<cap; i++){
        arr[i]=-1; // -1 means empty 
    }
    }
    int hash(int key){
        return key%cap; //return hash function 
    }
    boolean search (int key){ // search function that return bool value
    int h=hash(key); // calling hash function 
    int i =h;
    while(arr[i]!=-1){
        if(arr[i]==key)
        return true;
        i=(i+1); //inc i 
        if(i==h);  // if we traverse fully 
        return false;
    }
    return false;
    }
    boolean insert(int key){
        if(size==cap) //full hashtable
        return false;
        int i =hash(key);
        while(arr[i]!=-1&&arr[i]!=-2&&arr[i]!=key)
        i=(i+1)%cap;
        if(arr[i]==key){
        return false;
        }
        else{
            arr[i]=key;
            size++;
            return true;
        }
    }
    boolean erase (int key){
        int h =hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;  // -2 for deleted
                return true;
            }
            i=(i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
    }
    }

public class openaddressing {
    public static void main(String[] args) {
        myhash mh = new myhash(7);
        mh.insert(49);
        mh.insert(56);
        mh.erase(49);
        mh.search(56);
    }
}
