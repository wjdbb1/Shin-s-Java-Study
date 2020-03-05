package com.kh.chap03_class.rund;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// 다른 패키지에 있는 Person이라는 ㅡㄹ래스를 생성하기 위해 import작업

		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("신정현");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-5721-1821");
		p.setEmail("wjdbb1@gmail.com");

		System.out.println(p.information());

		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();

		//setter를 이용해서 이름 다시 수정
		p.setName(name);
		System.out.println(p.information());
		
		
		
		//접근 제한자가 default인 클래스는 패키지 외부에서 아예 접근이 불가능하다!!

	}

}
