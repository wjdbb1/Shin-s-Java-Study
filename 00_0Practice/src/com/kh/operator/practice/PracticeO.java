package com.kh.operator.practice;

import java.util.Scanner;

public class PracticeO {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "�����" : "����� �ƴϴ�";
		System.out.println(result);

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "�����" : ((num == 0) ? "0�̴�" : "������");
		System.out.println(result);
	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "¦����" : "Ȧ����";
		System.out.println(result);
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο��� : ");
		int person = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + (candy / person));
		System.out.println("���� ���� ���� : " + (candy % person));
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();

		System.out.print("��(���ڸ�) : ");
		int ban = sc.nextInt();

		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();

		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);

		String gender2 = (gender == 'M') ? "���л�" : "���л�";

		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();

		System.out.println(
				grade + "�г� " + ban + "�� " + num + "�� " + name + " " + " " + gender2 + "��  " + "������ " + score + "�̴�.");

	}

	public void method6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int age = sc.nextInt();

		String result = (age <= 13) ? "���" : (age <= 19) ? "û�ҳ�" : "����";

		System.out.println(result);
	}

	public void method7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int kor = sc.nextInt();

		System.out.print("���� : ");
		int eng = sc.nextInt();

		System.out.print("���� : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = (kor + eng + math) / 3.0;

		System.out.println("�հ� : " + sum);
		System.out.println("�հ� : " + avg);

		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "�հ�" : "���հ�";

		System.out.println(result);

	}

	public void method8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String jumin = sc.nextLine();

		String result = (jumin.charAt(7) == '1' || jumin.charAt(7) == '3') ? "����"
				: (jumin.charAt(7) == '2' || jumin.charAt(7) == '4') ? "����" : "�߸��Է��Ͽ����ϴ�.";

		System.out.println(result);
	}

	public void method9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("����1 : ");
		int num1 = sc.nextInt();

		System.out.print("����2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է� : ");
		int num = sc.nextInt();

		String result = (num1 >= num || num2 < num) ? "true" : "false";

		System.out.println(result);

	}

	public void method10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();

		String result = (num1 == num2 && num2 == num3) ? "true" : "false";

		System.out.println(result);

	}

}
