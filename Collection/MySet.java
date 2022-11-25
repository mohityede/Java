import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MySet{
    public static void main(String args[]){
        // set store only unique elements
        // HashSet elements are stored in random order
        HashSetDemo();

        // all the HashSet functions work in same way for LinkedHashSet and TreeSet
        // its same as HashSet but its implimented on top of linkedList(elements are in order as inserted)
        Set<Integer> s2 = new LinkedHashSet<>();

        // its is also same as hashSet but its implimented on top of Tree (all the elements are in sorted order)
        Set<Integer> s3 = new TreeSet<>();

    }

    public static void HashSetDemo(){
        // set store only unique elements
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(92);
        set.add(10);
        set.add(31);
        System.out.println(set);
        // if we add same avilabele element again it will not insert
        set.add(10);
        set.remove(92);
        System.out.println(set);
        System.out.println("10 is present is set:"+set.contains(10));
        System.out.println("100 is present is set:"+set.contains(100));
        System.out.println("isEmpty():"+set.isEmpty());
        System.out.println("size of set:"+set.size());
        set.clear();
        System.out.println(set);
    }
}