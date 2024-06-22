package OOPs.AnonymousClass;

public class Anonymous {
    public void show(){

        A obj=new A(){
            public void show(){
                System.out.println("Inside anoumous overrided show");
            }
        };
        obj.show();

        // B obj2=new B(); can't create abstract class object;
        B obj2 = new B(){
            public void show(){
                System.out.println("inside abstracted anonomys class");
            }
        };

        obj2.show();

    }
}
