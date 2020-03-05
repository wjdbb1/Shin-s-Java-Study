package com.kh.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");

		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		String result = "";
		if (num == 1) {
			result = "입력";
		}

		if (num == 2) {
			result = "수정";

		}
		if (num == 3) {
			result = "조회";
		}
		if (num == 4) {
			result = "삭제";

		}
		if (num == 9) {
			System.out.println("프로그램이 종료됩니다.");
			return;
		}
		System.out.println(result + " 메뉴 입니다.");
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력하세요: ");
		int num = sc.nextInt();

		/*
		 * if (num % 2 == 0 && num > 0) { System.out.println("짝수다"); } if (num % 2 != 0
		 * && num > 0) { System.out.println("홀수다"); } if (num < 0) {
		 * System.out.println("양수만 입력해주세요");
		 */

		/*
		 * if (num % 2 == 0 && num > 0) { System.out.println("짝수다"); } else if (num % 2
		 * != 0 && num > 0) { System.out.println("홀수다"); } else {
		 * System.out.println("양수만 입력해주세요"); }
		 */

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = (kor + eng + mat) / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다 !");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {

		/*
		 * if (month == 1 || month == 2 || month == 12) { season = "겨울"; } else if
		 * (month >= 3 && month <= 5) { season = "봄"; } else if (month >= 6 && month <=
		 * 8) { season = "여름"; } else if (month >= 9 && month <= 11) { season = "가을"; }
		 * else { season = "해당하는 계절이 없습니다."; }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;

		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호  : ");
		String pw = sc.nextLine();

		if (id.equals("sjh")) {
			if (pw.equals("qwe11")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");

		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();

		if (grade.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글작성, 댓글작성, 게시글조회");

		} else if (grade.equals("회원")) {
			System.out.println("게시글작성, 게시글조회, 댓글작성");

		} else if (grade.equals("비회원")) {
			System.out.println("게시글조회");

		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)을 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);

		String result = "";

		if (bmi >= 30) {
			result = "고도비만";

		} else if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi <= 18.5) {
			result = "정상 체중";
		} else if (bmi <= 23) {
			result = "과체중";
		} else if (bmi < 25) {
			result = "고도 비만";
		}
		System.out.println(result);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		sc.nextLine();
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		char op = sc.nextLine().charAt(0);

		int result = 0;

		if (num1 > 0 && num2 > 0) {
			if (op == '+') {
				result = num1 + num2;

			} else if (op == '-') {
				result = num1 - num2;

			} else if (op == '*') {
				result = num1 * num2;

			} else if (op == '/') {
				result = num1 / num2;

			} else if (op == '%') {
				result = num1 % num2;
			}
		}

		System.out.printf("%d %c %d = %d", num1, op, num2, result);

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();

		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();

		System.out.print("출석 회수 : ");
		int at = sc.nextInt();

		double sum = score1 * 0.2 + score2 * 0.3 + score3 * 0.3 + at;

		System.out.println("==========결과==========");
		if (sum >= 70 && at >= (20 * 0.7)) {

			System.out.println("중간 고사 점수 (20) : " + (double) score1 * 0.2);
			System.out.println("기말 고사 점수 (30) : " + (double) score2 * 0.3);
			System.out.println("과제 점수 (30) : " + (double) score3 * 0.3);
			System.out.println("출석회수 (20) : " + (double) at);
			System.out.println("총점 : " + (double) sum);
			System.out.println("PASS");

		} else if (at < 20 * 0.7 && sum < 70) {

			System.out.println("FAIL [출석 횟수 부족] (" + at + "/20)");
			System.out.println("FAIL [점수 미달] (총점 " + (double) sum + ")");

		} else if (at < 20 * 0.7) {
			System.out.println("FAIL [출석 횟수 부족] (" + at + "/20)");
		} else {

			System.out.println("FAIL [점수 미달] (총점 " + (double) sum + ")");

		}
	}

	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			practice1();
			break;

		case 2:
			practice2();
			break;

		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;

		default:
			System.out.println("잘못 입력하였습니다.");

		}
	}

}

/*
public void practice1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. 입력");
	System.out.println("2. 수정");
	System.out.println("3. 조회");
	System.out.println("4. 삭제");
	System.out.println("9. 종료");
	
	System.out.print("메뉴 번호를 입력하세요 : ");
	int menu = sc.nextInt();
	
	// 1. if-else if문 이용하는 방법
	
	
	if(menu == 1) {
		System.out.println("입력 메뉴입니다.");
	}else if(menu == 2) {
		System.out.println("수정 메뉴입니다.");
	}else if(menu == 3) {
		System.out.println("조회 메뉴입니다.");
	}else if(menu == 4) {
		System.out.println("삭제 메뉴입니다.");
	}else if(menu == 9) {
		System.out.println("프로그램이 종료됩니다.");
	}else {
		System.out.println("잘못입력하셨습니다.");
	}
	
	
	// 2. switch문 이용하는 방법
	
	switch(menu) {
	case 1 : System.out.println("입력 메뉴입니다."); break;
	case 2 : System.out.println("수정 메뉴입니다."); break;
	case 3 : System.out.println("조회 메뉴입니다."); break;
	case 4 : System.out.println("삭제 메뉴입니다."); break;
	case 9 : System.out.println("프로그램이 종료됩니다."); break;
	default : System.out.println("잘못입력하셨습니다."); break;
	}
	
	
	// 3. switch문 이용할 때 String 변수 이용하는 방법
	String str = null;
	
	switch(menu) {
	case 1 : str = "입력"; break;
	case 2 : str = "수정"; break;
	case 3 : str = "조회"; break;
	case 4 : str = "삭제"; break;
	case 9 : System.out.println("프로그램이 종료됩니다."); return;
	default : System.out.println("잘못입력하셨습니다."); return;
	}
	
	System.out.println(str + " 메뉴입니다.");
	
}

public void practice2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자를 한 개 입력하세요 : ");
	int num = sc.nextInt();
	
	// 1. 중첩 if문
	if(num > 0) {
		if(num % 2 == 0) {
			System.out.println("짝수다.");
		}else {
			System.out.println("홀수다.");
		}
	}else {
		System.out.println("양수만 입력해주세요.");
	}
	
	// 2. if-else if-else 문
	if(num <= 0) {
		System.out.println("양수만 입력해주세요.");
	}else if(num % 2 == 0) {
		System.out.println("짝수다.");
	}else {
		System.out.println("홀수다.");
	}
}

public void practice3() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어 점수 : ");
	int kor = sc.nextInt();
	System.out.print("수학 점수 : ");
	int math = sc.nextInt();
	System.out.print("영어 점수 : ");
	int eng = sc.nextInt();
	
	int sum = kor + math + eng;
	double avg = sum / 3.0;
	
	if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다. 합격입니다!");
	} else {
		System.out.println("불합격입니다.");
	}
	
}

public void practice4() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("1 ~ 12 사이의 정수 입력 : ");
	int num = sc.nextInt();
	
	// 1. 이런 방식
	switch(num) {
	case 12:
	case 1:
	case 2:
			System.out.println(num + "월은 겨울입니다.");
			break;
	case 3:
	case 4:
	case 5: 
			System.out.println(num + "월은 봄입니다.");
			break;
	case 6:
	case 7:
	case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
	case 9:
	case 10:
	case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
	default : 
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			break;
	}
	
	// 2. String 변수 사용해서 출력문은 한번만
	String season = "";
	
	switch(num) {
	case 12:
	case 1:
	case 2:
		season = "겨울";
		break;
	case 3:
	case 4:
	case 5: 
		season = "봄";
		break;
	case 6:
	case 7:
	case 8:
		season = "여름";
		break;
	case 9:
	case 10:
	case 11:
		season = "가을";
		break;
	default : 
		season = "잘못 입력된 달";
		break;
	}
	
	System.out.println(num + "월은 " + season + "입니다.");
}

public void practice5() {
	
	String userId = "byeollim";
	String userPwd = "1234";
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("아이디 : ");
	String id = sc.nextLine();
	
	System.out.print("비밀번호 : ");
	String pwd = sc.nextLine();
	
	if(userId.equals(id) && userPwd.equals(pwd)) {
		System.out.println("로그인 성공");
	}else if(!userId.equals(id)) {
		System.out.println("아이디가 틀렸습니다.");
	}else {
		System.out.println("비밀번호가 틀렸습니다.");
	}
	
}

public void practice6() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("권한을 확인하고자 하는 회원 등급 : ");
	
	switch(sc.nextLine()) { // 이렇게 바로 입력해서 비교할 수도..
	case "관리자" : System.out.println("회원관리, 게시글 관리");
	case "회원"  : System.out.println("게시글 작성, 댓글 작성");
	case "비회원" : System.out.println("게시글 조회"); break; // 여기서 break해야 default문까지 넘어가지 않는다.
	default : System.out.println("잘못 입력하셨습니다."); break;
	}
	
}

public void practice7() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("키(m)를 입력해주세요 : ");
	double height = sc.nextDouble();
	
	System.out.print("몸무게(kg)를 입력해주세요 : ");
	double weight = sc.nextDouble();
	
	double bmi = weight / (height * height);
	
	System.out.println("BMI 지수 : " + bmi);
	
	if(bmi < 18.5) {
		System.out.println("저체중");
	}else if(bmi < 23) {
		System.out.println("정상 체중");
	}else if(bmi < 25) {
		System.out.println("과체중");
	}else {
		System.out.println("비만");
	}
	
}

public void practice8() {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("피연산자1 입력 : ");
	int num1 = sc.nextInt();
	
	System.out.print("피연산자2 입력 : ");
	int num2 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("연산자를 입력(+,-,*,/,%) : ");
	char ch = sc.nextLine().charAt(0);
	
	int result=0;
	
	if(num1 > 0 && num2 > 0) {
		
		switch(ch) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		case '%': result = num1 % num2; break;
		default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
		}
		
	}else {
		System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); return;
	}
	
	System.out.printf("%d %s %d = %d", num1, ch, num2, result);

}

public void practice9() {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("중간 고사 점수 : ");
	int midTerm = sc.nextInt();

	System.out.print("기말 고사 점수 : ");
	int finalTerm = sc.nextInt();

	System.out.print("과제  점수 : ");
	int homework = sc.nextInt();

	System.out.print("출석 횟수 : ");
	int attendance = sc.nextInt();
	
	double m = midTerm * 0.2;
	double f = finalTerm * 0.3;
	double hw = homework * 0.3;
	double at = attendance;
	
	double sum = m + f + hw + at;
	
	System.out.println("===========결과==========");
	
	if(sum >= 70 && at >= 20 * 0.7) {
		System.out.println("중간 고사 점수(20) : " + m);
		System.out.println("기말 고사 점수(30) : " + f);
		System.out.println("과제 점수       (30) : " + hw);
		System.out.println("출석 점수       (20) : " + at);
		
		System.out.println("총점 : " + sum);
		System.out.println("PASS");
	}else {
		if(sum >= 70) {
			System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)");
		}else if(at >= 20 * 0.7){
			System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
		}else {
			System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)");
			System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
		}
	}
	
}

public void practice10() {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("실행할 기능을 선택하세요.");
	System.out.println("1. 메뉴 출력");
	System.out.println("2. 짝수/홀수");
	System.out.println("3. 합격/불합격");
	System.out.println("4. 계절");
	System.out.println("5. 로그인");
	System.out.println("6. 권한 확인");
	System.out.println("7. BMI");
	System.out.println("8. 계산기");
	System.out.println("9. Pass/Fail");

	System.out.print("선택 : ");
	int menu = sc.nextInt();
	
	switch (menu) { 

	case 1:	practice1(); break;
	case 2:	practice2(); break;
	case 3:	practice3(); break;
	case 4:	practice4(); break;
	case 5:	practice5(); break;
	case 6:	practice6(); break;
	case 7:	practice7(); break;
	case 8:	practice8(); break;
	case 9:	practice9(); break;
	default:
		System.out.println("잘못 입력하셨습니다.");
	}
	
}

}
*/
