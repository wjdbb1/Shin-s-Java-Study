package com.kh.practice.run;

import com.kh.practice.model.vo.Practice;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		p.setName("신정현");
		p.setBirth(970831);
		p.setGender('F');
		p.setComlicense("정보처리산업기사");
		
		
		System.out.println(p.information());
		
	}

}
