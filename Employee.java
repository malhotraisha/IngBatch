package com.bean;

public class Employee {
	
	private String userName;
	private String passWord;
	private String email;
	private String dob2;
	private String contactNumber;
	
	private int max_len = 20;
	private int min_len = 8;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public boolean validateUserName(String userName){
		/**
		 * validates the user name of the below criteria's
		 * the min length should be 8 & max length should be 20
		 * it should not contain any white spaces in between
		 * it can contain only 2 special chars "." & "_"
		 * 
		 */
		
		if(null != userName){
			int len = userName.length();			
			if(len >= min_len && len <= max_len){
				if(userName.matches("[a-zA-Z._ ]*"))
					return true;
				} 
			}		 
		return false;
	}
	
	public boolean validatePassword(String password){
		/*
		 * Validates if the password contains atleast 1 number
		 * and atleast 1 capital letter 
		 * atleast 1 special character
		 * and of minimum lenth  8
		 */
		
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

		if(null != password){
				if(password.matches(pattern)){
					return true;
				}				
		}
		return false;
	}
	
	public boolean validateEmail(String email){
		/*
		 * Validates if email contains
		 * @ symbol 
		 * endsWith .com
		 * contains numerals n alphabets
		 */
		
		String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})${.8}";

		if(null != email){
					if(email.matches(pattern)){
							return true;
					}					
		}
		return false;
	}
}
