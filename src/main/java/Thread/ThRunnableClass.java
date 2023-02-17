package Thread;

public class ThRunnableClass  {

    static Multiply mult;
    public  ThRunnableClass( Multiply multiply){
        mult = multiply;
    }
    Runnable runnable = () ->{
        mult.multiply(29);
    };

}
