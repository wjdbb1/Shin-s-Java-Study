package com.kh.variable;

// 다른 패키지 안에서는 같은 클래스명을 만들 수 있음
//==> 클래스명은 패키지명부터 시작하는 것이 풀네임
public class A_Variable {

	public void printValue() {
		System.out.println("변수 사용 전");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);

		int point = 100; // 포인트
		int bonus = 10; // 보너스
		int personCount = 10; // 사람수 -> 20명으로 변경
		int fees = 10; // 수수료

		System.out.println("변수 사용 후");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);

		// 가독성, 재사용상, 유지보수성 위해 변수 사용하는 습관 들이기!

	}

	public void declareVariable() {
		// 변수 선언
		// 형태 : 자료형 변수명;
		// 변수명은 항상 소문자로 시작. 여러 단어이면 첫문자는 대문자 -> 낙타등표기법

		// 1.논리형
		boolean isTrue; // 1byte

		// 2.숫자형
		// 2-1.정수형
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte --> 정수형 중에 가장 대표적인 자료형 (기본형)
		long lNum; // 8byte

		// 2-2. 실수형
		float fNum; // 4byte
		double dNum;// 8byte --> 실수형 중에 가장 대표적인 자료형 (기본형)

		// 3.문자형
		char ch;

		// 4. 문자열(참조형) --> 기본 자료형이 아닌 참조 자료형
		String str;

		// **변수에 값을 대입 **
		// 변수명 = 값;

		isTrue = true;// 논리형 변수에는 true, false값만 저장 가능
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // l또는 L을 붙이면서 long형 자료형 값이라는 표현
					// 표시하지 않아도 값이 들어감 (자동 형변환)

		fNum = 4.0F; // 반드시 f를 붙여야함 --> 데이터 손실이 일어날 수 있음
		dNum = 8.0d; // d를 생략해도 됨 --> double이 기본형 이므로

		// ch = 'ABC'; //문자에는 한 문자만 값 저장 가능
		ch = 'A'; // 따옴표를 이용하여 값 대입

		str = "ABC";// 쌍따옴표를 이용하여 값 대입
		str = "A";// 한 개의 문자를 저장할 수 있음

		// ** 변수 출력 ** //
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);

	}

	public void initvariable() {
		// 메소드 안에 선언 된 변수는 '지역변수'이므로
		// 해당 메소드에서만 사용 가능하며 반드시 초기화(값 대입)되어야 한다 !!!!

		// 변수 명명 규칙
		int number;
		// int number; --> 변수묭이 같으면 에러
		int Number; // 대소문자는 구분되기 때문에 가능

		// int true; --> 예약어(true)사용 불가

		int age1;
		// int 1age; --> 숫자로 시작할 수 없음
		
		int number_1;
		int number$2;
		//int numver#3; --> _ ,$ 이외의 특수문자 사용 불가
		
		//여러 단어로 된 변수명일 경우 붙여쓰고 두번째 단어부터 첫 글자를 대문자로 작성 -> 낙타등 표기법
		
		String username;// 관례상 틀림
		String userName;// 관례상 맞는 표현
		
		//자바는 한글도 사용 가능함
		String 이름; //한글을 사용하지 않는 환경에서는 오류를 발생시킬 가능성이 있어 잘 사용하지 않음
		
		
		

	}

}
