package Thread;

public class DemoThis extends Thread {
    Thread t;
    public DemoThis(){
        //super("DemoingThis");
        t = new Thread(this, "Thread Name");
        t.start();
        System.out.println("DemoThis ID "+ getId());
       // start();
    }
    @Override
    public void run(){
        try {
            t.join(2000);
            System.out.println(t.getName() + " "+ t.getId());

        } catch (InterruptedException ex){
            System.out.println("Exception");
        }
        //System.out.println(this);
    }
}
