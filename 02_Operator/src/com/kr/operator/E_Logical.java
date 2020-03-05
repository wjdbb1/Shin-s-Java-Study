package com.kr.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() { // &&(����) �� ���� ��� �����ؾ� ��, ||(����) �� ���� �� �ϳ��� �����ص� ��
		// ����ڰ� �Է��� ���� ���� 1���� 100������ ������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�����ϳ� �Է� : ");
		int num = sc.nextInt();

		boolean isTrue;
		// isTrue = (1 <= num <= 100);
		isTrue = (num >= 1) && (num <= 100);

		System.out.println("����ڰ� �Է��� ���� 1���� 100���� �Դϱ� : " + isTrue);

	}

	public void method2() {
		// ����ڰ� �Է��� ���� ���� ���� �빮������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);

		// char ���� ������ ������
		// 'A'~'Z'�� �ش��ϴ� �����ڵ� ���� 65~90
		boolean isTrue = (ch >= 'A') && (ch <= 'Z');
		System.out.println("����ڰ� �Է��� ���� �빮���Դϱ� " + isTrue);
	}

	public void method3() {
		// ����ڿ��� ���α׷� ���� ���� ����
		Scanner sc = new Scanner(System.in);

		System.out.print("��� �Ͻ÷��� y�Ǵ� Y�� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);

		boolean isTrue = (ch == 'y') || (ch == 'Y');
		System.out.println("����ڰ� �Է��� ���� y �Ǵ� Y�Դϱ�" + isTrue);

	}

	public void method4() {
		// short cut ����
		int num = 10;

		System.out.println("&& ���� ���� num �� : " + num);

		boolean result1 = false && ++num > 0;

		System.out.println("result1 : " + result1);
		System.out.println("&& ���� ���� num �� : " + num);
		
		boolean result2 = true || ++num < 0;

		System.out.println("result2 : " + result2);
		System.out.println("|| ���� ���� num �� : " + num);
	

	}
}
