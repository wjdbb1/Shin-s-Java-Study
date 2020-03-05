package com.kh.chap02_encapsulation.medel.vo;

import java.util.Scanner;

public class Account { // 계좌
	// 필드부 -> 캡슐화 하지않고 먼저 테스트

	/*public String name = "신정현";
	public String phone = "010-5721-1821";
	public String pwd = "qlqjs123";
	public int bankCode = 3030;
	public int balance = 0;*/
	

	private String name = "신정현";
	private String phone = "010-5721-1821";
	private String pwd = "qlqjs123";
	private int bankCode = 3030;
	private int balance = 0;
	
	// 생성자부 : 클래스명과 동일하게 작성
	public Account() {
	}
	// ->객체를 생성하기 위한 일종의 메소드로 뒤에 자세히 다룰 것

	// 메소드부
	// 입금기능을 위한 메소드 -> setter처럼
	public void deposit(int money) {
		// 메소드명 뒤의 괄호에는 입금하고자 하는 금액이 매개변수로 전달되어 올 예정

		if (money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");

		} else {
			System.out.println("잘못 된 금액이 입력되었습니다.");
		}
	}

	// 출금을 위한 메소드
	public void withdraw(int money) {
		// 출금하고자 하는 금액이 매개변수로 전달되어 옴
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호를 입력해주세요 : ");
		String str = sc.nextLine();

		if (str.equals(pwd)) { // 비밀번호가 일치할 경우
			if (money <= balance) { // 출금하고자 하는 금액이 잔액보다 작거나 같은 경우
				balance -= money;
				System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
			} else {
				System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
			}

		} else { // 비밀번호가 일치하는 경우
			System.out.println("비밀번호가 틀렸습니다.");
		}

	}

	// 잔액조회를 위한 메소드
	public void displayBalance() {
		System.out.println(name + "님 계좌의 잔액은" + balance + "원 입니다.");

	}

}
