package com.kkd.customerloginservice;

public class CustomerLoginConfiguration {
	private String phone_no;
	private String password;
	
	protected CustomerLoginConfiguration() {
		
	}
	public CustomerLoginConfiguration(String phone_no, String password) {
		super();
		this.phone_no = phone_no;
		this.password = password;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
