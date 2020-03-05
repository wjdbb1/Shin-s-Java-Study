package com.kh.variable;

public class D_Cast {
	public void rule1() {
		// boolean은 형변환 불가능 ! 오직 true, false 값만 가질 수 있다.
		boolean flag = true;
		// flag = 100; //flag 100; 에러발생

		// 1. 자동 형 변환
		// 값의 범위가 작은 자료형과 큰 자료형 간의 연산 (변수 대입, 계산 등) 시
		// 컴파일러가 자동으로 범위가 작은 자료형을 큰 자료형으로 변환

		// int(4byte) -> double(8byte)
		int i = 12;
		double d = 3.3;
		double result = i + d;

		System.out.println("reusult : " + result);
		// int 형과 double형의 연산 결과가 double형으로 자동으로 변환 됨

		// int(4byte) -> long(8byte)
		int i2 = 2147483647;
		long l = 1000000000L;
		long result2 = i2 + l;

		System.out.println("result2 : " + result2);

		// float(4byte) -> double(8byte)
		float f = 1.0f;
		double d2 = f;// 대입

		System.out.println("f : " + f);
		System.out.println("d2 : " + d2);

		// long(8byte) -> float(4byte)
		// 크기는 long형이 더 큰데 왜 float로 자동 형변환이 가능할까?
		// -> 실수인 float가 정수인 long형보다 표현 가능한 수의 범위가 더 커서 자동 형변환 가능
		long l2 = 100000000000L;
		float f2 = 12; // 대입
		System.out.println("f2 : " + f2);

		// char(2byte) -> int(4byte)
		int num = 'A'; // int형 변수에 char형 리터럴 값 대입 -> 문자에 해당하는 유니코드 값이 저장 됨
		System.out.println("num : " + num);

		// char 자료형에 정수값 저장 가능
		char ch = 65;
		// ch = -65; char는 음수값 저장 불가 -> 값의 범위가 0~65535
		System.out.println("ch : " + ch);

		// byte, short를 이용한 연산
		byte b2 = 1;
		byte b3 = 10;
		// byte result3 = b2 + b3; byte나 short는 연산 시 무조건 int형으로 처리된다.

		// 강제 형변환을 통해 byte에 대입가능
		byte result3 = (byte) (b2 + b3);
		int result4 = b2 + b3;

	}

	public void rule2() {
		// 2. 강제형변환
		// 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		// ** 형변환 생략 불가 **

		int iNum = 10;
		double dNum = 5.89;

		// int iSum = iNum + dNum;
		// 연산결과가 double이기 떄문에 int형 변수 iSum에 저장 불가

		// 에러 해결 방법
		// 1. 수행 결과를 int형으로 강제 형변환

		int iSum = (int) (iNum + dNum);
		System.out.println("iSum : " + iSum);
		// 실수 -> 정수형 강제 형변환 시 소수점 아래 부분은 모두 버림처리

		// 2. double형 값을 int로 강제 형변환
		int iSum2 = iNum + (int) dNum;
		System.out.println("iSum2 : " + iSum2);

		// 3. 연산결과를 double로 받음
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
	}

	public void dataLoss() {
		// 데이터 손실 테스트
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		//강제 형변환 후 데이터 손실 테스트
		
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
		
		
		
	}
}
