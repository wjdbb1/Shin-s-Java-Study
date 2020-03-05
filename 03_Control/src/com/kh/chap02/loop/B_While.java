package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * while��
	 * 
	 * [�ʱ��]; while(���ǽ�){ ������ �ڵ�; [������; �б⹮;] }
	 */

	public void method1() {
		// "�ȳ��ϼ���" 5�� ���

		int i = 1; // �ʱ��
		while (i <= 5) {// ���ǽ�
			System.out.println("�ȳ��ϼ���");
			i++;

		}
		// 1���� 5���� ����ϱ�
		i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;// ������
		}
	}

	public void method2() {
		// 5���� 1���� �������� ����ϱ�

		int i = 5;
		while (i > 0) {// (i>=1)
			System.out.print(i + " ");
			i--;
		}
	}

	public void method3() {
		// 1���� 10������ Ȧ���� ����ϱ�

		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}

	public void method4() {
		// 1���� ���� �� (50~100)������ �� ���ϱ�
		int random = (int) (Math.random() * 51) + 50;
		System.out.println("���� �� : " + random);

		int sum = 0;
		int i = 1;
		while (i <= random) {
			sum += i;
			i++;

		}
		System.out.println("1���� " + random + "������ �� : " + sum);
	}

	public void method5() {
		// ��������� ���ڿ��� �Է� �޾Ƽ� �� �ε����� ���ڸ� ���
		// "apple"
		// a
		// p
		// p
		// l
		// e

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();

		// ���ڿ��� ���̸� �˷��� --> ���ڿ�.length(); �޼ҵ� ���
		System.out.println("���ڿ��� ���� : " + str.length());

		// 0~���ڿ��� ���� -1
		// for (int i = 0; i < str.length(); i++) {
		// System.out.println(str.charAt(i));
		// }

		int i = 0;
		while (i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}

	}
//=====================================(��ø �ݺ���)============================================

	public void method6() {
		// 2�ܺ��� 9�ܱ��� ���

		int dan = 2;
		while (dan <= 9) {
			System.out.println("===== " + dan + "�� =====");

			int su = 1;
			while (su <= 9) {
				System.out.println(dan + " X " + su + " = " + (dan * su));
				su++;

			}
			dan++;
		}
	}

	public void method7() {
		// for���� �̿��� �ð� ��� ==> while������ �����غ���
		// �� ��¹��� printf�� ���

		int hour = 0;
		while (hour < 24) {

			int min = 0;
			while (min < 60) {
				System.out.printf("%2d��  %2d��\n ", hour, min);
				min++;
			}
			hour++;
		}
	} // ->������ Ƚ����ŭ �ݺ��ϰ��� �� ���� for���� �̿��ϴ� ���� ��
		// while���� �ַ� �޴��� ���� ����ؼ� ���α׷��� ������ ������ �Ǵ��ϴ� �뵵�� ���

	public void method8() {
		Scanner sc = new Scanner(System.in);

		// while���� ���ǿ� true�� ������ ����ؼ� �ݺ��ϴ� ���� ������ ���� �� ����
		while (true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. 1������ 5������ ���"); // method1()
			System.out.println("2. 5������ 1������ �������"); // method2()
			System.out.println("3. 1������ 10������ Ȧ�� ���"); // method3()
			System.out.println("9. ���α׷� ����");

			System.out.println("�޴����� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;// �޼ҵ� ����
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");

			}
		}
	}

	public void method9() {
		// ���ڿ� �Է¹ް� �� ���ڿ��� "exit"�� �ƴ� ������ �ݺ�

		Scanner sc = new Scanner(System.in);
		String str = ""; // ����ڰ� �Է��� ���ڿ��� ���� ���� �̸� ���� �� �ʱ�ȭ

		while (!str.equals("exit")) {
			System.out.print("���ڿ��� �Է����ּ��� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
		System.out.println("exit �Է� ����Ǿ����ϴ�.");
	}

}