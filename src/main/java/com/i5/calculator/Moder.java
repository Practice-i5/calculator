package com.i5.calculator;

public class Moder {
    static public int mod(int firstNum, int secondNum) {
        int result = 0;
//        try {
//            result = firstNum % secondNum;
//        } catch (IllegalArgumentException e) {
//            System.out.println("second에 0을 입력하지 마세요");
//        }

        if (secondNum == 0) {
            System.out.println("secondNum가 0입니다.");
            return -1;
        }


        return result;
    }
}
