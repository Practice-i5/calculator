package com.i5.calculator;

public class Divider {

    public static String divider(double origin, double divisor) {
        double result;

        result = origin / divisor;
        if (divisor == 0) {
            return "0으로 나눌 수 없습니다.";
        }
        return Double.toString(result);
    }

//    public static void main(String[] args) {
//        System.out.println(divider(-10, 4));
//        System.out.println(divider(3, 0));
//    }
}