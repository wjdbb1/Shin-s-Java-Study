package com.kh.practice.run;

import com.kh.practice.model.vo.Practice;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		p.setName("������");
		p.setBirth(970831);
		p.setGender('F');
		p.setComlicense("����ó��������");
		
		
		System.out.println(p.information());
		
	}

}
