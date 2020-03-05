package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if - else�� if(���ǽ�){ ������ �ڵ�1; } else{ ������ �ڵ�2; }
	 * 
	 * -> ���ǽ��� ����� true�� ��� �ڵ�1 ���� �� �������� ���ǽ��� ����� false�� ��� ������ �ڵ�2 ����
	 */

	/*
	 * if - else if - else �� if(���ǽ�1){ ������ �ڵ�1; } else if(���ǽ�2) { ������ �ڵ�2; } else {
	 * ������ �ڵ�3; }
	 * 
	 * -> ������ �ټ��� ��� ����ϴ� ���ǹ����� ���ǽ�1�� ����� true�� ��� �ڵ�1�� �����ϰ� �������� ���ǽ�1�� ����� false��
	 * ��� ���� ���ǽ�2 ���� ���ǽ�2�� ����� true�ΰ�� �ڵ�2�� �����ϰ� �������� ���ǽ�2�� ����� false�� ��� ������ �ڵ�3����
	 * 
	 * 
	 */
	public void method1() {
		// ���, ����, 0�Ǻ�

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		// 3���� �����̱� ������ if-else if-else������ ����
		if (num > 0) {
			System.out.println("�����.");
		} else if (num < 0) {
			System.out.println("������.");
		} else /* if (num == 0) */ {
			System.out.println("0�̴�.");
		}
	}

	public void method2() {
		// ¦ Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		// ��¦�� ¦�� �ƴϸ� Ȧ�� �̹Ƿ� ������ 2���� -> if-else�� ����

		if (num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");

		} else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
	}

	public void method3() {
		// A_If method3() -> if - else if - else�������� �ٲ㼭 �����ϰ� ����ǵ��� �ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("���� (M/F) : ");
		char gender = sc.nextLine().charAt(0);

		String student = "";

		if (gender == 'M' || gender == 'm') {
			student = "���л�";
		} else if (gender == 'F' || gender == 'f') {
			student = "���л�";
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return; // �޼ҵ� ���� ����
		}
		System.out.println(student + "�Դϴ�.");
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int age = sc.nextInt();

		String result = "";

		if (age <= 13) {
			result = "���";
		} else if (/* age > 13 && */ age <= 19) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}

		// if - else if ������ ���� ���� ������ �������� ���ϰ� �����Ա� ������
		// �翬�� ���� ������ �ݴ� ������ ���������� �����ϰ� ����

		System.out.println(result);
	}

	public void method5() {
		// ����ڿ��� ������ �Է¹޾�
		// �������� ����� ���� ������ ����� ����ϴ� �޼ҵ�

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
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
		System.out.println("����� ������ " + score + "�̰�, ����� " + grade + "�Դϴ�.");
	}

	public void method6() {
		// ���� ������ �� ��޺� �߰� ���� �̻��� ��쿡�� ��޿� "+"��� ���ڸ� �߰��Ͽ� ���
		// ��) 95�� �̻��� A+

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
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
		System.out.println("����� ������ " + score + "�̰�, ����� " + grade + "�Դϴ�.");
	}
}