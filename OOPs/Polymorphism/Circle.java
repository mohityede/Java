package OOPs.Polymorphism;

public class Circle extends Shape{
    @Override
    public void area(){
        System.out.println("Area of Circle:");
    }

    // cannot ovveride final method
    public int sum(int a,int b){
        return a+b;
    }
}