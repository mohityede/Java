package OOPs.Threads;

public class Threads {
    public void show(){
        A a=new A();
        a.start();
        B b=new B();
        b.start();
    }
}
