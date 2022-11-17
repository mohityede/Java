import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class MyList{

    public static void main(String args[]) {
        // creat List object of ArrayList type
        List<Integer> arr= new ArrayList<>();
        // to add element in end of list
        arr.add(23);
        arr.add(37);
        arr.add(1,21);
        System.out.println(arr);

        List<Integer> arr2= new ArrayList<>();
        arr2.add(132);
        arr2.add(193);
        arr2.add(127);
        arr2.add(192);
        arr2.add(37);
        arr2.add(37);
        System.out.println(arr2);

        // to add all the element of other ArrayList
        arr.addAll(arr2);
        // to get element by index
        System.out.println(arr.get(3));
        // to remove element by index
        System.out.println(arr.remove(1));
        // to remove integer by value
        arr.remove(Integer.valueOf(37));
        // to change value of index
        arr.set(0,50000);        
        // to check element exist in ArrayList or not
        System.out.println("contains 50:"+arr.contains(50));
        System.out.println("contains 192:"+arr.contains(192));
        // to get size of ArrayList (number of element present)
        int n= arr.size();
        System.out.print("\n Arr using for loop:");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+",");
        }

        System.out.print("\n Arr using foreach loop:");
        for(int ele:arr){
            System.out.print(ele+",");
        }

        System.out.print("\n Arr usint iterator:");
        // Iterator Class object creation
        Iterator<Integer> itr= arr.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        // to clear all the element of ArrayList
        arr.clear();
        System.out.println("\narr:"+arr);
    }
}