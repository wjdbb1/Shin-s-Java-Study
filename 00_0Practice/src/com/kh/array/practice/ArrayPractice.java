package com.kh.array.practice;

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

	public void practice2() {

		int[] arr = new int[10];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

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

/*
public void practice1() {
	// 1. 길이가 10인 배열을 만들자
	int[] arr 
	= new int[10];
	
	// 2. 1부터 10까지의 값을 반복문을 통해 순서대로 넣자
	
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
	arr[5] = 6;
	arr[6] = 7;
	arr[7] = 8;
	arr[8] = 9;
	arr[9] = 10;
	
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

public void practice2() {
	// 1. 길이가 10인 배열을 만들자
	int[] arr = new int[10];
	
	// 2. 10부터 1까지의 값을 반복문을 통해 순서대로 넣자
	
	arr[0] = 10;
	arr[1] = 9;
	arr[2] = 8;
	arr[3] = 7;
	arr[4] = 6;
	arr[5] = 5;
	arr[6] = 4;
	arr[7] = 3;
	arr[8] = 2;
	arr[9] = 1;
	
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

public void practice3() {
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


public void practice4() {
	// 1. 길이가 5인 String 배열 선언
	String[] arr = new String[5];
	
	// 2. 각 인덱스별 값 초기화
	arr[0] = "사과";
	arr[1] = "귤";
	arr[2] = "포도";
	arr[3] = "복숭아";
	arr[4] = "참외";
	
	// 위의 1번 2번 과정을 동시에 진행 할 수도 있다. 아래와 같이
	//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
	
	// 3. 배열 인덱스를 활용해서 귤 출력
	System.out.println(arr[1]);
}

public void practice5() {
	// 1. 사용자에게 문자열과 문자 입력받기
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열 : ");
	String str = sc.nextLine();
	
	System.out.println("문자 : ");
	char ch = sc.nextLine().charAt(0);
	
	// 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기
	
	// 먼저 사용자가 입력한 문자열 길이만큼의 char배열을 할당 
	char[] arr = new char[str.length()];
	
	// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
	for(int i = 0; i < arr.length; i++) {
		arr[i] = str.charAt(i);
	}
	
	
	// 3. 검색할 문자가 문자열에 몇개가 들어있는지와 어느 인덱스에 있는지 파악
	
	int count = 0; 	// 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
					// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가 시켜줄꺼임
	
	System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
	
	// 인덱스마다 접근하기 위해 반복문 사용
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우 
			System.out.print(i + " ");	// 해당 인덱스 이어서 출력
			count++;	// 그리고 count 1증가
		}
	}
	
	// 위에서 print()를 사용했기 때문에 개행이 안 되어있을 것
	System.out.println();	// 개행을 해주자
	System.out.println(ch + "개수 : " + count);
	
}

public void practice6() {
	
	// 1. "월" ~ "일"까지 초기화된 문자열 배열 만들기
	String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
	
	// 2. 사용자에게 0부터 6까지의 숫자 입력 받기
	Scanner sc = new Scanner(System.in);
	
	System.out.print("0 ~ 6 사이 숫자 입력 : ");
	int num = sc.nextInt();
	
	// 3. num값이 0 ~ 6 사이의 숫자인지 확인 --> 아닐 경우 "잘못 입력하셨습니다." 출력
	if(num >= 0 && num <= 6) {
		
		// 해당 요일 출력
		System.out.println(arr[num] + "요일");
		
	}else {
		System.out.println("잘못 입력하셨습니다.");
	}
}


public void practice7() {
	// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 : ");
	int num = sc.nextInt();
	
	int[] arr = new int[num];
	
	// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
	for(int i = 0; i < arr.length; i++) {
		System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
		arr[i] = sc.nextInt();
	}

	// 3. 전체 값 나열 및 총 합 출력
	int sum = 0;
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		sum += arr[i];
	}
	
	System.out.println();
	System.out.println("총 합 : " + sum);
	
	
}

public void practice8() {
	
	// 1. 사용자에게 3 이상의 정수 값을 입력받자
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num >= 3 && num % 2 == 1) { // 3이상이면서 홀수인 경우 (즉, 잘 입력한 경우)
			
			// 사용자가 입력한 정수 크기 만큼의 배열 만들자
			int[] arr = new int[num];
			
			// 값을 넣기 위한 변수 --> 오름차순일 경우 1씩 증가시킬 꺼고 내림차순일 경우 1씩 감소시킬꺼임
			int count = 1;
			
			// 중간까지 증가
			for(int i = 0; i < arr.length/2; i++) {
				arr[i] = count++; // 1증가
			}
			// 중간부터 감소
			for(int i = arr.length/2; i < arr.length; i++) {
				arr[i] = count--;
			}
			
			// 출력
			for(int i = 0; i < arr.length; i++) {
				if(i < arr.length-1) {
					System.out.print(arr[i] + ", ");
				}else {
					System.out.println(arr[i]);
				}
			}
			break; // 제대로 실행 하고 무한 반복문 빠져나가기
			
		}else { // 3이상이 아니거나 홀수가 아닌경우 (즉,잘못 입력한 경우)
			System.out.println("다시 입력하세요.");
		}
	}
	
}

public void practice9() {
	// 1. 치킨 메뉴들이 들어있는 String 배열 선언, 할당 동시에 초기화
	String[] chickens = {"후라이드", "양념", "파닭", "치즈"};
	
	// 2. 사용자에게 치킨 메뉴 입력받기
	Scanner sc = new Scanner(System.in);
	
	System.out.print("치킨 이름을 입력하세요 : ");
	String menu = sc.nextLine();
	
	// 3. 반복문을 통해 배열의 0번 인덱스부터 마지막 인덱스까지 접근하여
	//    사용자가 입력한 메뉴와 동일한 메뉴가 있는지 확인
	int i = 0;
	for( ; i < chickens.length; i++) {
		if(chickens[i].equals(menu)) { // 사용자가 입력한 메뉴와 동일한 메뉴일 경우
			break;       // 반복문을 빠져나감
		}
	}
	
	// 반복문을 모두 돌지 않고 break를 만난 경우 사용자가 입력한 메뉴가 존재
	if(i < chickens.length) { 
		System.out.println(menu + "치킨 배달 가능");
	}else {
		System.out.println(menu + "치킨은 없는 메뉴입니다.");
	}
}

public void practice10() {
	// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
	int[] arr = new int[10];
	
	// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화한 후 출력
	for(int i = 0; i < arr.length; i++) {
		arr[i] = (int)(Math.random() * 10 + 1);
		System.out.print(arr[i] + " ");
	}
}
}
*/