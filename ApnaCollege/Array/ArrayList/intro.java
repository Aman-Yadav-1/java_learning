package ApnaCollege.Array.ArrayList;
import java.util.*;

class intro{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int elem = list.get(2);
        System.out.println(elem);
        
        //add elem in bet
        list.add(1,1);
        System.out.println(list);

        //set elem
        list.set(0, 5);
        System.out.println(list);

        //delete an element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);
    }
}