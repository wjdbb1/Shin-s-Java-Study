package com.kh.chap01_Abstraction.run;

import com.kh.chap01_Abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 변수(하나의 자료형, 하나의 값)만을 가지고 프로그래밍 한다면?
		// 학생에 대한 성적관리
		String name1 = "신정현";
		int kor1 = 100;
		int math1 = 99;
		int eng1 = 98;
		// => 수백명의 학생이 있다면 변수의 개수가 너무 늘어나 관리하기 어려움

		// 배열(하나의 자료형, 여러개의 값)을 가지고 프로그래밍 한다면?
		String[] name = { "신정현", "우별림" };
		int[] kor = { 100, 70 };
		int[] math = { 99, 80 };
		int[] eng = { 98, 90 };

		// 만약 한명이 전학을 가게 된다면?
		// 해당 학생의 정보를 지우기 위해 일일히 해당 학생의 인덱스를 찾아
		// 각각의 배열에서 지워야함 => 실수가 있으면 큰 문제 발생

		// 속성 + 기능 => 클래스(틀)을 만들어서 객체를 찍어내자!
		// student라는 클래스(틀)를 만들고 자바에서 객체 형태로 만들기 위해서는
		// new 연산자를 통해 heap영역에 객체를 생성함
		Student shin = new Student();
		shin.name = "신정현";
		shin.kor = 100;
		shin.math = 99;
		shin.eng = 98;
		// -> 직접 접근을 통해 값 초기화

		System.out.println(
				shin.name + "님의 국어 점수는 " + shin.kor + "이고, 수학점수는 " + shin.math + "이며, 영어점수는 " + shin.eng + "입니다.");

		// -> 직접 접근을 통해 값 가져오기

		Student dong = new Student();
		dong.name = "홍길동";
		dong.kor = 30;
		dong.math = 40;
		dong.eng = 50;

		System.out.println(
				dong.name + "님의 국어 점수는 " + dong.kor + "이고, 수학점수는 " + dong.math + "이며, 영어점수는 " + dong.eng + "입니다.");
		// -> 해당 객체를 관리하기 위해서는 lim, dong 등의 레퍼런스 변수를 알면 된다.
		// *** 여기서 발생할 수 있는 문제 ***
		// 직접 접근해서 작업하면 클래스 외부에서 값 변경이 가능하므로
		// 값의 변질이 일어날 수 있음 -> 캡슐화 작업이 필요함
		
		
		
		
		
		
	}

}
