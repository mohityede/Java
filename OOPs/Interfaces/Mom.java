package OOPs.Interfaces;

public interface Mom{
    String HairColor="black";// all vairables are final and static in interface by default

    void getLove();

    default void sayHello(){
        System.out.println("hello son");
    }

    static void getReady(){
        System.out.println("getting ready....");
    }
}