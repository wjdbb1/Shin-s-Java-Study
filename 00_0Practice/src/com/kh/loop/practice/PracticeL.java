package com.kh.loop.practice;

import java.util.Scanner;

public class PracticeL {
	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}
		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");

				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

			}
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {

			System.out.print(i + " ");

		}
		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");

				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

			}
		}
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num == i) {
				System.out.print(i);

			} else {
				System.out.print(i + " + ");
			}
			sum += i;

		}
		System.out.print(" = " + sum);
	}

	public void method6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		if (num1 > 0 && num2 > 0) {
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			int max = 0;
			int min = 0;

			if (num1 > num2) {
				max = num1;
				min = num2;

			} else {
				max = num2;
				min = num1;

			}

			if (num1 > 0 && num2 > 0) {
				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");

				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}

		}
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("==== " + dan + "단  ====");

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));

			/*
			 * for (int i = dan; i <= dan; i++) {
			 * 
			 * for (int j = 1; j <= 9; j++) { System.out.println(dan + " * " + j + " = " +
			 * dan * j); } }
			 */
		}
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i = dan; dan <= 9; dan++) {
				System.out.println("==== " + dan + "단  ====");

				for (int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + dan * j);
				}

			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				for (int i = dan; dan <= 9; dan++) {
					System.out.println("==== " + dan + "단  ====");

					for (int j = 1; j <= 9; j++) {
						System.out.println(dan + " * " + j + " = " + dan * j);
					}

				}
				break;
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}

	public void method11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int snum = sc.nextInt();

		System.out.print("공차 : ");
		int tnum = sc.nextInt();

		for (int i = 0; i < 9; i++) {
			System.out.print(snum + (tnum * i) + " ");
		}

	}

	public void method12() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public void method13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {

				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public void method14() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			int result = 0;
			if (op.equals("+")) {
				result = num1 + num2;

			} else if (op.equals("-")) {
				result = num1 - num2;

			} else if (op.equals("*")) {
				result = num1 * num2;

			} else if (op.equals("/")) {
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
			} else if (op.equals("%")) {
				result = num1 % num2;

			} else {
				System.out.println("없는 연산자 입니다. 다시 입력해 주세요.");
				continue;
			}
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);

		}

	}

	public void method15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		boolean sosu = true;

		if (num >= 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					sosu = false;
					break;
				}
			}

			if (sosu) { // flag 값이 true일 경우
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method16() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("숫자 : ");
			int num = sc.nextInt();

			boolean sosu = true;

			if (num >= 2) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						sosu = false;
						break;
					}
				}

				if (sosu) { // flag 값이 true일 경우
					System.out.println("소수입니다.");
				} else {
					System.out.println("소수가 아닙니다.");
				}

				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");

			}
		}

	}

	public void method17() {/////////////////////////////////////
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num >= 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {

				}
				System.out.println("");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method18() {////

	}

	public void method19() {////
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num-i; j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

			

		}
	}

	public void method20() {////////
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("정수 입력 : "); int num = sc.nextInt();
		 * 
		 * for (int i = 1; i <= num; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(" "); }
		 * 
		 * }
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("정수 입력 : "); int num = sc.nextInt();
		 * 
		 * for (int i = num; i >= 1; i--) { for (int j = i; j >= 1; j--) {
		 * 
		 * System.out.print("*"); } System.out.println(""); }
		 * 
		 * } }
		 */}

	public void method21() {///////

	}

	public void method22() {////

	}

	public void method23() {/////

	}

}