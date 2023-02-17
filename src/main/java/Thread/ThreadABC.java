package Thread;

public class ThreadABC extends Thread {
    Multiply mul;
    public  ThreadABC(Multiply multiply){
        mul  = multiply;
    }
    @Override
    public void run(){
        mul.multiply(200);
    }
}
