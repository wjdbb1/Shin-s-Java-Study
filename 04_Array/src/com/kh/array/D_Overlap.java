package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	// 중복 제거

	public void method1() {
		// 사용자에게 5개의 값을 입력 받아 배열에 저장
		// 단, 중복 값은 허용하지 않음

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 정수 값 : ");
			arr[i] = sc.nextInt();// 입력

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) { // 중복 값이 있을 경우(if문으로 들어온 상태)
					System.out.println("중복 값이 존재합니다.");

					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// 출력
		}
	}

	public void method2() {
		int[] arr = new int[5];

		// 임의의 1부터 10사이의 난수를 중복없이 발생시켜 arr에 담기

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			for (int j = 0; j < i; j++) { // 이전에 발생한 랜덤 값과 비교
				if (arr[i] == arr[j]) { // 중복된 값이 있을시
					System.out.println(j + "번째와 " + i + "번째 : " + arr[i] + "중복");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public void method3() {
		// method2와 동일하게 담은 뒤(중복없이 랜덤값 )
		// 내림차순 정렬(삽입 정렬로 구현)하여 출력해보기

		int[] arr = new int[5];

		// 임의의 1부터 10사이의 난수를 중복없이 발생시켜 arr에 담기

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			for (int j = 0; j < i; j++) { // 이전에 발생한 랜덤 값과 비교
				if (arr[i] == arr[j]) { // 중복된 값이 있을시
					System.out.println(j + "번째와 " + i + "번째 : " + arr[i] + "중복");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}
}