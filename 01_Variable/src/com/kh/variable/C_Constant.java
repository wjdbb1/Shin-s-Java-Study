package com.kh.variable;

public class C_Constant {
	public void finalConstant() { // ��� �׽�Ʈ
		int age = 20;
		final int AGE = 20;

		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);

		// ���� �� ����
		age = 30;
		// AGE = 30;
		// ���� ���� �ߴ� ���� ������ ���� => �������� ������ ���� �������� �� ������ ǥ��
		// �ܼ�â���� ���� �۾��� �ߴ� ���� ��Ÿ�� ���� => (���� �۾���)�ݵ�� �ؼ��ϴ� ����!
		
		System.out.println("��� ���� �� �� ��ϵ� �� �� ������ �Ұ����ϴ�.");
		

	}

}
