package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeA {
	public void method1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void method2() {
		int[] arr = new int[10];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void method4() {
		String[] arr = new String[5];

		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";

		System.out.println(arr[1]);

	}

	public void method5() {///////////////////////
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

		}
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + "개수 : " + count);

	}

	public void method6() {
		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num <= 6 && num >= 0) {

			System.out.print(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void method7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {

			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}

		System.out.println();
		System.out.println("총 합 : " + sum);
	}

	public void method8() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int size = sc.nextInt();

			if (size >= 3 && size % 2 == 1) {
				int[] arr = new int[size];

				int count = 1;
				for (int i = 0; i < arr.length / 2; i++) {
					arr[i] = count++;

				}
				for (int i = arr.length / 2; i < arr.length; i++) {
					arr[i] = count--;

				}
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public void method9() {

		String[] arr = { "양념", "갈릭", "후라이드", "뿌링클" };

		Scanner sc = new Scanner(System.in);

		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		int i = 0;
		for (; i < arr.length; i++) {
			if (arr[i].equals(menu)) {

				break;

			}
		}
		if (i < arr.length) {
			System.out.print(menu + "치킨 배달 가능");
		} else
			System.out.print(menu + "치킨은 없는 메뉴입니다.");
	}

	public void method10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void method11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// 출력
		}
	}

	public void method12() {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String jumin = sc.nextLine();

		char[] origin = new char[jumin.length()];

		for (int i = 0; i < origin.length; i++) {
			origin[i] = jumin.charAt(i);
		}

		// System.out.println("원본 배열 출력");
		// for (int i = 0; i < origin.length; i++) {
		// System.out.print(origin[i]);
		// }
		// System.out.println();

		char[] copy = new char[origin.length];

		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
		}
		// System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
		System.out.println();

		// System.out.println("origin의 주소값 : " + origin.hashCode());
		// System.out.println("copy의 주소값 : " + copy.hashCode());

	}

	public void method13() {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// 출력
		}
	}

	public void method14() {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}

		int count = 0;

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			count++;

		}
		System.out.print("문자 개수 : " + count);

	}

	public void method15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요  : ");
		int size = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[size];

		for (int i = 0; i < arr.length; i++) {

			System.out.print(i + 1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();

		}
		while (true) {
			System.out.print("더 값을 입력 하시겠습니까?(Y/N) : ");
			char answer = sc.next().charAt(0);
			sc.nextLine();

			if (answer == 'y' || answer == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int size2 = sc.nextInt();
				sc.nextLine();

			}

		}

	}

}
