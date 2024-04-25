package OOPs.Polymorphism;


// if any class is set as final we can't inharite it and all the method and properties are also final automatically
public class Shape{
    public void area(){
        System.out.println("Area of Shape:");
    }

    // cannot ovverride final method - early binding
    // public final int sum(int a,int b){
    //     return a+b;
    // }

    public int sum(int a,int b){
        return a+b;
    }

    public static void greeting(){
        System.out.println("shape greetings");
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }
}