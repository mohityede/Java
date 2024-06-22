package OOPs.Interfaces;

// import OOPs.Interfaces.Computer;
// import OOPs.Interfaces.Laptop;
// import OOPs.Interfaces.Desktop;
// import OOPs.Interfaces.Developer;

public class Interface {
    public void show(){
        Computer lapy=new Laptop();
        Computer desk=new Desktop();

        Developer dev=new Developer();
        dev.writeCode(desk);
    }
}
