package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
   /*
    * for(초기식;조건식;증감식){ 실행할 코드
    * 
    * - 초기식 : 반복문이 수행 될 때 단 한번 수행되는 부분 보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 부분
    * 
    * - 조건식 : 반복문이 수행 될 조건을 작성하는 부분 조건식이 true일 경우 해당 코드 실행, false가 되는 순간 반복을 멈춤 보통
    * 초기식에서 사용된 변수를 가지고 조건식을 작성함
    * 
    * - 증감식 : 반복문을 제어하는 변수값을 증감 시키는 부분 증감연산자 (++, --)가 주로 사용됨
    * 
    */

   public void method1() {
      // 안녕하세요 라는 문장을 10번 출력

      for (int i = 1; i <= 10; i++) {
         System.out.println("안녕하세요");
      }

      for (int i = 0; i < 10; i++) { // 초기식과 조건식을 사용하여 반복횟수를 결정함
         System.out.println("안녕하세요");
      }

   }

   public void method2() {
      // 1부터 5까지 출력 1 2 3 4 5
      for (int i = 1; i <= 5; i++) { // 증감식의 i는 단독으로 사용되므로 전위, 후위 상관 없으나 일반적으로 후위 연산자로 작성
         System.out.print(i + " ");
      }

   }

   public void method3() {
      // 5부터 1까지 출력 5 4 3 2 1
      for (int i = 5; i >= 1; i--) {
         System.out.print(i + " ");
      }
   }

   public void method4() {
      // 1부터 10사이의 홀수 출력 1 3 5 7 9
      for (int i = 1; i <= 10; i++) {
         if (i % 2 == 1) { // 홀수인 경우만 출력 되도록
            System.out.print(i + " ");
         }
      }
      for (int i = 1; i <= 10; i += 2) {
         System.out.print(i + " ");
      }

   }

   public void method5() {
      // 1부터 10까지의 정수 합계
      // 1+2+...+9+10

      int sum = 0;
      for (int i = 1; i <= 10; i++) {
         // sum = sum + i;

         sum += i;
      }
      System.out.println(sum);
   }

   public void method6() {
      // 1부터 사용자가 키보드로 입력한 양수까지의 합계

      Scanner sc = new Scanner(System.in);
      System.out.print("양수를 입력하세요 : ");
      int num = sc.nextInt();

      int sum = 0;

      for (int i = 1; i <= num; i++) {

         sum += i;

      }
      System.out.println(sum);
   }

   public void method8() {
      // 구구단 2단 출력하기
      // 2*1=2
      // 2*2=4
      // ...
      // 2*9=18

      for (int i = 1; i <= 9; i++) {
         System.out.println("2 * " + i + " = " + (2 * i));
      }

   }

   public void method9() {
      // 사용자에게 입력받은 수에 해당하는 구구단 출력
      // 단, printf로 출력하기

      Scanner sc = new Scanner(System.in);
      System.out.print("정수 입력 : ");
      int dan = sc.nextInt();

      // 일단 입력된 숫자가 2~9 사이의 숫자가 맞는지 확인(if)
      if (dan >= 2 && dan <= 9) {
         for (int i = 1; i < 10; i++) {
            System.out.printf("%d  * %d = %d\n", dan, i, (dan * i));
         }
      } else {
         System.out.println("1~9사이의 양수를 입력하여야 합니다");
      }

   }

   public void method10() {
      /*
       * 1부터 어떤 랜덤 값(1부터 10사이의 랜덤 값)까지의 합계 구하기 java.lang.Math클래스에서 제공하는 random()메소드를
       * 사용하여 랜덤 값을 발생 시킬 수 있음 *** java.lang 패키지는 import 할 필요가 없음 *** -> 컴파일러에 의해
       * import java.lang.*; 이 생성
       */

      // Math.random() -> 0.0 ~ 0.999999...사이의 랜덤값 발생

      // random() = Math.random() * 10 + 1
      // 0.0 * 10 + 1<= random < 1.0 * 10 + 1 -> 1.0 ~ 10.999999(곱하는 값 = 내가 원하는 범위값,
      // 더하는 값 = 내가 원하는시작값)

      int random = (int) (Math.random() * 10) + 1;

      System.out.println(random);

      // 1부터 random 값 까지의 정수 합계
      int sum = 0;
      for (int i = 1; i <= random; i++) {
         sum += i;
      }
      System.out.println("1부터 " + random + "까지의 합 : " + sum);

   }

   public void method11() {
      // 랜덤 구구단 (2~9사이의 랜덤값을 random 변수에 담아 출력)

      int random = (int) (Math.random() * 8) + 2;

      for (int i = 1; i <= 9; i++) {
         System.out.println(random + " * " + i + " = " + (random * i));
      }

   }

   public void method12() {
      // 사용자에게 두 개의 정수 값 입력받아
      // 작은 수 부터 큰 수 까지의 합계 구하기

      Scanner sc = new Scanner(System.in);

      System.out.print("첫 번째 정수 : ");
      int num1 = sc.nextInt();

      System.out.print("두번째정수 : ");
      int num2 = sc.nextInt();

      // 2, 4 -> 2 3 4
      // 4, 2 -> 2 3 4

      int min = 0; // 입력된 정수 중 작은 값을 저장할 변수
      int max = 0; // 입력 된 정수 중 큰 값을 저장할 변수

      if (num1 > num2) {
         max = num1;
         min = num2;
      } else {
         max = num2;
         min = num1;

      }

      int sum = 0;
      for (int i = min; i <= max; i++) {
         sum += i;
         System.out.print(i + " ");

      }
      System.out.println();
      System.out.println(min + "부터 " + max + "까지의 합 : " + sum);
   }

// ----------------------(중첩반복문)---------------------------------------------------
   public void method13() {
      // 1부터 5까지 출력되는 문장을 3줄 출력하기
      // 1 2 3 4 5
      // 1 2 3 4 5
      // 1 2 3 4 5

      for (int i = 1; i <= 3; i++) { // --> 줄을 컨트롤(외부 for문 - 줄의 개수)

         for (int j = 1; j <= 5; j++) { // --->칸을 컨트롤(내부 for문 - 칸의 개수)
            System.out.print(j + " ");

         }
         System.out.println();// 개행
      }
   }

   public void method14() {
      // 0시 0분~ 23시 59분 출력
      // 시 --> 0시부터 23시까지 증가 -->외부 for문
      // 분 --> 0분부터 59분까지 증가 -->내부 for문

      for (int hour = 0; hour <= 23; hour++) {
         for (int min = 0; min <= 59; min++)
            System.out.println(hour + "시" + min + "분");

      }
   }

   public void method15() {
      // 2단부터 9단까지 출력
      // 단은 2부터 9까지 반복 --> 외부 for문
      // 곱해지는 수는 1부터 9까지 반복 --> 내부 for문

      for (int dan = 2; dan <= 9; dan++) {
         System.out.println("=== " + dan + "단 ===");
         for (int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
         }
         System.out.println(); // 단이 끝날때마다 개행

      }

   }

   public void method16() {
      // ****
      // ****
      // ****
      // ****
      // **** 출력하기

      // 행(줄) 지정 -> 외부for문
      // 열(칸) 지정 -> 내부 for문

      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 4; j++) {
            System.out.print("*");

         }
         System.out.println();

      }

   }

   public void method17() {
      // 1***
      // *2**
      // **3*
      // ***4

      for (int i = 1; i <= 4; i++) {
         for (int j = 1; j <= 4; j++) {

            if (i == j) {
               System.out.print(i);
            } else {
               System.out.print("*");
            }

         }
         System.out.println();
      }
   }
}