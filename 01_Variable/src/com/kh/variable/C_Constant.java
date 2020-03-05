package com.kh.variable;

public class C_Constant {
	public void finalConstant() { // 상수 테스트
		int age = 20;
		final int AGE = 20;

		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);

		// 변수 값 변경
		age = 30;
		// AGE = 30;
		// 빨간 줄이 뜨는 것은 컴파일 에러 => 문법적인 오류로 인해 컴파일할 수 없음을 표시
		// 콘솔창에서 빨간 글씨가 뜨는 것은 런타임 에러 => (빨간 글씨를)반드시 해석하는 연습!
		
		System.out.println("상수 값은 한 번 기록된 후 값 변경이 불가능하다.");
		

	}

}
