package com.i5.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int result;

        System.out.print("정수 두개를 입력해주세요");
        int firstNum = stdIn.nextInt();
        int secondNum = stdIn.nextInt();

        // dd
        System.out.print("[+-*%] === 원하는 계산을 선택해주세요(나누기는 %로 입력해주세요)");


        switch (stdIn.nextLine()) {
            case "+": // 더하기
                result = new Adder().add(firstNum, secondNum);
                break;
            case "-": // 빼기
                result = new Subtractor().subtract(firstNum, secondNum);
                break;
            case "*": // 곱하기
                result = new Multiplier().multiply(firstNum, secondNum);
                break;
            case "%":
                result = new Divider().divid(firstNum, secondNum);
                break;

            System.out.println("계산 결과 : " + result);
        }
    }
}
