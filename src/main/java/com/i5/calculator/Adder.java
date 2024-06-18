package com.i5.calculator;

import org.w3c.dom.ls.LSOutput;

public class Adder {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }

    static public int add(int first, int second) {
        return first + second;
    }
}