package com.kh.variable;

import java.util.Scanner;

public class B_keyboardInput {
	// java.util ��Ű������ �����ϴ� Ŭ������ �̿��� Ű���� �Է� �׽�Ʈ

	public void inputScanner1() {
		// java.util.Scanner ��� Ŭ������ �̿�

		Scanner sc = new Scanner(System.in);

		// ������� ������ �Է¹ް� �� �Է¹��� ������ ����ϴ� ���α׷� �����
		System.out.print("����� �̸��� �����Դϱ� : ");
		// String name = sc.next(); //-> ����ڰ� �Է��� �� �� ���� ������ ���� �о��
		String name = sc.nextLine(); // -> ����ڰ� �Է��� �� �ٿ� ���� ��� ������ �о��

		System.out.print("����� ���̴� ����Դϱ� :");
		int age = sc.nextInt(); // -> ����ڰ� �Է��� ������ ���� �� �о����

		System.out.print("����� Ű�� ���Դϱ�(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble(); // -> ����ڰ� �Է��� �Ǽ��� ���� �� �о����

		// ����ڰ� �Է��� �� ���
		System.out.println(name + "����" + age + "���̸�, Ű�� " + height + "cm �Դϴ�");

	}

	public void inputScanner2() {
		// Scanner���� �߻��� �� �ִ� ����!!!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine(); //���ۿ� ���� ���͸� �о�� ������ �뵵
		
		
		/*	sc.nextLine()�żҵ带 ������ �ٸ� �޼ҵ�� ���͸� �о���� �ʰ�
		 * 	�ش� ���� �о���Ƿ� ����ڰ� �Է��� '����'�� ���Ϳ� ��������
		 * 
		 * ���̸� �Է��ϰ� ���͸� ġ�� sc.nextInt()�� ���ڸ� ��������
		 * ���ʹ� ���ۿ� �����ִ� ����
		 * 
		 * sc.nextLine()�� ���ۿ� �����ִ� ������ ���͸� �ڵ����� �о�� �Է��� �����ٰ� ����
		 * address���� �� ���� ��
		 * 
		 * (���� ������������ XXX ZZZZ = sc.nextLine()�� ������ ���� ������ sc.nextLine();�� �������)
		 * 
		 * */
		
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		
	}
	
	public void inputScanner3() {
	//��������
	String name;
	int age;
	char gender;
	double height;
	
	
	//Ű���� �Է��� ���� Scanner����
	
	Scanner sc = new Scanner(System.in);
	
	//�� �ۿ� byte, boolean ���� �⺻ �ڷ����� �Է¹��� ���� ���������� nextXXX()�޼ҵ� ���
	System.out.print("�̸� : ");
	name = sc.nextLine();
	
	System.out.print("����(M/F) : ");
	//gender = sc.nextChar(); nextChar()�޼ҵ�� �������� ����
	gender = sc.nextLine().charAt(0);
	//sc.nextLine () ����� String Ŭ���� �ȿ� �ִ� charAt()�̶�� �޼ҵ带 �ѹ� �� �̿�
	
	//charAt�� ���ڿ����� ������ ��ġ�� �ִ� ���� �ϳ����� �̾Ƴ��� ����� ��
	// �� �� ��ġ�� �����ϴ� ����� ���ڿ� ���� ���� ���ں��� 0���� �����ؼ� 1�� �����ϸ� �ش� ��ġ�� ��
	
	
	System.out.print("���� : ");
	age = sc.nextInt();
	
	System.out.print("Ű : ");
	height = sc.nextDouble();
	
	System.out.println(name + "���� ���� ����");
	System.out.println("���� : " + gender);
	System.out.println("���� : " + age);
	System.out.println("Ű : " + height);

}
}