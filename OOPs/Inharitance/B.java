package OOPs.Inharitance;

public class B extends A{
    int age;

    public B(int age,String name){
        // super(name);
        this.age=age;
        System.out.println("B constructor");
    }
}