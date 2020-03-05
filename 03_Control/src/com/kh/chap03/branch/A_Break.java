package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method1() {
		// "exit" �Է� ������ ���ڿ��� ��� �Է� �޴� ���α׷�

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();

			if (str.equals("exit")) // {
				break; // �ݺ����� ��������(���ǹ��̶��� ����x)
			// }

			// ��� ���Ŀ� ���� ��ɹ��� �ϳ��� ��� �߰�ȣ ���� �ۼ� ����
			// �ϳ� �̻��� �Ǹ� �ݵ�� �߰�ȣ �ȿ� �ۼ��� ��

			System.out.println("str : " + str);

		}
		// ���� �ݺ��� �ȿ��� break�� ���� ��� ���� �ڵ忡�� ���� �߻�
		// =>���� �ݺ����� ���������� �ʴ´ٸ� ������ �� ���� �ڵ��̹Ƿ�
		// System.out.println("test");
	}

	public void method2() {
		// 1���� ����ڰ� �Է��� ���ڱ����� �հ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();

		int sum = 0;
		// for�� (���ǽľ��� -> ���ѹݺ�)
		for (int i = 1;; i++) {
			sum += i;
			if (i == num) // {
				break;
			// }

		}
		System.out.println("sum : " + sum);

	}
}
