package com.kh.run;

import com.kh.fitst.A_MethodPrinter; //외부의 클래스를 사용하고자 할때는 import구문(import가없으면 에러)
//패키지 아래 임포트 

public class RunA {

	public static void main(String[] args) {
		// 다른 클래스에 있는 메소드를 실행하려면?

		// 1. 실행할 메소드가 있는 클래스 생성
		//	클래스명 사용할이름 = new 클래스명();

		A_MethodPrinter a = new A_MethodPrinter();
		// 다른 패키지에 존재하는 클래스이기 때문에 인식할 수 없어서 에러 발생 -> import하기

		// 2. 메소드 실행(호출)
		//	사용할이름.사용할메소드();
		
		a.methodA();
		//a.methodB();
		//a.methodC();
		

	}

}
