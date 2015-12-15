package com.member.action;

public class Member {
	private int memberNumber;
	private String id;
	private String password;
	private String name;
	private String address;
	private String email;
	private String registerDate;
	private String memBerType;
	private boolean login_check;
	
	public Member() {
		login_check = false;
	}

	

	
	public String getMemBerType() {
		return memBerType;
	}

	public void setMemBerType(String memBerType) {
		this.memBerType = memBerType;
	}

	public boolean isLogin_check() {
		return login_check;
	}

	public void setLogin_check(boolean login_check) {
		this.login_check = login_check;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
