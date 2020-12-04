package com.task.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Register {
	@Id
     private int sid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	private String firstname;
	private String middlename;
	private String lastname;

	
	private int country_code;
	
	private String address;
	private String psw;
	private String psw_repeat;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getCountry_code() {
		return country_code;
	}
	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPsw_repeat() {
		return psw_repeat;
	}
	public void setPsw_repeat(String psw_repeat) {
		this.psw_repeat = psw_repeat;
	}
	@Override
	public String toString() {
		return "Register [sid=" + sid + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", country_code=" + country_code + ", address=" + address + ", psw=" + psw
				+ ", psw_repeat=" + psw_repeat + ", getSid()=" + getSid() + ", getFirstname()=" + getFirstname()
				+ ", getMiddlename()=" + getMiddlename() + ", getLastname()=" + getLastname() + ", getCountry_code()="
				+ getCountry_code() + ", getAddress()=" + getAddress() + ", getPsw()=" + getPsw() + ", getPsw_repeat()="
				+ getPsw_repeat() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

	}

