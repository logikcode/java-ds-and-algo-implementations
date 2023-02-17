package com.manuel.decadev.generics;

public class Fibonacci implements Generator<Integer>{
    private int num = 0;
    @Override
    public Integer next() {
        return fib(num++);
    }

    public static Integer fib(int num){
        if (num < 2) {
            return 1;
        }
        int result = fib(num-2) + fib(num - 1);
        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 18; i++){
            System.out.println(fibonacci.next());
        }
    }
}
