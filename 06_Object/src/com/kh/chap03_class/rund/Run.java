package com.kh.chap03_class.rund;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// �ٸ� ��Ű���� �ִ� Person�̶�� �Ѥ������� �����ϱ� ���� import�۾�

		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("������");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-5721-1821");
		p.setEmail("wjdbb1@gmail.com");

		System.out.println(p.information());

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �̸� : ");
		String name = sc.nextLine();

		//setter�� �̿��ؼ� �̸� �ٽ� ����
		p.setName(name);
		System.out.println(p.information());
		
		
		
		//���� �����ڰ� default�� Ŭ������ ��Ű�� �ܺο��� �ƿ� ������ �Ұ����ϴ�!!

	}

}
