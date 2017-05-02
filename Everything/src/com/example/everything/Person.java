package com.example.everything;


	public class Person {
		private int image;
		private String name,Ccourse;
		
		public Person(int image, String name, String ccourse) {
			super();
			this.image = image;
			this.name = name;
			Ccourse = ccourse;
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
		public String getCcourse() {
			return Ccourse;
		}
		public void setCcourse(String ccourse) {
			Ccourse = ccourse;
		}
		

	}


