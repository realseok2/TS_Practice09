package com.javaex.ex02;

public class Friend {

// ----------------------------------------					필터

	private String name;
	private String hp;
	private String school;

// ----------------------------------------					생성자

	public Friend() {
		
	}
	
	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

// ----------------------------------------					getter, setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

// ----------------------------------------					showInfo()

	public void showInfo() {
		System.out.println("#Name_[ " + name + " ],   #Hp_[ " + hp + " ],   #SchoolName_[" + school + " ]");
	}

// ----------------------------------------					toString()

	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}

}
