package com.kh.variable;

public class E_Overflow {
	public void overflow() {
		// byte �ڷ��� �� ���� ���� : -128~127
		// byte bNum = 128; //--> �ַ�, ������ ��� ����
		// �ʱ�ȭ �ÿ��� ���Ͱ��� ������ �߻�����������
		// ���� �������� ������ ����� �Ǹ� ������ �ƴ� �����÷ο� ó����

		byte bNum = 127;// byte �ִ밪
		System.out.println("bNum : " + bNum);

		bNum = (byte) (bNum + 1);
		System.out.println("bNum : " + bNum);

		
	}

	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		int multi = num1 * num2;
		System.out.println("����� : " + multi);

		// ���� ������ �̸� �˰� �̸� �����ؼ� �� ū �ڷ������� �������ָ� �ذ��� ����
		long multi2 = (long) num1 * num2; // -> �ݵ�� ���ϱ� ������ �Ͼ�� ���� ����ȯ �ؾ��� !
		System.out.println("�����2 : " + multi2);

	}

	public void printVariableSize() {
		// ������ �޸� ������ ��¿� �޼ҵ�
		System.out.println("byte�� ũ�� " + Byte.BYTES + "byte");
		System.out.println("short�� ũ�� " + Short.BYTES + "byte");
		System.out.println("int�� ũ�� " + Integer.BYTES + "byte");
		System.out.println("Long�� ũ�� " + Long.BYTES + "byte");
		System.out.println("float�� ũ�� " + Float.BYTES + "byte");
		System.out.println("double�� ũ�� " + Double.BYTES + "byte");
		System.out.println("char�� ũ�� " + Character.BYTES + "byte");
		// java.lang ��Ű�� ���� Ŭ�������� import ���� ����� �� ����

	}
}
