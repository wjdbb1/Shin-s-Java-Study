package com.kr.run;

import com.kr.operator.A_LogicalNegation;
import com.kr.operator.B_InDecrease;
import com.kr.operator.C_Arithmetic;
import com.kr.operator.D_Comparison;
import com.kr.operator.E_Logical;
import com.kr.operator.F_Compound;
import com.kr.operator.G_Triple;

public class Run {

	public static void main(String[] args) {
		A_LogicalNegation ln = new A_LogicalNegation();
		// �ڵ����� import ����Ű
		// ctrl + shift + o
		// ***�ڵ� import �� �������� ***
		// ������ �̸��� class�� ������ �� �ٸ� ��Ű�� ����� class�� import�� ���ɼ��� ����
		// ln.method1();

		B_InDecrease in = new B_InDecrease();
		// in.method1();
		// in.method2();

		C_Arithmetic ar = new C_Arithmetic();
		 ar.method1();

		D_Comparison co = new D_Comparison();
		// co.method1();

		E_Logical lo = new E_Logical();
		// lo.method1();
		// lo.method2();
		// lo.method3();
		// lo.method4();

		F_Compound cp = new F_Compound();
		//cp.method();

		G_Triple tp = new G_Triple();
		//tp.method1();
		//tp.method2();
		//tp.method3();
		//tp.method4();
		//tp.method5();
	
	}
	
	

}
