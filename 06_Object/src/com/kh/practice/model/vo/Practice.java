package com.kh.practice.model.vo;

public class Practice {
// 자격증 정보

	private String name;
	private int birth;
	private char gender;
	private String comlicense;

	public Practice() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getComlicense() {
		return comlicense;
	}

	public void setComlicense(String comlicense) {
		this.comlicense = comlicense;
	}
	
	public String information() {
		return "이름 : " + name + ", 생년월일 : " +birth +", 성별 : "+ gender +", 자격증이름 : "+comlicense;
	}

}
