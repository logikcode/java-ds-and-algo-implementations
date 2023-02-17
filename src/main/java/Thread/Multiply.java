package Thread;

public class Multiply {

    public Multiply(){}

    synchronized  public void multiply (int num){

        for( int i = 0; i <= 10; i += 1){
            System.out.println("Implemented Thread Run : " + i * num +" " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException){
                interruptedException.getCause();
            }
        }
    }

}
