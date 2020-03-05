package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * �ܵ� if�� if(���ǽ�){ ������ �ڵ�; }
	 * 
	 * -> ���ǽ��� ��� ���� true(��)�̸� �߰�ȣ ({ })���� �ڵ� ���� -> ���ǽ��� ��� ���� false(����)�̸� �ڵ� �������� �ʰ� �Ѿ
	 */

	public void method1() {
		// ���, ����, 0�Ǻ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("�����.");
		}

		if (num < 0) {
			System.out.println("������.");

		}
		if (num == 0) {
			System.out.println("0�̴�.");
		}
	}

	public void method2() {
		// ����ڷκ��� �����ϳ� �Է¹޾�
		// "�Է��� ���ڴ� ¦���Դϴ�."
		// "�Է��� ���ڴ� Ȧ���Դϴ�."��� ����ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		}

		// if(num %2 != 0)
		if (num % 2 == 1) {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}

	}

	public void method3() {
		// ������ �Է� �޾� ���л����� ���л����� �Ǻ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���� (M/F) : ");
		char gender = sc.nextLine().charAt(0);

		String student = "";

		if (gender == 'M' || gender == 'm') {
			student = "���л�";
		}

		if (gender == 'F' || gender == 'f') {
			student = "���л�";
		}

		if (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			// �߸� �Է� �޾��� ��� ���� �ڵ带 �����ϰ� ���� ����
			// ȣ�� �� �޼ҵ带 �����ϰ� �������� return������ �����

			return;

		}
		System.out.println(student + "�̴�.");
	}

	public void method4() {
		// ���̸� �Է¹޾� ���, û�ҳ�, ���� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();

		String result = "";

		if (age <= 13) {
			result = "���";

		}
		if (age > 13 && age <= 19) {
			result = "û�ҳ�";
		}

		if (age > 19) {
			result = "����";
		}
		System.out.println(result + "�Դϴ�.");

	}

	public void method5() {
		// �Է� �� �̸��� ������ �´��� Ȯ���ϴ� �޼ҵ�

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();

		/*
		 * if (name == "������") { System.out.println("�����Դϴ�."); }
		 * 
		 * if (name != "������") { System.out.println("������ �ƴմϴ�."); }
		 */
		// ctrl + shift + / => �� ���� �ּ�(�巡��)

		// �⺻ �ڷ����� �񱳽ÿ� ==, !=�� ���� ���� �񱳸� �� �� ������
		// String�� �⺻ �ڷ����� �ƴ� �����ڷ��� �̹Ƿ�
		// String Ŭ�������� �����ϴ� equals() �޼ҵ带 ����ؼ� ���ؾ��Ѵ�.

		if (name.equals("������")) {
			System.out.println("�����Դϴ�.");
		}

		if (!name.equals("������")) {
			System.out.println("������ �ƴմϴ�.");
		}

	}

}
