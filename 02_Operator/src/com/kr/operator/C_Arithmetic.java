package com.kr.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 10;
		int num2 = 3;

		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 + num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2); // 나누기의 목 -> 3
		System.out.println("num1 % num2 = " + num1 % num2); // 나누기의 나머지 -> 1

		// %(모듈러)는 이후 조건문에서 짝홀 판별 등에 많이 사용
		// 값 % 2 == 0 --> 짝수
		// 값 % 2 == 1 --> 홀수

		// 또한 배수 판별에서도 자주사용
		// 5의 배수인가?
		// 값 % 5 == 0

		int a = 10, b = 20, c = 0;

		c = a * b;
		c = a / b;

		System.out.println("a * b = " + (c = a * b));
		System.out.println("a / b = " + (c = a / b));
		System.out.println("a % b = " + (c = a % b));

		System.out.println("a + b = " + (c = a + b));
		System.out.println("a - b = " + (c = a - b));

	}
}
