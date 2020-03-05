package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

/*	// 1. 길이가 10인 배열을 만들자
	int[] arr
	= new int[10];

	// 2. 1부터 10까지의 값을 반복문을 통해 순서대로 넣자
	
	//arr[0] = 1;
	//arr[1] = 2;
	//arr[2] = 3;
	//arr[3] = 4;
	//arr[4] = 5;
	//arr[5] = 6;
	//arr[6] = 7;
	//arr[7] = 8;
	//arr[8] = 9;
	//arr[9] = 10;
	
	// i번째 인덱스 값에 i+1 값을 넣어주면 되겠구나!

	// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
	for(int i = 0; i < arr.length; i++) {
	arr[i] = i+1;
	}

	// 3. 잘 들어갔는지 출력
	for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
	}

	}
*/
	public void practice2() {

		int[] arr = new int[10];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	/*
	// 1. 길이가 10인 배열을 만들자
	int[] arr = new int[10];

	// 2. 10부터 1까지의 값을 반복문을 통해 순서대로 넣자
	
	//arr[0] = 10;
 //arr[1] = 9;
	//arr[2] = 8;
	//arr[3] = 7;
	//arr[4] = 6;
	//arr[5] = 5;
//arr[6] = 4;
//arr[7] = 3;
//arr[8] = 2;
//arr[9] = 1;
/	
	// i번째 인덱스 값에 arr.length-i 값을 넣어주면 되겠구나!

	// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
	for(int i = 0; i < arr.length; i++) {
	arr[i] = arr.length - i;
	}

	// 3. 잘 들어갔는지 출력
	for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
	}

	}
*/


	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

/*	
	// 1. 사용자에게 정수 입력 받기

	Scanner sc = new Scanner(System.in);

	System.out.print("양의 정수 : ");
	int size = sc.nextInt();

	// 2. 배열을 할당할 껀데 사용자가 입력한 정수(size)만큼의 크기로 할당
	int[] arr = new int[size];

	// 3. 1부터 입력받은 값까지 배열에 초기화
	for(int i = 0; i < arr.length; i++) {
	arr[i] = i+1;
	}

	// 4. 잘 들어갔는지 출력을 통해 확인
	for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
	}
	}

*/

	public void practice4() {

		String[] arr = new String[5];

		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[1]) {
				System.out.println(arr[i]);

			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

		}

		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스) : ");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");

				count++;

			}
		}

		System.out.println();
		System.out.println(ch + "개수 : " + count);

	}

	public void practice6() {

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num] + "요일");

		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번 째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();

		} // 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) { // 3이상이면서 홀수인 경우(즉, 잘 입력한 경우)

				// 사용자가 입력한 정수 크기 만큼의 배열을 만들자

				int[] arr = new int[num];

				// 값을 넣기 위한 변수 --> 오름차순일 경우 1씩 증가시킬 꺼고 내림차순일 경우 1씩 감소시킬꺼임
				int count = 1;

				// 중간까지 증가
				for (int i = 0; i < arr.length / 2; i++) {
					arr[i] = count++; // 1증가
				}
				// 중간부터 감소
				for (int i = arr.length / 2; i < arr.length; i++) {
					arr[i] = count--;
				}

				// 출력
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}
				}
				break; // 제대로 실행 하고 무한 반복문 빠져나가기

			} else { // 3이상이 아니거나 홀수가 아닌경우 (즉,잘못 입력한 경우)
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요: ");
		String str = sc.nextLine();

		/*
		 * String[] arr = new String[5]; arr[0] = "양념"; arr[1] = "후라이드"; arr[2] = "간장";
		 * arr[3] = "칠리";
		 */

		String[] arr = { "양념", "후라이드", "간장", "칠리" };

		int i = 0;

		for (; i < arr.length; i++) {

			if (arr[i].equals(str)) {

				break;
			}
		}
		if (i < arr.length) {
			System.out.println(str + "치킨 배달가능");

		} else {
			System.out.println(str + "치킨은 없는 메뉴 입니다.");
		}

	}

	public void practice10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			System.out.print(arr[i] + " ");
		}
	}
}