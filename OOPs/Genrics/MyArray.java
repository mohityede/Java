package OOPs.Genrics;

import java.util.ArrayList;

public class MyArray<T> {
    private static final String IndexOutOfBoundsException = "Index is out of range";
    private Object[] data;
    private static int DEFAULT_SIZE=20;
    private int size;

    public MyArray(){
        this.size=0;
        this.data=new Object[MyArray.DEFAULT_SIZE];
    }

    private boolean isFull(){
        if(this.size==this.data.length) return true;
        return false;
    }

    private void resizeData(){
        int currSize=this.data.length;
        Object[] newData=new Object[currSize*2];
        for(int i=0;i<this.size;i++){
            newData[i]=this.data[i];
        }
        this.data=newData;
    }

    public void add(T num){
        if(isFull()) resizeData();
        this.data[size]=num;
        this.size++;
    }

    public boolean contains(T num){
        for(int i=0;i<size;i++){
            if(this.data[i]==num) return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public int size(){
        return this.size;
    }

    public void set(int ind,T num){
        if(ind>=size) throw new Error(IndexOutOfBoundsException);
        else{
            this.data[ind]=num;
        }
    }

    public void remove(int ind) throws Exception{
        if(ind>=size) throw new Exception("out of range");
        else{
            for(int i=ind+1;i<this.size;i++){
                this.data[i-1]=this.data[i];
            }
            this.size--;
        }
    }

    @Override
    public String toString() {
        String res="";
        for(int i=0;i<this.size;i++){
            res+=this.data[i]+" ";
        }
        return res;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.contains(1);
        arr.isEmpty();
        arr.size();
        System.out.println(arr);
        arr.set(0, 2);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);

        System.out.println("Arr2 Starts:");
        MyArray<Character> arr2=new MyArray<>();
        arr2.add('3');
        arr2.add('d');
        System.out.println(arr2.contains('c'));
        System.out.println(arr2.contains('c'));
        System.out.println(arr2.isEmpty());
        System.out.println(arr2.size());
        System.out.println(arr2);
        arr2.set(1, 'x');
        System.out.println(arr2);
        try{
            arr2.remove(0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(arr2);
    }
}
