package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method1() {
		// "exit" 입력 전까지 문자열을 계속 입력 받는 프로그램

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();

			if (str.equals("exit")) // {
				break; // 반복문을 빠져나옴(조건문이랑은 관계x)
			// }

			// 제어문 이후에 오는 명령문이 하나일 경우 중괄호 없이 작성 가능
			// 하나 이상이 되면 반드시 중괄호 안에 작성할 것

			System.out.println("str : " + str);

		}
		// 무한 반복문 안에서 break가 없는 경우 다음 코드에는 오류 발생
		// =>무한 반복문을 빠져나오지 않는다면 실행할 수 없는 코드이므로
		// System.out.println("test");
	}

	public void method2() {
		// 1부터 사용자가 입력한 숫자까지의 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		// for문 (조건식없음 -> 무한반복)
		for (int i = 1;; i++) {
			sum += i;
			if (i == num) // {
				break;
			// }

		}
		System.out.println("sum : " + sum);

	}
}
