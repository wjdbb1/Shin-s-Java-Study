package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.medel.vo.Account;
import com.kh.chap02_encapsulation.medel.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student st = new Student();
		/*
		 * st.name = "������"; st.kor = 100; st.math = 90; st.eng = 80;
		 */
		// public -> private�� ���������ν� ���� ����
		// ���� ���� ���� ������ �ȵȴٸ� ��� ���� �־��־�� �ұ�?
		// ���������� ������ �� �ֵ��� setter/getter �޼ҵ带 �̿��ؾ���

		// �������� ---- ��ü�� ���� �����Ϸ��� setter�� ����ؾ���

		st.setName("������");
		st.setKor(100);
		st.setMath(90);
		st.setEng(80);

		// ������ �� �˾ƿ��� -> getter
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� ���� : " + st.getKor());
		System.out.println("���� ���� : " + st.getMath());
		System.out.println("���� ���� : " + st.getEng());

		// �ѹ��� ����ϱ� ���� information()�̶�� �޼ҵ带 ������
		System.out.println(st.information());
		// ----------------------------------------------------------------------------
		// Account Ŭ������ ��ü ����
		Account ac = new Account();

		// �ܾ���ȸ
		ac.displayBalance();

		// 100���� �Ա�
		ac.deposit(1000000);
		ac.displayBalance();

		// 50���� ����
		ac.withdraw(500000);
		ac.displayBalance();

		// ���ڱ� account��ü�� ����� ����� �����ϰ� �ܾ��� ����Ѵٸ�
		// ac.balance -=1000000; //ĸ��ȭ ���� �� ���� ���� �Ұ���
		ac.displayBalance();

		// ���� �ʵ���� public �̶�� ���� �����ڷ� �����Ǿ� ����
		// ��, �ٸ� �ܺο��� ���� �� ������ �����ؼ� ���� �����ϰų� ��ȸ�ϴ� ���� ����
		// public -> private�� ĸ��ȭ�� �����ؾ� �� �������� ���� ������ ����������.

	}

}
