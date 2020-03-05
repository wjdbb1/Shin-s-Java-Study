package com.kh.chap03_class.model.vo;

// 클래스에서 사용 가능한 접근 제한자 --> public, default(생략)

public class Person {

//1.필드부 (==멤버 변수)
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;

	// 2.생성자부
	public Person() {
	}

	// 3. 메소드부 - getter / setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;

	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String information() {
		return id + pwd + name + age + gender + phone + email;
	}
}