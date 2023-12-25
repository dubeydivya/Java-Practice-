import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String args[]){
        //hashset creation
        HashSet<Integer> set =new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//duplicate
        //size
        System.out.println("size of set is: "+ set.size());

        //print element
        System.out.println(set);

        //search--contains
        if(set.contains(1)){
            System.out.println("set contain 1");
        }
        if (!set.contains(6)){
            System.out.println("set not contain");
        }
        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1- we delete 1");
        }

        //Iterator
        Iterator it = set.iterator();

        //Iterator ke 2 main function hote he 1.hashNext  2.next
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
