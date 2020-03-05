package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);

			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int cnt = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = cnt--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {

		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + "," + j + ")");

			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;

			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}

		}
		for (int i = 0; i < arr.length - 1; i++) {

			arr[3][3] += arr[i][3] + arr[3][i];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			System.out.print("열 크기 : ");
			int col = sc.nextInt();

			char[][] arr = new char[row][col];

			if (row >= 1 && row <= 10 && col >= 1 && col <= 10) {

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) ((int) (Math.random() * 26) + 65);
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;

			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}

		}

	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int row = sc.nextInt();

		char[][] arr = new char[row][];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 크기 : ");
			int col = sc.nextInt();

			arr[i] = new char[col];
		}

		// 값 초기화
		char value = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * while (true) {
	 * 
	 * System.out.print("행 크기 : "); int row = sc.nextInt();
	 * 
	 * char[][] arr = new char[row][];
	 * 
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * System.out.print(i + "행의 크기 : "); int col = sc.nextInt(); arr[i] = new
	 * char[col];
	 * 
	 * // 값초기화
	 * 
	 * for (int j = 0; j < arr[i].length; j++) {
	 * 
	 * }
	 * 
	 * } } }
	 */

	public void practice8() {
		String[] students = { "김예수", "김영해", "방명수", "손은희", "송종기", "윤은애", "이영지", "임시환", "전지연", "정중하", "차태연", "하이유" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
		// 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
		// 학생을 이어서 셀 수 있도록 count 변수 생성

		// 1분단 애들 값 넣기
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		// 2분단 애들 값 넣기
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		// 출력
		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice9() {
		String[] students = { "김예수", "김영해", "방명수", "손은희", "송종기", "윤은애", "이영지", "임시환", "전지연", "정중하", "차태연", "하이유" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
// 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
// 학생을 이어서 셀 수 있도록 count 변수 생성

// 1분단 애들 값 넣기
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

// 2분단 애들 값 넣기
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

// 출력
		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==================================");

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();

		String part = ""; // 분단
		int row = 0; // 몇번째 줄
		String col = ""; // 왼쪽 오른쪽

		for (int i = 0; i < seat1.length; i++) {

			for (int j = 0; j < seat1[i].length; j++) {

				if (seat1[i][j].equals(name)) {

					part = "1분단";
					row = i + 1;

					if (j == 0) {
						col = "왼쪽";
					} else {
						col = "오른쪽";
					}
				}
			}
		}

		for (int i = 0; i < seat2.length; i++) {

			for (int j = 0; j < seat2[i].length; j++) {
				if (seat2[i][j].equals(name)) {

					part = "2분단";
					row = i + 1;

					if (j == 0) {
						col = "왼쪽";
					} else {
						col = "오른쪽";

					}
				}
			}
		}

		if (part.equals("")) {
			System.out.println("검색하신 학생은 없습니다.");
		} else {
			System.out.println("검색하신 " + name + " 학생은 " + part + " " + row + "번째 줄 " + col + "에 있습니다.");
		}

	}

}
