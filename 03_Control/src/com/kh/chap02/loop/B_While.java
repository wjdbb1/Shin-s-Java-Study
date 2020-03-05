package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * while문
	 * 
	 * [초기식]; while(조건식){ 실행할 코드; [증감식; 분기문;] }
	 */

	public void method1() {
		// "안녕하세요" 5번 출력

		int i = 1; // 초기식
		while (i <= 5) {// 조건식
			System.out.println("안녕하세요");
			i++;

		}
		// 1부터 5까지 출력하기
		i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;// 증감식
		}
	}

	public void method2() {
		// 5부터 1까지 역순으로 출력하기

		int i = 5;
		while (i > 0) {// (i>=1)
			System.out.print(i + " ");
			i--;
		}
	}

	public void method3() {
		// 1에서 10사이의 홀수만 출력하기

		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}

	public void method4() {
		// 1부터 랜덤 값 (50~100)까지의 합 구하기
		int random = (int) (Math.random() * 51) + 50;
		System.out.println("랜덤 수 : " + random);

		int sum = 0;
		int i = 1;
		while (i <= random) {
			sum += i;
			i++;

		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}

	public void method5() {
		// 사용자한테 문자열을 입력 받아서 각 인덱스별 문자를 출력
		// "apple"
		// a
		// p
		// p
		// l
		// e

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 문자열의 길이를 알려면 --> 문자열.length(); 메소드 사용
		System.out.println("문자열의 길이 : " + str.length());

		// 0~문자열의 길이 -1
		// for (int i = 0; i < str.length(); i++) {
		// System.out.println(str.charAt(i));
		// }

		int i = 0;
		while (i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}

	}
//=====================================(중첩 반복문)============================================

	public void method6() {
		// 2단부터 9단까지 출력

		int dan = 2;
		while (dan <= 9) {
			System.out.println("===== " + dan + "단 =====");

			int su = 1;
			while (su <= 9) {
				System.out.println(dan + " X " + su + " = " + (dan * su));
				su++;

			}
			dan++;
		}
	}

	public void method7() {
		// for문을 이용한 시간 출력 ==> while문으로 변경해보기
		// 단 출력문은 printf를 사용

		int hour = 0;
		while (hour < 24) {

			int min = 0;
			while (min < 60) {
				System.out.printf("%2d시  %2d분\n ", hour, min);
				min++;
			}
			hour++;
		}
	} // ->정해진 횟수만큼 반복하고자 할 때는 for문을 이용하는 것이 편리
		// while문은 주로 메뉴를 만들어서 계속해서 프로그램을 진행할 것인지 판단하는 용도로 사용

	public void method8() {
		Scanner sc = new Scanner(System.in);

		// while문의 조건에 true를 넣으면 계쏙해서 반복하는 무한 루프를 만들 수 있음
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 1월부터 5월까지 출력"); // method1()
			System.out.println("2. 5월부터 1월까지 역순출력"); // method2()
			System.out.println("3. 1월부터 10월까지 홀수 출력"); // method3()
			System.out.println("9. 프로그램 종료");

			System.out.println("메뉴선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;// 메소드 종료
			default:
				System.out.println("잘못 입력하였습니다.");

			}
		}
	}

	public void method9() {
		// 문자열 입력받고 그 문자열이 "exit"가 아닐 때까지 반복

		Scanner sc = new Scanner(System.in);
		String str = ""; // 사용자가 입력할 문자열을 받을 변수 미리 선언 및 초기화

		while (!str.equals("exit")) {
			System.out.print("문자열을 입력해주세요 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
		System.out.println("exit 입력 종료되었습니다.");
	}

}