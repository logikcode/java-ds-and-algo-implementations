package Thread;

public class Test1 implements Runnable {

    public static void main(String[] args) {

        new Test1();
//       Test1 t1 = new Test1();
//       Thread thread = new Thread(t1);
//       thread.start();


    }

    public Test1(){
     //Test1 test1 = new Test1();
     new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Testing ....");
    }
}
