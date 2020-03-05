package com.kr.operator;

public class F_Compound {
	// 복합 대입 연산자 : 산술 연산자와 대입 연산자를 함께 사용하는 연산자
	// 연산 처리 속도가 훨씬 빠르므로 사용 권장함

	public void method() {
		int num = 12;

		System.out.println("num : " + num);

		num += 3; // num 3 증가

		num -= 5; // num 5 감소

		num *= 6; // num 6배 증가

		num /= 2; // num 2배 감소

		num %= 4; // num을 4로 나누었을 때의 나머지

		System.out.println("num : " + num);

	}

}
