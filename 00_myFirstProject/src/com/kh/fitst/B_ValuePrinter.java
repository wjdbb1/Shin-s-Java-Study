package com.kh.fitst;

public class B_ValuePrinter {
	/*
	 * <명명규칙> 1. 패키지 -> 소문자로 시작 2. 클래스 -> 대문자로 시작 3. 메소드 -> 소문자로 시작
	 *
	 * 여러 개의 단어가 있을 때는 각 단어의 앞자리는 대문자로 -> 낙타등 표기법
	 *
	 */

	public void printValue1() {
		// 여러가지 형태의 값을 출력하는 기능을 하는 메소드

		// 1. 숫자출력
		System.out.println(123); // 정수
		System.out.println(1.23); // 실수

		// 2. 문자출력(한글자 출력) -> 따옴표 (싱글 쿼테이션) 사용
		System.out.println('a');
		System.out.println('b');

		// 3. 문자열 출력 -> 쌍따옴표(더블 쿼테이션) 사용
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");

		// 4. 내부에서 연산 가능
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12);
		// 컴퓨터는 이진수 밖에 표현할 수 없으므로 실수 값 연산은 불완전해서 오차가 생길 수 있음

		// 5. 문자는 숫자와 연산 가능 -> 컴퓨터는 근본적으로 문자를 숫자로 받아들이기 때문
		System.out.println('a' + 1); // 97(a의 유니코드) + 1

		// 6. 문자열("")과 숫자의 합 -> 문자열
		System.out.println("안녕하세요" + 1); // "안녕하세요1"
		System.out.println("반갑습니다" + 22 + 33);// "반갑습니다2233"

		System.out.println("반갑습니다" + 22 + 33 + "안녕");
		System.out.println(22 + 33 + "안녕" + "하세요");
	}

}
