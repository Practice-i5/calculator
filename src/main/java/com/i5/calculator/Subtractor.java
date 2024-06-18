package com.i5.calculator;

import java.util.Scanner;

public class Subtractor {
    public static int subtract(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public static void main(String[] args) {
        // Scanner 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double firstNumber = scanner.nextDouble();

        // 두 번째 숫자 입력받기
        System.out.print("두 번째 숫자를 입력하세요: ");
        double secondNumber = scanner.nextDouble();

        // 빼기 계산 수행
        int result = subtract((int) firstNumber, (int) secondNumber);

        // 결과 출력
        System.out.println("결과: " + firstNumber + " - " + secondNumber + " = " + result);

        scanner.close();
    }
}
