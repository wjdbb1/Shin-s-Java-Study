package com.kh.fitst;

public class A_MethodPrinter {

	// �鿩����(ctrl + shift + F)
	//���α׷� �����ϱ����ؼ� ������ ���θ޼ҵ带 ã�ư��� ������ ���� �޼ҵ尡 ������ ������ x
	
	public void methodA() {
		System.out.println("Method A�� ȣ��Ǿ���� !");
		methodB(); //methodB ȣ��

	}

	public void methodB() {
		System.out.println("Method B�� ȣ��Ǿ���� !");
		methodC(); //methodc ȣ��
		
	}

	public void methodC() {
		System.out.println("Method C�� ȣ��Ǿ���� !");

	}

}
