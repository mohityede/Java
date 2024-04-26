import OOPs.Interfaces.*;

class main {
    public static void main(String[] args) {
        // Basics obj=new Basics();

        // A c=new A();
        // C c=new C(false,24,"mohit");
        // System.out.println(c);

        // Shape shape=new Shape();
        // Circle circle=new Circle();
        // Shape sq=new Square();

        // // Method overloading - static/compile time Polymorphism
        // shape.sum(1,2);
        // shape.sum(1,2,3);

        // // Method overriding - dynamic/run time polymorphism
        // circle.area();
        // sq.area();

        // Square sq2=new Square();
        // Shape sq3=new Square();
        // sq2.greeting();
        // sq3.greeting();

        // Parent p=new Parent();
        // Child c=new Child();
        // // System.out.println(p.stocks);
        // // System.out.println(c.stocks);
        // GrandChild gc=new GrandChild();

        Son s1=new Son();
        s1.getLove();
        s1.getProperty();
        System.out.println(Mom.HairColor);
        System.out.println(s1.friendCount);

        Mom s2=new Son();
        // System.out.println(s2.friendCount);
        s2.sayHello();
        Mom.getReady();

        
    }
}
