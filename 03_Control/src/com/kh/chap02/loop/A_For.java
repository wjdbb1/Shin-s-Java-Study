package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
   /*
    * for(�ʱ��;���ǽ�;������){ ������ �ڵ�
    * 
    * - �ʱ�� : �ݺ����� ���� �� �� �� �ѹ� ����Ǵ� �κ� ���� �ݺ��� �ȿ��� ���� ������ ���� �� �ʱ�ȭ �ϴ� �κ�
    * 
    * - ���ǽ� : �ݺ����� ���� �� ������ �ۼ��ϴ� �κ� ���ǽ��� true�� ��� �ش� �ڵ� ����, false�� �Ǵ� ���� �ݺ��� ���� ����
    * �ʱ�Ŀ��� ���� ������ ������ ���ǽ��� �ۼ���
    * 
    * - ������ : �ݺ����� �����ϴ� �������� ���� ��Ű�� �κ� ���������� (++, --)�� �ַ� ����
    * 
    */

   public void method1() {
      // �ȳ��ϼ��� ��� ������ 10�� ���

      for (int i = 1; i <= 10; i++) {
         System.out.println("�ȳ��ϼ���");
      }

      for (int i = 0; i < 10; i++) { // �ʱ�İ� ���ǽ��� ����Ͽ� �ݺ�Ƚ���� ������
         System.out.println("�ȳ��ϼ���");
      }

   }

   public void method2() {
      // 1���� 5���� ��� 1 2 3 4 5
      for (int i = 1; i <= 5; i++) { // �������� i�� �ܵ����� ���ǹǷ� ����, ���� ��� ������ �Ϲ������� ���� �����ڷ� �ۼ�
         System.out.print(i + " ");
      }

   }

   public void method3() {
      // 5���� 1���� ��� 5 4 3 2 1
      for (int i = 5; i >= 1; i--) {
         System.out.print(i + " ");
      }
   }

   public void method4() {
      // 1���� 10������ Ȧ�� ��� 1 3 5 7 9
      for (int i = 1; i <= 10; i++) {
         if (i % 2 == 1) { // Ȧ���� ��츸 ��� �ǵ���
            System.out.print(i + " ");
         }
      }
      for (int i = 1; i <= 10; i += 2) {
         System.out.print(i + " ");
      }

   }

   public void method5() {
      // 1���� 10������ ���� �հ�
      // 1+2+...+9+10

      int sum = 0;
      for (int i = 1; i <= 10; i++) {
         // sum = sum + i;

         sum += i;
      }
      System.out.println(sum);
   }

   public void method6() {
      // 1���� ����ڰ� Ű����� �Է��� ��������� �հ�

      Scanner sc = new Scanner(System.in);
      System.out.print("����� �Է��ϼ��� : ");
      int num = sc.nextInt();

      int sum = 0;

      for (int i = 1; i <= num; i++) {

         sum += i;

      }
      System.out.println(sum);
   }

   public void method8() {
      // ������ 2�� ����ϱ�
      // 2*1=2
      // 2*2=4
      // ...
      // 2*9=18

      for (int i = 1; i <= 9; i++) {
         System.out.println("2 * " + i + " = " + (2 * i));
      }

   }

   public void method9() {
      // ����ڿ��� �Է¹��� ���� �ش��ϴ� ������ ���
      // ��, printf�� ����ϱ�

      Scanner sc = new Scanner(System.in);
      System.out.print("���� �Է� : ");
      int dan = sc.nextInt();

      // �ϴ� �Էµ� ���ڰ� 2~9 ������ ���ڰ� �´��� Ȯ��(if)
      if (dan >= 2 && dan <= 9) {
         for (int i = 1; i < 10; i++) {
            System.out.printf("%d  * %d = %d\n", dan, i, (dan * i));
         }
      } else {
         System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�");
      }

   }

   public void method10() {
      /*
       * 1���� � ���� ��(1���� 10������ ���� ��)������ �հ� ���ϱ� java.lang.MathŬ�������� �����ϴ� random()�޼ҵ带
       * ����Ͽ� ���� ���� �߻� ��ų �� ���� *** java.lang ��Ű���� import �� �ʿ䰡 ���� *** -> �����Ϸ��� ����
       * import java.lang.*; �� ����
       */

      // Math.random() -> 0.0 ~ 0.999999...������ ������ �߻�

      // random() = Math.random() * 10 + 1
      // 0.0 * 10 + 1<= random < 1.0 * 10 + 1 -> 1.0 ~ 10.999999(���ϴ� �� = ���� ���ϴ� ������,
      // ���ϴ� �� = ���� ���ϴ½��۰�)

      int random = (int) (Math.random() * 10) + 1;

      System.out.println(random);

      // 1���� random �� ������ ���� �հ�
      int sum = 0;
      for (int i = 1; i <= random; i++) {
         sum += i;
      }
      System.out.println("1���� " + random + "������ �� : " + sum);

   }

   public void method11() {
      // ���� ������ (2~9������ �������� random ������ ��� ���)

      int random = (int) (Math.random() * 8) + 2;

      for (int i = 1; i <= 9; i++) {
         System.out.println(random + " * " + i + " = " + (random * i));
      }

   }

   public void method12() {
      // ����ڿ��� �� ���� ���� �� �Է¹޾�
      // ���� �� ���� ū �� ������ �հ� ���ϱ�

      Scanner sc = new Scanner(System.in);

      System.out.print("ù ��° ���� : ");
      int num1 = sc.nextInt();

      System.out.print("�ι�°���� : ");
      int num2 = sc.nextInt();

      // 2, 4 -> 2 3 4
      // 4, 2 -> 2 3 4

      int min = 0; // �Էµ� ���� �� ���� ���� ������ ����
      int max = 0; // �Է� �� ���� �� ū ���� ������ ����

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
      System.out.println(min + "���� " + max + "������ �� : " + sum);
   }

// ----------------------(��ø�ݺ���)---------------------------------------------------
   public void method13() {
      // 1���� 5���� ��µǴ� ������ 3�� ����ϱ�
      // 1 2 3 4 5
      // 1 2 3 4 5
      // 1 2 3 4 5

      for (int i = 1; i <= 3; i++) { // --> ���� ��Ʈ��(�ܺ� for�� - ���� ����)

         for (int j = 1; j <= 5; j++) { // --->ĭ�� ��Ʈ��(���� for�� - ĭ�� ����)
            System.out.print(j + " ");

         }
         System.out.println();// ����
      }
   }

   public void method14() {
      // 0�� 0��~ 23�� 59�� ���
      // �� --> 0�ú��� 23�ñ��� ���� -->�ܺ� for��
      // �� --> 0�к��� 59�б��� ���� -->���� for��

      for (int hour = 0; hour <= 23; hour++) {
         for (int min = 0; min <= 59; min++)
            System.out.println(hour + "��" + min + "��");

      }
   }

   public void method15() {
      // 2�ܺ��� 9�ܱ��� ���
      // ���� 2���� 9���� �ݺ� --> �ܺ� for��
      // �������� ���� 1���� 9���� �ݺ� --> ���� for��

      for (int dan = 2; dan <= 9; dan++) {
         System.out.println("=== " + dan + "�� ===");
         for (int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
         }
         System.out.println(); // ���� ���������� ����

      }

   }

   public void method16() {
      // ****
      // ****
      // ****
      // ****
      // **** ����ϱ�

      // ��(��) ���� -> �ܺ�for��
      // ��(ĭ) ���� -> ���� for��

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