package com.kh.variable;

public class E_Overflow {
	public void overflow() {
		// byte 자료형 값 저장 범위 : -128~127
		// byte bNum = 128; //--> 애러, 범위를 벗어난 값임
		// 초기화 시에는 위와같이 에러를 발생시켜주지만
		// 연산 과정에서 범위를 벗어나게 되면 에러가 아닌 오버플로우 처리됨

		byte bNum = 127;// byte 최대값
		System.out.println("bNum : " + bNum);

		bNum = (byte) (bNum + 1);
		System.out.println("bNum : " + bNum);

		
	}

	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		int multi = num1 * num2;
		System.out.println("계산결과 : " + multi);

		// 값의 범위를 미리 알고 이를 예상해서 더 큰 자료형으로 변경해주면 해결이 가능
		long multi2 = (long) num1 * num2; // -> 반드시 곱하기 연산이 일어나기 전에 형변환 해야함 !
		System.out.println("계산결과2 : " + multi2);

	}

	public void printVariableSize() {
		// 변수별 메모리 사이즈 출력용 메소드
		System.out.println("byte의 크기 " + Byte.BYTES + "byte");
		System.out.println("short의 크기 " + Short.BYTES + "byte");
		System.out.println("int의 크기 " + Integer.BYTES + "byte");
		System.out.println("Long의 크기 " + Long.BYTES + "byte");
		System.out.println("float의 크기 " + Float.BYTES + "byte");
		System.out.println("double의 크기 " + Double.BYTES + "byte");
		System.out.println("char의 크기 " + Character.BYTES + "byte");
		// java.lang 패키지 내의 클래스들은 import 없이 사용할 수 있음

	}
}
