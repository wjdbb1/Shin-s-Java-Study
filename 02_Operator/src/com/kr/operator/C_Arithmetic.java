package com.kr.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 10;
		int num2 = 3;

		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 + num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2); // �������� �� -> 3
		System.out.println("num1 % num2 = " + num1 % num2); // �������� ������ -> 1

		// %(��ⷯ)�� ���� ���ǹ����� ¦Ȧ �Ǻ� � ���� ���
		// �� % 2 == 0 --> ¦��
		// �� % 2 == 1 --> Ȧ��

		// ���� ��� �Ǻ������� ���ֻ��
		// 5�� ����ΰ�?
		// �� % 5 == 0

		int a = 10, b = 20, c = 0;

		c = a * b;
		c = a / b;

		System.out.println("a * b = " + (c = a * b));
		System.out.println("a / b = " + (c = a / b));
		System.out.println("a % b = " + (c = a % b));

		System.out.println("a + b = " + (c = a + b));
		System.out.println("a - b = " + (c = a - b));

	}
}
