package OOPs.Threads;

public class B extends Thread {
    public void run(){
        for(int i=0;i<50;i++) System.out.println("Hey..."+i);
    }
}
