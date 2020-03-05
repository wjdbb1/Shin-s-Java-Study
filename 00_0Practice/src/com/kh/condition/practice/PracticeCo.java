package com.kh.condition.practice;

import java.util.Scanner;

public class PracticeCo {
	public void method1() {

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");

		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		String result = "";

		if (num == 1) {
			result = "입력";
		} else if (num == 2) {
			result = "수정";
		} else if (num == 3) {
			result = "조회";
		} else if (num == 4) {
			result = "삭제";
		} else if (num == 9) {
			System.out.println("프로그램이 종료되었습니다.");
			return;
		}
		System.out.println(result + "메뉴입니다.");

		/*
		 * if (num == 1) { System.out.println("입력 메뉴 입니다."); } else if (num == 2) {
		 * System.out.println("수정 메뉴 입니다."); } else if (num == 3) {
		 * System.out.println("조회 메뉴 입니다."); } else if (num == 4) {
		 * System.out.println("삭제 메뉴 입니다."); } else if (num == 9) {
		 * System.out.println("프로그램이 종료됩니다."); } else {
		 * System.out.println("잘못 입력하였습니다."); }
		 */
		/*
		 * switch (num) { case 1: System.out.println("입력 메뉴 입니다."); break; case 2:
		 * System.out.println("수정 메뉴 입니다."); break; case 3:
		 * System.out.println("조회 메뉴 입니다."); break; case 4:
		 * System.out.println("삭제 메뉴 입니다."); break;
		 * 
		 * case 9: System.out.println("프로그램이 종료됩니다."); break; default:
		 * System.out.println("잘못 입력하였습니다."); break;
		 * 
		 * }
		 */
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");

			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}

		/*
		 * if (num > 0 && num % 2 == 0) { System.out.println("짝수다"); } else if (num > 0
		 * && num % 2 == 1) { System.out.println("홀수다"); } else if (num <= 0) {
		 * System.out.println("양수만 입력해주세요."); }
		 */

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = (kor + eng + math) / 3;

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {

			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");

		}

	}

	public void method4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월 사이의 정수 입력 : ");
		int month = sc.nextInt();

		String season = "";
		switch (month) {

		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "잘못 입력된 달";
			break;
		}

		System.out.println(month + "월은 " + season + "입니다.");
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String InputId = sc.nextLine();

		System.out.print("비밀번호 : ");
		String InputPw = sc.nextLine();

		String id = "sjh";
		String pw = "qwe123";

		if (InputId.equals(id)) {
			if (InputPw.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str = sc.nextLine();

		switch (str) {
		case "관리자":
			System.out.println("회원관리, 게시글관리");
		case "회원":
			System.out.println("게시글작성, 댓글작성");
		case "비회원":
			System.out.println("게시글 조회");
			break;

		default:

			System.out.println("잘못 입력했습니다.");

		}
		/*
		 * if (str.equals("관리자")) {
		 * System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글작성"); } else if
		 * (str.equals("회원")) { System.out.println("게시글 작성, 게시글 조회, 댓글작성"); } else if
		 * (str.equals("비회원")) { System.out.println("게시글 조회"); } else {
		 * System.out.println("잘못 입력했습니다."); } }
		 */
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(cm)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)을 입력해 주세요 : ");
		int weight = sc.nextInt();

		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);

		if (bmi < 18.5) {

			System.out.println("저체중");
		} else if (bmi < 23) {

			System.out.println("정상체중");
		} else if (bmi < 25) {

			System.out.println("과체중");
		} else if (bmi < 30) {

			System.out.println("비만");
		} else /* if (bmi >= 30) */ {

			System.out.println("고도비만");
		}

	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);

		int result = 0;
		if (num1 > 0 && num2 > 0) {
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;

			default:
				System.out.println("연산기호를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		} else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다.");
			return;

		}
		System.out.printf("%d %c %d %c %d", num1, op, num2, '=', result);

		/*
		 * if (num1 > 0 && num2 > 0) { if (op == '+') {
		 * 
		 * result = num1 + num2; } else if (op == '-') {
		 * 
		 * result = num1 - num2; } else if (op == '*') {
		 * 
		 * result = num1 * num2; } else if (op == '/') {
		 * 
		 * result = num1 / num2; } else if (op == '%') {
		 * 
		 * result = num1 % num2; } else {
		 * 
		 * System.out.println("연산기호를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return; } } else {
		 * 
		 * System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); return;
		 * 
		 * } System.out.printf("%d %c %d %c %d", num1, op, num2, '=', result);
		 * 
		 * }
		 */
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();

		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();

		System.out.print("출석  점수 : ");
		int att = sc.nextInt();

		double m = score1 * 0.2;
		double f = score1 * 0.3;
		double hw = score3 * 0.3;
		double at = att;

		double sum = m + f + hw + at;

		System.out.println("======= 결과 =======");
		if (sum >= 70 && at >= 20 * 0.7) {
			System.out.println("중간 고사 점수(20) : " + m);
			System.out.println("기말 고사 점수(30) : " + f);
			System.out.println("과제 점수       (30) : " + hw);
			System.out.println("출석 점수       (20) : " + at);

			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		} else {
			if (sum >= 70) {
				System.out.println("FAIL [출석 횟수 부족] (" + att + "/20)");
			} else if (at >= 20 * 0.7) {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			} else {
				System.out.println("FAIL [출석 횟수 부족] (" + att + "/20)");
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			}
		}

	}

	

	public void method10() {

		System.out.println("1. 메뉴 출력");
		System.out.println("2. 메뉴 출력");
		System.out.println("3. 메뉴 출력");
		System.out.println("4. 메뉴 출력");
		System.out.println("5. 메뉴 출력");
		System.out.println("6. 메뉴 출력");
		System.out.println("7. 메뉴 출력");
		System.out.println("8. 메뉴 출력");
		System.out.println("9. 메뉴 출력");

		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method4();
			break;
		case 5:
			method5();
			break;
		case 6:
			method6();
			break;
		case 7:
			method7();
			break;
		case 8:
			method8();
			break;
		case 9:
			method9();
			break;
		default:
			System.out.println("잘못 입력하였습니다.");

		}
	}

}