package com.kh.variable.practice;

import java.util.Scanner;

public class PracticeV {

	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();

		System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�^^");

	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ �� ��� : " + (num1 / num2));

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		double width = sc.nextDouble();

		System.out.print("���� : ");
		double height = sc.nextDouble();

		System.out.println("���� : " + (width * height));
		System.out.println("�ѷ� : " + ((width + height) * 2));
	}

	public void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();

		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));

	}
}
