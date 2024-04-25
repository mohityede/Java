package OOPs.Inharitance;

public class C extends B{
    boolean isMarried;
    public C(boolean isMarried,int age,String name){
        super(age,name);
        this.isMarried=isMarried;
        System.out.println("C constructor");
    }

    public String toString(){
        return super.name+" "+super.age+" "+this.isMarried;
    }
}