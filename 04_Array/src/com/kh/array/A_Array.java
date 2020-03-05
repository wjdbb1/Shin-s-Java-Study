package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/*
	 * 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것 저장된 값마다 인덱스가 지정되며 인덱스는 0부터 시작함
	 */

	public void method1() {
		/*
		 * 1. 배열 선언 자료형[] 배열명; 자료형 배열명[];
		 * 
		 */

		int[] arr; // -> 자료형 뒤에 대괄호가 있는 편이 바로 배열임을 알 수 있음
		// int arr[];

		/*
		 * 2. 배열 할당 배열명 = new 자료형 [배열크기];
		 */

		arr = new int[5]; // -> 배열에 5개의 int형 정수를 담을 수 있다

		// 선언과 할당을 동시에 처리 가능
		int[] arr1 = new int[5];

		/*
		 * 3. 초기화 배열명[인덱스] = 값;
		 */
		arr1[0] = 0;
		arr1[1] = 0;
		arr1[2] = 0;
		arr1[3] = 0;
		arr1[4] = 0;
		// arr1[5] = 0; -> 인덱스는 0부터 할당한 크기 -1 까지 존재

		// 배열의 장점 : 대입을 할 때 인덱스의 위치나 값이 일정한 규칙이 있다면 반복문 사용 가능
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;

		}

		// 출력 => for문

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}

	public void method2() {
		// 변수 선언
		int i; // 메모리 공간에 값을 담을 박스를 만드는 과정
				// 이 때 메모리의 stack이라는 영역에 할당

		// 배열 선언
		int[] iArr; // 변수 선언과 동일하게 stack영역에 공간이 생김
					// 다만 값을 담는 용도가 아니라 주소 값을 보관할 공간임
					// 값을 담는 변수는 그냥 변수, 주소 값을 담는 변수는 레퍼런스(참조) 변수

		char cArr[]; // 기본자료형(boolean, char, byte, short, int, long, float, double
						// 으로 선언 된 애는 -> 변수, 그외는 -> 레퍼런스

		// 배열 할당
		// iArr=new int[]; //반드시 할당할 크기 지정해주어야 함
		iArr = new int[5];
		cArr = new char[10];
		// new 연산자를 통해 배열을 할당하면 메모리의 heap영역에 해당 배열의 크기만큼의
		// 공간이 만들어 지고 그 공간의 주소값을 stack 영역의 레퍼런스 변수에 저장

		// ==> 따라서 해당 배열에 값을 넣거나 수정할 때 해당 주소를 참조해서 사용

		System.out.println("iArr : " + iArr);
		System.out.println("cArr : " + cArr);

		// heap 영역의 메모리에는 변수를 만든다거나 직접적으로 접근을 하지 못하는 영역k
		// 주소를 통해서만 찾아갈 수 있음
	}

	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// 여기까지는 배열을 선언하고 할당한 것으로 아직 실제 값을 넣지 않음(초기화x)

		// 해당 인덱스들을 출력하면어떤 값들이 나오는지 for문을 이용한 출력문으로 확인
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);

		}
		System.out.println("===========================");

		for (int i = 0; i < iArr.length; i++)

		{
			System.out.println(iArr[i]);

		}

		/*
		 * int num; System.out.println(num);
		 */

		// 지역 변수와 달리 초기화를 하지 않아도 오류 없이 값이 출력 됨
		// 배열은 따로 초기화하지 않을 시 JVM이 지정한 기본 값으로 초기화

		// 왜냐하면 heap 영역은 값이 없는 공간이 존재할 수 없음

		// 문자열의 길이를 알기 위해 length() 라는 메소드를 이용
		// 하지만 배열의 길이를 알기 위해서는 메소드가 아닌 변수로(lentgh)로 이용

		System.out.println("iArr의 길이 : " + iArr.length);
		System.out.println("cArr의 길이 : " + cArr.length);
	}

	public void method4() {
		// 사용자에게 입력받은 정수로 배열의 길이 지정
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이 : ");
		int size = sc.nextInt();
		// double형 배열 dArr을 사용자가 입력한 size만큼 할당
		double[] dArr = new double[size];

		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length);
		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}

	}

	public void method5() {
		int[] iArr = new int[5];
		int num = 2;
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = num; // 2 4 6 8 10
			num += 2;

		}
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		// hashCode() : 주소값의 10진수 값
		System.out.println("iArr의 길이 : " + iArr.length);

		// iArr[5] = 12 ;
		// 배열의 단점 : 한번 지정한 크기는 변경이 불가능함

		// 크기를 바꾸려면 다시 배열 크기를 지정해서 할당해주어야 함
		iArr = new int[10];
		// 10이라는 크기의 배열을 heap영역에 새로 생성하고
		// 새로 생성한 주소 값을 iArr이라는 레퍼런스 변수에 덮어쓴다

		System.out.println("===== 변경 후의 iArr =====");
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		// hashCode() : 주소값의 10진수 값
		System.out.println("iArr의 길이 : " + iArr.length);

		// 주소값이 변경 된 것을 알 수 있음
		// 그러면 기존에 참조하고 있던 연결이 끊기고 새로운곳을 참고하므로
		// 예전 배열은?? ==> 어느 곳에도 참조되지않고 heap영역을 둥둥 떠다니는 상태
		// ==>일정 시간이 지나면 가비지 컬렉터가 더 이상 쓸모 없다고 판단하여 지움(자동 메모리 관리)

		// 지금 할당 된 배열을 지우려면?
		iArr = null;
		// 레퍼런스 변수에 null 값이 들어가게 되면 주소값이 null로 바뀌므로
		// heap에 있는 공간과의 연결 고리가 끊어지고 해당 공간도 나중에 가비지 컬렉터가 삭제함

		System.out.println("===== 삭제 후의 iArr =====");
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		// -> 참조값이 없기때문에 아예 출력이 불가능 하기때문에 오류가남
		// hashCode() : 주소값의 10진수 값
		System.out.println("iArr의 길이 : " + iArr.length);

		// NullPointerException 발생
		// 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을 때 발생

	}

	public void method6() {
		// 배열 선언 및 할당과 동시에 초기화

		int[] iArr = { 1, 2, 3, 4 };

		// 중괄호 블럭을 사용하는 경우 new연산자를 사용하지 않아도 되며,
		// 값의 갯수만큼 자동으로 크기가 할당

		int[] iArr2 = new int[] { 1, 2, 3, 4 };

		// iArr이랑 iArr2랑 들어가 있는 값이 같으므로 한번 같은지 확인해보자
		System.out.println(iArr == iArr2);
		// ==> 레퍼런스 변수들의 주소값을 비교했으므로
		// 각각 heap영역에 할당되어 있는 다른 배열이므로 주소는 같을 수 없음

	}

	public void method7() {
		String[] sArr = new String[5];

		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]); // 문자열 배열은 기본 값 null
		}
		// 0번 인덱스부터 마지막 인덱스 까지 반복하여
		// 사용자에게 문자열을 입력 받고 해당 인덱스에 사용자가 입력한 값을 넣어
		// 잘 입력되었는지 출력해 보기

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sArr.length; i++) {
			System.out.print("문자열 입력 : ");
			sArr[i] = sc.nextLine();
		}
		// 잘 입력되었는지 확인(출력)

		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]);

		}
	}

	public void method8() {
		// 사용자에게 5명의 키의 정보를 입력받아 배열에 담아두고
		// 반복문을 통해 5명의 키의 총합, 평균 구하기

		Scanner sc = new Scanner(System.in);

		double[] height = new double[5];

		double sum = 0;
		for (int i = 0; i < height.length; i++) {
			System.out.print("키 입력 : ");
			height[i] = sc.nextDouble();
			sum += height[i];

		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / height.length);
	}

	public void method9() {
		// 사용자에게 한개의 정수를 입력 받고 그 크기만큼의 배열을 만들어
		// 1~100사이의 랜덤 값 발생시켜서 담고 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// 랜덤 값 발생
		// 방법 1. java.lang.Math 클래스의 random() 메소드
		// 방법 2. java.util.Random 클래스

		Random ran = new Random();
		System.out.println("int 범위의 난수  : " + ran.nextInt());// 난수 = 랜덤값
		System.out.println("1 ~ 100범위의 난수 : " + (ran.nextInt(100) + 1));

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void method10() {
		// 최대값 최소값 구하기
		Scanner sc = new Scanner(System.in);
		// 5개의 값을 저장할 수 있는 정수형 배열 선언 및 할당

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 입력 : ");
			arr[i] = sc.nextInt();

		}

		int max = arr[0];
		int min = arr[0];

		// 1번 인덱스부터 배열 끝까지 반복하며 값 비교하기
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
			if (min > arr[i]) {
				min = arr[i];

			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);

	}
}
