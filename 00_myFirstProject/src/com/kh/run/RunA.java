package com.kh.run;

import com.kh.fitst.A_MethodPrinter; //�ܺ��� Ŭ������ ����ϰ��� �Ҷ��� import����(import�������� ����)
//��Ű�� �Ʒ� ����Ʈ 

public class RunA {

	public static void main(String[] args) {
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 �����Ϸ���?

		// 1. ������ �޼ҵ尡 �ִ� Ŭ���� ����
		//	Ŭ������ ������̸� = new Ŭ������();

		A_MethodPrinter a = new A_MethodPrinter();
		// �ٸ� ��Ű���� �����ϴ� Ŭ�����̱� ������ �ν��� �� ��� ���� �߻� -> import�ϱ�

		// 2. �޼ҵ� ����(ȣ��)
		//	������̸�.����Ҹ޼ҵ�();
		
		a.methodA();
		//a.methodB();
		//a.methodC();
		

	}

}
