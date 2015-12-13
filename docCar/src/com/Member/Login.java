package com.Member;

public class Login {
	String id;
	String password;
	boolean login_check;
	public Login(){
		
		login_check = false;
	}
	public boolean isLogin_check() {
		return login_check;
	}
	public void setLogin_check(boolean login_check) {
		this.login_check = login_check;
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
	
}
