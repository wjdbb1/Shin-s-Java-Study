package com.kh.chap03_class.model.vo;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("������");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010 - 5721 - 1821");
		p.setEmail("wjdbb1@gmail.com");

		System.out.println(p.information());

		// ���������ڰ� default�� class�� ���� ��Ű�� �������� ���� ����

	}

}
