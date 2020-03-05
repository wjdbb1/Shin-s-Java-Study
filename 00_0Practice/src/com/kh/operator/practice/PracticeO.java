package com.kh.operator.practice;

import java.util.Scanner;

public class PracticeO {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다" : "양수가 아니다";
		System.out.println(result);

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다" : ((num == 0) ? "0이다" : "음수다");
		System.out.println(result);
	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("인원수 : ");
		int person = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + (candy / person));
		System.out.println("남는 사탕 개수 : " + (candy % person));
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);

		String gender2 = (gender == 'M') ? "남학생" : "여학생";

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();

		System.out.println(
				grade + "학년 " + ban + "반 " + num + "번 " + name + " " + " " + gender2 + "의  " + "성적은 " + score + "이다.");

	}

	public void method6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";

		System.out.println(result);
	}

	public void method7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = (kor + eng + math) / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("합계 : " + avg);

		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";

		System.out.println(result);

	}

	public void method8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호를 입력하세요(-포함) : ");
		String jumin = sc.nextLine();

		String result = (jumin.charAt(7) == '1' || jumin.charAt(7) == '3') ? "남자"
				: (jumin.charAt(7) == '2' || jumin.charAt(7) == '4') ? "여자" : "잘못입력하였습니다.";

		System.out.println(result);
	}

	public void method9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int num = sc.nextInt();

		String result = (num1 >= num || num2 < num) ? "true" : "false";

		System.out.println(result);

	}

	public void method10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		String result = (num1 == num2 && num2 == num3) ? "true" : "false";

		System.out.println(result);

	}

}
