package com.kr.operator;

public class B_InDecrease {
	public void method1() {
		// 전위 연산
		int a = 10;
		int b = ++a;
		System.out.println("a : " + a + ", b : " + b);

		// 후위연산
		int c = 10;
		int d = c++;
		System.out.println("c : " + c + ", d : " + d);

		int num1 = 20;
		int result = num1++ * 3;
		System.out.println("result : " + result); // 60
		System.out.println("num1 : " + num1); // 20
	}

	public void method2() {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a++);// 10(11)

		System.out.println((++a) + (b++));// a: 12, b : 20(21) -> 32출력

		System.out.println((a++) + (--b) + (--c));// a : 12(13), b : 20, c : 29 -> 12 + 20 + 29 = 61출력

		System.out.println("a : " + a);// 13
		System.out.println("b : " + b);// 20
		System.out.println("c : " + c);// 29
	}
}

