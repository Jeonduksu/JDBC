package com.model.dto;

public class MyTest {
	private int mno; // int
	private String name;	//varchar
	private String nickname; //varchar
	
	public MyTest() {
		super();
	}

	public MyTest(int mno, String name, String nickname) {
		super();
		this.mno = mno;
		this.name = name;
		this.nickname = nickname;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "MyTest [mno=" + mno + ", name=" + name + ", nickname=" + nickname + "]";
	}
	
	
}
