package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple"); //중복X

        System.out.println(set.size());

        for(String element : set){
            System.out.println(element);
        }
        set.remove("banana");
        for(String element : set){
            System.out.println(element);
        }

        boolean contains = set.contains("cherry");
        System.out.println("Set contains cherry?" +" "+contains);

        set.clear();
        boolean empty = set.isEmpty();
        System.out.println("Set is empty?"+" "+empty);
    }
}
