package OOPs;

public class Basics{
    String name;

    public Basics(){
        System.out.println("This is static constructor");
    }

    public Basics(Basics old){ // copy constructor
        this.name=old.name;    
    }

    public void printBasic(){
        System.out.println("Besics");
    }
}