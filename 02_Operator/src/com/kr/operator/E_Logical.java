package com.kr.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() { // &&(논리합) 두 조건 모두 만족해야 참, ||(논리곱) 두 조건 중 하나만 만족해도 참
		// 사용자가 입력한 정수 값이 1부터 100사이의 값인지 확인하기
		Scanner sc = new Scanner(System.in);

		System.out.print("정수하나 입력 : ");
		int num = sc.nextInt();

		boolean isTrue;
		// isTrue = (1 <= num <= 100);
		isTrue = (num >= 1) && (num <= 100);

		System.out.println("사용자가 입력한 값이 1부터 100사이 입니까 : " + isTrue);

	}

	public void method2() {
		// 사용자가 입력한 문자 값이 영어 대문자인지 확인하기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);

		// char 형은 실제로 정수형
		// 'A'~'Z'에 해당하는 유니코드 값은 65~90
		boolean isTrue = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까 " + isTrue);
	}

	public void method3() {
		// 사용자에게 프로그램 종료 여부 묻기
		Scanner sc = new Scanner(System.in);

		System.out.print("계속 하시려면 y또는 Y를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);

		boolean isTrue = (ch == 'y') || (ch == 'Y');
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까" + isTrue);

	}

	public void method4() {
		// short cut 연산
		int num = 10;

		System.out.println("&& 연산 전의 num 값 : " + num);

		boolean result1 = false && ++num > 0;

		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num 값 : " + num);
		
		boolean result2 = true || ++num < 0;

		System.out.println("result2 : " + result2);
		System.out.println("|| 연산 후의 num 값 : " + num);
	

	}
}
