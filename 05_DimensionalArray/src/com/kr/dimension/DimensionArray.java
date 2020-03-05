package com.kr.dimension;

import java.util.Scanner;

public class DimensionArray {
	// 이차원 배열 : 일차원 배열 여러 개를 하나로 묶은 것이 2차원 배열

	public void method1() {
		/*
		 * *이차원 배열선언 자료형[][] 배열명; 자료형[] 배열명[]; 자료형 배열명[][];
		 */

		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		// 선언을 하게 되면 stack에 레퍼런스 변수 생성

		/*
		 * 이차원 배열 할당 배열명 = new 자료형[행크기][열크기];
		 */

		arr1 = new int[3][5];
		// 할당을 하게 되면 heap영역에 해당 크기만큼의 공간 할당

		// 행의 길이를 알고자 한다면
		System.out.println("행의 길이 : " + arr1.length);

		// 열의 길이를 알고자 한다면
		System.out.println("열의 길이 : " + arr1[0].length);

		// ****
		// ****
		// ****
		// ****
		// ****

		// 외부for문 -->행의 갯수만큼 반복
		// 내부 for문 --> 열의 갯수만큼 반복

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 이차원 배열도 동일하게 중첩 for문을 이용함
		for (int i = 0; i < arr1.length; i++) { // arr1의 길이 = 행의 길이 (레퍼런스 변수에 몇행이 있는지)
			for (int j = 0; j < arr1[i].length; j++) { // arr1의 특정값의 길이 = 열의 길이 (몇열이 있는지(더 들어가서 칸수가 몇칸이 있는지))
				System.out.print(arr1[i][j] + " ");

			}
			System.out.println();
		}
	}

	public void method2() {
		int[][] arr = new int[3][5];

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		// 값 기록
		// 1. 인덱스에 접근하여 값 기록
		/*
		 * arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3; arr[0][3] = 4; arr[0][4] = 5;
		 */

		// 2. 중첩 for문을 이용하여 값 기록
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				// value++; -> 굳이 나눠서 안쓰고 위에 ++연산자 붙여서 연결에서 써도됨
			}
		}
		// 3.출력을 통해 확인
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method3() {
		// 이차원 배열의 할당과 초기화 동시에

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		// printf 구문으로 출력하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void method4() {
		// 가변 배열
		// 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은 것이 --> 2차원배열
		// 즉, 묶여있는 1차원 배열의 길이가 꼭 같은 필요는 x

		int[][] arr = new int[3][]; // 가변 배열 할당 (행만 지정 -> 행은 무조건 지정해야하고 열은 지정 안해도 됨)

		arr[0] = new int[2]; // 0행은 2열
		arr[1] = new int[1]; // 1행은 1열
		arr[2] = new int[3]; // 2행은 3열

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}

	public void method5() {
		// 가변 배열 할당과 초기화 동시에
		int[][] arr = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		// 직접 출력 구문 타이핑 해서 확인하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void method6() {
		// double형 2행 4열 배열 을 만들어
		// 3명의 학생의 국어(0행), 영어(1행)성적을 입력받고 마지막 열(3열)에는 합계를 담기

		double[][] arr = new double[2][4];
		Scanner sc = new Scanner(System.in);

		// 입력받는 반복문
		for (int i = 0; i < arr.length; i++) {
			double sum = 0; // 국어 또는 영어의 합계를 담을 변수

			for (int j = 0; j < arr[i].length - 1; j++) { // 마지막 열을 제외
				if (i == 0) {

					System.out.print(j + 1 + "번 학생 국어 점수 : ");
				} else {
					System.out.print(j + 1 + "번 학생 영어 점수 : ");
				}
				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];

			}
			arr[i][3] = sum;

		}
		// 출력하는 반복문
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("국어 점수 : ");
			} else {
				System.out.print("영어 점수 : ");
			}
			for (int j = 0; j < arr[i].length; j++) {
				// 성적 값과 합계 구분
				if (j < arr[i].length - 1) {
					System.out.print(arr[i][j] + " ");

				} else {
					System.out.print("합계 : " + arr[i][j]);

				}

			}
			System.out.println();
		}
		// 국어점수 평균 : XX점
		// 영어점수 평균 : XX점

		// System.out.println(); 빨리 쓰는법 -> syso ->ctrl+space

		System.out.println("국어 점수 평균 : " + arr[0][3] / 3);
		System.out.println("영어 점수 평균 : " + arr[1][3] / 3);

	}

	public void method7() {
		// char형 2차원 배열 5행 5열을 만들고 행과 열을 입력받아
		// 해당 좌표의 값을 'X'로 변환해서 2차원 배열 출력하기
		// 반복 실항하되 행이나 열 입력 시 0미만 5이상의 수가 입력 되면
		// 프로그램을 종료함

		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][5];
		int row;
		int col;

		while (true) {
			System.out.print("행 인덱스 입력 >> ");
			row = sc.nextInt();
			System.out.print("열 인덱스 입력>> ");
			col = sc.nextInt();

			// 종료 조건
			if (row < 0 || row > 4 || col < 0 || col > 4) {
				break;

			}
			arr[row][col] = 'X';
			// 출력문 작성 => "\t"
			System.out.println("\t0\t1\t2\t3\t4\t");
			for (int i = 0; i < arr.length; i++) {
				
				for (int j = 0; j < arr[i].length; j++) {

					System.out.print(arr[i][j] + "\t");

				}
				System.out.println();

			}

		}
		System.out.println("프로그램을 종료합니다.");
	}
}