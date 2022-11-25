import java.util.Set;
import java.util.HashSet;

public class MySet{
    public static void main(String args[]){
        HashSetDemo();
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