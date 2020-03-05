package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	// 배열 정렬
	public void method1() {
		// 배열을 정렬하기에 앞서서 변수를 가지고 값을 변경하는 테스트부터

		// 두 개의 변수의 값을 서로 변경

		int num1 = 20;
		int num2 = 10;

		System.out.println("==== 변경 전 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		// 값을 임시로 보관할 새로운 변수를 만들어서 이동 시켜야 함

		int temp; // 임시로 값을 보관해 둘 변수

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("==== 변경 후 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

	}

	public void method2() {
		// 배열도 동일하게 위치 변경 가능
		int[] arr = { 2, 1, 3 }; // 하나씩 왼쪾으로 밀기 : 1, 3, 2

		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

	public void method3() {
		int[] arr = { 2, 5, 4, 1, 3 };

		// 삽입 정렬
		// 배열의 n번 인덱스 값을 0번 ~ n-1번 인덱스 까지 비교

		// i = 1 j = 0~0
		// i = 2 j = 0~1
		// i = 3 j = 0~2
		// i = 4 j = 0~3

		// 기준을 잡고 앞에꺼랑 비교해서 i>j일떄 둘이 바꿔줌

		// 오름차순 정렬
		// 인덱스 한 개씩 증가시키는 반복문
		for (int i = 1; i < arr.length; i++) {
			// 인덱스가 증가할 때 마다 처음부터 해당 인덱스까지 비교하는 반복문
			for (int j = 0; j < i; j++) {
				System.out.println("현재 인덱스 위치 : " + i + ", " + j);
				// 오름차순을 위한 정렬 처리
				if (arr[i] < arr[j]) { // 오름차순 -->i가 j보다 작을떄 (i가 기준)
										// 내림차순은 부등호만 반대로 처리하면 가능
					System.out.println("===== 교환 발생 =====");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				// 수행 결과를 바로 확인해보기
				System.out.println(i + "회전 : " + Arrays.toString(arr));
				// 간단하게 Array를 한줄로 출력해보고 싶을 때 사용
				System.out.println();
			}

		}

	}

	public void method4() {
		int[] arr = { 2, 5, 4, 1, 3 };

		// 오름차순 정렬
		Arrays.sort(arr);
		// Arrays.sort(arr,0,3); //fromIndex, toIndex
		// 0번 인덱스부터 3번 인덱스 전까지 정렬

		System.out.println(Arrays.toString(arr));

		// Arrays.sort()는 따로 내림차순은 지원하지 않음
		// 만약 내림차순을 구현하고 싶다면 새로운 배열을 만들어서 거꾸로 복사
		int[] copy = new int[5];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = arr[copy.length - 1 - i];

		}
		System.out.println(Arrays.toString(copy));
	}
	// 정렬 방법은 삽입 정렬 이외에도 버블정렬, 선택정렬 등 많은 방법이 있으므로
	// 추가적으로 공부하고 싶다면 찾아서 공부 ㅎ________ㅎ
}