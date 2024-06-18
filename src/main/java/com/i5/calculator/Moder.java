package com.i5.calculator;

public class Moder {
    public static void main(String[] args) {
        System.out.println(mod(2, 0));
    }

    static public int mod(int firstNum, int secondNum) {
        int result = 0;

        try {
            result = firstNum % secondNum;
        } catch (ArithmeticException e) {
            System.out.println("secondNum에 0을 입력했습니다.");
            return -1;
        }
        return result;
    }
}