package ApnaCollege.Array.ArrayList;

import java.util.*;

public class intro{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        System.out.println(list.get(1));

        list.set(0, 1);
        System.out.println(list.size());
        System.out.println(list);
    }
}