package Thread;

public class ThreadPlay {

    static Thread t1;
    static Thread t2;
    static ThreadABC object;
    static Multiply multi;

    public static void main(String[] args) {

        multi = new Multiply();

        object = new ThreadABC(multi);

       // ThreadABC abc = new ThreadABC(multi);
        ThRunnableClass th2 = new ThRunnableClass(multi);
        Thread thread2 = new Thread(th2.runnable);
        thread2.start();



        //t1 = new Thread(object);
        //t2 = new Thread(th2);
        object.start();





    }

}
