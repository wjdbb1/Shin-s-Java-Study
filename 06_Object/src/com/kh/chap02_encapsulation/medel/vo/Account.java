package com.kh.chap02_encapsulation.medel.vo;

import java.util.Scanner;

public class Account { // ����
	// �ʵ�� -> ĸ��ȭ �����ʰ� ���� �׽�Ʈ

	/*public String name = "������";
	public String phone = "010-5721-1821";
	public String pwd = "qlqjs123";
	public int bankCode = 3030;
	public int balance = 0;*/
	

	private String name = "������";
	private String phone = "010-5721-1821";
	private String pwd = "qlqjs123";
	private int bankCode = 3030;
	private int balance = 0;
	
	// �����ں� : Ŭ������� �����ϰ� �ۼ�
	public Account() {
	}
	// ->��ü�� �����ϱ� ���� ������ �޼ҵ�� �ڿ� �ڼ��� �ٷ� ��

	// �޼ҵ��
	// �Աݱ���� ���� �޼ҵ� -> setteró��
	public void deposit(int money) {
		// �޼ҵ�� ���� ��ȣ���� �Ա��ϰ��� �ϴ� �ݾ��� �Ű������� ���޵Ǿ� �� ����

		if (money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");

		} else {
			System.out.println("�߸� �� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}

	// ����� ���� �޼ҵ�
	public void withdraw(int money) {
		// ����ϰ��� �ϴ� �ݾ��� �Ű������� ���޵Ǿ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ�� �Է����ּ��� : ");
		String str = sc.nextLine();

		if (str.equals(pwd)) { // ��й�ȣ�� ��ġ�� ���
			if (money <= balance) { // ����ϰ��� �ϴ� �ݾ��� �ܾ׺��� �۰ų� ���� ���
				balance -= money;
				System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
			} else {
				System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
			}

		} else { // ��й�ȣ�� ��ġ�ϴ� ���
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}

	}

	// �ܾ���ȸ�� ���� �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "�� ������ �ܾ���" + balance + "�� �Դϴ�.");

	}

}
