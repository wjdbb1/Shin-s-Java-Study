package com.kh.practice.model.vo;

public class Practice {
// �ڰ��� ����

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
		return "�̸� : " + name + ", ������� : " +birth +", ���� : "+ gender +", �ڰ����̸� : "+comlicense;
	}

}
