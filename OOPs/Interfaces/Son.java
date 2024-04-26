package OOPs.Interfaces;

public class Son implements Dad,Mom {
    public int friendCount=10;

    public Son(){
        System.out.println("Son contructore");
    }

    @Override
    public void getLove() {
        System.out.println("Getting love from mom");
    }

    @Override
    public void getProperty() {
        System.out.println("getting properties from Dad");
    }
}