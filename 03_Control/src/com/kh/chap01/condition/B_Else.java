package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if - else문 if(조건식){ 실행할 코드1; } else{ 실행할 코드2; }
	 * 
	 * -> 조건식의 결과가 true인 경우 코드1 수행 후 빠져나감 조건식의 결과가 false인 경우 무조건 코드2 수행
	 */

	/*
	 * if - else if - else 문 if(조건식1){ 실행할 코드1; } else if(조건식2) { 실행할 코드2; } else {
	 * 실행할 코드3; }
	 * 
	 * -> 조건이 다수일 경우 사용하는 조건문으로 조건식1의 결과가 true인 경우 코드1을 수행하고 빠져나감 조건식1의 결과가 false인
	 * 경우 다음 조건식2 수행 조건식2의 결과가 true인경우 코드2를 수행하고 빠져나감 조건식2의 결과가 false인 경우 무조건 코드3수행
	 * 
	 * 
	 */
	public void method1() {
		// 양수, 음수, 0판별

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		// 3개의 조건이기 떄문에 if-else if-else문으로 구성
		if (num > 0) {
			System.out.println("양수다.");
		} else if (num < 0) {
			System.out.println("음수다.");
		} else /* if (num == 0) */ {
			System.out.println("0이다.");
		}
	}

	public void method2() {
		// 짝 홀 판별
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		// 어짝피 짝수 아니면 홀수 이므로 조건은 2개뿐 -> if-else로 구성

		if (num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");

		} else {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
	}

	public void method3() {
		// A_If method3() -> if - else if - else구문으로 바꿔서 동일하게 수행되도록 하기

		Scanner sc = new Scanner(System.in);

		System.out.print("성별 (M/F) : ");
		char gender = sc.nextLine().charAt(0);

		String student = "";

		if (gender == 'M' || gender == 'm') {
			student = "남학생";
		} else if (gender == 'F' || gender == 'f') {
			student = "여학생";
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return; // 메소드 종료 구문
		}
		System.out.println(student + "입니다.");
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		String result = "";

		if (age <= 13) {
			result = "어린이";
		} else if (/* age > 13 && */ age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}

		// if - else if 구문은 위의 조건 구문을 만족하지 못하고 내려왔기 때문에
		// 당연히 위의 조건의 반대 조건을 내부적으로 포함하고 있음

		System.out.println(result);
	}

	public void method5() {
		// 사용자에게 점수를 입력받아
		// 점수별로 등급을 나눠 점수와 등급을 출력하는 메소드

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = sc.nextInt();

		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("당신의 점수는 " + score + "이고, 등급은 " + grade + "입니다.");
	}

	public void method6() {
		// 위의 문제에 각 등급별 중간 점수 이상의 경우에는 등급에 "+"라는 문자를 추가하여 출력
		// 예) 95점 이상은 A+

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = sc.nextInt();

		String grade = "";

		if (score >= 90) {
			grade = "A";

			if (score >= 95) {
				grade += "+";
			}

		} else if (score >= 80) {
			grade = "B";

			if (score >= 85) {
				grade += "+";
			}

		} else if (score >= 70) {
			grade = "C";

			if (score >= 75) {
				grade += "+";
			}

		} else if (score >= 60) {
			grade = "D";

			if (score >= 65) {
				grade += "+";
			}

		} else {
			grade = "F";
		}
		System.out.println("당신의 점수는 " + score + "이고, 등급은 " + grade + "입니다.");
	}
}