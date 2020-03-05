package com.kr.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자 : 항목이 3개인 연산자
	// (조건식) ? (조건식이 참인 경우의 식 1) : (조건식이 거짓일 경우의 식 2);

	public void method1() {
		// 입력받은 정수가 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수이다" : "음수이다";

		System.out.println(num + "은(는) " + result);

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "짝수이다" : "홀수이다";
		System.out.println(num + "은(는) " + result);

	}

	public void method3() {
		// 사용자에게 두 개의 정수 값을 입력 받아서
		// 두 정수 값의 곰셈 결과가 100보다 이상인 경우 "결과가 100 이상입니다."
		// 작은 경우 "결과가 100보다 작습니다"를 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("정수값1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수값2 : ");
		int num2 = sc.nextInt();

		String result = (num1 * num2 >= 100) ? "결과가 100이상입니다." : "결과가 100보다 작습니다.";
		System.out.println(num1 * num2 + "은(는) " + result);
	}

	public void method4() {
		// 사용자가 입력한 영문자가 대문자인지 소문자인지 판별 후 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);

		String result = (ch >= 'A' && ch <= 'Z') ? "대문자이다" : "대문자가 아니다";

		System.out.println(ch + "는 " + result);

	}

	public void method5() {
		// 삼항 연산자 중첩 사용
		// 입력 받은 정수가 0인지 0이 아닌지 판별한 뒤
		// 0이 아닌경우 양수인지 음수인지 판별

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		String result = (num == 0) ? "0이다" : ((num > 0)) ? "양수이다" : "음수이다";
		System.out.println(num + "은(는) " + result);

	}
}
