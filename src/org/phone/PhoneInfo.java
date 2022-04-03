package org.phone;

public class PhoneInfo {

	public void phoneName() {
	System.out.println("One Plus");

	}
	public void phoneMiei() {
	System.out.println("7874568469875982745");

	}
	public void phoneCamera() {
	System.out.println("20 Pixels");

	}
	public void phoneStorage() {
	System.out.println("126 GB Internal Storage");

	}
	public void phoneOsName() {
	System.out.println("Andriod 11");
	

	}
	public void phoneModel() {
		System.out.println("IPhone 12 pro max");
	}
	public void phoneUser() {
		System.out.println("single user");
	}
	public static void main(String[] args) {
		PhoneInfo phoneInfo= new PhoneInfo();
		phoneInfo.phoneName();
		phoneInfo.phoneMiei();
		phoneInfo.phoneCamera();
		phoneInfo.phoneStorage();
		phoneInfo.phoneOsName();
	}
}
