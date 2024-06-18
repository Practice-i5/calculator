package com.i5.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int result;
        String s_result;

        System.out.println("정수 두 개를 입력해주세요");
        int firstNum = stdIn.nextInt();
        int secondNum = stdIn.nextInt();
        System.out.println("[+-*/] === 원하는 연산을 입력해주세요");
        String str = stdIn.next();

        switch (str) {
            case "+": // 더하기
                result = new Adder().add(firstNum, secondNum);
                System.out.println("계산 결과 : " + result);
                break;
            case "-": // 빼기
                result = new Subtractor().subtract(firstNum, secondNum);
                System.out.println("계산 결과 : " + result);
                break;
            case "*": // 곱하기
                result = new Multiplier().multiply(firstNum, secondNum);
                System.out.println("계산 결과 : " + result);
                break;
            case "/":
                s_result = new Divider().divider(firstNum, secondNum);
                System.out.println("계산 결과 : " + s_result);
                break;

        }
    }
}