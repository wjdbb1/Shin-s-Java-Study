package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
   /*
    * Do while �� [�ʱ��] do { ������ �ڵ�; [������ ; �б⹮;] } while(���ǽ�);
    */

   public void method1() {
      int num = 0;
      do {
         System.out.println(num);
      } while (num != 0);
      // ->while�� �ٸ� ���� ������ ���� �ʾƵ� �ݵ�� �� ���� ���� �����ϰ� ������ �˻��Ѵٴ� ��

   }

   public void method2() {
      // 1���� 5���� ���
      int i = 1;
      do {
         System.out.print(i + " ");
         i++;
      } while (i <= 5);
   }

   public void method3() {
      // 1���� ������(17~24)������ �� ���ϱ�
      int random = (int) (Math.random() * 8) + 17;
      System.out.println("���� �� : " + random);

      int sum = 0;
      int i = 1;

      do {
         sum += i;
         i++;

      } while (i <= random);
      System.out.println("1���� " + random + "������ �� : " + sum);

   }

   public void method4() {
      // ���ڿ� �Է¹޾� �ϳ��� ���ھ� ����ϱ�
      Scanner sc = new Scanner(System.in);
      System.out.print("���ڿ� �Է� : ");
      String str = sc.nextLine();

      int i = 0;
      do {
         System.out.println(str.charAt(i));
         i++;
      } while (i < str.length());
   }// ���࿡ �� ���ڿ��� �Է� ���� ��� ���� �߻� -->
   //do while���� �ϴ� ���� �� ������ Ȯ���ϹǷ�
}