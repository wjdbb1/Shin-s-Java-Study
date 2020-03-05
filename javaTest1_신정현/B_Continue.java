package com.kh.chap03.branch;

public class B_Continue {
	public void method1() {

		// continue�� �̿��Ͽ� Ȧ���� ���
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0)// {
				continue; // ¦���� ��� ���� ��¹� ����x �ݺ����� ó��(������)���� ��
			// }
			System.out.print(i + " ");
		}
	}

	public void method2() {
		// 1���� 100������ �������� �� ���
		// ��, 4�� ����� ���� ���

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0)
				continue;
			sum += i;

		}
		System.out.println(sum);
	}

	public void method3() {
		// for���� �̿��Ͽ� 2~9�ܱ��� ������ ���
		// ��, 4�� ����� ���� ���� ����ϱ�

		for (int dan = 2; dan <= 9; dan++) {

			if (dan % 4 == 0) {
				continue;
			}
			System.out.println("=== " + dan + "�� ===");
			for (int su = 1; su <= 9; su++) {

				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println(); // ���� ���������� ����

		}

	}

	public void method4() {
		// for���� �̿��Ͽ� 2~9�ܱ��� ������ ���
		// ��, ¦���� ���� ����ϱ�
		// ex) 2 * 1 = 2
		// 2 * 3 = 6

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("=== " + dan + "�� ===");
			for (int su = 1; su <= 9; su++) {
				if (su % 2 == 0) {
					continue;
				}
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println(); // ���� ���������� ����

		}
	}
}
