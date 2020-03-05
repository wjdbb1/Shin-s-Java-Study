package com.kh.variable;

import java.util.Scanner;

public class B_keyboardInput {
	// java.util 패키지에서 제공하는 클래스를 이용한 키보드 입력 테스트

	public void inputScanner1() {
		// java.util.Scanner 라는 클래스를 이용

		Scanner sc = new Scanner(System.in);

		// 사용자의 정보를 입력받고 그 입력받은 정보를 출력하는 프로그램 만들기
		System.out.print("당신의 이름은 무엇입니까 : ");
		// String name = sc.next(); //-> 사용자가 입력한 값 중 공백 이전의 값만 읽어옴
		String name = sc.nextLine(); // -> 사용자가 입력한 한 줄에 대한 모든 정보를 읽어옴

		System.out.print("당신의 나이는 몇살입니까 :");
		int age = sc.nextInt(); // -> 사용자가 입력한 정수에 대한 값 읽어오기

		System.out.print("당신의 키는 몇입니까(소수점 첫째 자리까지 입력) : ");
		double height = sc.nextDouble(); // -> 사용자가 입력한 실수에 대한 값 읽어오기

		// 사용자가 입력한 값 출력
		System.out.println(name + "님은" + age + "세이며, 키는 " + height + "cm 입니다");

	}

	public void inputScanner2() {
		// Scanner에서 발생할 수 있는 오류!!!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); //버퍼에 남은 엔터를 읽어와 버리는 용도
		
		
		/*	sc.nextLine()매소드를 제외한 다른 메소드는 엔터를 읽어오지 않고
		 * 	해당 값만 읽어오므로 사용자가 입력한 '엔터'가 버터에 남아있음
		 * 
		 * 나이를 입력하고 엔터를 치면 sc.nextInt()는 숫자만 가져가고
		 * 엔터는 버퍼에 남아있는 상태
		 * 
		 * sc.nextLine()은 버퍼에 남아있는 나머지 엔터를 자동으로 읽어와 입력이 끝났다고 인지
		 * address에는 빈 값이 들어감
		 * 
		 * (엔터 다음에다음에 XXX ZZZZ = sc.nextLine()이 오려면 전에 무조건 sc.nextLine();를 써줘야함)
		 * 
		 * */
		
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		
	}
	
	public void inputScanner3() {
	//변수선언
	String name;
	int age;
	char gender;
	double height;
	
	
	//키보드 입력을 위해 Scanner생성
	
	Scanner sc = new Scanner(System.in);
	
	//그 밖에 byte, boolean 등의 기본 자료형을 입력받을 때도 마찬가지로 nextXXX()메소드 사용
	System.out.print("이름 : ");
	name = sc.nextLine();
	
	System.out.print("성별(M/F) : ");
	//gender = sc.nextChar(); nextChar()메소드는 존재하지 않음
	gender = sc.nextLine().charAt(0);
	//sc.nextLine () 결과인 String 클래스 안에 있는 charAt()이라는 메소드를 한번 더 이용
	
	//charAt은 문자열에서 지정된 위치에 있는 문자 하나만을 뽑아내는 기능을 함
	// 이 때 위치를 지정하는 방법은 문자열 제일 앞의 문자부터 0으로 시작해서 1씩 증가하면 해당 위치가 됨
	
	
	System.out.print("나이 : ");
	age = sc.nextInt();
	
	System.out.print("키 : ");
	height = sc.nextDouble();
	
	System.out.println(name + "님의 개인 정보");
	System.out.println("성별 : " + gender);
	System.out.println("나이 : " + age);
	System.out.println("키 : " + height);

}
}