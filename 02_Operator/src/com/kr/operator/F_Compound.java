package com.kr.operator;

public class F_Compound {
	// ���� ���� ������ : ��� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
	// ���� ó�� �ӵ��� �ξ� �����Ƿ� ��� ������

	public void method() {
		int num = 12;

		System.out.println("num : " + num);

		num += 3; // num 3 ����

		num -= 5; // num 5 ����

		num *= 6; // num 6�� ����

		num /= 2; // num 2�� ����

		num %= 4; // num�� 4�� �������� ���� ������

		System.out.println("num : " + num);

	}

}
