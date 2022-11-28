import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class MyMap{
    public static void main(String args[]){
        HashMapDemo();

        // TreeMap is same as HashMap its just store keys in sorted order
        Map<String,Integer> mp2= new TreeMap<>();
    }

    public static void HashMapDemo(){
        Map<String,Integer> mp= new HashMap<>();

        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);
        mp.put("four",4);

        mp.remove("two");

        System.out.println(mp);
        System.out.println("chack two is present in key:"+mp.containsKey("two"));
        System.out.println("chack 3 is present in value:"+mp.containsValue(3));
        // put element if key is not present
        mp.putIfAbsent("five",5);

        // traverse through map
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.println(e);
            System.out.println("key:"+e.getKey()+" value:"+e.getValue());
        }

        // for traverse through keys only
        for(String k:mp.keySet()){
            System.out.println(k);
        }
        // for traverse through values only
        for(Integer v:mp.values()){
            System.out.println(v);
        }

        boolean isEmpty = mp.isEmpty();
        mp.clear();
    }
}