package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만을 복사
	// 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부 값들을 복사

	public void method1() {
		int[] origin = { 1, 2, 3, 4, 5 };

		// origin을 copy에 복사
		int[] copy = origin;

		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// 잘 복사 되었는지 copy 확인

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
		// 복사된 copy배열을 이용해서 2번 인덱스 값을 99로 수정
		copy[2] = 99;
		System.out.println("===== 복사본 배열 값 변경 후 =====");

		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// 잘 복사 되었는지 copy 확인

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();

		// copy 배열의 2번 인덱스 값만 변경했는데 원본까지 값이 변경
		// ==> 같은 곳을 참조하고 있기 때문(같은 주소값)

		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		// ============>얕은 복사
	}

	// 새로운 배열을 만들기 위해서는 깊은 복사가 필요함
	public void method2() {
		// 1. for문을 이용한 방법
		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[5];
		// 5크기의 빈 배열을 만들어 줌 현재는 0으로 초기화

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];

		}

		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// 잘 복사 되었는지 copy 확인

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
		// 복사된 copy배열을 이용해서 2번 인덱스 값을 99로 수정
		copy[2] = 99;
		System.out.println("===== 복사본 배열 값 변경 후 =====");

		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// 잘 복사 되었는지 copy 확인

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();

		

		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());

	}

	public void method3() {
		// 2. System클래스에서 arraycopy()메소드를 이용한 복사

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[10]; // 넉넉하게 크게 생성

		// System.arracopy(원본 배열명, 복사 시작 할 인덱스, 복사본 배열명, 복사본 배열의 복사 될 시작 위치, 복사길이);

		System.arraycopy(origin, 0, copy, 2, origin.length);
		// origin 배열을 copy 배열에 복사하는데 origin 배열의 0번 인덱스부터 마지막에 넣은
		// 길이만큼을 copy배열의 2번 인덱스부터 채우겠다는 의미

		// 원본출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// 잘 복사 되었는지 copy 확인

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
	}

	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf()메소드 사용

		int[] origin = { 1, 2, 3, 4, 5 };

		// 복사본 배열 = Arrays.copyOf(원본배열, 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 5);

		// 내가 지정한 길이 만큼 무조건 크기가 할당 됨
		// 해당 길이가 복사하고자 하는 길이보다 클 경우 기본 배열 내용 모두 복사(뒤에는 0 이 옴)
		// 작을 경우 내가 지정한 길이만큼 복사

		// 원본출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// 잘 복사 되었는지 copy 확인

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
	}

	public void method5() {
		// 4. clone() 메소드 이용한 복사
		// : 시작 인덱스를 지정할 수 없으며 원본 배열 통채로 복사해서 새로운 배열 할당

		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = origin.clone();

		// 원본출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// 잘 복사 되었는지 copy 확인

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
	}

	// 복사에 대한 개념을 배우는 이유는
	// 얕은 복사를 하면 같은 주소를 참조 => 원본 / 복사본 중하나를 수정하면 서로에게 영향을 끼침

	// 우리가 복사를 사용하는 이유는 주로 원본은 유지한 채 복사본으로 테스트가 필요한 경우
	// (정렬, 은닉 등등) => 깊은 복사를 하는 방법이 필요!!!
	


	
	
	
	

}