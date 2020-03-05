package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	/*
	 * switch���� if���� ���� ���ǹ� ������ �������� if���� ���� ������ ���������� switch���� ��ȣ �ȿ� ���� ��(�����)
	 */

	public void method1() {
		// 1~3 ������ ������ �Է¹޾�
		// 1->"������ �Դϴ�"
		// 2->"�Ķ��� �Դϴ�"
		// 3->"�ʷϻ� �Դϴ�"
		// �߸� �Է� -> "�߸� �Է��Ͽ����ϴ�."����ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("������ �Դϴ�.");
			break;

		case 2:
			System.out.println("�Ķ��� �Դϴ�.");
			break;

		case 3:
			System.out.println("�ʷϻ� �Դϴ�.");
			break;

		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");

		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��Ͻÿ� : ");
		String fruit = sc.nextLine();

		int price = 0;

		switch (fruit) {
		case "���":
			price = 1000;
			break;

		case "�ٳ���":
			price = 3000;
			break;

		case "������":
			price = 2000;
			break;

		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return;

		}
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");
	}

	public void method3() {
		// 1~12������ �Է¹޾� �ش��ϴ� ���� ������ ��¥�� ���
		// 28/29/��, 30��, 31���� �޷� ��������

		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ~ 12������ �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("�Է��Ͻ� ���� 30�� ���� �Դϴ�.");
			break;

		case 2:
			System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�ϱ��� �Դϴ�.");
			break;
		default:
			System.out.println("�ݵ�� 1~12�� ������ �Է��ؾ� �մϴ�.");
		}

	}

}
