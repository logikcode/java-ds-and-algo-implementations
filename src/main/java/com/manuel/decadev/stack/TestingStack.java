package com.manuel.decadev.stack;

public class TestingStack {
    public static void main(String[] args) {
        ThreeInOneStack stack = new ThreeInOneStack(3);
        boolean response = stack.isFull(1);
        System.out.println(response);
    }
}
