package com.kh.loop.practice;

import java.util.Scanner;

public class PracticeL {
	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}
		if (num < 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");

				}
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");

			}
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {

			System.out.print(i + " ");

		}
		if (num < 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");

				}
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");

			}
		}
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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

		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° ���� : ");
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
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		}
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();

			System.out.print("�� ��° ���� : ");
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
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			}

		}
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int dan = sc.nextInt();
		System.out.println("==== " + dan + "��  ====");

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

		System.out.print("���� : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i = dan; dan <= 9; dan++) {
				System.out.println("==== " + dan + "��  ====");

				for (int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + dan * j);
				}

			}
		} else {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���� : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				for (int i = dan; dan <= 9; dan++) {
					System.out.println("==== " + dan + "��  ====");

					for (int j = 1; j <= 9; j++) {
						System.out.println(dan + " * " + j + " = " + dan * j);
					}

				}
				break;
			} else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}

	public void method11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int snum = sc.nextInt();

		System.out.print("���� : ");
		int tnum = sc.nextInt();

		for (int i = 0; i < 9; i++) {
			System.out.print(snum + (tnum * i) + " ");
		}

	}

	public void method12() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
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

		System.out.print("���� �Է� : ");
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

			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if (op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			System.out.print("����1 : ");
			int num1 = sc.nextInt();

			System.out.print("����2 : ");
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
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
			} else if (op.equals("%")) {
				result = num1 % num2;

			} else {
				System.out.println("���� ������ �Դϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);

		}

	}

	public void method15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		boolean sosu = true;

		if (num >= 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					sosu = false;
					break;
				}
			}

			if (sosu) { // flag ���� true�� ���
				System.out.println("�Ҽ��Դϴ�.");
			} else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void method16() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("���� : ");
			int num = sc.nextInt();

			boolean sosu = true;

			if (num >= 2) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						sosu = false;
						break;
					}
				}

				if (sosu) { // flag ���� true�� ���
					System.out.println("�Ҽ��Դϴ�.");
				} else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}

				break;

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");

			}
		}

	}

	public void method17() {/////////////////////////////////////
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		if (num >= 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {

				}
				System.out.println("");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void method18() {////

	}

	public void method19() {////
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
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
		 * System.out.print("���� �Է� : "); int num = sc.nextInt();
		 * 
		 * for (int i = 1; i <= num; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(" "); }
		 * 
		 * }
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("���� �Է� : "); int num = sc.nextInt();
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