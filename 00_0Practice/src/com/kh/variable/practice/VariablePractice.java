package com.kh.variable.practice;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		String name;
		int age;
		char gender;
		double height;

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();

		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		sc.nextLine();

		System.out.print("������ �Է��ϼ���(��/��) : ");
		gender = sc.nextLine().charAt(0);

		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		height = sc.nextDouble();

		System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ� ^^");

	}

	public void method2() {

		int first;
		int second;

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		first = sc.nextInt();

		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		second = sc.nextInt();

		System.out.println();
		System.out.println("���ϱ� ��� : " + (first + second));
		System.out.println("���� ��� : " + (first - second));
		System.out.println("���ϱ� ��� : " + (first * second));
		System.out.println("������ �� ��� : " + (first / second));
	}

	public void method3() {

		double width;
		double depth;
		// double area;
		// double cir;

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		width = sc.nextDouble();

		System.out.print("���� : ");
		depth = sc.nextDouble();

		System.out.println();
		System.out.println("���� : " + width * depth);
		System.out.println("�ѷ� : " + (width + depth) * 2);

		// System.out.println("���� : " + area);
		// System.out.println("�ѷ� : " + cir);

	}

	public void method4() {

		String str;
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = sc.nextLine();

		System.out.println();
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));

	}
}


/*
public void method1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�̸��� �Է��ϼ��� : ");
	String name = sc.nextLine();
	System.out.print("���̸� �Է��ϼ��� : ");
	int age = sc.nextInt();
	sc.nextLine(); // nextInt() �޼ҵ� �ڿ� nextLine() �޼ҵ尡 �� ���̱� ������ �� ���̿� ���͸� ���ۿ��� ���ִ� �۾��� ����ߵȴ�. 
	
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
	
	// ��� ���� ���� (*,/,% > +,-)
	System.out.println("���ϱ� ��� : " + (num1 + num2));	// ��ȣ�� ���ϰ� �Ǹ� ���ڿ��� �ν��Ͽ� ���� �ΰ��� �پ ���´�.
	System.out.println("���� ��� : " + (num1 - num2));	// ���������� ��ȣ�� ���ϰԵǸ�  '���ڿ�-����'�� �ν��Ͽ� ���� �߻�
	System.out.println("���ϱ� ��� : " + num1 * num2);		
	System.out.println("������ �� ��� : " + num1 / num2);
}

public void method3() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	double width = sc.nextDouble();
	System.out.print("���� : ");
	double height = sc.nextDouble();
	
	System.out.println("���� : " + width * height);
	System.out.println("�ѷ� : " + (width + height) * 2);
	
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
*/

