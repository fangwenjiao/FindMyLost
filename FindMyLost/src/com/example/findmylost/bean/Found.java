package com.example.findmylost.bean;

import cn.bmob.v3.BmobObject;

public class Found extends BmobObject {

	private String describe;
	private String phone;
	private String title;
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
