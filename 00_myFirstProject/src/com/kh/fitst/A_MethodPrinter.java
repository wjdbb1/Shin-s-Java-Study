package com.kh.fitst;

public class A_MethodPrinter {

	// 들여쓰기(ctrl + shift + F)
	//프로그램 실행하기위해선 무조건 메인메소드를 찾아가기 때문에 메인 메소드가 없으면 실행이 x
	
	public void methodA() {
		System.out.println("Method A가 호출되었어요 !");
		methodB(); //methodB 호출

	}

	public void methodB() {
		System.out.println("Method B가 호출되었어요 !");
		methodC(); //methodc 호출
		
	}

	public void methodC() {
		System.out.println("Method C가 호출되었어요 !");

	}

}
