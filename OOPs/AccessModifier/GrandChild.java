package OOPs.AccessModifier;

public class GrandChild extends Parent{
    public String name;

    public GrandChild(){
        System.out.println("GrandChild Constructor "+super.stocks);
        Child c=new Child();
        System.out.println(c.stocks);
    }
}