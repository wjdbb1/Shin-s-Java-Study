package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.medel.vo.Account;
import com.kh.chap02_encapsulation.medel.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student st = new Student();
		/*
		 * st.name = "신정현"; st.kor = 100; st.math = 90; st.eng = 80;
		 */
		// public -> private로 변경함으로써 정보 은닉
		// 위와 같이 직접 접근이 안된다면 어떻게 값을 넣어주어야 할까?
		// 간접적으로 접근할 수 있도록 setter/getter 메소드를 이용해야함

		// 간접접근 ---- 객체에 값을 설정하려면 setter를 사용해야함

		st.setName("신정현");
		st.setKor(100);
		st.setMath(90);
		st.setEng(80);

		// 개게의 값 알아오기 -> getter
		System.out.println("이름 : " + st.getName());
		System.out.println("국어 점수 : " + st.getKor());
		System.out.println("수학 점수 : " + st.getMath());
		System.out.println("영어 점수 : " + st.getEng());

		// 한번에 출력하기 위해 information()이라는 메소드를 만들자
		System.out.println(st.information());
		// ----------------------------------------------------------------------------
		// Account 클래스로 객체 생성
		Account ac = new Account();

		// 잔액조회
		ac.displayBalance();

		// 100만원 입금
		ac.deposit(1000000);
		ac.displayBalance();

		// 50만원 인출
		ac.withdraw(500000);
		ac.displayBalance();

		// 갑자기 account객체의 입출금 기능을 무시하고 잔액을 출금한다면
		// ac.balance -=1000000; //캡슐화 적용 시 직접 접근 불가능
		ac.displayBalance();

		// 현재 필드들은 public 이라는 접근 제한자로 설정되어 있음
		// 즉, 다른 외부에서 직접 그 변수에 접근해서 값을 수정하거나 조회하는 것이 가능
		// public -> private로 캡슐화를 적용해야 함 정상적인 계좌 관리가 가능해진다.

	}

}
