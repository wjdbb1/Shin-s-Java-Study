package com.kh.dimensionarray.practice;

public class PracticeDA {
	public void method1() {

		int[][] arr = new int[4][4];

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}
	public void method2() {
		int[][] arr = new int[4][4];
		int value = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void method3() {
		String[][] arr = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + "," + j + ")";

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	public void method4() {

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;

				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
				System.out.println();
			}
			System.out.println();

		}
	}
}
