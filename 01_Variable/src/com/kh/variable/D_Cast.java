package com.kh.variable;

public class D_Cast {
	public void rule1() {
		// boolean�� ����ȯ �Ұ��� ! ���� true, false ���� ���� �� �ִ�.
		boolean flag = true;
		// flag = 100; //flag 100; �����߻�

		// 1. �ڵ� �� ��ȯ
		// ���� ������ ���� �ڷ����� ū �ڷ��� ���� ���� (���� ����, ��� ��) ��
		// �����Ϸ��� �ڵ����� ������ ���� �ڷ����� ū �ڷ������� ��ȯ

		// int(4byte) -> double(8byte)
		int i = 12;
		double d = 3.3;
		double result = i + d;

		System.out.println("reusult : " + result);
		// int ���� double���� ���� ����� double������ �ڵ����� ��ȯ ��

		// int(4byte) -> long(8byte)
		int i2 = 2147483647;
		long l = 1000000000L;
		long result2 = i2 + l;

		System.out.println("result2 : " + result2);

		// float(4byte) -> double(8byte)
		float f = 1.0f;
		double d2 = f;// ����

		System.out.println("f : " + f);
		System.out.println("d2 : " + d2);

		// long(8byte) -> float(4byte)
		// ũ��� long���� �� ū�� �� float�� �ڵ� ����ȯ�� �����ұ�?
		// -> �Ǽ��� float�� ������ long������ ǥ�� ������ ���� ������ �� Ŀ�� �ڵ� ����ȯ ����
		long l2 = 100000000000L;
		float f2 = 12; // ����
		System.out.println("f2 : " + f2);

		// char(2byte) -> int(4byte)
		int num = 'A'; // int�� ������ char�� ���ͷ� �� ���� -> ���ڿ� �ش��ϴ� �����ڵ� ���� ���� ��
		System.out.println("num : " + num);

		// char �ڷ����� ������ ���� ����
		char ch = 65;
		// ch = -65; char�� ������ ���� �Ұ� -> ���� ������ 0~65535
		System.out.println("ch : " + ch);

		// byte, short�� �̿��� ����
		byte b2 = 1;
		byte b3 = 10;
		// byte result3 = b2 + b3; byte�� short�� ���� �� ������ int������ ó���ȴ�.

		// ���� ����ȯ�� ���� byte�� ���԰���
		byte result3 = (byte) (b2 + b3);
		int result4 = b2 + b3;

	}

	public void rule2() {
		// 2. ��������ȯ
		// ū ũ���� �ڷ����� ���� ũ���� �ڷ������� �ٲٴ� ��
		// ** ����ȯ ���� �Ұ� **

		int iNum = 10;
		double dNum = 5.89;

		// int iSum = iNum + dNum;
		// �������� double�̱� ������ int�� ���� iSum�� ���� �Ұ�

		// ���� �ذ� ���
		// 1. ���� ����� int������ ���� ����ȯ

		int iSum = (int) (iNum + dNum);
		System.out.println("iSum : " + iSum);
		// �Ǽ� -> ������ ���� ����ȯ �� �Ҽ��� �Ʒ� �κ��� ��� ����ó��

		// 2. double�� ���� int�� ���� ����ȯ
		int iSum2 = iNum + (int) dNum;
		System.out.println("iSum2 : " + iSum2);

		// 3. �������� double�� ����
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
	}

	public void dataLoss() {
		// ������ �ս� �׽�Ʈ
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		//���� ����ȯ �� ������ �ս� �׽�Ʈ
		
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
		
		
		
	}
}
