package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
   /*
    * Do while 문 [초기식] do { 실행할 코드; [증감식 ; 분기문;] } while(조건식);
    */

   public void method1() {
      int num = 0;
      do {
         System.out.println(num);
      } while (num != 0);
      // ->while과 다른 점은 조건이 맞지 않아도 반드시 한 번은 수행 먼저하고 조건을 검사한다는 점

   }

   public void method2() {
      // 1부터 5까지 출력
      int i = 1;
      do {
         System.out.print(i + " ");
         i++;
      } while (i <= 5);
   }

   public void method3() {
      // 1부터 랜덤수(17~24)까지의 합 구하기
      int random = (int) (Math.random() * 8) + 17;
      System.out.println("랜덤 수 : " + random);

      int sum = 0;
      int i = 1;

      do {
         sum += i;
         i++;

      } while (i <= random);
      System.out.println("1부터 " + random + "까지의 합 : " + sum);

   }

   public void method4() {
      // 문자열 입력받아 하나의 문자씩 출력하기
      Scanner sc = new Scanner(System.in);
      System.out.print("문자열 입력 : ");
      String str = sc.nextLine();

      int i = 0;
      do {
         System.out.println(str.charAt(i));
         i++;
      } while (i < str.length());
   }// 만약에 빈 문자열을 입력 받은 경우 오류 발생 -->
   //do while문은 일단 실행 후 조건을 확인하므로
}