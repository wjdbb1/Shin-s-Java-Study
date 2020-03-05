package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "�����" : "����� �ƴϴ�";

		System.out.println(result);

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "�����" : ((num == 0) ? "0�̴�" : "������");

		System.out.println(result);

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "¦����" : "Ȧ����";
		System.out.println(result);

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� �� : ");
		int per = sc.nextInt();

		System.out.print("���� ���� : ");
		int candy = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + candy / per);
		System.out.println("���� ���� ���� : " + candy % per);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();

		System.out.print("��(���ڸ�) : ");
		int group = sc.nextInt();

		System.out.print("��(���ڸ�) : ");
		int num = sc.nextInt();

		System.out.print("����(M/F) : ");
		String gender = sc.nextLine();

		String result = (gender.equals("M")) ? "���л�" : "���л�";
		sc.nextLine();

		System.out.print("���� (�Ҽ��� �Ʒ� �Ѥ� �ڸ�����) : ");
		double score = sc.nextDouble();

		System.out.println(grade + "�г� " + group + "�� " + num + "�� " + name +" "+ result + "�� ������ " + score + "�̴�");

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int age = sc.nextInt();

		String result = (age <= 13) ? "���" : (age > 19) ? "����" : "û�ҳ�";

		System.out.println(result);

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int mat = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = (kor + eng + mat) / 3;

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		String result = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) ? "�հ�" : "���հ�";

		System.out.println(result);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (- ����) : ");
		char num = sc.nextLine().charAt(8);

		String result = (num == 1) ? "����" : "����";

		System.out.println(result);

	}

	public void practice9() {
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

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();

		String result = (num1 == num2 && num2 == num3) ? "ture" : "false";
		
		System.out.println(result);
	}
}

/*
//�ǽ����� 1
	// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", ����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���.
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : " );
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����." : "����� �ƴϴ�";
		System.out.println(result);	
		
	}
	
	// �ǽ����� 2
	// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", 
	// ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���.
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����  : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num < 0 ? "������" : "0�̴�");
		System.out.println(result);
		
	}
	
	
	// �ǽ����� 3
	// Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = num % 2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(result);
		
	}
	
	
	// �ǽ����� 4
	// ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް� 
	// 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		int people;
		int candy;
		
		System.out.print("�ο� �� : ");
		people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		candy = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + candy / people);
		System.out.println("���� ���� ���� : " + candy % people);
		
	}
	
	
	// �ǽ����� 5
	// Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
	// �� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó�� �ϼ���.
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		String student = (gender == 'M') ? "���л�" : "���л�";
	
		System.out.println();
		System.out.println(	grade + "�г� " + classNum + "�� " + num + "�� " 
						+ name + " " + student + "�� ������ " + score + "�̴�.");
		
	}
	
	
	// �ǽ����� 6
	// ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, 
	// ����(19�� �ʰ�)���� ����ϼ���.
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "���" : (age <= 19 ? "û�ҳ�" : "����");
		System.out.println(result);
		
	}
	
	
	// �ǽ����� 7
	
	����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
	�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
	�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ� 
	�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		System.out.println();		
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		// int / int�� �ϰԵǸ� �� ��� ���� int�� �ް� �ȴ�. �Ҽ��� ǥ���� ������� ������ �ս��� �߻��Ѵ�.
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "�հ�" : "���հ�";
		System.out.println(result);
		
	}
	

	// �ǽ����� 8
	// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (- ����) :  ");
		String str = sc.nextLine();
		
		char pId = str.charAt(7);
		
		String gender = (pId == '1' || pId == '3') ? "���� " : 
						(pId == '2' || pId == '4') ? "����" : "�߸� �Է��ϼ̽��ϴ�";
		System.out.println(gender);
		
	}
	
	// �ǽ����� 9
	
	Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
	�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
	�ƴϸ� false�� ����ϼ���.
	(��, num1�� num2���� �۾ƾ� ��)
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int input;

		System.out.print("����1 : ");
		num1 = sc.nextInt();

		System.out.print("����2 : ");
		num2 = sc.nextInt();

		System.out.print("�Է� : ");
		input = sc.nextInt();
		
		System.out.println((input <= num1) || (input > num2));
		
	}

	
	// �ǽ����� 10
	// 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();

		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);

	}
	


}*/
