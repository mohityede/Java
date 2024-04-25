import OOPs.*;
import OOPs.Inharitance.*;
import OOPs.Polymorphism.*;

class main {
    public static void main(String[] args) {
        Basics obj=new Basics();

        // A c=new A();
        // C c=new C(false,24,"mohit");
        // System.out.println(c);

        Shape shape=new Shape();
        Circle circle=new Circle();
        Shape sq=new Square();

        // Method overloading - static/compile time Polymorphism
        shape.sum(1,2);
        shape.sum(1,2,3);

        // Method overriding - dynamic/run time polymorphism
        circle.area();
        sq.area();

        Square sq2=new Square();
        Shape sq3=new Square();
        sq2.greeting();
        sq3.greeting();

    }
}
