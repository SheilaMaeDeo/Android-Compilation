package com.example.listviewcaller;

public class Contact {
	
	private int image;
	private String name, tel;
	public Contact(int image, String name, String tel) {
		super();
		this.image = image;
		this.name = name;
		this.tel = tel;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
