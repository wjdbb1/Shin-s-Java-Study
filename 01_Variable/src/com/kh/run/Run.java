package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_keyboardInput;
import com.kh.variable.C_Constant;
import com.kh.variable.D_Cast;
import com.kh.variable.E_Overflow;
import com.kh.variable.F_Printf;

public class Run {

	public static void main(String[] args) {
		A_Variable var = new A_Variable();
		// var.printValue();
		// var.declareVariable();

		B_keyboardInput kb = new B_keyboardInput();
		// kb.inputScanner1();
		// kb.inputScanner2();
		// kb.inputScanner3();

		C_Constant con = new C_Constant();
		// con.finalConstant();

		D_Cast ca = new D_Cast();
		// ca.rule1();
		// ca.rule2();
		// ca.dataLoss();

		// Ŭ������ ����� �̸��� ������ �ʰ� �ٷ� �����ؼ� �޼ҵ带 �����ϴ� ���
		new E_Overflow().overflow();
		new E_Overflow().calc();
		new E_Overflow().printVariableSize();

		// new F_Printf().printfMethod();

	}

}
