package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 단독 if문 if(조건식){ 실행할 코드; }
	 * 
	 * -> 조건식의 결과 값이 true(참)이면 중괄호 ({ })안의 코드 실행 -> 조건식의 결과 값이 false(거짓)이면 코드 실행하지 않고 넘어감
	 */

	public void method1() {
		// 양수, 음수, 0판별

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다.");
		}

		if (num < 0) {
			System.out.println("음수다.");

		}
		if (num == 0) {
			System.out.println("0이다.");
		}
	}

	public void method2() {
		// 사용자로부터 정수하나 입력받아
		// "입력한 숫자는 짝수입니다."
		// "입력한 숫자는 홀수입니다."라고 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}

		// if(num %2 != 0)
		if (num % 2 == 1) {
			System.out.println("입력한 숫자는 홀수입니다.");
		}

	}

	public void method3() {
		// 성별을 입력 받아 남학생인지 여학생인지 판별
		Scanner sc = new Scanner(System.in);

		System.out.print("성별 (M/F) : ");
		char gender = sc.nextLine().charAt(0);

		String student = "";

		if (gender == 'M' || gender == 'm') {
			student = "남학생";
		}

		if (gender == 'F' || gender == 'f') {
			student = "여학생";
		}

		if (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("잘못 입력하셨습니다.");
			// 잘못 입력 받았을 경우 이후 코드를 실행하고 싶지 않음
			// 호출 된 메소드를 종료하고 싶을때는 return구문을 사용함

			return;

		}
		System.out.println(student + "이다.");
	}

	public void method4() {
		// 나이를 입력받아 어린이, 청소년, 성인 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();

		String result = "";

		if (age <= 13) {
			result = "어린이";

		}
		if (age > 13 && age <= 19) {
			result = "청소년";
		}

		if (age > 19) {
			result = "성인";
		}
		System.out.println(result + "입니다.");

	}

	public void method5() {
		// 입력 된 이름이 본인이 맞는지 확인하는 메소드

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		/*
		 * if (name == "신정현") { System.out.println("본인입니다."); }
		 * 
		 * if (name != "신정현") { System.out.println("본인이 아닙니다."); }
		 */
		// ctrl + shift + / => 블럭 범위 주석(드래그)

		// 기본 자료형은 비교시에 ==, !=과 같은 동등 비교를 할 수 있지만
		// String은 기본 자료형이 아닌 참조자료형 이므로
		// String 클래스에서 제공하는 equals() 메소드를 사용해서 비교해야한다.

		if (name.equals("신정현")) {
			System.out.println("본인입니다.");
		}

		if (!name.equals("신정현")) {
			System.out.println("본인이 아닙니다.");
		}

	}

}
