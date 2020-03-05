package com.kh.chap02_encapsulation.medel.vo;

public class Student {
//	필드부
	// 접근제한자[예약어] 자료형 변수명;

	private String name;
	private int kor;
	private int math;
	private int eng;

	// 생성자부

	// 메소드부 : 기능을 구현하는 부분
	// 접근제한자 반환형 메소드([매개변수])

	// setter
	// 데이터(필드)들을 기록 및 수정하는 기능을 하는 메소드
	// 이 때 메소드는 외부 접근 가능하도록 해야 하므로 public 접근 제한자 사용

	// setter 메소드명은 낙타등 표기법을 이용하여 setXXX로 통상 지어줌
	// ex) setName, setKor, setMath, ...
	// 매개변수 명은 아무렇게나 지정 가능하지만 관례상 필드명과 동일하게 사용
	public void setName(String name) { // 이름을 변경해주는 메소드
		// name = name;
		// -> 매개변수의 name = 매개변수의 name;
		// {} 구연에서는 해당 지역에서 만들어진 변수가 우선 순위가 높기 때문
		// 우리가 원하는건 필드의 name = 매개변수의 name
		this.name = name; // -> this 에는 해당 객체의 주소값이 담겨있음
	}

	public void setKor(int kor) { // 국어 점수를 변경해주는 메소드
		this.kor = kor;
	}

	public void setMath(int math) { // 수학 점수 변경해주는 메소드
		this.math = math;
	}

	public void setEng(int eng) { // 영어 점수 변경해주는 메소드
		this.eng = eng;
	}

	// getter
	// 값을 반환해주는 기능을 하는 메소드
	// getter 메소드명은 낙타등 표기법을 이용하여 getXXX로 통상 지어줌
	// ex) getName, getKor, getMath ...

	// getter 메소드는 단지 해당 필드 값을 반환해 주는 메소드로 해당 메소드로 전달 되는 값이 없기 때문에 매개변수는 작성할 필요가 없음
	// 단 반환을 해줘야 하므로 내가 반환하고자 하는 값의 자료형을 반환형에 기재

	public String getName() { // 이름을 반환하는 메소드
		return name; // 반환형이 있을 시 반드시 return 구문에 해당 반환형의 값 기재

	}

	public int getKor() { // 국어점수를 반환하는 메소드
		return kor;
	}

	public int getMath() { // 수학점수를 반환하는 메소드
		return math;

	}

	public int getEng() { // 영어점수를 반환하는 메소드
		return eng;
	}

	// 모든 필드 값을 다 합친 문자열을 반환하는 메소드
	public String information() {
		return "이름 : " + name + ", 국어점수 : " + kor + ", 수학점수 : " + math + ",영어점수 : " + eng;

	}

}
